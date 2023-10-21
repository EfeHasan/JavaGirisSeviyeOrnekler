import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        char harf = scan.next().charAt(0);//string girilmesi isteniyor sonra ilk harfe alınarak chara çevriliyor
        System.out.println(harf);

    }
}