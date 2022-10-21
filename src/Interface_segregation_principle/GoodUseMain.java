/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_segregation_principle;


import java.util.ArrayList;

/**
 * @author danie
 */
public class GoodUseMain {
    
    public static void main(String A[])
    {
        
        ArrayList<GoodUseDataManagament> objDM=new ArrayList<>();
        objDM.add(new GoodUseEmployeeManagament());
        objDM.add(new GoodUseCustomerManagament());
        objDM.get(0).read();
        objDM.get(0).save();
        objDM.get(1).read();
        objDM.get(1).save();
        
        ArrayList<GoodUseDataManagamentDelete> objDMD=new ArrayList<>();
        objDMD.add(new GoodUseEmployeeManagament());
        objDMD.get(0).delete();
        
    }
    
}



























