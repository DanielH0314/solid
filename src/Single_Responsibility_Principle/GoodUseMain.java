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
public class GoodUseMain {
    
    public static void main(String S[])
    {
        GoodUseCar obj_buc=new GoodUseCar("Nissan");
        GoodUseDB obj_gudb=new GoodUseDB();
        obj_gudb.saveCarBD(obj_buc);
    }
    
}
