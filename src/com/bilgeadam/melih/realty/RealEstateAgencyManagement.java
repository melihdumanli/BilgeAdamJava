package com.bilgeadam.melih.realty;

import java.io.*;
import java.time.LocalDate;

public class RealEstateAgencyManagement {
    public static void main(String[] args) {
        Adress agencyAddr = new Adress("Balık sokak", "Istanbul", "Turkey", 15);
        RealEstateAgency agency = new RealEstateAgency("Konut Realty", agencyAddr);

        Adress langAddr = new Adress("İnönü Caddesi", "Istanbul", "Turkey", 15);
        Dimension landDim = new Dimension(100.0,200.);
        Land land1 = new Land("Pazaryeri", langAddr, landDim, LocalDate.now(), 200000.0);
        agency.addRealty(land1);
        
        House house1 = new House("Bilge Apt", new Adress("Mustafa Caddesi", "Istanbul","Turkey",45), new Dimension(10.0,10.5),LocalDate.parse("2021-10-15"));
        house1.setLevelNumber(3);
        house1.setNumOfRooms(3);
        house1.setPrice(2000);
        agency.addRealty(house1);
        
        serializeAgency(agency);

        RealEstateAgency myNewAgency = deserializeAgency();
        House house2 = new House("Adam Apt", new Adress("Mustafa Caddesi", "Istanbul","Turkey",5), new Dimension(10.0,10.5),LocalDate.parse("2021-11-15"));
        System.out.println(myNewAgency);
        myNewAgency.addRealty(house2);
        System.out.println(myNewAgency);
    }

    private static void serializeAgency(RealEstateAgency agency) {

        try {
            FileOutputStream file = new FileOutputStream("C:\\Users\\ECZ\\Documents\\agency.data");
            ObjectOutputStream oos = new ObjectOutputStream(file);
            oos.writeObject(agency);
            oos.close();
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
    private static RealEstateAgency deserializeAgency() {
        RealEstateAgency agency = null;
        try {
            File ff = new File("D:\\BA Dersler\\File Test");
            System.out.println(ff.exists());
            FileInputStream file = new FileInputStream("C:\\Users\\ECZ\\Documents\\agency.data");
            ObjectInputStream ois = new ObjectInputStream(file);
            agency = (RealEstateAgency) ois.readObject();
            ois.close();
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }catch (IOException ex){
            ex.printStackTrace();
        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
        return agency;
    }
}
