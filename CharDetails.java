// CharDetails.java
// 1/24/26

import java.util.Scanner;

public class CharDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        String category = Character.isLetter(ch) ? "Letter" : (Character.isDigit(ch) ?  "Digit" : "Special Character");

        System.out.println("\n--- Character Details ---");
        System.out.println("Input: " + ch);
        System.out.println("Type: " + category);
        System.out.println("ASCII Value: " + (int) ch);
    }
}
