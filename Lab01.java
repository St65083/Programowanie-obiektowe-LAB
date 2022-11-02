import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Wypisz();
        System.out.println(getWiek()); //zad 1
        System.out.println(getName()); //zad 1
        Obliczenia(); //zad 2
        System.out.println(CzyParzysta(2)); //zad 3
        System.out.println(CzyPodzielna(31)); //zad 4
        System.out.println(Potega(2)); //zad 5
        Pierwiastek(4); //zad 6
        LiczbyLosoweTrojkat(); //zad 7
    }

    /* public static void Wypisz()
    {
        int a=-2, b=23;
        Scanner input = new Scanner(System.in);
        System.out.println("podaj c ");
        int c=getInt();
        System.out.println("a = "+ a +", b= "+b);
    }
     */

    public static int getInt()
    {
        return new Scanner(System.in).nextInt();
    }
    /*public static double getDouble()
    {
        return new Scanner(System.in).nextDouble();
    }*/

    //zad 1 ---------------
    public static int getWiek()
    {
        System.out.println("zad 1");
        return 23;
    }
    public static String getName()
    {
        return "Dawid";
    }

    //zad 2 ------------------
    public static void  Obliczenia()
    {
        System.out.println("zad 2");
        System.out.println("Podaj 2 liczby całkowite");
        int a=getInt();
        int b=getInt();
        System.out.println("Suma "+a+ " + "+b+" = "+(a+b));
        System.out.println("Różnica "+a+ " - "+b+" = "+(a-b));
        System.out.println("Iloczyn "+a+ " * "+b+" = "+(a*b));
    }

    //zad 3 ------------------
    public static boolean CzyParzysta(int c)
    {
        System.out.println("zad 3");
        if(c%2==0) return true;
        return false;
    }

    //zad 4 ---------------------
    public static boolean CzyPodzielna(int d)
    {
        System.out.println("zad 4");
        if(d%3==0 && d%5==0) return true;
        return false;
    }

    //zad 5 -----------------------
    public static int Potega(int e)
    {
        System.out.println("zad 5");
        return e*e*e;
    }

    //zad 6 -----------------------
    public static void Pierwiastek(double f)
    {
        System.out.println("zad 6");
       double sqrt = Math.sqrt(f);
       System.out.println(sqrt);
    }

    //zad 7 ------------------------
    public static void LiczbyLosoweTrojkat()
    {
        Random rand = new Random();
        System.out.println("Podaj przedział liczb");
        int a=getInt();
        int b=getInt();
        /* int losowa=rand.nextInt(b-a+1)+a;
        System.out.println(a+" i "+b+" "+losowa); */ //sprawdzenie

        int bok1=rand.nextInt(b-a+1)+a;
        int bok2=rand.nextInt(b-a+1)+a;
        int bok3=rand.nextInt(b-a+1)+a;

        if((bok1+bok2>bok3 && bok1+bok3>bok2 && bok2+bok3>bok1))
        {
            System.out.println("z podanych liczb:"+bok1+" "+bok2+" "+bok3+" da się utworzyć trójkąt");
        }
        else
        {
            System.out.println("z podanych liczb:"+bok1+" "+bok2+" "+bok3+" nie da się utworzyć trójkąta");
        }

    }

}