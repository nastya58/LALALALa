package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Imput a number");
        double num = in.nextDouble();
        double argone = Math.sin(2*num);
        double argtwo = Math.sin(5*num);
        double argthree = Math.sin(3*num);
        double argfour = Math.cos(num);
        double argfive = Math.cos(3*num);
        double argsix = Math.cos(5*num) ;
        double z = (argone + argtwo - argtwo)/(argfour - argfive + argsix) ;
        System.out.print(z);
        in.close();
    }
}