import java.io.Console;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        scan.close();

        for(int i = sayi1; i < sayi2; i++)
            System.out.println(i);
    }
}