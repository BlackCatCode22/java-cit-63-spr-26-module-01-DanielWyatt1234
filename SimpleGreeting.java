// SimpleGreeting.java
// 1/24/26

import java.util.Scanner;

public class SimpleGreeting {

    public static void main(String[] args){
        System.out.println("Hello. What is your name?");
        Scanner sc = new Scanner(System.in);
        String scanned = sc.next();

        System.out.println("Nice to meet you, " + scanned + "!");
    }
}
