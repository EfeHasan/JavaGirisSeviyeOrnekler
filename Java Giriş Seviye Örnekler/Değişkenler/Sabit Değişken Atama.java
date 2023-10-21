public class Main
{
    public static void main(String[] args)
    {
        int kenar1, kenar2, cevre;
        final int hipotenüs = 5;//hiç bir şekilde içindeki değer değiştirilemez
        //hipotenüs = 1 hata verir
        kenar1 = 1;
        kenar2 = 3;
        cevre=kenar1 + kenar2 + hipotenüs;
        System.out.println(cevre);
    }
}