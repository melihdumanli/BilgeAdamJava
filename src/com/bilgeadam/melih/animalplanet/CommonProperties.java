package com.bilgeadam.melih.animalplanet;

public class CommonProperties {
    protected String ureme;
    protected String co2tuketim;
    protected String hareket;
    protected String name;

    public CommonProperties() {
    }

    public CommonProperties(String ureme, String co2tuketim, String hareket, String name) {
        this.ureme = ureme;
        this.co2tuketim = co2tuketim;
        this.hareket = hareket;
        this.name = name;
    }

    @Override
    public String toString() {
        return "CommonProperties{" +
                "ureme='" + ureme + '\'' +
                ", co2tuketim=" + co2tuketim +
                ", hareket='" + hareket + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getUreme() {
        return ureme;
    }

    public void setUreme(String ureme) {
        this.ureme = ureme;
    }

    public String getCo2tuketim() {
        return co2tuketim;
    }

    //String adi; Melih
    //setAdi() = Melih
    //getAdi()  =Melih

    public void setCo2tuketim(String co2tuketim) {
        this.co2tuketim = co2tuketim;
    }

    public String getHareket() {
        return hareket;
    }

    public void setHareket(String hareket) {
        this.hareket = hareket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
