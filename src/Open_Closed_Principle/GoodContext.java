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
public class GoodContext {
    
    GoodUseInterface objgoodUseInterface;
    public GoodContext(GoodUseInterface param)
    {
        objgoodUseInterface=param;
    }
    
    public float executeStrategyGetShippingCost()
    {
        return objgoodUseInterface.getShippingCost();
    }
    
    public double executeStrategyTotal()
    {
        return objgoodUseInterface.get_total();
    }
}
