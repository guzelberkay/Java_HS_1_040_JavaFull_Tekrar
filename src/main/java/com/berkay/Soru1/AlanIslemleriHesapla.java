package com.berkay.Soru1;

import java.util.Scanner;


public class AlanIslemleriHesapla {
    private double alanHesapla(Type type, int...size){
        int alan = 0;
        switch (type) {
            case KARE:
                alan = size[0] * size[0];
                break;

            case DORTGEN:
                alan = size[0] * size[1];
                break;

            default:
                System.out.println("Geçersiz tip");
        }

        return alan;
    }
    public void AlanIslemleri() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seciniz?");
        System.out.println("1. Kare Alan Hesapla");
        System.out.println("2. Dikdörtgen Alan Hesapla");

        int secim = scanner.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Karenin kenar uzunluğunu giriniz: ");
                int kenarKare = scanner.nextInt();
                System.out.println("Alan: " + alanHesapla(Type.KARE,kenarKare));
                break;
            case 2:
                System.out.println("Dikdörtgenin ilk kenar uzunluğunu giriniz: ");
                int kenar1 = scanner.nextInt();
                System.out.println("Dikdörtgenin ikinci kenar uzunluğunu giriniz: ");
                int kenar2 = scanner.nextInt();
                System.out.println("Alan: " + alanHesapla(Type.DORTGEN, kenar1, kenar2));
                break;

            default:
                System.out.println("Geçersiz seçim");
        }
    }



}
