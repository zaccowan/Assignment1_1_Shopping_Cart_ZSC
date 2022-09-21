
/**
* Interface that describes the operations of a shopping cart.
*
* @author zaccowan
* @version 9/1/2022
* Fall/2022
*/
public interface ShoppingCartInterface<T> {	
	
	/**
	* Gets the size of the cart
	* @return An integer for number of items in cart
	*/
	public int getCartSize();
	
	/**
	* Tests if cart is empty
	* @return True if cart contains items
	*/
	public boolean isEmpty();
	
	/**
	* Gets the price of the item
	* @param itemToAdd Item to add to cart
	* @return True if successfully added
	*/
	public boolean addItemToCart(T itemToAdd);
	
	/**
	* Gets the price of the item
	* @param itemToAdd Item to add to cart
	* @param numberToAdd Number of specific item to add
	* @return True if successfully added
	*/
	public boolean addItemToCart(T itemToAdd, int numberToAdd);
	
	/**
	* Removes the most recently added item from cart
	* @return True if successfully removed
	*/
	public boolean removeLastAddedItem();
	
	/**
	* Removes all items from cart
	* @return True if successfully removed
	*/
	public boolean clearCart();
	
	/**
	* Gets the number of a specific item in cart, if possible
	* @param itemToCount What item to count
	* @return Integer for number of specific item
	*/
	public int getNumberOfItem(T itemToCount);
	
	/**
	* Removes the most recently added item from cart
	* @param itemToCheck What item to check for
	* @return True if item is found in cart
	*/
	public boolean checkCartForItem(T itemToCheck);
	
	/**
	* Get the total price of items in cart
	* @return the price of total cart
	*/
	public double getCartPrice();
	
	/**
	* Get the total price of all instances of an Item, if in cart
	* @param Item the item to get price for
	* @return the price of the item group
	*/
	public double getPriceOfItemGroup(Item itemToCheck);
	
	/**
	* Formats all items and data into string
	* @return String with all formatted item data
	*/
	public String toString();
	
	/**
	* Returns all items in cart
	* @return Array of items in cart
	*/
	public T[] toArray();

}
