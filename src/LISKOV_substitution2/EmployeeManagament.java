/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LISKOV_substitution2;

/**
 *
 * @author danie
 */
public class EmployeeManagament implements DataManagament,DataManagamentDelete{
    
    @Override
    public void save()
    {
        System.out.println("We are saving information of the Employee");
    }
    
    @Override
    public void read()
    {
        System.out.println("We are reading information of the Employee");
    }
    
    @Override
    public void delete()
    {
        System.out.println("We are deleting information of the Employee");
    }
    
}
