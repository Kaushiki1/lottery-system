package com.company;

public class Lottery extends Lotteries {
    private String number;
    private String name;
    private int digits;
    
    public String getNumber() {
        return number;
    }
    public String getName() {
        return name;
    }
    public int getDigits() {
        return digits;
    }
    public void setNumber(String newNumber) {
        number = newNumber;
    }
    public void setName(String newName) {
        name = newName;
    }
    public void setDigits(int newDigits) {
        digits = newDigits;
    }    

    public Lottery(String n, String na){
        number = n;
        name = na;
        this.digits = super.digits;
    }
    public Lottery(){
        number = "unknown";
        name = "unknown";
    }
    public void printNumber() {
        System.out.println(number);
    }
    public void winStatement(String type) {
        System.out.println("You win the" + type + "!");
    }
}
