import javax.swing.plaf.synth.SynthLookAndFeel;
import  java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double say1 , say2 , ortalma;

        System.out.print("Birinci Sayıyı Giriniz");
        say1 = scan.nextDouble();

        System.out.print("İkinci Sayiyi Giriniz");
        say2 = scan.nextDouble();

        ortalma = (say1 + say2) / 2;
        if(ortalma >= 50)
        {
            System.out.println("Geçtiniz");
        }
        else
        {
            System.out.println("Kaldınız");
        }
    }
}