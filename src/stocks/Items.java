/**
 * File Name: Items.java
 * Programmers: Leon and Thisaja
 * Course: ICS3U1
 * Date: December 7th, 2019
 */

package stocks;

/**
 * Description: The template of each item object containing the item's ID, its name, its quantity and if it has been discontinued or not.
 */ 
public class Items {
    private int ID;
    private String name;
    private int quantity;
    private boolean discontinued;
    
    /**
     * Description: Constructor; initializes all the properties of an Item object each time and instance of an Item object is created.
     * Pre: ID has been assigned to an int value, itemName has been assigned to a String value, itemQuantity has been assigned to an int value.
     * Post: None.
    */
    public Items(int ID, String name,int quantity){
        this.ID=ID;
        this.name=name;
        this.quantity=quantity;
        this.discontinued=false;
    }
    
    /**
     * Description: Returns the ID number.
     * Pre: None.
     * Post: The item's ID as an int.
    */
    public int getID(){
        return ID;
    }
    
    /**
     * Description: Returns the item's name.
     * Pre: None.
     * Post: The item's name as a string.
    */
    public String getName(){
        return name;
    }
    
    /**
     * Description: Returns the item's quantity.
     * Pre: None.
     * Post: The item's quantity as an int.
    */
    public int getQuantity(){
        return quantity;
    }
    
    /**
     * Description: Returns if the item has been discontinued or not.
     * Pre: None.
     * Post: The item's state as a boolean.
    */
    public boolean isDiscontinued(){
        return discontinued;
    }
    
    /**
     * Description: Assigns the item a new ID.
     * Pre: An int value containing the new ID.
     * Post: None.
    */
    public void setID(int newID){
        ID=newID;
    }
    
    /**
     * Description: Assigns the item a new name.
     * Pre: A string value containing the new name.
     * Post: None.
    */
    public void setName(String newName){
        name=newName;
    }
    
    /**
     * Description: Assigns the item a new quantity.
     * Pre: An int value containing the new quantity.
     * Post: None.
    */
    public void setQuantity(int newQuantity){
        quantity=newQuantity;
    }
    
    /**
     * Description: Assigns the item a new state.
     * Pre: A boolean value containing the new state.
     * Post: None.
    */
    public void setDiscontinued(boolean newDiscontinued){
        discontinued=newDiscontinued;
    }
    
    /**
     * Description: Returns all the item's properties as a string.
     * Pre: None.
     * Post: A string value containing all the item's properties.
    */
    public String toString(){
        return "ID: "+ID+", Name: "+name+", Quantity: "+quantity+", isDiscontinued?: "+discontinued;
    }
}
