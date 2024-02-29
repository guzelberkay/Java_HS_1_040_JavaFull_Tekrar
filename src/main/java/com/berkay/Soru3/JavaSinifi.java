package com.berkay.Soru3;

import java.sql.DataTruncation;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JavaSinifi {
    String adi;
    String baslangicTarihi;
    String bitisTarihi;
    List<AnaKonu> anaKonular;
    List<Ogrenci> ogrenciler;

    public JavaSinifi(String adi, String baslangicTarihi, String bitisTarihi) {
        this.adi = adi;
        this.baslangicTarihi = baslangicTarihi;
        this.bitisTarihi = bitisTarihi;
        this.anaKonular = new ArrayList<>();
        this.ogrenciler = new ArrayList<>();

    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getBaslangicTarihi() {
        return baslangicTarihi;
    }

    public void setBaslangicTarihi(String baslangicTarihi) {
        this.baslangicTarihi = baslangicTarihi;
    }

    public String getBitisTarihi() {
        return bitisTarihi;
    }

    public void setBitisTarihi(String bitisTarihi) {
        this.bitisTarihi = bitisTarihi;
    }

    public List<AnaKonu> getAnaKonular() {
        return anaKonular;
    }

    public void setAnaKonular(List<AnaKonu> anaKonular) {
        this.anaKonular = anaKonular;
    }

    public List<Ogrenci> getOgrenciler() {
        return ogrenciler;
    }

    public void setOgrenciler(List<Ogrenci> ogrenciler) {
        this.ogrenciler = ogrenciler;
    }
}
