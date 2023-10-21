// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {
        String isim = "Efe";
        String soyisim = "Gültekin";
        System.out.println(isim + soyisim);
        //EfeGültekin olarak çıktı verir araya boşluk konulmadığı için
        System.out.println(isim + " " + soyisim);
        //Efe Gültekin oplarak çıktı verir araya boşluk konuldu
    }
}