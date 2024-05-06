package com.driver;

public class Main {
    public static void main(String[] args){
      Product p=new Product();
      int A=p.product(10,20);
      int B=p.product(10,5,3);
      double a=23,b=9.8;
      double C=p.product(a,b);
     // System.out.println("1st method "+A+"\n2nd method "+B+"\n3rd method "+C);
    }
}
