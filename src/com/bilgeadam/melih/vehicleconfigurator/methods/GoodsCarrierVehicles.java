package com.bilgeadam.melih.vehicleconfigurator.methods;

import com.bilgeadam.melih.vehicleconfigurator.commonvariables.VehicleCommons;
import com.bilgeadam.melih.vehicleconfigurator.enums.Colors;
import com.bilgeadam.melih.vehicleconfigurator.intefaces.ICommercialMethods;
import com.bilgeadam.melih.vehicleconfigurator.maps.Maps;

import java.util.HashMap;
import java.util.Scanner;

public class GoodsCarrierVehicles extends VehicleCommons implements ICommercialMethods{
    @Override
    public void showMenu() {

    }

    @Override
    public void categorySelection() {
    }

    @Override
    public void modelSelection() {
        Scanner scanner = new Scanner(System.in);
        int selection;
        HashMap<Integer, String > models = Maps.GoodsCarrierModels();
        do {
            System.out.println("Lütfen Satın Almak İstediğiniz Araç Modelini Seçiniz");
            for (HashMap.Entry temp : models.entrySet()) {
                System.out.println(temp.getKey() + " " + temp.getValue());
            }
            selection = scanner.nextInt();
            if (selection < 1 || selection > models.size())
                System.out.println("Geçersiz Bir Değer Girdiniz. Lütfen Tekrar Deneyiniz.");
        } while (selection < 1 || selection > models.size());
        scanner.close();
        super.setModel(models.get(selection));
    }

    @Override
    public void transmissionSelection() {
        Scanner scanner = new Scanner(System.in);
        int selection;
        HashMap<Integer, String > transmission = Maps.Transmission();
        do {
            System.out.println("Lütfen Satın Almak İstediğiniz Şanzıman Tipini Seçiniz");
            for (HashMap.Entry temp : transmission.entrySet()) {
                System.out.println(temp.getKey() + " " + temp.getValue());
            }
            selection = scanner.nextInt();
            if (selection < 1 || selection > transmission.size())
                System.out.println("Geçersiz Bir Değer Girdiniz. Lütfen Tekrar Deneyiniz.");
        } while (selection < 1 || selection > transmission.size());
        scanner.close();
        super.setTransmission(transmission.get(selection));

    }

    @Override
    public void colorSelection() {
        Scanner scanner = new Scanner(System.in);
        int selection;
        do {
            for (int i = 0; i < Colors.values().length; i++) {
                System.out.println(i + " : " + Colors.values().clone()[i]);
            }
            selection = scanner.nextInt();
            if (selection < 1 || selection > Colors.values().length)
                System.out.println("Geçersiz Bir Değer Girdiniz. Lütfen Tekrar Deneyiniz.");
        } while (selection < 1 || selection > Colors.values().length);
        scanner.close();
        super.setColor(Colors.values().clone()[selection]);
    }

    //VehicleCommons("Volkswagen", )

}
