/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LISKOVsubstitution3;

import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class UseMain {
    
    public static void main(String S[])
    {
        ArrayList<Gato> objA=new ArrayList<>();
        objA.add(new Gato("Manchas"));
        objA.add(new Gato("Oso"));
        objA.add(new Gato("Bigotes"));
        objA.add(new Gato("Sandro"));
        objA.add(new Gato("Garras"));
        //toFeedCat(objA);
        
        objA.forEach(
                (N) -> 
                {
                        ActionstoAnimalSubclass obj=new ActionstoAnimalSubclass();                        
                        obj.feed(N);
                });
        
        ArrayList<Animal> objA1=new ArrayList<>();
        objA1.add(new Animal("Gringo"));
        objA1.add(new Animal("Solovino"));
        objA1.add(new Animal("Tigre"));
        //toFeedAnimal(objA1);
        
        objA1.forEach(
                (N) -> 
                {
                        ActionstoAnimalSubclass obj=new ActionstoAnimalSubclass();                        
                        obj.feed(N);
                });
        
        
        ArrayList<Gato> objA2=new ArrayList<>();
        objA2.add(new Gato("Gringo"));
        objA2.add(new Gato("Solovino"));
        objA2.add(new Gato("Tigre"));
        
        objA2.forEach(
                (N) -> 
                {
                        ActionstoAnimalSubclass obj=new ActionstoAnimalSubclass();                        
                        obj.feed(N);
                });
        //toFeedCatType1(objA2);
        
    }
    
    
    static void toFeedCat(ArrayList<Gato> objA)
    {
        objA.forEach(
                (N) -> 
                {
                        ActionstoAnimalSubclass obj=new ActionstoAnimalSubclass();                        
                        obj.feed(N);
                });
        
        
    }
    
    static void toFeedAnimal(ArrayList<Animal> objA)
    {
        objA.forEach(
                (N) -> 
                {
                        ActionstoAnimalSubclass obj=new ActionstoAnimalSubclass();                        
                        obj.feed(N);
                });
        
        
    }
    
    /*static void toFeedCatType1(ArrayList<Gato> objA)
    {
        objA.forEach(
                (N) -> 
                {
                        ActionAnimalSubclassWrong obj=new ActionAnimalSubclassWrong();                        
                        obj.feed(N);
                });
        
        
    }*/
    
}
