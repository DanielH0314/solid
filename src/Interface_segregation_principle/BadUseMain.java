/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_segregation_principle;

import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class BadUseMain {
    /*
        We need to implement a solution from a main interface in order to implement 3 diferents methods
        save, read and delete, but one subclass doesn't use the method delete
        If we are triyng to implementent just one interface we're gonna catch a problem, because we will force
        the implement of the delete method, this is an example of a bad implementation
    */
    public static void main(String A[])
    {
        
        ArrayList<BadUseDataManagament> objDM=new ArrayList<>();
        objDM.add(new BadUseEmployeeManagament());
        objDM.add(new BadUseCustomerManagament());
        objDM.get(0).read();
        objDM.get(0).save();
        objDM.get(0).delete();
        objDM.get(1).read();
        objDM.get(1).save();
        objDM.get(1).delete();
        
    }
}
