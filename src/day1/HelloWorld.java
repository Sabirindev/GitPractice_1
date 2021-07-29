package day1;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello worlD");

        Scanner scan = new Scanner(System.in);
        String b = scan.next();

        scan.nextLine();

        String a = scan.nextLine();


        System.out.println(a);
        System.out.println(b);
    }

}
