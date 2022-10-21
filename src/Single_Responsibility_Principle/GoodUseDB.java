/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Single_Responsibility_Principle;

/**
 *
 * @author danie
 */
public class GoodUseDB {
    
    public GoodUseDB()
    {
        System.out.println("---> database conecction Instance");
    }
    
    void saveCarBD(GoodUseCar obj_guc)
    {
        
        System.out.println("---> The information from the Car object (brand is "+ obj_guc.getMarca() +") is taken and Save to DataBase");
    }
}
