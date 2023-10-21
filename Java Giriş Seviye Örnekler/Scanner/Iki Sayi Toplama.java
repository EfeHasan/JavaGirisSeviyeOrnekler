import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scann = new Scanner(System.in);
        int sayi1 , sayi2 , toplam;//değişkenler tanımlandı

        System.out.print("Birinci Sayıyı Giriniz:");
        sayi1 = scann.nextInt();

        System.out.print("İkinci Sayıyı Giriniz:");
        sayi2 = scann.nextInt();

        toplam = sayi1 + sayi2;

        System.out.println(toplam);
    }
}