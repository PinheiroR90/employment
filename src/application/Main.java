package application;

import entities.Employee;
import entities.OutSourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Running");

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i =0; i<n;i++){
            System.out.println("Employee #"+(i+1)+" data:");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.next();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hours: ");
            double valueHours = sc.nextDouble();
            System.out.println("OutSource? (y/n) ? ");
            String op = sc.next();
            if(op.equalsIgnoreCase("y")){
                System.out.println("Additional charge: ");
                double additionalChager = sc.nextDouble();
                list.add(new OutSourceEmployee(name,hours,valueHours,additionalChager));
            }else{
                list.add(new Employee(name,hours,valueHours));
            }
        }

        System.out.println("PAYMENT: ");
        for (Employee l: list){
            System.out.println(l.getName() + " -  $"+l.payment());
        }
        sc.close();
    }
}
