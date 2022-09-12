package cartPackage;

/**
 * @author zaccowan
 * @version 9/9/22
 * Fall/2022
 */
public class Application {
	public static void main(String [] args) {
		
//		System.out.println("------ String Cart Testing ------");
//		ShoppingCart<String> myStringCart = new ShoppingCart<String>();
//		
//		myStringCart.addItemToCart("Apple");
//		myStringCart.addItemToCart("Grape");
//		System.out.println(myStringCart.isEmpty());
//		myStringCart.clearCart();
//		System.out.println(myStringCart.getCartSize());
//		myStringCart.removeLastAddedItem();
//		System.out.println(myStringCart.getCartSize());
		
		
		System.out.println("\n------ Item Cart Testing ------");
		Item apple = new Item("Apple", 1.99, "Tasty and sweet.");
		Item chips = new Item("Chips", 2.99, "Salty, very salty.");
		ShoppingCart<Item> myItemCart = new ShoppingCart<Item>(apple);

		myItemCart.addItemToCart(chips, 4);
		System.out.println(myItemCart.getCartPrice());
		System.out.println("Price of apples: \t" + myItemCart.getPriceOfItemGroup(apple));
		System.out.println("Price of chips: \t" + myItemCart.getPriceOfItemGroup(chips));
		System.out.println();
		System.out.println(myItemCart.toString());
		System.out.println(myItemCart.toArray()[0].toString());
	}
}
