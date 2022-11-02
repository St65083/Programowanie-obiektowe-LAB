import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        rownanieKwadratowe(); //zad 1
        wartosciFunkcjiA(); //zad 2
        wartosciFunkcjiB(); //zad 2
        wartosciFunkcjiC(); //zad 2
        porzadkowanie(); //zad 3
        przystanek(); //zad 4
        samochod(); //zad 5
        kalkulator(); //zad 6
    }

    public static double getDouble()
    {
        return new Scanner(System.in).nextDouble();
    }
    public static int getInt()
    {
        return new Scanner(System.in).nextInt();
    }
    public static boolean getBoolean()
    {
        return new Scanner(System.in).nextBoolean();
    }


    //zad 1 ---------------------
    public static void rownanieKwadratowe()
    {
        System.out.println("Podaj liczby a,b,c");
        double a=getDouble();
        double b=getDouble();
        double c=getDouble();
        double delta, x0,x1,x2;

        delta=b*b-(4*a*c);
        if(a!=0)
        {
            if (delta < 0)
            {
                System.out.println("Rówanie nie ma rozwiązań");
            }
            else if (delta == 0)
            {
                x0=-b/(2*a);
                System.out.println("Rówanie ma jedno rozwiązanie: "+x0);
            }
            else
            {
                x1= (-b - Math.sqrt(delta))/(2*a);
                x2= (-b + Math.sqrt(delta))/(2*a);

                System.out.println("Rówanie ma 2 rozwiązania: "+x1+" "+x2);
            }
        }
    }

    //zad 2---------------------
    public static void wartosciFunkcjiA()
    {
        System.out.println("Podaj x dla a(x)");
        double x = getDouble();

        if(x>0)
        {
            System.out.println(x*2);
        }
        else if (x == 0)
        {
            System.out.println(x=0);
        }
        else if(x<0)
        {
            System.out.println(x*(-3));
        }
    }

    public static void wartosciFunkcjiB()
    {
        System.out.println("Podaj x dla b(x)");
        double x = getDouble();

        if(x>=1)
        {
            System.out.println(x*x);
        }
        else if (x<1)
        {
            System.out.println(x=x);
        }
    }

    public static void wartosciFunkcjiC()
    {
        System.out.println("Podaj x dla c(x)");
        double x = getDouble();

        if(x>2)
        {
            System.out.println(x+2);
        }
        else if (x==2)
        {
            System.out.println(x=8);
        }
        else if(x<2)
        {
            System.out.println(x=x-4);
        }
    }

    //zad 3 ----------------------
    public static void porzadkowanie()
    {
        System.out.println("Podaj liczby x,y,z");
        double x=getDouble();
        double y=getDouble();
        double z=getDouble();
        double[] tab ={x,y,z};
        double temp;
        for(int i=0; i<tab.length-1; i++)
        {
            for(int j=0; j<tab.length-1; j++)
            {
                if(tab[j]>tab[j+1])
                {
                    temp=tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                }
            }
        }
        System.out.println("Postortowane liczby: ");
        for(int i=0; i<tab.length; i++)
        {
            System.out.println(tab[i]+" ");
        }
    }

    // zad 4 ----------------------------
    public static void przystanek()
    {
        System.out.println("Czy jest autobus? Tak:true, Nie:false");
        boolean autobus=getBoolean();
        System.out.println("Czy jest deszcz? Tak:true, Nie:false");
        boolean deszcz=getBoolean();


        if(deszcz && autobus)
        {
            System.out.println("Weź parasol");
            System.out.println("Dostaniesz się na uczelnię");
        }
        else if(deszcz && !autobus)
        {
            System.out.println("Nie dostaniejsz się na uczelnię");
        }
        else if(!deszcz && autobus)
        {
            System.out.println("Dostaniesz się na uczelnię");
            System.out.println("Miłego dnia i pieknej pogody");
        }
    }

    //zad 5 -----------------------------
    public static void samochod()
    {
        System.out.println("Czy jest znizka? Tak:true, Nie:false");
        boolean znizka=getBoolean();
        System.out.println("Czy otrzymałeś premię? Tak:true, Nie:false");
        boolean premia=getBoolean();


        if(!znizka || premia)
        {
            System.out.println("Możesz kupić samochód");
            System.out.println("Zniżki na samochód nie ma");
        }

        else if(!znizka || !premia)
        {
            System.out.println("Zakup samochodu trzeba odłożyć na pózniej ..");
            System.out.println("Zniżki na samochód nie ma");
        }
        else if(znizka || premia)
        {
            System.out.println("Możesz kupić samochód");
        }
    }

    //zad 6 --------------------
    public static void kalkulator()
    {
        System.out.println("Podaj a i b");
        double a=getDouble();
        double b=getDouble();

        System.out.println("Wybierz operację na liczbach");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnozenie");
        System.out.println("4. Dzielenie");
        System.out.println("5. Reszta z dzielenia");

        int wybor=getInt();

        switch(wybor)
        {
            case 1:
                System.out.println("suma = "+(a+b));
                break;
            case 2:
                System.out.println("różnica = "+(a-b));
                break;
            case 3:
                System.out.println("iloczyn = "+(a*b));
                break;
            case 4:
                if(b !=0)
                {
                    System.out.println("iloraz = "+(a/b));
                }
                else
                {
                    System.out.println("Nie wolno dzielić przez0");
                }

                break;
            case 5:
                System.out.println("reszta z dzielenia = "+(a%b));
                break;
        }
    }
}