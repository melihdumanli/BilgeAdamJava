package com.bilgeadam.melih.vehicleconfigurator.maps;

import com.bilgeadam.melih.lesson21.Color;
import com.bilgeadam.melih.vehicleconfigurator.enums.GoodsCarrierModels;
import com.bilgeadam.melih.vehicleconfigurator.enums.PassengerCarrierModels;
import com.bilgeadam.melih.vehicleconfigurator.enums.PersonalUseOnlyModels;
import com.bilgeadam.melih.vehicleconfigurator.enums.Transmission;

import java.util.HashMap;

public class Maps{
    public static HashMap categorySelection(){
        HashMap<Integer, String > categories = new HashMap<Integer, String>();
        categories.put(1,"Binek Araç");
        categories.put(2,"Ticari Araç");
        return categories;
    }
    public static HashMap CommercialSegments(){
        HashMap<Integer,String > commercialSegments = new HashMap<Integer,String >();
        commercialSegments.put(1,"Yolcu Taşıma");
        commercialSegments.put(2,"Yük Taşıma");
        return commercialSegments;
    }
    public static HashMap PersonalUseOnlySegments(){
        HashMap<Integer,String > personalUseOnlySegments = new HashMap<Integer,String>();
        personalUseOnlySegments.put(1,"B Segmenti : Mini Aile");
        personalUseOnlySegments.put(2,"C Segmenti : Kompakt");
        personalUseOnlySegments.put(3,"D Segmenti : Geniş Aile");
        personalUseOnlySegments.put(4,"E Segmenti : Üst Sınıf");
        personalUseOnlySegments.put(5,"F Segmenti : Lüks Sınıf");
        return personalUseOnlySegments;
    }
    public static HashMap PersonalUseOnlyModels(){
        HashMap<Integer,PersonalUseOnlyModels > personalUseOnlyModels = new HashMap<Integer,PersonalUseOnlyModels>();
        personalUseOnlyModels.put(1,PersonalUseOnlyModels.POLO);
        personalUseOnlyModels.put(2,PersonalUseOnlyModels.GOLF_8);
        personalUseOnlyModels.put(3, PersonalUseOnlyModels.GOLF_8_ESTATE);
        personalUseOnlyModels.put(4,PersonalUseOnlyModels.PASSAT);
        personalUseOnlyModels.put(5,PersonalUseOnlyModels.PASSAT_ESTATE);
        personalUseOnlyModels.put(6,PersonalUseOnlyModels.ARTEON);
        personalUseOnlyModels.put(7,PersonalUseOnlyModels.T_ROC);
        personalUseOnlyModels.put(8,PersonalUseOnlyModels.TIGUAN);
        personalUseOnlyModels.put(9,PersonalUseOnlyModels.TIGUAN_ALLSPACE);
        personalUseOnlyModels.put(10,PersonalUseOnlyModels.TOUAREG);
        return personalUseOnlyModels;
    }
    public static HashMap PassengerCarrierModels(){
        HashMap<Integer, PassengerCarrierModels> passengerCarrierModels = new HashMap<Integer,PassengerCarrierModels>();
        passengerCarrierModels.put(1,PassengerCarrierModels.CADDY);
        passengerCarrierModels.put(2,PassengerCarrierModels.TRANSPORTER);
        passengerCarrierModels.put(3,PassengerCarrierModels.CARAVELLE);
        passengerCarrierModels.put(4,PassengerCarrierModels.CRAFTER);
        return passengerCarrierModels;
    }
    public static HashMap GoodsCarrierModels(){
        HashMap<Integer, GoodsCarrierModels> goodsCarrierModels = new HashMap<Integer,GoodsCarrierModels>();
        goodsCarrierModels.put(1,GoodsCarrierModels.CADDY_CARGO);
        goodsCarrierModels.put(2,GoodsCarrierModels.CADDY_CARGO_MAXI);
        goodsCarrierModels.put(3,GoodsCarrierModels.TRANSPORTER_PANEL_VAN);
        goodsCarrierModels.put(4,GoodsCarrierModels.TRANSPORTER_PIKAP);
        goodsCarrierModels.put(5,GoodsCarrierModels.CRAFTER_PANEL_VAN);
        return goodsCarrierModels;
    }
    /*public static HashMap BodyTypes(){
        HashMap<PersonalUseOnlyModels, String> bodyTypes = new HashMap<PersonalUseOnlyModels,String>();
        bodyTypes.put(PersonalUseOnlyModels.POLO, "HatchBack");
        bodyTypes.put(PersonalUseOnlyModels.GOLF_8, "HatchBack");
        bodyTypes.put(PersonalUseOnlyModels.GOLF_8_ESTATE, "Station Wagon");
        bodyTypes.put(PersonalUseOnlyModels.PASSAT, "Sedan");
        bodyTypes.put(PersonalUseOnlyModels.PASSAT_ESTATE, "Station Wagon");
        bodyTypes.put(PersonalUseOnlyModels.ARTEON, "Sedan");
        bodyTypes.put(PersonalUseOnlyModels.T_ROC, "SUV");
        bodyTypes.put(PersonalUseOnlyModels.TIGUAN, "SUV");
        bodyTypes.put(PersonalUseOnlyModels.TIGUAN_ALLSPACE, "SUV");
        bodyTypes.put(PersonalUseOnlyModels.TOUAREG, "SUV");
        return bodyTypes;
    }*/
    public static HashMap BaseModelPrices(){
        HashMap<PersonalUseOnlyModels, Double> baseModelPrices = new HashMap<PersonalUseOnlyModels,Double>();
        baseModelPrices.put(PersonalUseOnlyModels.POLO, 122000.0);
        baseModelPrices.put(PersonalUseOnlyModels.GOLF_8, 193000.0);
        baseModelPrices.put(PersonalUseOnlyModels.GOLF_8_ESTATE, 200000.0);
        baseModelPrices.put(PersonalUseOnlyModels.PASSAT, 225000.0);
        baseModelPrices.put(PersonalUseOnlyModels.PASSAT_ESTATE, 238000.0);
        baseModelPrices.put(PersonalUseOnlyModels.ARTEON, 256000.0);
        baseModelPrices.put(PersonalUseOnlyModels.T_ROC, 205000.0);
        baseModelPrices.put(PersonalUseOnlyModels.TIGUAN, 246000.0);
        baseModelPrices.put(PersonalUseOnlyModels.TIGUAN_ALLSPACE, 263000.0);
        baseModelPrices.put(PersonalUseOnlyModels.TOUAREG, 603000.0);
        return baseModelPrices;
    }
    public static HashMap DieselEngines(){
        HashMap<Integer , String > dieselEngines = new HashMap<Integer , String>();
        dieselEngines.put(1, "1.6 TDI");
        dieselEngines.put(2, "2.0 TDI-1");
        dieselEngines.put(3, "2.0 TDI-2");
        dieselEngines.put(4, "2.0 TDI-3");
        dieselEngines.put(5, "2.0 TDI-4");
        dieselEngines.put(6, "3.0 TDI");
        return dieselEngines;
    }
    public static HashMap PetrolEngines(){
        HashMap<Integer , String > petrolEngines = new HashMap<Integer , String>();
        petrolEngines.put(1, "1.0 TSI");
        petrolEngines.put(2, "1.0 e-TSI");
        petrolEngines.put(3, "1.5 TSI");
        petrolEngines.put(4, "2.0 TSI");
        return petrolEngines;
    }
    public static HashMap Transmission(){
        HashMap<Integer , Transmission> transmission = new HashMap<Integer , Transmission>();
        transmission.put(1, Transmission.MANUEL);
        transmission.put(2, Transmission.SEMI_AUTOMATIC);
        return transmission;
    }
    public static HashMap EnginePowers(){
        HashMap<String , Integer > EnginePowers = new HashMap<String , Integer>();
        EnginePowers.put("1.6 TDI", 115);
        EnginePowers.put("2.0 TDI-1", 190);
        EnginePowers.put("2.0 TDI-2", 122);
        EnginePowers.put("2.0 TDI-3", 150);
        EnginePowers.put("2.0 TDI-4", 177);
        EnginePowers.put("3.0 TDI", 286);
        EnginePowers.put("1.0 TSI", 95);
        EnginePowers.put("1.0 e-TSI", 110);
        EnginePowers.put("1.5 TSI", 150);
        EnginePowers.put("2.0 TSI", 252);
        return EnginePowers;
    }
    public static HashMap MaxTorque(){
        HashMap<String , Integer > maxTorque = new HashMap<String , Integer>();
        maxTorque.put("1.6 TDI", 250);
        maxTorque.put("2.0 TDI-1", 400);
        maxTorque.put("2.0 TDI-2", 300);
        maxTorque.put("2.0 TDI-3", 300);
        maxTorque.put("2.0 TDI-4", 300);
        maxTorque.put("3.0 TDI", 500);
        maxTorque.put("1.0 TSI", 175);
        maxTorque.put("1.0 e-TSI", 200);
        maxTorque.put("1.5 TSI", 250);
        maxTorque.put("2.0 TSI", 300);
        return maxTorque;
    }
    public static HashMap GoodsCarriersMaxSpeeds(){
        HashMap<GoodsCarrierModels, Integer> maxSpeeds = new HashMap<GoodsCarrierModels ,Integer>();
        maxSpeeds.put(GoodsCarrierModels.CADDY_CARGO, GoodsCarrierModels.CADDY_CARGO.getMaxSpeed());
        maxSpeeds.put(GoodsCarrierModels.CADDY_CARGO_MAXI, GoodsCarrierModels.CADDY_CARGO_MAXI.getMaxSpeed());
        maxSpeeds.put(GoodsCarrierModels.TRANSPORTER_PANEL_VAN, GoodsCarrierModels.TRANSPORTER_PANEL_VAN.getMaxSpeed());
        maxSpeeds.put(GoodsCarrierModels.TRANSPORTER_PIKAP, GoodsCarrierModels.TRANSPORTER_PIKAP.getMaxSpeed());
        maxSpeeds.put(GoodsCarrierModels.CRAFTER_PANEL_VAN, GoodsCarrierModels.CRAFTER_PANEL_VAN.getMaxSpeed());
        return maxSpeeds;
    }
    public static HashMap PassengerCarriersMaxSpeeds(){
        HashMap<PassengerCarrierModels, Integer> maxSpeeds = new HashMap<PassengerCarrierModels ,Integer>();
        maxSpeeds.put(PassengerCarrierModels.CADDY, PassengerCarrierModels.CADDY.getMaxSpeed());
        maxSpeeds.put(PassengerCarrierModels.TRANSPORTER, PassengerCarrierModels.TRANSPORTER.getMaxSpeed());
        maxSpeeds.put(PassengerCarrierModels.CARAVELLE, PassengerCarrierModels.CARAVELLE.getMaxSpeed());
        maxSpeeds.put(PassengerCarrierModels.CRAFTER, PassengerCarrierModels.CRAFTER.getMaxSpeed());
        return maxSpeeds;
    }
    public static HashMap PersonalVehiclesMaxSpeeds(){
        HashMap<PersonalUseOnlyModels, Integer> maxSpeeds = new HashMap<PersonalUseOnlyModels ,Integer>();
        maxSpeeds.put(PersonalUseOnlyModels.POLO, PersonalUseOnlyModels.POLO.getMaxSpeed());
        maxSpeeds.put(PersonalUseOnlyModels.GOLF_8, PersonalUseOnlyModels.GOLF_8.getMaxSpeed());
        maxSpeeds.put(PersonalUseOnlyModels.GOLF_8_ESTATE, PersonalUseOnlyModels.GOLF_8_ESTATE.getMaxSpeed());
        maxSpeeds.put(PersonalUseOnlyModels.PASSAT, PersonalUseOnlyModels.PASSAT.getMaxSpeed());
        maxSpeeds.put(PersonalUseOnlyModels.PASSAT_ESTATE, PersonalUseOnlyModels.PASSAT_ESTATE.getMaxSpeed());
        maxSpeeds.put(PersonalUseOnlyModels.ARTEON, PersonalUseOnlyModels.ARTEON.getMaxSpeed());
        maxSpeeds.put(PersonalUseOnlyModels.T_ROC, PersonalUseOnlyModels.T_ROC.getMaxSpeed());
        maxSpeeds.put(PersonalUseOnlyModels.TIGUAN, PersonalUseOnlyModels.TIGUAN.getMaxSpeed());
        maxSpeeds.put(PersonalUseOnlyModels.TIGUAN_ALLSPACE, PersonalUseOnlyModels.TIGUAN_ALLSPACE.getMaxSpeed());
        maxSpeeds.put(PersonalUseOnlyModels.TOUAREG, PersonalUseOnlyModels.TOUAREG.getMaxSpeed());
        return maxSpeeds;
    }
    public static HashMap GoodsCarrierMaxSpeeds(){
        HashMap<GoodsCarrierModels, Integer> maxSpeeds = new HashMap<GoodsCarrierModels ,Integer>();
        maxSpeeds.put(GoodsCarrierModels.CADDY_CARGO, GoodsCarrierModels.CADDY_CARGO.getMaxSpeed());
        maxSpeeds.put(GoodsCarrierModels.CADDY_CARGO_MAXI, GoodsCarrierModels.CADDY_CARGO_MAXI.getMaxSpeed());
        maxSpeeds.put(GoodsCarrierModels.TRANSPORTER_PANEL_VAN, GoodsCarrierModels.TRANSPORTER_PANEL_VAN.getMaxSpeed());
        maxSpeeds.put(GoodsCarrierModels.TRANSPORTER_PIKAP, GoodsCarrierModels.TRANSPORTER_PIKAP.getMaxSpeed());
        maxSpeeds.put(GoodsCarrierModels.CRAFTER_PANEL_VAN, GoodsCarrierModels.CRAFTER_PANEL_VAN.getMaxSpeed());
        return maxSpeeds;
    }
    public static HashMap DieselEnginePrices(){
        HashMap<String, Double> dieselEnginePrices = new HashMap<String ,Double>();
        dieselEnginePrices.put("1.6 TDI", 12000.0);
        dieselEnginePrices.put("2.0 TDI-1", 28000.0);
        dieselEnginePrices.put("2.0 TDI-2", 18000.0);
        dieselEnginePrices.put("2.0 TDI-3", 24000.0);
        dieselEnginePrices.put("2.0 TDI-4", 22000.0);
        dieselEnginePrices.put("3.0 TDI", 26000.0);
        return dieselEnginePrices;
    }

    public static HashMap PetrolEnginePrices(){
        HashMap<String, Double> petrolEnginePrices = new HashMap<String ,Double>();
        petrolEnginePrices.put("1.0 TSI", 10000.0);
        petrolEnginePrices.put("1.0 e-TSI", 12000.0);
        petrolEnginePrices.put("1.5 TSI", 18000.0);
        petrolEnginePrices.put("2.0 TSI", 22500.0);
        return petrolEnginePrices;
    }

}
