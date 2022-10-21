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
public class BadUseMain {
    public static void main(String S[])
    {
        /*
            Maybe looks great but, what happen if we need to include another kind of data base, 
            Ok, first of all we must add another method in our class BadUseBD but the problem here
            is  how to resolve this trying to isolate our method that works, this is something imposible
            we need to see another way .... a good way is "dependecy injection"
        */
        BadUseBD obj_bd=new BadUseBD();
        
        BadUseUser obju=new BadUseUser();
        obju.setName("Daniel");
        obju.setAddress("Circuito anillo periferico");
        
        obj_bd.save(obju);
        
        /*
            SQLServer
            File
        */
    }
}
