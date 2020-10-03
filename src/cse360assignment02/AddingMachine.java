package cse360assignment02;

import java.util.ArrayList;

/**
 * 
 * @author Patrick McInerney
 * @studentID 1214826886
 * @repository https://github.com/PatrickMcI/cse360assignment02.git
 */

public class AddingMachine 
{
    private int total;
    private String toStringReturn = "0 ";
    private ArrayList<String> operations = new ArrayList<String>();
  
    public AddingMachine () 
    {
        total = 0;  // not needed - included for clarity
    }
  
    public int getTotal () 
    {
        return total;
    }
  
    public void add (int value) 
    {
        total += value;
        operations.add("+");
        operations.add(String.valueOf(value));
    }

    public void subtract (int value) 
    {
        total -= value;
        operations.add("-");
        operations.add(String.valueOf(value));
    }

    public String toString () 
    {
        for(int i = 0; i < operations.size(); i++)
            toStringReturn += operations.get(i) + " ";
            
        return toStringReturn;
    }

    public void clear() 
    {
        total = 0;
        toStringReturn = "0 ";
        operations.clear();
    }
}
