package com.ega;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("3 jautājumi par JAVA.");
//  1. jaut
        System.out.println("Kāds ir JAVA sākotnējais nosaukums?");
        name = scanner.nextLine();

    if (name.equals("Oak")) {
        System.out.println("Pareizi!");
    } else {
        System.out.println(":(");
    }

//  2. jaut
            System.out.println("Mainīgie ir__________ datu vērtību glabāšanai.");
            name = scanner.nextLine();

            if (name.equals("konteineri")) {
                System.out.println("Pareizi!");
            } else {
                System.out.println(":(");

            }
// 3. jaut
            System.out.println("Ko apzīmē datu tips:'INT'?");
            name = scanner.nextLine();

            if (name.equals("veselos skaitļus")) {
                System.out.println("Pareizi!");
            } else {
                System.out.println(":(");

            }
        System.out.println("Apsveicu. Tu esi atbildējis, pareizi, uz visiem jautājumiem.");
        }
    }



