package com.cc.java;

public class App {
    

    public static void main(String[] args) {

        Cat cat1 = new Cat("Grizabella", "white", 29,true);
        output("Name: " + cat1.getStringAttributes("#name"));
        output("Fellfarbe: " + cat1.getStringAttributes("#furColor"));
        output("Alter: " + cat1.getAge());
        output("Alter: " + cat1.getAge());
        output("Alter: " + cat1.getAge());
        output("Alter: " + cat1.getAge());

        output("-------------");

        Cat cat2 = new Cat("Alonzo", "grey", 35,false);
        output("Name: " + cat2.getStringAttributes("#name"));
        output("Fellfarbe: " + cat2.getStringAttributes("#furColor"));
        output("Alter: " + cat2.getAge());
        
    }

    public static void output(String inputStr) {
        System.out.println(inputStr);
    }

}

