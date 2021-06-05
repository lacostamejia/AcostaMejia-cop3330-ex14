/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 *
 *
*/

import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); //Scanner method declared
        double order_amount;
        double tax;
        double total;
        String state;
        String state_taxes = "WI";

        System.out.print("What is the order amount? ");
        order_amount = in.nextInt();

        System.out.print("What is the state? ");
        state = in.next();

        state = state.toUpperCase(); //Here we convert to UPPERCASE so we won't have problems to compare with any type of inputted string


        total = order_amount; //Here we are stating the total is the same as the order amount in case is not the WI state

        if(state.equals(state_taxes))
        {
            tax = (0.055 * order_amount); //Here we are finding the tax
            total = tax + order_amount; //Here we are finding the total

            System.out.printf("The subtotal is $%.2f. \n", order_amount );
            System.out.printf("The tax is $%.2f.\n",tax);
        }

        System.out.printf("The total is $%.2f.\n",total);



    }
}
