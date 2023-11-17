package de.neuefische;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int i = 0;
//        System.out.println(10/i);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Bitte geben Sie eine Zahl ein");
//        int i = scanner.nextInt();
//        System.out.println(i);

        CarRepo repo = new CarRepo();

        try {
            repo.getCarById("1");
        } catch (CarNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("Lala");
        }


        System.out.println(1+2);
        /**
         *                                Exception
         *                                /      \
         *                               /        \
         *                     Checked Ex.       Unchecked Ex. / Runtime Exceptions
         *   Werden zur compilezeit geprüft!     Werden nicht geprüft.
         *   -> Erwartbare Fehler                -> (Un)Erwartbare Fehler
         *   -> Müssen wir behandeln             -> Sollten wir behandel
         *   -> Müssen angezeigt werden.         -> Sollten angezeigt werden
         */

    }
}