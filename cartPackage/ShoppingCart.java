package cartPackage;

/**
 * Shopping cart class for shopping cart operations and management. Uses ResizableArrayBag to store items.
 * Works with classes implementing ItemInterface.
 * @author zaccowan
 * @version 9/9/22
 * @param <T>
 * Fall/2022
 */
public class ShoppingCart<T> implements ShoppingCartInterface<T> {

	
	/**
	 * Bag used to store items in cart.
	 * @param T Type to store
	 */
	private ResizableArrayBag<T> cart = new ResizableArrayBag<T>();
	//For formatting price
	
	
	
	/**
	 * Default Constructor
	 */
	public ShoppingCart() {
		cart = new ResizableArrayBag<T>();
	}
	
	public ShoppingCart(T entry) {
		addItemToCart(entry);
	}

	
	/**
	 * Get the number of items in cart
	 * @return Current number of items in cart
	 */
	@Override
	public int getCartSize() {
		return cart.getCurrentSize();
	}

	/**
	 * Test to see if cart is empty.
	 *@return True if cart is empty.
	 */
	@Override
	public boolean isEmpty() {
		boolean result = true;
		if(cart.isEmpty()) {
			return result;
		}
		return !result;
	}

	/**
	 * Add item to cart
	 *@param itemToAdd Item to add to cart
	 *@return True if success
	 */
	@Override
	public boolean addItemToCart(T itemToAdd) {
		return cart.add(itemToAdd);
	}

	/**
	 * Add number of item to cart
	 *@param itemToAdd Item to add to cart
	 *@param numberToAdd Number of respective item to add to cart
	 *@return True if success
	 */
	@Override
	public boolean addItemToCart(T itemToAdd, int numberToAdd) {
		for( int count = 0 ; count < numberToAdd ; count++ ) {
			cart.add(itemToAdd);
		}
		return true;
	}

	
	/**
	 *Remove the last added item to the bag
	 *@return True if item successfully removed
	 */
	@Override
	public boolean removeLastAddedItem() {
		cart.remove();
		return true;
	}

	/**
	 *Clear all items from cart
	 *@return True if cart successfully cleared
	 */
	@Override
	public boolean clearCart() {
		cart.clear();
		return true;
	}

	/**
	 *Returns the quantity of a specific item in cart
	 *@param itemToCount The item to check quantity of
	 *@return Integer of the number of item in cart 
	 */
	@Override
	public int getNumberOfItem(T itemToCount) {
		int result = cart.getFrequencyOf(itemToCount);
		return result;
	}

	
	/**
	 *Test if an item exists in cart
	 *@param itemToCheck The item to search for
	 *@return True if item exists in cart
	 */
	@Override
	public boolean checkCartForItem(T itemToCheck) {
		boolean result = cart.contains(itemToCheck);
		return result;
	}

	/**
	 *Gets the total price of all items in cart.
	 *Only works if cart is used to store objects of Item class.
	 *@return Double representing the total price of all objects.
	 */
	@Override
	public double getCartPrice() {
		double sum = 0.0;
		T[] cartArray = cart.toArray();
		for(int index = 0 ; index < cartArray.length ; index++ ) {
			Item tempItem = (Item) cart.getItemAtIndex(index);
			sum += tempItem.getItemPrice();
		}
		return sum;
	}

	
	/**
	 *Get the total price of all the instances of an specific item.
	 *@param itemToCheck An item of the Item class to check price of
	 *@return Double of the total price of the item group
	 */
	@Override
	public double getPriceOfItemGroup(Item itemToCheck) {
		double sum = 0.0;
		T[] cartArray = cart.toArray();
		for(int index = 0 ; index < cartArray.length ; index++ ) {
			Item tempItem = (Item) cart.getItemAtIndex(index);
			if (tempItem.getItemName() == itemToCheck.getItemName()) {
				sum += tempItem.getItemPrice();
			}

		}
		return sum;
	}
	
	
	/**
	 * Get a string with all cart information
	 * @return String formatted with cart info
	 */
	@Override
	public String toString() {
		String items = "";
		for( int index = 0 ; index < cart.getCurrentSize()-1 ; index++ ) {
			items += "-------\t" + cart.getItemAtIndex(index) + ",\n";
		}
		return "Total Price: " + getCartPrice() + "\nItems in cart:\n" + items;
	}

	
	/**
	 *Get array version of items in cart
	 *@return Array of all items in cart.
	 */
	@Override
	public T[] toArray() {
		@SuppressWarnings("unchecked")
		T[] result = (T[]) new Object[cart.toArray().length];
		for( int index = 0 ; index < cart.toArray().length ; index++ ) {
			result[index] = cart.getItemAtIndex(index);
		}
		return result;
	}
}
