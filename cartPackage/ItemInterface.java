package cartPackage;
/**
* Interface that describes the operations and data of an shopping item.
*
* @author Zachary Cowan
* @version 9/1/2022
* Fall/2022
*/
public interface ItemInterface {
	
	/*
	* Gets the name of the item
	* @return The name of the item 
	*/
	public String getItemName();
	
	/*
	* Gets the description of the item
	* @return The description of the item 
	*/
	public String getItemDescription();
	
	/*
	* Gets the price of the item
	* @return The price of the item 
	*/
	public double getItemPrice();
	
	/*
	* Sets the name of the item
	* @param name Value to set as item name
	*/
	public void setItemName(String name);
	
	/*
	* Sets the description of the item
	* @param description Value to set as item description
	*/
	public void setItemDescription(String description);
	
	/*
	* Sets the price of the item
	* @param price Value to set as item price
	*/
	public void setItemPrice(double price);
	
	/*
	* Gets the name of the item
	* @return formatted string with item information
	*/
	public String toString();
}
