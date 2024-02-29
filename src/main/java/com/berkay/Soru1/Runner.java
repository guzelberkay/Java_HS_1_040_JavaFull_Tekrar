package com.berkay.Soru1;

import com.berkay.Soru1.AlanIslemleriHesapla;

public class Runner {
    public static void main(String[] args) {
        /**
         * Bir sınıf oluşturuyoruz. Bu sınıf içinde şu iki method bulunmakta,
         * private int AlanHesaplama(Type type, int... size)
         *
         * public void AlanIslemleri(){
         *
         * }
         *
         * İşlev:
         * - İlk method girilen tipe göre gelen uzunluklardan alan hesaplayacak
         * - İkinci method kullanıcı ile iletişime geçerek hangi işlemleri yapmak
         * istediğini talep ederek işlem seçtirecek ve kenar uzunluklarını alacaktır.
         * Yukarıdaki bilgilere göre ilgili sınıfı yazınız.
         */

        AlanIslemleriHesapla alanIslemleri = new AlanIslemleriHesapla();
        alanIslemleri.AlanIslemleri();

    }
}
