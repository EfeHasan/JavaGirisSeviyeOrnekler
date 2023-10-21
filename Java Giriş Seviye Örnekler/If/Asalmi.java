import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int deger = scan.nextInt();
        boolean asalmi = true;
        for(int i = 2; i < deger ; i++)
        {
            int mod = deger % i;
            if (mod == 0)
            {
                 System.out.println("Asal Sayı Değildir");
                 asalmi = false;
                 break;
            }
        }
        if(asalmi)
        {
            System.out.println("Asal Sayıdır");
        }
    }
}