package Projeler;
import java.util.Scanner;
public class DaireDilimininalani {
    public static void main(String[] args) {

        int r,a;
        double alan,pi = 3.14;
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapı:");
        r = input.nextInt();
        System.out.print("merkez açısının ölçüsü");
        a = input.nextInt();

        alan =(pi*(r*r)*a)/360;

        System.out.print("Daire dilimini alanı:"+alan);

    }
}
