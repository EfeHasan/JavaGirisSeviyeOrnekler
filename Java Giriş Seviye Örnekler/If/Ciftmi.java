import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();

        if((sayi % 2) == 0)
            System.out.println("Çift bir sayıdır");
        else
            System.out.println("Tek bir sayıdır");
    }
}