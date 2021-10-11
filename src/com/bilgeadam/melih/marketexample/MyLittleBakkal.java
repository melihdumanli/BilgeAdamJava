package com.bilgeadam.melih.marketexample;

import com.bilgeadam.BAUtils.BAUtils;

import java.util.HashMap;

public class MyLittleBakkal {
    public static void main(String[] args) {
        BAUtils.header("M E L İ H ' İ N   B A K K A L  D Ü K K A N I");

        HashMap<Integer, String > menu = initMenu();
        boolean cont = false;
        do {
            int selection = BAUtils.menu(menu);
            cont = processMenu(selection);
        }while (cont);
        BAUtils.footer();
    }

    private static boolean processMenu (int selection){
        // her bir menü kalemi için bir fonksiyon yazılacak
        if (selection==99)
            return false;
        System.out.println(selection + " seçildi");
        return true;
    }

    private static HashMap<Integer, String > initMenu(){
        HashMap<Integer,String > menu = new HashMap<>();
        menu.put(1, "Çalışan Girişi");
        menu.put(2, "Ürün Listele");
        menu.put(8, "Ürün Gir");
        menu.put(23, "Stok Sorgula");
        menu.put(6," Fiyat Güncelle");
        menu.put(7, "Müşteri Tanımla");
        menu.put(3, "Müşteri Listesi");
        menu.put(4, "Ürün Listesi");
        menu.put(99, "Programı Bitir");

        return menu;
    }
}
