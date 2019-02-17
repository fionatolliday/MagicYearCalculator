package com.company;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String welcome = "Welcome to the magic year calculator";
                System.out.println(welcome);




                System.out.println("Please input your name:");
                     InputStream name = System.in;
                     Scanner readname = new Scanner(name);
                     String linename = readname.nextLine();

                System.out.println("Please input your surname:");
                    InputStream surname = System.in;
                    Scanner readsurname = new Scanner(surname);
                    String linesurname = readsurname.nextLine();

                System.out.println("Please enter your annual salary:");
                    InputStream salary = System.in;
                    Scanner readsalary = new Scanner(salary);
                    String linesalary = readsalary.nextLine();
                    int salaryint = Integer.parseInt(linesalary);



                System.out.println("Please enter your work start year:");
                    InputStream year = System.in;
                    Scanner readyear = new Scanner(year);
                    String lineyear = readyear.nextLine();
                    int yearint = Integer.parseInt(lineyear);
                    int magicyear = yearint + 65;



                System.out.println("Your magic age details are:");
                System.out.println("Name:" + linename + linesurname);
                System.out.println("Monthly salary:" + salaryint / 12);
                System.out.println("Magic year:" + magicyear);
//              Here i tried to do ("Magic year:" + yearint + 65) but it was just concatenating it.
//              Strings + numbers concatenate i have discovered.

    }
}








//    Magic Year Calculator Challenge
////Overview
////        We have the following rules:
////
////        Magic Year = work start year + 65
////        Monthly salary = annual salary / 12 (rounded up)
////        All calculation results should be rounded to the whole dollar. If >= 50 cents round up to the next dollar increment,
//          otherwise round down.
////        For example, the following calculations would result with an annual salary of $60,050 starting work in the year 1980:
////
////        Monthly salary = 60,050 / 12 = 5,004.16666667 (round down) = 5,004
////        Magic year = 1980 + 65 = 2045
////        Your Task
////        Generate a magic year calculator. You should be able to enter a single persons details, the application will generate a result.
//          Everything will be done via the console.
////
////        An example run through of how this console would be...
////
////        Welcome to the magic year calculator!
////
////        Please input your name: John
////        Please input your surname: Doe
////        Please enter your annual salary: 60050
////        Please enter your work start year : 1980
////
////        Your magic age details are:
////
////        Name: John Doe
////        Monthly Salary: 5004
////        Magic Year: 2045