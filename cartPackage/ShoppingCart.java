package cartPackage;

public class ShoppingCart<T> implements ShoppingCartInterface<T> {

	private ResizableArrayBag<T> cart = new ResizableArrayBag<T>();
	
	public ShoppingCart() {
		
	}

	@Override
	public int getCartSize() {
		return cart.getCurrentSize();
	}

	@Override
	public boolean isEmpty() {
		boolean result = true;
		if(cart.isEmpty()) {
			return result;
		}
		return !result;
	}

	@Override
	public boolean addItemToCart(T itemToAdd) {
		return cart.add(itemToAdd);
	}

	@Override
	public boolean addItemToCart(T itemToAdd, int numberToAdd) {
		for( int count = 0 ; count < numberToAdd ; count++ ) {
			cart.add(itemToAdd);
		}
		return true;
	}

	@Override
	public boolean removeLastAddedItem() {
		cart.remove();
		return true;
	}

	@Override
	public boolean clearCart() {
		cart.clear();
		return true;
	}

	@Override
	public int getNumberOfItem(T itemToCount) {
		int result = cart.getFrequencyOf(itemToCount);
		return result;
	}

	@Override
	public boolean checkCartForItem(T itemToCheck) {
		boolean result = cart.contains(itemToCheck);
		return result;
	}

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
	
	@Override
	public String toString() {
		String items = "";
		for( int index = 0 ; index < cart.getCurrentSize()-1 ; index++ ) {
			items.concat(cart.getItemAtIndex(index) + ",\n");
			System.out.println(cart.getItemAtIndex(index));
		}
		return "Total Price: " + getCartPrice() + "\nItems in cart: " + items;
	}

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
