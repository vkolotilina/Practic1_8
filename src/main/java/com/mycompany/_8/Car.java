/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._8;

/**
 *
 * @author Варвара
 */
public class Car {
    String brand;
    int year;
    String number;
    
    public Car(String brand, int year, String number) {
        this.brand = brand;
        this.year = year;
        this.number = number;
    }
    
    public String getBrand() {
        return brand;
    }
    public int getYear() {
        return year;
    }
    public String getNumber() {
        return number;
    }

}
