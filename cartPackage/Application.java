package cartPackage;

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
		ShoppingCart<Item> myItemCart = new ShoppingCart<Item>();
		
		Item apple = new Item("Apple", 1.99, "Tasty and sweet.");
		myItemCart.addItemToCart(apple, 3);
		System.out.println(myItemCart.getCartPrice());
		System.out.println(myItemCart.getPriceOfItemGroup(apple));
		System.out.println(myItemCart.toString());
	}
}
