/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Open_Closed_Principle;

/**
 *
 * @author danie
 */
public class BadUseMain {
    
    /*
        The problem is ... when you will try to change a specific way for the calculation of the shipping, 
        you imagine if you will change the type of calc of cost shipping when is for flight, the calculation is based for the weight ... 
        to implement this principle, we need to change some things,  we will switch the calculation for each shipping type    
    */
    /*
        on this implementation If you try to change the method "getShippingCost" 
        you will change the class BadUseOrder  due to you will break the principle
    */
        
    /* The solution is implemented the wrong way */
    public static void main(String S[])
    {
        
        BadUseOrder obj_buo=new BadUseOrder();
        obj_buo.setShipping("fly");
        obj_buo.setCost(8);
        
        obj_buo.getList_items().add(new PojoItem("producto 1","descripcion 1",3.0,1,1));
        obj_buo.getList_items().add(new PojoItem("producto 2","descripcion 1",5,1,1.5f));
        obj_buo.getList_items().add(new PojoItem("producto 3","descripcion 1",15.5,2,1));
        obj_buo.getList_items().add(new PojoItem("producto 4","descripcion 1",8.9,3,1));
        
        System.out.println("---- Price's Order is "+obj_buo.get_total()+" with a shipping cost of "+obj_buo.getShippingCost());
        
    }
    
}
