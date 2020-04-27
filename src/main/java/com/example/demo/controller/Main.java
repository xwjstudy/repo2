package com.example.demo.controller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextDouble()){
            int i = input.nextInt();
            if(i>=1&&i<=35)
            {
                System.out.println( f(i));
            }
        }

    }
    public static int f(int n){
        if(n<=2){
            return n;
        }else{
            return f(n-1)+f(n-2);
        }
    }

    public static int  f2(int n){

        if(n<=2)
            return n;

        int f1=1;
        int f2=2;
        int sum=0;

        for(int i=3;i<=n;i++){
            sum=f1+f2;
            f1=f2;
            f2=sum;

        }
        return sum;

    }

}