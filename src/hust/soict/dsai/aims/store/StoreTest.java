package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class StoreTest {
	public static void main(String[] args) {
	    Store myStore = new Store();
	    DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "Goerge Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "Roger Allers", 87, 19.95f);
	    myStore.addDVD(dvd1);
	    myStore.addDVD(dvd2);
	    myStore.addDVD(dvd3);
	    
	    myStore.removeDVD(dvd1);
	    }

}
