package c3;

public class Manager {
	public void play(Animal animal) {
		if(animal instanceof Dog) {
			((Dog)animal).shout();
			
		}else {
			((Roo)animal).leap();
			
		}
		
	}
}
