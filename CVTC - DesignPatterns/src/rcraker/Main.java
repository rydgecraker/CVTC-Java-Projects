package rcraker;


public class Main {
	
	public static void main(String[] args) {
		
		try {
			animalMakesNoise(AnimalFactory.create("dog"));
			animalMakesNoise(AnimalFactory.create("cat"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		DOMSubject subject = new DOMSubject();
		subject.attach(new HTMLElement("html"));
		subject.attach(new HTMLElement("div"));
		subject.attach(new HTMLElement("p"));
		
		subject.notifyElements();
		
	}
	
	
	public static void animalMakesNoise(Animal pet) {
		System.out.println(pet.makeNoise());
	}
	
}
