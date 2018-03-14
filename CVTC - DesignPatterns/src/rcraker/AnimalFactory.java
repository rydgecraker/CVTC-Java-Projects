package rcraker;


public class AnimalFactory {
	
	public static Animal create(String animalType) throws Exception {
		Animal result = null;
		switch (animalType) {
			case "cat":
				result = new Cat();
				break;
			case "dog":
				result = new Dog();
				break;
			default:
				throw new Exception("Invalid type " + animalType);
		}
		return result;
	}
	
}
