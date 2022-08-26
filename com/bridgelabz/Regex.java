package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    static void validateFirstName() {
        // first name cap and min 3 char
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter FirstName");
        String fname = sc.next();
        String regex = "[A-Z]{1}+[a-z]{3,}+$";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(fname);
        boolean result = matcher.matches();

        if(result){
            System.out.println("Valid Name");
        }
        else {
            System.out.println("Please Enter valid Name");
        }
    }
    static void validateLName() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter LastName");
        String lname=sc.next();
        String regex = "[A-Z]{1}+[a-z]{3,}+$";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(lname);
        boolean result = matcher.matches();

        if(result){
            System.out.println("Valid Name");
        }
        else {
            System.out.println("Please Enter valid Name");
        }
    }
    static void validateEmail() {
        //E.g. abc.xyz@bl.co.in
        System.out.println("Enter your Email");
       Scanner sc = new Scanner(System.in);
        String email = sc.next();
        String regex = "[a-z]+.+[a-z]+[@]+[a-z]+.+[a-z]$";

        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(email);
        boolean result = matcher.matches();

        if(result){
            System.out.println("Valid Email");
        }else {
            System.out.println("Please Enter Valid Email");
        }
    }

    static void validateMobileNumber() {
        //
        System.out.println("Enter Mobile Number");
        Scanner sc = new Scanner(System.in);
        String number =  sc.next();
        String regex ="\\d{10}";
        Pattern p = Pattern.compile(regex);
        Matcher matcher =  p.matcher(number);
        boolean result = matcher.matches();

        if(result){
            System.out.println("Valid Number");
        }else {
            System.out.println("Invalid number");
        }
    }
    
    public static void main(String[] args) {
        validateFirstName();
        validateLName();
        validateEmail();
        validateMobileNumber();
    }



}
