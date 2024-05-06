package com.driver;

public class Main {
    public static void main(String[] args){
      Product p=new Product();
      A=p.product(10,20);
      B=p.product(10,5,3);
      double a=23,b=9.8;
      C=p.product(a,b);
      System.out.println("1st method "+A+"\n2nd method "+B+"\n3rd method "+C);
    }
}
