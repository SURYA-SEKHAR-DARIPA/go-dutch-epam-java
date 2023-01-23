package com.epam.rd.autotasks.godutch;
import java.util.*;

public class GoDutch {

    public static void main(String[] args) {
        //Write code here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a<0){
            System.out.println("Bill total amount cannot be negative");
        }
        else if(b<=0){
            System.out.println("Number of friends cannot be negative or zero");
        }
        else{
            int total=a+((a*10)/100);
            System.out.println(total/b);
        }
    }
}
