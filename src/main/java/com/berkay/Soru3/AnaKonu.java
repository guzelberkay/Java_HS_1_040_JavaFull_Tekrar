package com.berkay.Soru3;

import java.util.ArrayList;
import java.util.List;

public class AnaKonu {
   private String adi;
    private List <AltBasliklar> altBasliklarList;

    public AnaKonu(String adi, List<AltBasliklar> altBasliklarList) {
        this.adi = adi;
        this.altBasliklarList = new ArrayList<>();
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public List<AltBasliklar> getAltBasliklarList() {
        return altBasliklarList;
    }

    public void setAltBasliklarList(List<AltBasliklar> altBasliklarList) {
        this.altBasliklarList = altBasliklarList;
    }
}
