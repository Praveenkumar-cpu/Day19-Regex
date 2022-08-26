package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    static void validateFirstName() {
        // first name cap and min 3 char
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fname");
        String fname=sc.next();
        String regex = "[A-Z]{1}+[a-z]{3,}+$";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(fname);
        boolean result = matcher.matches();

        if(result){
            System.out.println("Valid Name");
        }
        else {
            System.out.println("Invalid Name");
        }
    }


    public static void main(String[] args) {
        validateFirstName();
    }

}
