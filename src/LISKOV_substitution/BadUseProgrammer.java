/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LISKOV_substitution;

import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class BadUseProgrammer extends BadUseEmployee{
    
    private ArrayList<String> assets;
    private ArrayList<String> assignmentsSprints;
    
    public BadUseProgrammer(String name,String age,char gender,String numero_empleado,String numero_licencia)
    {
        super(name,age,gender,numero_empleado,null);
    }
    
    @Override
    public void doWork()
    {
        System.out.println("The Worker is programming ...");
    }
    
}
