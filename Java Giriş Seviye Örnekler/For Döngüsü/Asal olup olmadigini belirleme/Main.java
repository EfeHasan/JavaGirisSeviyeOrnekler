import com.sun.tools.jconsole.JConsoleContext;

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int deger = scan.nextInt(); boolean asal = true;
        scan.close();

        for(int i = 2 ; i < deger; i++ )
        {
            int mod = deger % i;

            if(mod == 0)
            {
                System.out.println("Sayınız asal sayı değildir");
                asal = false;
                break;
            }
        }
        if(asal)
        {
            System.out.println("Sayınız asal asayıdır");
        }
    }
}