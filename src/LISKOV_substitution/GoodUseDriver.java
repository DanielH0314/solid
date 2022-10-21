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
public class GoodUseDriver extends GoodUseSubtypeB{    
    
    
    public GoodUseDriver(String name,String age,char gender,String numero_empleado)
    {
        super(name,age,gender,numero_empleado);
    }
     
    @Override
    public void doWork()
    {
        System.out.println("The Worker is driving ...");
    }
    
    @Override
    public void getEmployee()
    {        
        System.out.println("The name of the employee is: "+this.getName()+", He is "+this.getAge()+" years old, his number of employee is "+this.getEmployeeNumber()+", his license number is "+this.getLicenceNumber()+" "+" and his gender is "+this.getGender());
    }

}
