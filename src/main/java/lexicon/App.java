package lexicon;


import java.util.InputMismatchException;
import java.util.Scanner;


public class App
{
    public static void main( String[] args )
    {
        while (true) {
            printMenu();
            switch (getInputNumber()) {
                case 0:
                    Ex0.ex0();
                    break;
                case 1:
                    Ex1.ex1();
                    break;
                case 2:
                    Ex2.ex2();
                    break;
                case 3:
                    Ex3.ex3();
                    break;
                case 4:
                    Ex4.ex4();
                    break;
                case 5:
                    Ex5.ex5();
                    break;
                case 6:
                    Ex6.ex6();
                    break;
                case 7:
                    Ex7.ex7();
                    break;
                case 8:
                    Ex8.ex8();
                    break;
                case 9:
                    Ex9.ex9();
                    break;
                case 10:
                    Ex10.ex10();
                    break;
                case 11:
                    Ex11.ex11();
                    break;
                case 12:
                    System.exit(12);
                    break;
                default:
                    System.out.println("\t\texercise number is not valid");
                    break;
            }


        } // while


    } //main

    public static void printMenu() {
        System.out.println("##### String Exercises #####");
        System.out.println("\tEnter 12 to Exit");
        System.out.print("\tExercise number (0-11): ");
    }

    public static int getInputNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("\t\tenter a valid number between 0-12");
        }

        return number;
    }
}