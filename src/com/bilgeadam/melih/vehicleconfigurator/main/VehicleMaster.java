package com.bilgeadam.melih.vehicleconfigurator.main;

import com.bilgeadam.melih.vehicleconfigurator.enums.Colors;
import com.bilgeadam.melih.vehicleconfigurator.enums.GoodsCarrierModels;
import com.bilgeadam.melih.vehicleconfigurator.methods.GoodsCarrierVehicles;

public class VehicleMaster {
    public static void main(String[] args) {
       /* BAUtils.header("ARAÇ SEÇİM SİHİRBAZINA HOŞ GELDİNİZ");
        VehicleMasterMethods.categorySelection();
        System.out.println(Maps.BodyTypes());
*/
        //System.out.println(Maps.MaxSpeeds().get(GoodsCarrierModels.CADDY_CARGO));
        for (int i = 0; i < Colors.values().length; i++) {
            System.out.println(Colors.values().clone()[i]);
        }
        GoodsCarrierVehicles goodsCarrierVehicles = new GoodsCarrierVehicles();
        System.out.println(goodsCarrierVehicles);

    }
}
