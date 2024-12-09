import practice3.Practice3;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // переменные экземпляра, кот хранятся в классе Practice3
        Practice3 practice3 = new Practice3();

        System.out.println("Write here a first number ");
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        practice3.setNotStaticNum(firstNum);

        System.out.println("Write here a first number ");
        int secondNum = scanner.nextInt();
        practice3.setNotStaticNum(secondNum);


        System.out.println("result: " + firstNum + " + " + secondNum +" = " + (firstNum + secondNum));


       /* //локальные переменные
        int num1;
        int num2;

        System.out.println("enter num1 ");
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        System.out.println("enter num2 ");
        num2 = scanner.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));*/







    }
}