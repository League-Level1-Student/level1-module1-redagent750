package popcorn;

public class PopcornMaker {
	
	public static void main(String[] args) {
		Microwave Popcorn = new Microwave();
		Popcorn.putInMicrowave(null);
		Popcorn.setTime(1);
		Popcorn.startMicrowave();
		Popcorn bag = new Popcorn("cheese");
		bag.eat();
		bag.applyHeat();
		
	}
}
