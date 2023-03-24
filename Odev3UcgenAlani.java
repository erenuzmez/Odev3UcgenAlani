package Java101odevler;
import java.util.Scanner;
public class Odev3UcgenAlani {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double alan,u,kenar1,kenar2,kenar3;
        System.out.println("1.Kenarı giriniz:");
        kenar1=input.nextDouble();
        System.out.println("2.Kenarı giriniz:");
        kenar2=input.nextDouble();
        System.out.println("3.Kenarı giriniz:");
        kenar3=input.nextDouble();
        u=(kenar1+kenar2+kenar3)/2;
        alan=Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
        System.out.println("Üçgenin Alanı:"+alan);


    }
}
