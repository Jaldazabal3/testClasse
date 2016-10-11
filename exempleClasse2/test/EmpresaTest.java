/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import exerciciempresa.Empresa;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author jaldazabal
 */

public class EmpresaTest {
    
    Empresa emp;
    
    public EmpresaTest() {
    }
    @Before
    public void before(){
        emp=new Empresa();
        
    }
    /**
     * This test verifies that the first employee can be added normally
     */
    @Test
    public void primerEmpleatTest(){
        boolean result = emp.nouEmpleat("Name1", 0);
        assertEquals(true, result);
    }
    /**
     * this test verifies that an employee cannot be added if the parameter "complement" is negative
     */
    @Test
    public void complementsNegatiusTest(){
        boolean result = emp.nouEmpleat("Name2", -10);
        assertEquals(false,result);
    }
    /**
     * this test verifies that until the max number of employees can be added normally, but the next ones cannot be added
     */
    @Test
    public void maxEmployeesTest(){
        boolean result;
        for(int i=0;i<emp.getNumeroEmpleats();i++){
           result=emp.nouEmpleat("Name"+i, i*10);
           assertEquals(result,true);
        }
        result=emp.nouEmpleat("Name11", 0);
        assertEquals(false, result);
    }
}
