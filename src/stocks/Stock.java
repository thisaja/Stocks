/**
 * File Name: Stock.java
 * Programmers: Leon and Thisaja
 * Course: ICS3U1
 * Date: December 7th, 2019
 */

package stocks;
import java.util.*;

/**
 * Description: The template of a Stock object containing an ArrayList of Items and the id number it is currently at.
 */
public class Stock {
    private ArrayList<Items>stock;
    private static int id;
    
    /**
     * Description: Constructor; initializes all the properties of an Stock object each time and instance of an Stock object is created.
     * Pre: None
     * Post: None
     */
    public Stock(){
        stock=new ArrayList<>();
        id=1000;
    }
    
    /**
     * Description: Adds an item into the stock.
     * Pre: None.
     * Post: None.
     */
    public void addItem(){
	    int itemID;
	    String itemName;
	    int itemQuantity;
	    Items newItem;
	    
	    itemID = id;
	    itemName = Client.stringInput("Enter the name of the item: ");
	    itemQuantity = Client.intInput("Enter the quantity of the item: ");
       
	    if(itemName.equals("Discontinued")) {
	    	System.out.println("Sorry, inappropriate name.");
	    	return;
	    }
	    if(itemQuantity<0) {
	    	System.out.println("Sorry, inappropriate amount.");
	    	return;
	    }
	    for(Items i:stock){
	       if(i.getName().equals(itemName)){
	    	   System.out.println("Sorry, that name already exist");
	    	   return;
	       }
	   }
	    
	   newItem = new Items(itemID,itemName,itemQuantity);
	   System.out.println(newItem);
	   stock.add(newItem);
	   id++;
    }
    
    /**
     * Description: Removes an item in the stock.
     * Pre: None.
     * Post: None.
     */
    public void removeItem(){
        int itemID;
        String itemName;
        int itemQuantity;
        
        itemID = Client.intInput("Enter the ID of the item: ");
        itemName = Client.stringInput("Enter the name of the item: ");
        itemQuantity = Client.intInput("Enter the quantity of the item: ");
              
        for(Items i: stock){
            if(i.getID()==itemID && i.getName().equals(itemName) && i.getQuantity()==itemQuantity){
            	if(i.isDiscontinued()) {
            		System.out.println("Sorry, the item you entered has been discontinued.");
            		return;
            	}
            	System.out.println(i);
            	stock.remove(stock.indexOf(i));
                return;
            }
        }
        System.out.println("Sorry, the item you entered does not exist.");
    }
    
    /**
     * Description: Changes the quantity of an item in the stock.
     * Pre: None.
     * Post: None.
     */
    public void changeQuantity(){
        int itemID;
        String itemName;
        int itemQuantity;
        String type;
        int change;
        
        do {
        	type = Client.stringInput("Do you want to add or subtract? (A to Add , S to Subtract): ").toUpperCase();
        }while(!type.equals("A") && !type.equals("S"));
        
        itemID = Client.intInput("Enter the ID of the item: ");
        itemName = Client.stringInput("Enter the name of the item: ");
        itemQuantity = Client.intInput("Enter the quantity of the item: ");
        
        change = Client.intInput("Enter how much you want to add/subtract by: ");
        if(type.equals("A")) {
        	while(change<0) {
        		System.out.println("Sorry, you can't add a negative amount of items.");
                change = Client.intInput("Enter how much you want to add/subtract by: ");
        	}
            for(Items i: stock){
                if(i.getID()==itemID && i.getName().equals(itemName) && i.getQuantity()==itemQuantity){
                	if(i.isDiscontinued()) {
                		System.out.println("Sorry, the item you entered has been discontinued.");
                		return;
                	}
                	System.out.println(i);
                	i.setQuantity(i.getQuantity()+change);
                    return;
                }
            }
        }
        else {
        	while(itemQuantity-change<0) {
        		System.out.println("Sorry, you can't take more than you have.");
                change = Client.intInput("Enter how much you want to add/subtract by: ");
        	}
            for(Items i: stock){
                if(i.getID()==itemID && i.getName().equals(itemName) && i.getQuantity()==itemQuantity){
                	if(i.isDiscontinued()) {
                		System.out.println("Sorry, the item you entered has been discontinued.");
                		return;
                	}
                	System.out.println(i);
                	i.setQuantity(i.getQuantity()-change);
                    return;
                }
            }
        }
        System.out.println("Sorry, the item you entered does not exist.");
    }     
    
	/**
	 * Description: Discontinues an item in the stock.
	 * Pre: None.
	 * Post: None.
	 */
    public void discontinue(){
        int itemID;
        String itemName;
        int itemQuantity;
        
        itemID = Client.intInput("Enter the ID of the item: ");
        itemName = Client.stringInput("Enter the name of the item: ");
        itemQuantity = Client.intInput("Enter the quantity of the item: ");
              
        for(Items i: stock){
            if(i.getID()==itemID && i.getName().equals(itemName) && i.getQuantity()==itemQuantity){
            	System.out.println(i);
                i.setName("Discontinued");
                i.setQuantity(0);
                i.setDiscontinued(true);
                return;
            }
        }
        System.out.println("Sorry, the item you entered does not exist.");
    }
    
    /**
     * Description: Display every item in the stock list. 
     * Pre: None.
     * Post: None.
     */
    public void display(){
        for(int i=0;i<stock.size();i++)System.out.println(stock.get(i));
    }
}
