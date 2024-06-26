package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
	
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private static int nbDigitalVideoDiscs = 0;
	private int id;
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public double getCost() {
		return cost;
	}
	public float getId() {
		return this.id;
	};

	
	public DigitalVideoDisc(String title) {
		this.title = title;
		nbDigitalVideoDiscs ++;
		this.id = nbDigitalVideoDiscs;
	};
	public DigitalVideoDisc(String title, String category, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
		nbDigitalVideoDiscs ++;
		this.id = nbDigitalVideoDiscs;
	};
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.director = director;
		nbDigitalVideoDiscs ++;
		this.id = nbDigitalVideoDiscs;
	};

	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		nbDigitalVideoDiscs ++;
		this.id = nbDigitalVideoDiscs;
	}

	@Override
	public String toString() {
		return "DVD - Title=" + title + "- Category=" + category + "- Director=" + director + "- Length="
				+ length + "- Cost=" + cost + "$";
	}

	

}
