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
public class GoodUseCar {
    
    String marca;
    
    public GoodUseCar(String marca)
    {
        this.marca=marca;
    }
    
    String getMarca()
    {
        return this.marca;
    }
}
