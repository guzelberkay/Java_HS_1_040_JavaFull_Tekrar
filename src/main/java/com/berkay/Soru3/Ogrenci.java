package com.berkay.Soru3;

import java.util.UUID;

public class Ogrenci {
    private String ad;
    private String id;

    public Ogrenci(String ad) {
        this.ad = ad;
        this.id = UUID.randomUUID().toString();
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
