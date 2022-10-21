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
public abstract class BadUseEmployee {
    
    private String name;
    private String age;
    private char gender;
    private String employeeNumber;
    private String LicenceNumber;
    
    public BadUseEmployee(String name,String age,char gender,String numero_empleado,String numero_licencia)
    {
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.employeeNumber=numero_empleado;
        this.LicenceNumber=numero_licencia;
    }
    
    public abstract void doWork();
            
    public void getEmployee()
    {
        System.out.println("The name of the employee is: "+this.getName()+", He is "+this.getAge()+" years old, his number of employee is "+this.getEmployeeNumber()+", his license number is "+this.getLicenceNumber()+" "+" and his gender is "+this.getGender());
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * @return the gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * @return the employeeNumber
     */
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * @param employeeNumber the employeeNumber to set
     */
    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
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
