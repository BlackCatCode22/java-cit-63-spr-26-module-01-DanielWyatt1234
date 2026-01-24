// CircleArea.java
// 1/24/26

import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args) {

        System.out.println("What is the radius of your circle?");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double area = Math.PI * (radius * radius);

        System.out.println("The area of your circle is " + area + "!");
    }
}
