// TempConverter.java
// 1/24/26

import java.util.Scanner;

public class TempConverter {

    public static void main(String[] args){

        System.out.println("What is the temperature Fahrenheit?");
        Scanner sc = new Scanner(System.in);
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        System.out.println(fahrenheit + "F is " + celsius + "C!");
    }
}
