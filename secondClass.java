/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.semester3.oopslabs;
import java.util.*;

/**
 *
 * @author Shah Jalal
 */
public class secondClass {
    private int num1;
    private int num2;
    private char op ;
    public int result;
    
    secondClass(){
        num1 = 0;
        num2 = 0;
        
    }
    public void setX(int x){
        num1=x;
    }
        public void setY(int y){
        num2=y;
    }
         
        public void claculate(){
            if(op=='+'){
                System.out.println("Sum:"+ (num1+num2));
                 result=num1+num2;
            }else if(op=='-'){
                System.out.println("minus is:"+ (num1-num2));
                 result=num1-num2;
            }else if(op=='*'){
                System.out.println("multiple is:"+ (num1*num2));
                 result=num1*num2;
            }else
            System.out.println("operation is not defined");
        }
         void input(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter value of num1: ");
      num1 =sc.nextInt();
      
      System.out.println("Enter value of num2: ");
       num2 =sc.nextInt();
      
      System.out.println("Enter operation operand: ");
       op =sc.next().charAt(0);
  }
    void display(){
  
      System.out.println("final result is :"+result);
       
  }
    
}
