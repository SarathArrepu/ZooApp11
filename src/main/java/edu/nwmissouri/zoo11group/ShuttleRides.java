/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo11group;

/**
 *
 * @author SarathArrepu
 */
public class ShuttleRides extends ZooRides {
    private String customerName;
    private boolean doubleAxle;
    private int noofcustomers;
    
    @Override
    public void ticketprice(){
        System.out.println("The ticket price is $10");
    }
    public void noofseats(){
        System.out.println("The number of seats is six");
    }
    
    public void shuttletype(){
        System.out.println("This a minivan");
    }
}