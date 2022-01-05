// Jonatan Meyer - Mini-assignment 2: Number "Analyzer" - 01-10-2020
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {



                int Number;
                Scanner sc = new Scanner(System.in);
                System.out.println("\n Please Enter a number: ");

                String Number1 = sc.nextLine();
                Number =Integer.parseInt(Number1);
                // Ovenstående kode aflæser brugerens input og


                if (Number == 0) {
                    System.out.println("You have entered Zero!");
                }
                else if (Number < 0) {
                    System.out.println("You have entered a negative number!");

                }
                // Ovenstående kode checker om det bruger indstastede tal er 0, positivt eller negativt.


                else {

                    System.out.println("You have entered a positive number!");

                }

                if (Number % 2 == 0) {
                    System.out.println("You have entered a even number!");
                }
                else {
                    System.out.println("You have entered an odd number!");
                }
                // Dette ovenstående kode checker om det brugerinstastede tal er et lige eller ulige tal.

            }
        }


