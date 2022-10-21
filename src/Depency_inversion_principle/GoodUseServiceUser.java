/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Depency_inversion_principle;

/**
 *
 * @author danie
 */
public class GoodUseServiceUser {
    
    GoodUseInterfaceDeviceStorage obj_ids;
    public GoodUseServiceUser(GoodUseInterfaceDeviceStorage obj_ids)
    {
        this.obj_ids=obj_ids;
    }
    
    public void savePerson(GoodUseUser objuser) {
		
	obj_ids.save(objuser);
                
    }

}
