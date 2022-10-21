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
public abstract class GoodUseSubtypeB extends GoodUseEmployee{
    private String LicenceNumber;
    
    public GoodUseSubtypeB(String name,String age,char gender,String numero_empleado)
    {
        super(name,age,gender,numero_empleado);        
    }

    /**
     * @return the LicenceNumber
     */
    public String getLicenceNumber() {
        return LicenceNumber;
    }

    /**
     * @param LicenceNumber the LicenceNumber to set
     */
    public void setLicenceNumber(String LicenceNumber) {
        this.LicenceNumber = LicenceNumber;
    }
 
}
