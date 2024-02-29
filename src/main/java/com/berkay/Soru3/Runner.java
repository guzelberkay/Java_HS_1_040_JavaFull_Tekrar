package com.berkay.Soru3;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    /**
     * Java eğitimi alan bir sınıfın eğitim aldığı alanları içersinde barındıran
     * bir liste oluşturacağız
     *
     * AnaKonu -> adında bir sınıf olacak. Burada [JavaCore, JavaJDBC, JavaEE, Spring]
     * seklinde değerleri tutacak bir sınıf.
     * AltBaslıklar -> Ana konuların alt başlıklarını tutacak bir sınıf, alt baslık adı
     * ve açıklaması
     * Ogrenci -> Ogrenci bilgilerini tutacak bir sınıf.
     * JavaSinifi -> Ogrenci ve AnaKonu Listesini tutacak bir sınıf olacak.
     * Bu sınıfın adı ve eğitimin başlangıç ve bitiş tarihlerini içeren bir sınıf.
     */
    public static void main(String[] args) {
        System.out.println("Program Basladi");
        AltBasliklar altBasliklar = new AltBasliklar("Javada Degiskenler","");
        List<AltBasliklar> altBasliklarList = new ArrayList<>();
        altBasliklarList.add(altBasliklar);

        List<AnaKonu> anaKonuList = new ArrayList<>();
        anaKonuList.add(new AnaKonu("Java Core",altBasliklarList));
        List<Ogrenci> ogrenciList = new ArrayList<>();
        ogrenciList.add(new Ogrenci("Berkay"));

        List<JavaSinifi> javaSinifiList = new ArrayList<>();
        javaSinifiList.add(new JavaSinifi("","",""));

    }
}
