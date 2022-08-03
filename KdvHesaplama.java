package giris;
    import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {

      double fiyat,kdvliFiyat,kdvTutari;
      Scanner input = new Scanner(System.in);

      System.out.print("fiyat:");
      fiyat = input.nextDouble();
      double kdvYuzdesi = (fiyat >= 1000) ? 0.08 : 0.18;
      kdvTutari = fiyat * kdvYuzdesi;
      kdvliFiyat = fiyat + kdvTutari;

      System.out.println("kdvsiz tutar"+fiyat);
      System.out.println("kdv tutarı:"+ kdvTutari);
      System.out.print("kdvli fiyat:"+kdvliFiyat);





    }


}
