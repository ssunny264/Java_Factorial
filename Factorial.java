/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iusb.cs;

/**
 *
 * @author slbru
 */
public class NewClass {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    static int factorial(int m) {
        int result = 1; 
        int i = 1;
         while (i<m) {
             result = result *i;
         }
         return result;
    }        
}
