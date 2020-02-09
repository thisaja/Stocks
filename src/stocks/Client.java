/**
 * File Name: Client.java
 * Programmer: Leon and Thisaja
 * Course: ICS3U1
 * Date: December 7th, 2019
 */

package stocks;
import java.util.*;

/**
 * Description: Client code; Lets the user change various parameters.
 */

public class Client {
    static Scanner input=new Scanner(System.in);
    
    /**
     * Description: Displays a prompt asking the user for their input, gets their input and returns it as a string.
     * Pre: A string value containing the prompt.
     * Post: The user's input as a string.
     */
    public static String stringInput(String prompt){
    	String userInput;
        System.out.print(prompt);
        userInput=input.next();
        return userInput;
    }
    
    /**
     * Description: Displays a prompt asking the user for their input, gets their input and returns it as an int.
     * Pre: A string value containing the prompt.
     * Post: The user's input as a int.
     */
    public static int intInput(String prompt) {
    	int userInput;
        System.out.print(prompt);
        userInput=input.nextInt();
        return userInput;
    }
        
	public static void main(String[] args) {
        int choice;
        Stock stock=new Stock();
        System.out.println("\t\t\t\t\tStock Inventory");

        choice=intInput("Enter 1 to add a new item, 2 to remove an item, 3 to change the quantity of an item, 4 to discontinue an item, 5 to display all items, and 6 to exit: ");	
        
        while(choice!=6){   
        	switch(choice) {
        	case 1:
        		stock.addItem();
        		break;
        	case 2:
        		stock.removeItem();
        		break;
        	case 3:
        		stock.changeQuantity();
        		break;
        	case 4:
        		stock.discontinue();
        		break;
        	case 5:
        		stock.display();
        		break;
        	}
        	System.out.println("");
	        choice=intInput("Enter 1 to add a new item, 2 to remove an item, 3 to change the quantity of an item, 4 to discontinue an item, 5 to display all items, and 6 to exit: ");	
        }        
	}
}
