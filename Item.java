

import java.text.DecimalFormat;

/**
 * Interface defining the methods of an Item.
 * Item objects work with ShoppingCart class.
 * @author zaccowan
 * @version 9/9/22
 * Fall/2022
 */
public class Item implements ItemInterface {

	private String itemName = "";
	private double itemPrice = 0.0;
	private String itemDescription = "";
	
	DecimalFormat df = new DecimalFormat(".##");
	
	/**
	 * Constructor
	 * @param name
	 * @param price
	 * @param description
	 */
	public Item(String name, double price, String description) {
		setItemName(name);
		setItemPrice(price);
		setItemDescription(description);
	}
	
	/**
	 * Default Constructor
	 */
	public Item() {
		setItemName("Default Item");
		setItemPrice(0.0);
		setItemDescription("Default Description");
	}
	
	/**
	 *Getter method to get item name
	 *@return String name
	 */
	@Override
	public String getItemName() {
		return itemName;
	}

	/**
	 *Getter method to get item description
	 *@return String description
	 */
	@Override
	public String getItemDescription() {
		return itemDescription;
	}

	/**
	 *Getter method to get item price
	 *@return double price
	 */
	@Override
	public double getItemPrice() {
		return itemPrice;
	}

	/**
	 *Setter method to set item name
	 *@param name Value to set as item name
	 */
	@Override
	public void setItemName(String name) {
		itemName = name;
	}

	/**
	 *Setter method to set item description
	 *@param description Value to set as item description
	 */
	@Override
	public void setItemDescription(String description) {
		itemDescription = description;
		
	}

	/**
	 *Setter method to set item price
	 *@param description Value to set as item price
	 */
	@Override
	public void setItemPrice(double price) {
		itemPrice = price;
	}
	
	
	/**
	 *To string method that returns formated Item information.
	 */
	public String toString() {
		return "Name:\t" + getItemName() + "\n\tDescription:\t" + getItemDescription() + "\n\tPrice:\t$" + getItemPrice();
	}

}
