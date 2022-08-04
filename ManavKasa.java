package Projeler;
import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {

     double     armut = 2.14 ,
                elma = 3.67,
                domates = 1.11,
                muz = 0.95,
                patlican = 5.00 ;
     double toplam,a,b,c,d,e;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo:");
        a = input.nextDouble();
        System.out.print("Elma kaç kilo:");
        b = input.nextDouble();
        System.out.print("Domates kaç kilo:");
        c = input.nextDouble();
        System.out.print("Muz kaç kilo:");
        d = input.nextDouble();
        System.out.print("Patlıcan kaç kilo:");
        e = input.nextDouble();

        toplam = a*armut + b*elma + c*domates + d*muz + e*patlican;

        System.out.print("Toplam tutar : "+toplam);

    }
}
