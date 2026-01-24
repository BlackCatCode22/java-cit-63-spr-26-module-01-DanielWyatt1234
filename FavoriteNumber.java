// FavoriteNumber.java
// 1/24/26

import java.util.Scanner;

public class FavoriteNumber {

    public static void main(String[] args) {

        System.out.println("What is your favorite number?");
        Scanner sc = new Scanner(System.in);
        int scanned = sc.nextInt();

        System.out.println("Your favorite number is " + scanned + "!");

    }
}
