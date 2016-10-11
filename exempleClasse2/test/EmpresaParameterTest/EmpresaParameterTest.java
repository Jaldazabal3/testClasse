/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmpresaParameterTest;

import exerciciempresa.Empresa;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author jaldazabal
 */
@RunWith(Parameterized.class)
public class EmpresaParameterTest {
    
   
    private Empresa emp;
    
    @Before
    public void before(){
        emp=new Empresa();
    }
    
    @Parameters
    public static Collection getData(){
        List<Object[]> obj=new ArrayList<>();
            obj.add(new Object[]{"Name1",100,"Nom: Name1 Sou: 900\n",true});
            obj.add(new Object[]{"Name2",-100,"",false});
            return obj;        
    }
    
    private String nom;
    private int complement;
    private String expectedString;
    private boolean expected;
    public EmpresaParameterTest(String nom,int complement,String expectedString, boolean expected) {
         this.nom=nom;
         this.complement=complement;
         this.expected=expected;
         this.expectedString=expectedString;
    }
     
     
    @Test
    public void testNouEmpleat(){
        boolean result= emp.nouEmpleat(nom,complement);
        assertEquals(expected,result);
    }
    
    @Test
    public void testListEmployees(){
        if(emp.nouEmpleat(nom, complement)){
            assertEquals(expectedString, emp.listEmployees());
        }
    }
}
