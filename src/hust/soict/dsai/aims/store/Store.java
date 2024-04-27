package hust.soict.dsai.aims.store;

import java.util.ArrayList;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
public class Store {
    private ArrayList<DigitalVideoDisc> itemInStore = new ArrayList<DigitalVideoDisc>();
    public void addDVD(DigitalVideoDisc disk) {
        this.itemInStore.add(disk);
    }
    public void removeDVD(DigitalVideoDisc disk) {
        this.itemInStore.remove(disk);
    }     
}
