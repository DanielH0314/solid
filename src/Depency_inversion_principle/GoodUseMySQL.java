/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Depency_inversion_principle;

/**
 *
 * @author danie
 */
public class GoodUseMySQL implements GoodUseInterfaceDeviceStorage{
    
    @Override
    public void save(Object objuser)
    {
        System.out.println("Save info about User "+objuser.getClass());
    }

    
}
