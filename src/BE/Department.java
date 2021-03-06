/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BE;

/**
 *
 * @author bhp
 */
public class Department
{
    private final int ID;
    private String name;

    public Department(int id, String name)
    {
        this.ID = id;
        this.name = name;
    }

    /**
     * @return the ID
     */
    public int getId()
    {
        return ID;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return String.format("%4d %-50s", ID, name);
    }
    
    
    
}
