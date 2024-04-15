package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your age:");
        int age= scanner.nextInt();
        try{
        if(age<0){
            throw new InvalidAgeException("Age is invalid");
        }}catch (InvalidAgeException invalidAgeException){
            System.err.println("InvalidAgeException:  "+invalidAgeException.getMessage());
        }
        System.out.println("Process failed");
    }

}