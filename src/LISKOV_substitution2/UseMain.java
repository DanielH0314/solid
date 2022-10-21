/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LISKOV_substitution2;

import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class UseMain {
    
    public static void main(String A[])
    {
        
        ArrayList<DataManagament> objDM=new ArrayList<>();
        objDM.add(new EmployeeManagament());
        objDM.add(new CustomerManagament());
        objDM.get(0).read();
        objDM.get(0).save();
        objDM.get(1).read();
        objDM.get(1).save();
        
        ArrayList<DataManagamentDelete> objDMD=new ArrayList<>();
        objDMD.add(new EmployeeManagament());
        objDMD.get(0).delete();
        
    }
    
}



























