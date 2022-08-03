package Giris;
import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {

        int matematik,fizik,turkce,kimya,muzik,tarih;
        Scanner input = new Scanner(System.in);

        System.out.print("matematik notu:");
        matematik = input.nextInt();
        System.out.print("fizik notu:");
        fizik = input.nextInt();
        System.out.print("türkçe notu:");
        turkce = input.nextInt();
        System.out.print("kimya notu:");
        kimya = input.nextInt();
        System.out.print("müzik notu:");
        muzik = input.nextInt();
        System.out.print("tarih notu:");
        tarih = input.nextInt();
        double toplam = (matematik+fizik+turkce+kimya+muzik+tarih);
        double ortalama = toplam/6;
        System.out.println("ortalama :"+ortalama);
        String str = (ortalama > 60) ?"Sınıfı geçti":"Sınıfta kaldı";
        System.out.print("durum:"+str);


    }
}
