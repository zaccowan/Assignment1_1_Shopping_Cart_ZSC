package cartPackage;

public class Item implements ItemInterface {

	private String itemName = "";
	private double itemPrice = 0.0;
	private String itemDescription = "";
	
	public Item(String name, double price, String description) {
		setItemName(name);
		setItemPrice(price);
		setItemDescription(description);
	}
	
	public Item() {
		setItemName("Default Item");
		setItemPrice(0.0);
		setItemDescription("Default Description");
	}
	
	@Override
	public String getItemName() {
		return itemName;
	}

	@Override
	public String getItemDescription() {
		return itemDescription;
	}

	@Override
	public double getItemPrice() {
		return itemPrice;
	}

	@Override
	public void setItemName(String name) {
		itemName = name;
	}

	@Override
	public void setItemDescription(String description) {
		itemDescription = description;
		
	}

	@Override
	public void setItemPrice(double price) {
		itemPrice = price;
	}
	
	public String toString() {
		return getItemName();
	}

}
