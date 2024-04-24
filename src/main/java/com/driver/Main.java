package com.driver;

public class Main {
  class Product{
    public static void main(String[] args){
      Product p=new Product();
      A=p.product(10,20);
      B=p.product(10,5,3);
      double a=23,b=9.8;
      C=p.product(a,b);
      System.out.println("1st method "+A+"\n2nd method "+B+"\n3rd method "+C);
    }
    public int product(int x,int y){
      int re=x*y;
      return re;
    }
    public int product(int x,int y,int z){
      int re=x*y*z;
      return re;
    }
    public double product(double x,double y){
      double re=x*y;
      return re;
    }
  }
  
}
