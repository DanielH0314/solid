/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Open_Closed_Principle;

import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class BadUseOrder {
    private ArrayList<PojoItem> list_items;
    private String shipping;
    private float cost;//cost of shipping
    
    public BadUseOrder()
    {
        list_items=new ArrayList<>();
    }
    
    double get_total()
    {
        return getList_items().stream().mapToInt(l -> l.getCantidad()).sum()*getList_items().stream().mapToDouble(l -> l.getPrecio()).sum();
    }
    
    float getShippingCost()
    {
        float result=0;
        switch(shipping)
        {
            case "fly":
                        result= (float) getList_items().stream().mapToDouble(l -> l.getPeso()).sum() * this.cost;
                        break;
            case "ground":
                        if((float) getList_items().stream().mapToDouble(l -> l.getPeso()).sum()<100) /* if the weight is minus than 100 then*/
                            result= (float) getList_items().stream().mapToDouble(l -> l.getPeso()).sum() * this.cost;
                        else
                            result=0;
                        break;
            default:break;
        }
        return result;
    }
    
    /**
     * @return the list_items
     */
    public ArrayList<PojoItem> getList_items() {
        return list_items;
    }

    /**
     * @param list_items the list_items to set
     */
    public void setList_items(ArrayList<PojoItem> list_items) {
        this.list_items = list_items;
    }

    /**
     * @return the shipping
     */
    public String getShipping() {
        return shipping;
    }

    /**
     * @param shipping the shipping to set
     */
    public void setShipping(String shipping) {
        this.shipping = shipping;
    }

    /**
     * @return the cost
     */
    public float getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(float cost) {
        this.cost = cost;
    }
    
    
}
