package com.oca.day1;

public class Example
{ 
    public static void gfg(String s) 
    {     
        System.out.println("String"); 
    } 
    public static void gfg(Object o) 
    { 
        System.out.println("Object"); 
    } 
  
    public static void main(String args[]) 
    { 
        gfg(null); 
    } 
}