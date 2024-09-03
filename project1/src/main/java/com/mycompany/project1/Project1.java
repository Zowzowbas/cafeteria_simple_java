
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project1;

/**
 *
 * @author CL3-PC21
 */
import java.util.Scanner;
public class Project1 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("[1] - Snacks");
        System.out.println("[2] - Drinks");
        System.out.println("What would you like to order?: ");
        int q1 = input.nextInt();
        
        if (q1 == 1)
        {
            System.out.println("Snacks");
            System.out.println("[1] - Piatos (20 pesos)");
            System.out.println("[2] - Nova (25 pesos)");
            System.out.println("Enter the snack of your choice: ");
            int q2 = input.nextInt();
            int piatos, nova;
            piatos = 20;
            nova = 25;
            
            // 1st Snack Choice
                if (q2 == 1)
                {
                    System.out.println("Piatos (20 pesos)");
                    
                    System.out.println("Would you like to order drinks? [1] - Yes / [2] - No:");
                    int q3 = input.nextInt();
                    
                    // Drinks Yes / No
                        if (q3 == 1)
                        {
                            System.out.println("Drinks");
                            System.out.println("[1] - Coke (20 pesos)");
                            System.out.println("[2] - Water (15 pesos)");
                            System.out.println("Enter the drinks of your choice: ");
                            int q4 = input.nextInt();
                            int coke, water;
                            coke = 20;
                            water = 15;
                            
                            // 1st Snacks with drink choice
                            if (q4 == 1)
                            {
                                System.out.println("Coke (20 pesos)");
                                int total;
                                total = piatos + coke;
                                System.out.println("Your Total is: " + total);
                                System.out.println("Enter cash: ");
                                int cash = input.nextInt();
                                
                                    while (cash < total)
                                    {
                                        System.out.println("Insufficient Cash!");
                                        System.out.println("Enter cash: ");
                                        cash = input.nextInt();
                                    }
                                    
                                        if (cash >= total)
                                        {
                                            int change;
                                            change = cash - total;
                                            System.out.println("Thank you for buying on our store :)");
                                            System.out.println("Your total change is: " + change);
                                            
                                        }
                            }
                            
                            // 2nd Snacks with drink choice
                            else if (q4 == 2)
                            {
                                System.out.println("Water (15 pesos)");
                                int total;
                                total = piatos + water;
                                System.out.println("Your Total is: " + total);
                                System.out.println("Enter cash: ");
                                int cash = input.nextInt();
                                
                                    while (cash < total)
                                    {
                                        System.out.println("Insufficient Cash!");
                                        System.out.println("Enter cash: ");
                                        cash = input.nextInt();
                                    }
                                    
                                        if (cash >= total)
                                        {
                                            int change;
                                            change = cash - total;
                                            System.out.println("Thank you for buying on our store :)");
                                            System.out.println("Your total change is: " + change);
                                            
                                        }
                            }
                            
                            // Validation 1st Snack with drinks
                            else {
                                System.out.println("Invalid Input");
                            }
                        }
                        
                        // Q3 No answer
                        else if (q3 == 2) {
                            System.out.println("Thanks for Buying");   
                                int total;
                                total = piatos;
                                System.out.println("Your Total is: " + total);
                                System.out.println("Enter cash: ");
                                int cash = input.nextInt();
                                
                                    while (cash < total)
                                    {
                                        System.out.println("Insufficient Cash!");
                                        System.out.println("Enter cash: ");
                                        cash = input.nextInt();
                                    }
                                    
                                        if (cash >= total)
                                        {
                                            int change;
                                            change = cash - total;
                                            System.out.println("Thank you for buying on our store :)");
                                            System.out.println("Your total change is: " + change);
                                            
                                        }
                        }
                        
                        // Drinks Yes / No validation
                        else {
                            System.out.println("Invalid Input");
                        }
                        
                    }
                
                //------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                // 2nd Snack Choice
                else if (q2 == 2)
                {
                    System.out.println("Nova (25 pesos)");
                    
                    System.out.println("Would you like to order drinks? [1] - Yes / [2] - No:");
                    int q3 = input.nextInt();
                    
                        if (q3 == 1)
                        {
                            System.out.println("Drinks");
                            System.out.println("[1] - Coke (20 pesos)");
                            System.out.println("[2] - Water (15 pesos)");
                            System.out.println("Enter the drinks of your choice: ");
                            int q4 = input.nextInt();
                            int coke, water;
                            coke = 20;
                            water = 15;
                            
                            if (q4 == 1)
                            {
                                System.out.println("Coke (20 pesos)");
                                int total;
                                total = nova + coke;
                                System.out.println("Your Total is: " + total);
                                System.out.println("Enter cash: ");
                                int cash = input.nextInt();
                                
                                    while (cash < total)
                                    {
                                        System.out.println("Insufficient Cash!");
                                        System.out.println("Enter cash: ");
                                        cash = input.nextInt();
                                    }
                                    
                                        if (cash >= total)
                                        {
                                            int change;
                                            change = cash - total;
                                            System.out.println("Thank you for buying on our store :)");
                                            System.out.println("Your total change is: " + change);
                                            
                                        }
                            }
                            else if (q4 == 2)
                            {
                                System.out.println("Water (15 pesos)");
                                int total;
                                total = nova + water;
                                System.out.println("Your Total is: " + total);
                                System.out.println("Enter cash: ");
                                int cash = input.nextInt();
                                
                                    while (cash < total)
                                    {
                                        System.out.println("Insufficient Cash!");
                                        System.out.println("Enter cash: ");
                                        cash = input.nextInt();
                                    }
                                    
                                        if (cash >= total)
                                        {
                                            int change;
                                            change = cash - total;
                                            System.out.println("Thank you for buying on our store :)");
                                            System.out.println("Your total change is: " + change);
                                            
                                        }
                            }
                                                        
                            // Validation 2nd Snack with drinks
                            else {
                                System.out.println("Invalid Input");
                            }
                            
                        }
                        // Q3 No answer
                        else if (q3 == 2) {
                                System.out.println("Thanks for Buying");   
                                int total;
                                total = nova;
                                System.out.println("Your Total is: " + total);
                                System.out.println("Enter cash: ");
                                int cash = input.nextInt();
                                
                                    while (cash < total)
                                    {
                                        System.out.println("Insufficient Cash!");
                                        System.out.println("Enter cash: ");
                                        cash = input.nextInt();
                                    }
                                    
                                        if (cash >= total)
                                        {
                                            int change;
                                            change = cash - total;
                                            System.out.println("Thank you for buying on our store :)");
                                            System.out.println("Your total change is: " + change);
                                            
                                        }
                        }
                }
                // Snack Choice else
                else {
                    System.out.println("Invalid Input");
                }
                
        }
        
        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        // Drinks Choice
        else if (q1 == 2)
        {
            System.out.println("Drinks");
            System.out.println("[1] - Coke (20 pesos)");
            System.out.println("[2] - Water (15 pesos)");
            System.out.println("Enter the drinks of your choice: ");
            int q2 = input.nextInt();
            int coke, water;
            coke = 20;
            water = 15;
            
                if (q2 == 1)
                {
                    System.out.println("Coke (20 pesos)");
                    
                    System.out.println("Would you like to order snacks? [1] - Yes / [2] - No:");
                    int q3 = input.nextInt();
                    
                        if (q3 == 1)
                        {
                            System.out.println("Snacks");
                            System.out.println("[1] - Piatos (20 pesos)");
                            System.out.println("[2] - Nova (25 pesos)");
                            System.out.println("Enter the snacks of your choice: ");
                            int q4 = input.nextInt();
                            int piatos, nova;
                            piatos = 20;
                            nova = 25;
                            
                            if (q4 == 1)
                            {
                                System.out.println("Piatos (20 pesos)");
                                int total;
                                total = coke + piatos;
                                System.out.println("Your Total is: " + total);
                                System.out.println("Enter cash: ");
                                int cash = input.nextInt();
                                
                                    while (cash < total)
                                    {
                                        System.out.println("Insufficient Cash!");
                                        System.out.println("Enter cash: ");
                                        cash = input.nextInt();
                                    }
                                    
                                        if (cash >= total)
                                        {
                                            int change;
                                            change = cash - total;
                                            System.out.println("Thank you for buying on our store :)");
                                            System.out.println("Your total change is: " + change);
                                            
                                        }
                            }
                            
                            else if (q4 == 2)
                            {
                                System.out.println("Nova (25 pesos)");
                                int total;
                                total = coke + nova;
                                System.out.println("Your Total is: " + total);
                                System.out.println("Enter cash: ");
                                int cash = input.nextInt();
                                
                                    while (cash < total)
                                    {
                                        System.out.println("Insufficient Cash!");
                                        System.out.println("Enter cash: ");
                                        cash = input.nextInt();
                                    }
                                    
                                        if (cash >= total)
                                        {
                                            int change;
                                            change = cash - total;
                                            System.out.println("Thank you for buying on our store :)");
                                            System.out.println("Your total change is: " + change);
                                            
                                        }
                            }
                        }
                        // Q3 2nd choice
                        else if (q3 == 2) {
                            System.out.println("Thanks for Buying");   
                                int total;
                                total = coke;
                                System.out.println("Your Total is: " + total);
                                System.out.println("Enter cash: ");
                                int cash = input.nextInt();
                                
                                    while (cash < total)
                                    {
                                        System.out.println("Insufficient Cash!");
                                        System.out.println("Enter cash: ");
                                        cash = input.nextInt();
                                    }
                                    
                                        if (cash >= total)
                                        {
                                            int change;
                                            change = cash - total;
                                            System.out.println("Thank you for buying on our store :)");
                                            System.out.println("Your total change is: " + change);
                                            
                                        }
                        }
                        // Snack Choice else
                        else {
                        System.out.println("Invalid Input");
                        }
                }
                
                else if (q2 == 2)
                {
                    System.out.println("Water (15 pesos)");
                    
                    System.out.println("Would you like to order snacks? [1] - Yes / [2] - No:");
                    int q3 = input.nextInt();
                    
                        if (q3 == 1)
                        {
                            System.out.println("Snacks");
                            System.out.println("[1] - Piatos (20 pesos)");
                            System.out.println("[2] - Nova (25 pesos)");
                            System.out.println("Enter the snacks of your choice: ");
                            int q4 = input.nextInt();
                            int piatos, nova;
                            piatos = 20;
                            nova = 25;
                            
                            if (q4 == 1)
                            {
                                System.out.println("Piatos (20 pesos)");
                                int total;
                                total = water + piatos;
                                System.out.println("Your Total is: " + total);
                                System.out.println("Enter cash: ");
                                int cash = input.nextInt();
                                
                                    while (cash < total)
                                    {
                                        System.out.println("Insufficient Cash!");
                                        System.out.println("Enter cash: ");
                                        cash = input.nextInt();
                                    }
                                    
                                        if (cash >= total)
                                        {
                                            int change;
                                            change = cash - total;
                                            System.out.println("Thank you for buying on our store :)");
                                            System.out.println("Your total change is: " + change);
                                            
                                        }
                            }
                            else if (q4 == 2)
                            {
                                System.out.println("Nova (25 pesos)");
                                int total;
                                total = nova + water;
                                System.out.println("Your Total is: " + total);
                                System.out.println("Enter cash: ");
                                int cash = input.nextInt();
                                
                                    while (cash < total)
                                    {
                                        System.out.println("Insufficient Cash!");
                                        System.out.println("Enter cash: ");
                                        cash = input.nextInt();
                                    }
                                    
                                        if (cash >= total)
                                        {
                                            int change;
                                            change = cash - total;
                                            System.out.println("Thank you for buying on our store :)");
                                            System.out.println("Your total change is: " + change);
                                            
                                        }
                            }
                                                        
                            // Validation 2nd drinks with snacks
                            else {
                                System.out.println("Invalid Input");
                            }
                            
                        }
                        // Q3 2nd choice
                        else if (q3 == 2) {
                            System.out.println("Thanks for Buying");
                                int total;
                                total = water;
                                System.out.println("Your Total is: " + total);
                                System.out.println("Enter cash: ");
                                int cash = input.nextInt();
                                
                                    while (cash < total)
                                    {
                                        System.out.println("Insufficient Cash!");
                                        System.out.println("Enter cash: ");
                                        cash = input.nextInt();
                                    }
                                    
                                        if (cash >= total)
                                        {
                                            int change;
                                            change = cash - total;
                                            System.out.println("Thank you for buying on our store :)");
                                            System.out.println("Your total change is: " + change);
                                            
                                        }
                        }
                        // Snack Choice else
                        else {
                        System.out.println("Invalid Input");
                        }
                }    
                        //Drink Choice
                        else {
                        System.out.println("Invalid Input");
                        }
        }
        
        else 
                {
                   System.out.println("Invalid Input! Please input the given choices"); 
                }
    }
}
