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
public class GoodUseMain {
    
    /*
        This principle looks to try to keep the code that works separated from a new implementation or requirement 
    */
    
    public static void main(String S[])
    {
        GoodUseInterface obj_buo=createDataFly();
        
        GoodContext objGoodContext=new GoodContext(obj_buo);
        
        System.out.println("---- Price's Order is "+objGoodContext.executeStrategyTotal()+" with a shipping cost of "+objGoodContext.executeStrategyGetShippingCost());
        
    }
    
    
    private static GoodUseInterface createDataFly()
    {
        GoodUseGround obj_buo=new GoodUseGround();
        obj_buo.setCost(8);
        
        obj_buo.getList_items().add(new PojoItem("producto 1","descripcion 1",3.0,1,1));
        obj_buo.getList_items().add(new PojoItem("producto 2","descripcion 1",5,1,1.5f));
        obj_buo.getList_items().add(new PojoItem("producto 3","descripcion 1",15.5,2,1));
        obj_buo.getList_items().add(new PojoItem("producto 4","descripcion 1",8.9,3,1));
        
        return obj_buo;
    }
}
