package rcraker;
import java.util.ArrayList;


public class DOMSubject {
	
	public ArrayList<HTMLElement> elements = new ArrayList<HTMLElement>();
	
	
	public void attach(HTMLElement element) {
		elements.add(element);
	}
	
	
	public void notifyElements() {
		for (HTMLElement element : elements) {
			// Notify the element
			element.update();
		}
	}
}
