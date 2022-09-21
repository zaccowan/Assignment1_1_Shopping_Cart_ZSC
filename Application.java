

/**
 * @author zaccowan
 * @version 9/9/22
 * Fall/2022
 */
public class Application {
	public static void main(String [] args) {
		
		System.out.println("------ String Cart Testing ------");
		ShoppingCart<String> myStringCart = new ShoppingCart<String>();
		
		myStringCart.addItemToCart("Apple");
		myStringCart.addItemToCart("Grape");
		System.out.println(myStringCart.isEmpty());
		myStringCart.clearCart();
		System.out.println(myStringCart.getCartSize());
		myStringCart.removeLastAddedItem();
		System.out.println(myStringCart.getCartSize());
		
		
		System.out.println("\n------ Item Cart Testing ------");
		Item apple = new Item("Apple", 1.99, "Tasty and sweet.");
		Item chips = new Item("Chips", 2.99, "Salty, very salty.");
		ShoppingCart<Item> myItemCart = new ShoppingCart<Item>(apple); //new shopping cart with apple in the bag
		System.out.println(myItemCart.getCartSize());
		System.out.println(myItemCart.isEmpty());
		myItemCart.addItemToCart(apple);
		myItemCart.addItemToCart(chips, 4);
		System.out.println("number of chips:\t" + myItemCart.getNumberOfItem(chips));
		myItemCart.removeLastAddedItem();
		System.out.println("Cart Price:\t"  + myItemCart.getCartPrice());
		System.out.println("Price of apples: \t" + myItemCart.getPriceOfItemGroup(apple));
		System.out.println("Price of chips: \t" + myItemCart.getPriceOfItemGroup(chips));
		System.out.println("Chips currently in cart?\t" + myItemCart.checkCartForItem(chips));
		System.out.println(myItemCart.toString());
		myItemCart.clearCart();
		System.out.println(myItemCart.toString());
	}
}
