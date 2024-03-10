package com.driver;

public class Main {
    Product p=new Product();
    p.fun(10);
    p.fun(2,3);
    p.fun(5,6,7);
}
public class Product{
  //int x,y,z;
  void fun(int x){
    
    System.out.println("This only one parameter method"+x);
  }
  void fun(int x,int y,int z){
    System.out.println("This three parameters method "+x+" ,"+y+" ,"+z);
  }
  void fun(int x,int y){
    System.out.println("This two parameters method "+x+" ,"+y);
  }
}
