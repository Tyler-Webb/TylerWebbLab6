
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tyler
 */
public class LandTractMain {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter length of lot one");
        String lotOneLength = keyboard.nextLine();
        System.out.println("Enter the width of lot one");
        String lotOneWidth = keyboard.nextLine();
        
        System.out.println("Enter the length of lot two");
        String lotTwoLength = keyboard.nextLine();
        System.out.println("Enter the width of lot two");
        String lotTwoWidth = keyboard.nextLine();
        
        LandTract landTractOne = new LandTract(lotOneLength, lotOneWidth);
        LandTract landTractTwo = new LandTract(lotTwoLength, lotTwoWidth);
        
        System.out.println("Area of lot one: " + landTractOne.getArea());
        System.out.println("Area of lot two: " + landTractTwo.getArea());
        
        if(landTractOne.checkIfEqual(landTractTwo)){
            System.out.println("They are the same size lots");
        } else{
            System.out.println("They are not the same size lots");
        }
    }
}
