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
public class GoodUseMain {
    
    public static void main(String S[])
    {
        
        GoodUseSubtypeA objbup=new GoodUseProgrammer("Daniel","37",'H',"03141050");
        GoodUseSubtypeB objbud=new GoodUseDriver("Juan","20",'H',"1155305");
        objbud.setLicenceNumber("NumberLicense1234");
        
        System.out.println("Test from the subclasses  .... ");
        
        objbup.getEmployee();
        objbup.doWork();
        
        
        objbud.getEmployee();
        objbud.doWork();
        
        System.out.println(".........................................");
        
        System.out.println("Test from the main class .... ");
        
        GoodUseEmployee[] arrayEmployees=new GoodUseEmployee[2];
        
        arrayEmployees[0]=objbup;
        arrayEmployees[1]=objbud;        
        
        arrayEmployees[0].getEmployee();
        arrayEmployees[0].doWork();
        
        arrayEmployees[1].getEmployee();
        arrayEmployees[1].doWork();
        
        System.out.println(".........................................");
        
    }
}



/*

    No se permite que hayan eliminaciones de Clientes // Fail Problema
Class - A // Manipulación información
* save
* read
* eliminar (logica)

Class - B extends A // Manipulación empleados
* save
* read
* eliminar

Class - C extends A // Manipulación Clientes
* save
* read
* eliminar X 

/////////////////////////////////////////////////////////////////////////////
Interfaz

No se permite que hayan eliminaciones de Clientes // ?
Interfaz Class - A // Manipulación información
* save
* read

Interfaz Class - AEliminacion // Interfaz de eliminación
* eliminar (logica)


Class - B implements A,AEliminacion // Manipulación empleados
* save
* read
* eliminar (logica)


Class - C implements A // Manipulación Clientes
* save
* read
/////////////////////////////////////////////////////////////////////////////
Interfaz - Abstract Class

 No se permite que hayan eliminaciones de Clientes // ?
Class - A // Manipulación información
* save
* read

Interfaz Class - AEliminacion // Interfaz de eliminación
* eliminar (logica)

Class - B extends A implements AEliminacion // Manipulación empleados
* save
* read
* eliminar (logica)

Class - C extends A // Manipulación Clientes
* save
* read
/////////////////////////////////////////////////////////////////////////////
 No se permite que hayan eliminaciones de Clientes // ? OK 

Class - A extends AEliminacion // Manipulación información
* save
* read

Class - AEliminacion extends A// Manipulación de eliminación
* eliminar (logica)


Class - B extends AEliminacion // Manipulación empleados
* save
* read
* eliminar (logica)


Class - C extends A // Manipulación Clientes
* save
* read


*/