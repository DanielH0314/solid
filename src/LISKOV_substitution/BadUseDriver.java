/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LISKOV_substitution;

/**
 *
 * @author danie
 */
public class BadUseDriver extends BadUseEmployee{
    
    public BadUseDriver(String name,String age,char gender,String numero_empleado,String numero_licencia)
    {
        super(name,age,gender,numero_empleado,numero_licencia);
    }
     
    @Override
    public void doWork()
    {
        System.out.println("The Worker is driving ...");
    }
}
