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
public class GoodUseMain {
    public static void main(String S[])
    {
        
        GoodUseMySQL obj_bd=new GoodUseMySQL();
        
        GoodUseUser obju=new GoodUseUser();
        obju.setName("Daniel");
        obju.setAddress("Circuito anillo periferico");
        
        GoodUseServiceUser objsu=new GoodUseServiceUser(obj_bd);
        objsu.savePerson(obju);
        
    }
}
