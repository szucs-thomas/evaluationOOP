import java.util.Scanner;

public class Main {
    public static int beker(String szoveg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(szoveg);
        return sc.nextInt();
    }

    public static String szovegBeker(String szoveg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(szoveg);
        return sc.nextLine();
    }

    public static void atlagnalJobbKiir(Diak[] tomb) {
        double atlag = atlagSzamol(tomb);
        System.out.println("Az átlagnál jobb diákok:");
        for (Diak d : tomb) {
            if (d.getJegy()>atlag) {
                d.kiir();
            }
        }
    }

    public static double atlagSzamol(Diak[] diakok) {
        int osszeg = 0;
        for (Diak d : diakok) {
            osszeg += d.getJegy();
        }
        return (double) osszeg / diakok.length;
    }

    public static void main(String[] args) {
        int letszam = beker("Kérem az osztály létszámát: ");
        int maxPont = beker("Kérem a dolgozatban elérhető max. pontot: ");

        Diak[] diakok = new Diak[letszam];

        for (int i = 0; i < letszam; i++) {
            String nev = szovegBeker("Kérem a(z) " + (i + 1) + ". diák nevét: ");
            int elertPont = beker("Kérem  " + nev + " elért pontját:");

            //Diak d = new Diak(nev,elertPont,maxPont);   //Diak obj. létrehozása new Diak(...), osztalyoz() ...,
            diakok[i] = new Diak(nev, elertPont, maxPont);  //obj. berakása a tömbbe  lehet rögtön létrehozáskor oda rakni
           // diakok[i].kiir();  //diak adatainak kiirása
        }
        System.out.println("A dolgozat eredménye: ");
        for (Diak d : diakok) {
            d.kiir();
        }
        System.out.println();
        System.out.println("Az osztály átlaga: " + atlagSzamol(diakok));
        atlagnalJobbKiir(diakok); //átlagnál jobb eredmények kiirása
    }


}