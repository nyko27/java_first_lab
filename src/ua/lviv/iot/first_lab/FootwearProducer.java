package ua.lviv.iot.first_lab;

public class FootwearProducer {
	public static void main(String[] args) {

		Footwear.heightOfSole = 3.5;

		final int AMOUNT_OF_SHOES = 4;

		Footwear boots = new Footwear();
		Footwear trainers = new Footwear("Adidas", 2500, 40, "red");
		Footwear sandals = new Footwear("Nike", 200, 39, "Brown", "Germany", "Black", "Skin", "Summer");

		System.out.println(" Footwear created using different constructors:\n");
		System.out.println(boots.toString() + "\n");
		System.out.println(trainers.toString() + "\n");
		System.out.println(sandals.toString() + "\n");

		System.out.println(Footwear.printStaticHeightOfsole());
		System.out.println(sandals.printHeightOfsole());

		Footwear[] arrayOfShoes = new Footwear[AMOUNT_OF_SHOES];

		int footwearIndex;

		for (footwearIndex = 0; footwearIndex < AMOUNT_OF_SHOES; footwearIndex++) {
			arrayOfShoes[footwearIndex] = new Footwear("ECCO", 2500, 40 + footwearIndex, "black");
		}

		System.out.println("\n Footwear created using cycle:\n");

		for (Footwear currentShoes : arrayOfShoes) {
			System.out.println(currentShoes.toString() + "\n");

		}

	}

}
