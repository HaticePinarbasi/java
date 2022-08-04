package Giris;
import java.util.Scanner;
public class UcgenAlani {

    public static void main(String[] args) {

        int a,b,c,cevre;
        double u,alan;
        Scanner input = new Scanner(System.in);

        System.out.print("1. kenarı girin:");
        a = input.nextInt();
        System.out.print("2.  kenarı girin:");
        b = input.nextInt();
        System.out.print("3.  kenarı girin:");
        c = input.nextInt();

        u = (a+b+c)/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));


        System.out.print("Alan:"+alan);

    }

}
