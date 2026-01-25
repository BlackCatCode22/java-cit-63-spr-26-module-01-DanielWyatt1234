// MadLibs.java
// 1/24/26

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--- Welcome to Java Mad Libs! ---");

        System.out.print("Enter an adjective (describing word): ");
        String adjective = sc.next();

        System.out.print("Enter a noun (person, place, or thing): ");
        String noun = sc.next();

        System.out.print("Enter a verb (action word): ");
        String verb = sc.next();

        System.out.print("Enter a place: ");
        String place = sc.next();

        System.out.print("Enter a plural noun: ");
        String pluralNoun = sc.next();

        System.out.println("\n--- Your Mad Libs Story ---");
        System.out.println("Yesterday, I saw a very " + adjective + " " + noun + ".");
        System.out.println("It decided to " + verb + " all the way to " + place + ".");
        System.out.println("On the way, it met some " + pluralNoun + " who thought it was hilarious!");
        System.out.println("It was truly a day to remember.");
    }
}