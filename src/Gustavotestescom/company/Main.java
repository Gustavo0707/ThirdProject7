package Gustavotestescom.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, number2, number3, number4,number5;
        boolean valid = true;

        System.out.println("type 5 numbers");
        number = scanner.nextInt();
        number2 = scanner.nextInt();
        number3 = scanner.nextInt();
        number4 = scanner.nextInt();
        number5 = scanner.nextInt();

        while(valid = true){
            if (number > number2 & number > number3 & number > number4 & number > number5){
                System.out.println("The great number is " + number);
            }
            else if(number2 > number & number2 > number3 & number2 > number4 & number2 > number5){
                System.out.println("The great number is " + number2);
            }
            else if(number3 > number & number3 > number2 & number3 > number4 & number3 > number5){
                System.out.println("The great number is " + number3);
            }
            else if(number4 > number & number4 > number2 & number4 > number3 & number4 > number5){
                System.out.println("The great number is " + number4);
            }
            else if (number5 > number & number5 > number2 & number5 > number3 & number5 > number4){
                System.out.println("The great number is " + number5);
            }
            break;
        }
    }
}
