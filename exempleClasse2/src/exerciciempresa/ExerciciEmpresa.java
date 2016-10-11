/**
 * This program can be used to add employees to a company and list them
 * @author jaldazabal
 * @version 1.0
 */
package exerciciempresa;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author jaldazabal
 * @version 1.0
 * 
 */
public class ExerciciEmpresa {
    public Scanner scr = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    Empresa emp =new Empresa();
    public static void main(String[] args) {
        // TODO code application logic here
        ExerciciEmpresa e=new ExerciciEmpresa();
        e.run();
    }
    public void run(){
        int opcio=0;
        while(opcio!=3){
            opcio=menu();
            switch(opcio){
                case 1:
                    if(addEmployee()==true){
                        System.out.println("Succes");
                    }
                    else System.out.println("Error");
                    break;
                case 2:
                    System.out.println(emp.listEmployees());
                    break;
                case 3:
                    break;
                default:
                    break;
            }
        }
    }
    /**
     * Prints a menu and returns the option chosen by the user
     * @return an integer that is the option chosen by the user
     */
    public int menu(){
        int opcio=0;
        try{
            System.out.println("1. Add employee");
            System.out.println("2. List employees");
            System.out.println("3. Exit");
            System.out.println("Option: ");
            opcio=parseInt(scr.nextLine());
        }catch(NumberFormatException e){
            System.out.println(e);
        }
        return opcio;
    }
    /**
     * takes the name and complements by keyboard and passes them to Empresa class
     * @return  true if success false if not
     */
    public boolean addEmployee(){
        int complement=0;
        String nom;
        try{
            System.out.println("Employee name: ");
            nom=scr.nextLine();
            System.out.println("Complements: ");
            complement=parseInt(scr.nextLine());
            return emp.nouEmpleat(nom, complement);
        }catch(NumberFormatException e){
            System.out.println(e);
            return false;
        }
    }
    
    
}
