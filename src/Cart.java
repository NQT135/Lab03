
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
}
