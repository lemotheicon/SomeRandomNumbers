/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somerandomnumbers;

/**
 *
 * @author Maria
 */
import java.util.Random;
public class SomeRandomNumbers {

    
    public static void main(String[] args) {
      Random randomNumber = new Random();
      final int LIMIT = 10;
        System.out.println(randomNumber.nextInt(LIMIT)+"");
        System.out.println(randomNumber.nextInt(LIMIT)+"");
        System.out.println(randomNumber.nextInt(LIMIT));
        
        
       
        
    }
    
}
