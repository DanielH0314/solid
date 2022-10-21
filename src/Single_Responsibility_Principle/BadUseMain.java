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

/*
    The Single Responsability Principle
    A class should have just one reason for changing
*/

/*
    Why this is wrong ?
    The principle is broken because in the same class Bad_user_Car we are implementing the process for saving 
    information into a database, this is wrong because if we need to change this method we will need to modify 
    the class but in this class, we have other things which have nothing to do with this
*/
/* The solution is implemented the wrong way */
public class BadUseMain {
    
    public static void main(String S[])
    {
        BadUseCar obj_buc=new BadUseCar("Nissan");
        obj_buc.saveCarBD();
    }
    
}
