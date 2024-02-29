package com.berkay.Soru2;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;

public class Runner {
    public static void main(String[] args) {
        /**
         * Bir component sınıfı yazıyorsunuz bu sınıf abstract bir sınıf olacak,
         * bu sınıftan farklı bileşenler türeteceksiniz. Mesela;
         * Input, Label, Button bu sınıfların belli işlevleri olacak.
         *
         * 1- Input sınıfı oluşturulurken, default değer olabilecektir.
         * 2- Input sınıfının değişken değeri set edilebilecektir.
         * 3- Label sınıfı oluşturulurken mutlaka bir değer almalı (String)
         * 4- Label sınıfı System.out ile çıktılandığında içinde String değeri ekrana
         * yazdırır.
         * 5- Buton oluşturulurken mıutlaka width,height,text seklinde 3 değer almalıdır.
         * 6- Buton sınıfının içinde onClick adında bir method olmalıdır ve çalıştığında
         * buton tıklandı ifadesi sout ile ekrana çıktı vermelidir.
         * DİKKAT!!!!!
         * tüm component nesnelerinin width,height ve label bilgileri vardır ve abstract
         * içinde mutlaka default verilerle set edilmelidir. Yani bir Input nesnesi
         * oluşturduğunuzda bu nesnenin default genişlik ve yüksekliği abstract Component
         * sınıfında belirlenmelidir.
         */

        Input input = new Input();
        System.out.println(input);
        // java win form oluturmak
//        JFrame form = new JFrame("Bileşen Örneği");
//        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        form.setPreferredSize(new Dimension(1024,100));
//
//// java label oluşturmak
//        JLabel label = new JLabel("Adınızı giriniz");
//        label.setPreferredSize(new Dimension(150,30));
//        label.setBackground(Color.orange);
//        Border border = BorderFactory.createBevelBorder(BevelBorder.LOWERED,Color.BLUE,Color.BLACK);
//        label.setBorder(border);
//
//// java input text oluşturmak
//        JTextField input = new JTextField(50);
//// java button oluşturmak
//        JButton buton = new JButton("Giriş Yap");
//// bileşenleri taşımak için bir panel oluşturmak ve panele bileşenleri eklemek
//        JPanel panel = new JPanel(new FlowLayout());
//        panel.add(label);
//        panel.add(input);
//        panel.add(buton);
//// panel yapısının form üzerinde eklenmesi
//        form.getContentPane().add(panel);
//        form.pack();
//        form.setVisible(true);
//
    }
}
