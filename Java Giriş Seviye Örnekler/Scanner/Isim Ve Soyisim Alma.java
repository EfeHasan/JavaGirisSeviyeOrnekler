import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scann = new Scanner(System.in);
        String isim, soyisimi, isimSoyisim;

        System.out.print("İsminizi Giriniz:");
        isim = scann.nextLine();

        System.out.print("\nSoyisminizi Giriniz:");
        soyisimi = scann.nextLine();

        isimSoyisim = isim + " " + soyisimi;
        System.out.println(isimSoyisim);
        System.out.println(isimSoyisim.length());
    }
}