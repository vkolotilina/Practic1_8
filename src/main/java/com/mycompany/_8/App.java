/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Варвара
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Practical task 1.6, Kolotilina Varvara, RIBO-03-22, Var. 1");
        ArrayList<Car> CarList = new ArrayList<>();
        CarList.add(new Car("Aurus", 2020, "K123VO"));
        CarList.add(new Car("BMW", 2009, "M456KS"));
        CarList.add(new Car("Skoda", 2014, "B789KV"));
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Choose number:");
        System.out.println("1. Add a new car.");
        System.out.println("2. Delete a car by number.");
        System.out.println("3. Delete all cars.");
        System.out.println("Enter number: ");
        
        int SelectNum = scan.nextInt();
        
        switch(SelectNum){
            case 1:
                System.out.print("Car brand: ");
                String NewBrand = scan.next();
                System.out.print("Car year: ");
                int NewYear = scan.nextInt();
                System.out.print("Car number: ");
                String NewNumber = scan.next();
                
                boolean DoubleNum = false;
                for (Car NewCar : CarList){
                    if(NewCar.number.equals(NewNumber)){
                        DoubleNum = true;
                        break;
                    }
                }
                
                if(DoubleNum == true){
                    System.out.println("This number is already in the list.");
                }else{
                    CarList.add(new Car(NewBrand, NewYear, NewNumber));
                    System.out.println("A new car has been added.");
                }
                break;
                
            case 2:
                System.out.print("Enter the number of the car to remove: ");
                String RemoveNum = scan.next();
                CarList.removeIf(car -> car.number.equals(RemoveNum));
                System.out.println("A car has been removed.");
            break;
            
            case 3:
                CarList.clear();
                System.out.println("The list has been cleared.");
            break;                       
        }
    }    
}
