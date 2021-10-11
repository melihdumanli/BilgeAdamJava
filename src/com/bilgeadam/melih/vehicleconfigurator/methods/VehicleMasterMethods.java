package com.bilgeadam.melih.vehicleconfigurator.methods;

import com.bilgeadam.melih.vehicleconfigurator.enums.CommercialSegments;
import com.bilgeadam.melih.vehicleconfigurator.maps.Maps;

import java.util.HashMap;
import java.util.Scanner;

public class VehicleMasterMethods {

    public static int categorySelection(){
        Scanner scanner = new Scanner(System.in);
        int selection;
        HashMap<Integer, String > categories = Maps.categorySelection();
        do {
            System.out.println("Lütfen Satın Almak İstediğiniz Araç Kategorisiniz Seçiniz");
            for (HashMap.Entry temp : categories.entrySet()) {
                System.out.println(temp.getKey() + " " + temp.getValue());
            }
            selection = scanner.nextInt();
            if (selection < 1 || selection > 2)
                System.out.println("Geçersiz Bir Değer Girdiniz. Lütfen Tekrar Deneyiniz.");
        } while (selection < 1 || selection > 2);

        scanner.close();
        //System.out.println("Seçiminiz," + categories.get(selection));

        return 0;
    }

    public static void segmentSelection(int selection){
        String selectedSegment;
        if (selection==1)
            commercialVehicleSelection(selection);
        else if (selection==2)
            personalUseOnlyVehicleSelection(selection);
    }

    private static void commercialVehicleSelection(int selection) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String > commercialSegments = Maps.CommercialSegments();
        do {
            System.out.println("Lütfen Kullanım Şeklini Seçiniz:\n");
            for (HashMap.Entry temp: commercialSegments.entrySet()) {
                System.out.println(temp.getKey() + " " + temp.getValue());
            }
        } while (selection < 1 || selection > 2);
        int select = scanner.nextInt();



    }

    private static void personalUseOnlyVehicleSelection(int selection) {
    }

}
