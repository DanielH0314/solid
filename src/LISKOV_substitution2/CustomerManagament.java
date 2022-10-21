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
public class CustomerManagament implements DataManagament{
    
    @Override
    public void save()
    {
        System.out.println("We are saving information of the Customer");
    }
    
    @Override
    public void read()
    {
        System.out.println("We are reading information of the Customer");
    }
    
}
