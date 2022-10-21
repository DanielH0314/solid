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
public class GoodUseGround implements GoodUseInterface{
    private ArrayList<PojoItem> list_items;
    private float cost;//cost of shipping
    
    public GoodUseGround()
    {
        list_items=new ArrayList<>();
    }
    
    @Override
    public double get_total()
    {
        return getList_items().stream().mapToInt(l -> l.getCantidad()).sum()*getList_items().stream().mapToDouble(l -> l.getPrecio()).sum();
    }
    
    @Override
    public float getShippingCost()
    {
        float result=0;
        if((float) getList_items().stream().mapToDouble(l -> l.getPeso()).sum()<100) /* if the weight is minus than 100 then*/
            result= (float) getList_items().stream().mapToDouble(l -> l.getPeso()).sum() * this.cost;
        else
            result=0;
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
