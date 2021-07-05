/*
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        int x= 4;
        int y = 6;
        System.out.printf("x=%d y=%d", x, y);
        int age = 12;
        float height = (float) 1.7;
        String name = "Alex";

        System.out.printf("N: %s H: %f A: %d", name, height, age);
        //System.out.println(fall);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int numb = in.nextInt();
        System.out.println("Your number is" + numb);
	// write your code here

         */
        /*
        System.out.println("Enter the number");
        Scanner answer = new Scanner(System.in);
        int answ =  answer.nextInt();
        if(answ > 2 && answ < 9) {
            System.out.println("The number is greater than 2 and less than 9");
        } else {
            System.out.println("unknown number");
        }


        Scanner Deposit_amount = new Scanner(System.in);
        System.out.println("Enter Deposit amount");
        double sum = Deposit_amount.nextDouble();
        if(sum < 100 && sum > 0) sum += sum*0.05;
        else if(sum < 200 && sum >= 100) sum += sum*0.07;
        else if(sum > 200) sum+= sum*0.07;
        System.out.println("Sum is: " + sum);

        Scanner choice = new Scanner(System.in);
        System.out.println("Enter the operation number: \n1.Addition \n2.Subtraction \n3.Multiplication");
        int num = choice.nextInt();

        double num1 = choice.nextDouble();
        double num2 = choice.nextDouble();

        switch (num){
            case 1:
                System.out.println("Addition");
                num1 += num2;
                break;
            case 2:
                System.out.println("Subtraction");
                num1 -= num2;
                break;
            case 3:
                System.out.println("Multiplication");
                num1 *= num2;
                break;
            default:
                System.out.println("XZ");
                break;
        }
        if(1<= num && num <=3) {
            System.out.println("Result: " + num1);
        }


 Scanner in = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        double sum = in.nextDouble();
        System.out.print("Введите срок вклада в месяцах: ");
        int month = in.nextInt();
int i =0;
        while (i < month) {
            sum += sum * 0.07;
            i++;
        }
        System.out.printf("После %d месяцев сумма вклада составит %f", month, sum);
        in.close();


       for (int i = 0; i < 10; i++) {
           for (int j = 0; j < 10; j++)
               System.out.printf("%d\t", i * j);
           System.out.println();
       }
        int[] numbers = new int[3];
        try{
            //numbers[6]=45;
            numbers[6]=Integer.parseInt("gfd");
        }
        catch(ArrayIndexOutOfBoundsException ex){

            System.out.println("Выход за пределы массива");
        }
        catch(NumberFormatException ex){

            System.out.println("Ошибка преобразования из строки в число");
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++)
                System.out.printf("%d\t", i * j);
            System.out.println();
        }
        Employee rab = new Employee("jojo", "google");
        rab

    }
}


public class Program{

    public static void main(String[] args) {

        Employee sam = new Employee("Sam", "Microsoft");
        sam.display();  // Sam
        sam.work();     // Sam works in Microsoft
    }
}
class Person {

    private String name;
    public String getName(){ return name; }
    private int kode = 5;
    public int joj =5;

    public Person(String name){

        this.name=name;
    }

    public void display(){

        System.out.println("Name: " + name);
    }
    private void sikret() {
        System.out.printf("Your kode is %d /t ggg /n", kode);
    }
}
class Employee extends Person{

    private String company;

    public Employee(String name, String company) {

        super(name);
        this.company=company;
    }
    public void work(){
        System.out.printf("%s works in %s \n", getName(), company);
    }
}
*/



package com.company;

import java.util.ArrayList;
import java.lang.Math.*;


class Main{
    public static void main(String[] args) {
        String string = "12.34";
        Double doub = Double.parseDouble(string);
        System.out.println(doub);


    }
}