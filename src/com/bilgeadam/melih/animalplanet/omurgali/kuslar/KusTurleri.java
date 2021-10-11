package com.bilgeadam.melih.animalplanet.omurgali.kuslar;

public enum KusTurleri {
    Papagan(1,"papagan"), Serce(2,"serce"), Muhabbet(3,"muhabbet"), Kartal(4, "kartal"), Atmaca(5, "atmaca");

    private final int id;
    private final String kusAdi;

    KusTurleri(int id, String kusAdi) {
        this.id = id;
        this.kusAdi = kusAdi;
    }
}
