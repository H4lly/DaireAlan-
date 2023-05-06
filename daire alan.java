import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        double r,alan,a,pi;

        Scanner input= new Scanner(System.in);

        System.out.print("Yarıçapı giriniz: ");

        r = input.nextDouble();

        System.out.print("Merkez açısının ölçüsünü giriniz:");

        a = input.nextDouble();

        pi=3.14;

        alan= (pi*r*r*a)/360.0;

        System.out.println("Daire diliminin alanı:"+alan);










    }
}