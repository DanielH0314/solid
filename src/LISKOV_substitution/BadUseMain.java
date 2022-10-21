/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LISKOV_substitution;

/**
 *
 * @author danie
 */
public class BadUseMain {
    
    /*
        Our program should be able to change a subclass insteand of superclass, in this case
        a subclass try to send X numbers of parameters trough of his constructor to his father class, but not always 
        is the best option because the another class doesn't send one of this parameters ...
        we are trying to use in a bad way
    */
    
    public static void main(String S[])
    {
        
        BadUseEmployee objbup=new BadUseProgrammer("Daniel","37",'H',"03141050","DGS4199");
        BadUseEmployee objbud=new BadUseDriver("Juan","25",'H',"ABC456","DGS4199");
        
        objbup.getEmployee();
        objbup.doWork();
        
        objbud.getEmployee();
        objbud.doWork();
        
    }
    
}
