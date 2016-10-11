/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciempresa;

import java.util.ArrayList;
import java.util.List;

/**
 * This class has an array that allows putting employees in a single array
 * @author jaldazabal
 */
public class Empresa {
    private List<Empleat> employees= new ArrayList<Empleat>();    //list of employees
    private final int numeroEmpleats=10;                            //number of employees limited to 10
    /**
     * Constructor
     */
    public Empresa() {
    }
    //getters
    public int getNumeroEmpleats() {
        return numeroEmpleats;
    }
    
    
    /**
     * Adds an employee to the arraylist of employees
     * @param nom employee's name
     * @param complements the salary will be 800 + this parameter
     * @return return true if the employee is added successfully
     */
    public boolean nouEmpleat(String nom, int complements){
        if(employees.size()>=numeroEmpleats){
            System.out.println("Cannot add more employees");
        }
        else if(complements<0){
            System.out.println("Complement can't be negative");
        }
        else{
            Empleat empleat=new Empleat(nom,complements);
            employees.add(empleat);
            return true;
        }
        return false;
    }
    /**
     * use this method to list all the employees of the company
     * @return a string with information of all the employees
     */
    public String listEmployees(){
        StringBuilder empleats = new StringBuilder();
        for(Empleat emp : employees){
            empleats.append("Nom: ");
            empleats.append(emp.getNom());
            empleats.append(" Sou: ");
            empleats.append(emp.getSou());
            empleats.append("\n");
            
        }
        return empleats.toString();
    }
}
