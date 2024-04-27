package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private int numberItem = 0;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd) {
		if(numberItem == MAX_NUMBERS_ORDERED) {
			return;
		}
		
		itemsOrdered[numberItem] = dvd;
		numberItem++;
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
	    for (DigitalVideoDisc dvd : dvdList) {
	        // Add dvd to the current cart
	    	addDigitalVideoDisc(dvd);
	    }
	}

	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		addDigitalVideoDisc(dvd1);
		addDigitalVideoDisc(dvd2);
	}
	
	public double totalCost() {
		double total = 0.0;
		for(int i = 0; i < numberItem; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc dvd) {
		for(int i = 0; i < numberItem; ++i ) {
			if(itemsOrdered[i] == dvd) {
				for(int j = i; j < numberItem - 1; ++j) {
					itemsOrdered[j] = itemsOrdered[j + 1];
				}
				numberItem--;
			}
		}
		
	}
	public void print() {
		double total = totalCost();
		for (int i = 0; i < numberItem; i++) {
			DigitalVideoDisc disk = itemsOrdered[i];
			System.out.println( "DVD - Title= " + disk.getTitle() + "- Category= " + disk.getCategory() + "- Director= " + disk.getDirector() + "- Length= "
					+ disk.getLength() + "- Cost= " + disk.getCost() + "$");
			//total += disk.getCost();
		}
		System.out.println("Total Cost: " + total);
	}
	
	public void listOrederItem(){
		System.out.println("**************CART*************");
		print();
		System.out.println("*******************************");
	}
	
	public void searchById(int myId) {
		boolean found = false;
		for (int i = 0; i < numberItem; i++) {
			DigitalVideoDisc disk = itemsOrdered[i];
			if (disk.getId() == myId) {
				System.out.println( "DVD - Title= " + disk.getTitle() + "- Category= " + disk.getCategory() + "- Director= " + disk.getDirector() + "- Length= "
						+ disk.getLength() + "- Cost= " + disk.getCost() + "$");
				found = true;
				break;
			}
			if (found ==false) {
				System.out.println("This id is not in your cart");
			}
		}
	}
	public void searchByTitle(String myTitle) {
		boolean found = false;
		for (int i = 0; i < numberItem; i++) {
			DigitalVideoDisc disk = itemsOrdered[i];
			if (disk.getTitle() == myTitle) {
				System.out.println( "DVD - Title= " + disk.getTitle() + "- Category= " + disk.getCategory() + "- Director= " + disk.getDirector() + "- Length= "
						+ disk.getLength() + "- Cost= " + disk.getCost() + "$");
				found = true;
			}
			if (found ==false) {
				System.out.println("This id is not in your cart");
			}
		}
	}


}
