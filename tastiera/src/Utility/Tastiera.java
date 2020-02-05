package Utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Tastiera {

    private static BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

    public static int leggiIntero(String mess, int min, int max) throws ValoreNonRange {
        int numInt = 0;
        boolean errore;
        do {
            errore = false;
            System.out.println("inserisci un numero");
            try {
                numInt = Integer.parseInt(tastiera.readLine());
                if (numInt < min || numInt > max) throw new ValoreNonRange("inserire un numero tra " + min + "e" + max);
                errore = true;
            } catch (NumberFormatException e) {
                System.out.println("numero non valido");
            } catch (IOException e) {
                System.out.println("errore nell'input");
            }
        }while (!errore);
        return numInt;
    }

    public static float leggiFloat(String mess, float min, float max) throws ValoreNonRange {
        float numFloat = 0;
        boolean errore;
        do {
            errore = false;
            System.out.println("inserisci un numero");
            try {
                numFloat = Float.parseFloat(tastiera.readLine());
                if (numFloat < min || numFloat > max) throw new ValoreNonRange("inserire un numero tra " + min + "e" + max);
                errore = true;
            } catch (NumberFormatException e) {
                System.out.println("numero non valido");
            } catch (IOException e) {
                System.out.println("errore nell'input");
            }
        }while (!errore);
        return numFloat;
    }

    public static double leggiDouble(String mess, double min, double max) throws ValoreNonRange {
        double num = 0;
        boolean errore;
        do {
            errore = false;
            System.out.println("inserisci un numero");
            try {
                num = Double.parseDouble(tastiera.readLine());
                if (num < min || num > max) throw new ValoreNonRange("inserire un numero tra " + min + "e" + max);
                errore = true;
            } catch (NumberFormatException e) {
                System.out.println("numero non valido");
            } catch (IOException e) {
                System.out.println("errore nell'input");
            }
        }while (!errore);
        return num;
    }
    
}
