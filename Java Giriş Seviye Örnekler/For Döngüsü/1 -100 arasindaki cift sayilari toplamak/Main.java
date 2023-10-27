// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {
        // 1 - 100 arasındaki çift sayıları toplamak
        int toplam = 0 , bitis = 100 , baslangic;
        for (baslangic = 1; baslangic <= bitis; baslangic++)
        {
           int mod = baslangic % 2;
           if(mod == 0)
               toplam += baslangic;
        }
        System.out.println(toplam);
    }
}