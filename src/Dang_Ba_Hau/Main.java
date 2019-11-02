package Dang_Ba_Hau;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius ;
        int choice ;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Fahrenheit");
                    fahrenheit = input.nextDouble();
                    fahrenheitToCelsius(fahrenheit);
                    choice = 0;

                    break;
                case 2:
                    System.out.println("Enter Celsius");
                    celsius = input.nextDouble();
                    CelsiusToFahrenheit(celsius);
                    choice = 0;

                    break;
                case 0:
                    System.exit(0);

            }
        }
            while (choice != 0) ;

    }

    public static void CelsiusToFahrenheit(double celsius) {
        double fahrenheit = celsius*(9.0/5.0)+32 ;
        System.out.printf("\n%f Celsius to Fahrenheit %f",celsius , fahrenheit);

    }
    public static void fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9.01
        ) * (fahrenheit - 32);
        System.out.printf("\n%f Fahrenheit to Celsius %f",fahrenheit , celsius);

    }
}
