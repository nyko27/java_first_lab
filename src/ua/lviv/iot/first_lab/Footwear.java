package ua.lviv.iot.first_lab;

public class Footwear {
	private String producerName;
	private double price;
	private int size;
	private String colour;
	private String producingCountry;
	private String colourOfSole;
	static double heightOfSole;
	protected String materialType;
	protected String seasonForWearing;

	public String getProducerName() {
		return producerName;
	}

	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getProducingCountry() {
		return producingCountry;
	}

	public void setProducingCountry(String producingCountry) {
		this.producingCountry = producingCountry;
	}

	public String getColourOfSole() {
		return colourOfSole;
	}

	public void setColourOfSole(String colourOfSole) {
		this.colourOfSole = colourOfSole;
	}

	public Footwear(String producerName, double price, int size, String colour, String producingCountry,
			String colourOfSole, String materialType, String seasonForWearing) {
		this.producerName = producerName;
		this.price = price;
		this.size = size;
		this.colour = colour;
		this.producingCountry = producingCountry;
		this.colourOfSole = colourOfSole;
		this.materialType = materialType;
		this.seasonForWearing = seasonForWearing;
	}

	public Footwear(String producerName, double price, int size, String colour) {
		this(producerName, price, size, colour, null, null, null, null);
	}

	public Footwear() {
		this(null, 0, 0, null, null, null, null, null);
	}

	@Override
	public String toString() {
		return "Footwear [producerName=" + producerName + ", price=" + price + ", size=" + size + ", colour=" + colour
				+ ", producingCountry=" + producingCountry + ", colourOfSole=" + colourOfSole + ", materialType="
				+ materialType + ", seasonForWearing=" + seasonForWearing + "]";
	}

	public static String printStaticHeightOfsole() {
		return "Height of Sole =" + Footwear.heightOfSole;
	}

	public String printHeightOfsole() {
		return "Height of Sole =" + Footwear.heightOfSole;
	}

	public void resetValues(String producerName, double price, int size, String colour, String producingCountry,
			String colourOfSole, String materialType, String seasonForWearing) {
		this.producerName = producerName;
		this.price = price;
		this.size = size;
		this.colour = colour;
		this.producingCountry = producingCountry;
		this.colourOfSole = colourOfSole;
		this.materialType = materialType;
		this.seasonForWearing = seasonForWearing;
	}

}
