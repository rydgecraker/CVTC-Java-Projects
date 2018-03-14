package rcraker;


public class HTMLElement {
	
	private String elementType;
	
	
	public HTMLElement(String elementType) {
		this.elementType = elementType;
	}
	
	
	public void update() {
		System.out.println("I updated bruh - " + elementType);
	}
}
