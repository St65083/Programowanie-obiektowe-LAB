import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args)
    {
        srednia(); //zad 1
        dodatnieIUjemne(); //zad 2
        int[] tab = {1,2,3,4,5,6};
        ciag(tab); //zad 3
        losowanie(); //zad 4
        //palindrom(); // zad 5 błąd, nie zdążyłem go poprawić
    }

    public static int getInt()
    {
        return new Scanner(System.in).nextInt();
    }
    public static double getDouble()
    {
        return new Scanner(System.in).nextDouble();
    }

    //zad 1 --------------
    public static void srednia()
    {
        System.out.println("Podaj liczbę studentów");
        int n=getInt();
        int i=0;
        int suma=0;
       while(i<n)
        {
            System.out.println("Podaj punkty studenta");
            int punkty=getInt();
            suma+=punkty;
            i++;
        }
        double srednia=suma/n;
        System.out.println("Średnia punktów studentów to: "+srednia);
    }

    //zad 2 ------------------------
    public static void dodatnieIUjemne()
    {
        int n=10;
        int i=0;
        double dodatnie =0;
        double ujemne=0;
        double dodatnieSuma=0;
        double ujemneSuma=0;

        while(i<n)
        {
            System.out.println("Podaj liczbę ");
            int liczba=getInt();
            if(liczba <0)
            {
                ujemne++;
                ujemneSuma+=liczba;
            }
            else
            {
                dodatnie++;
                dodatnieSuma+=liczba;
            }
            i++;
        }
        System.out.println("Liczby ujemne "+ujemne+" suma ujemnych: "+ujemneSuma);
        System.out.println("Liczby dodatnie "+dodatnie+" suma dodatnie: "+dodatnieSuma);
    }

    //zad 3 ---------------------
    public static void ciag(int[] tab)
    {
        int suma=0;
        for(int i=0;i<tab.length; i++)
        {
            int liczba = tab[i];
            if(liczba%2==0)
            {
                suma+=liczba;
            }
        }
        System.out.println("Suma liczb parzystych "+suma);
    }

    //zad 4 ----------------------
    public static void losowanie()
    {
        System.out.println("Podaj n ");
        int n=getInt();
        Random rand = new Random();
        int[] tab=new int[n];
        for(int i=0; i<n; i++)
        {
            tab[i]=rand.nextInt(-10,45);
        }
        ciag(tab);
    }

    //zad 5 ------------
    public static void palindrom(String[] args)
    {
        System.out.println("Podaj słowo ");
        Scanner scan = new Scanner(System.in);
        String slowo = scan.nextLine();
        String slowoNaOdwrot="";

        int dlgoscSlowa=slowo.length();
        for(int i =(dlgoscSlowa -1); i>=0; --i)
        {
            slowoNaOdwrot=slowoNaOdwrot+slowo.charAt(i);

            if(slowo.equals(slowoNaOdwrot))
            {
                System.out.println("To jest palindrom ");
            }
            else
            {
                System.out.println("To nie jest palindrom ");
            }
        }
    }

}