/**
 * 
 */
package reg.jedi.edu;


/**
 * 
 * @author Rydge
 *
 */
public class Jedi {
	
	private String		name;
	private String		path;
	private String		rank;
	private String		saberColor;
	private String		instructor;
	private String		uniqueTrait;
	
	
	public static int	JEDI_COUNTER	= 0;
	
	
	/**
	 * Yoyoyo. This is an empty jedi yo. Use the other constructor unless you wanna be a bitch about
	 * it.
	 */
	public Jedi() {
		JEDI_COUNTER++;
	}
	
	
	/**
	 * 
	 * @param path
	 *            The type of jedi
	 * @param rank
	 *            the rank of the jedi
	 * @param saberColor
	 *            the color of the jedi saber (Blue, Green, or Yellow typcially)
	 * @param instructor
	 *            (Yoda, Obi-Wan, Luke, Mace, ect)
	 * @param uniqueTrait
	 *            (Signature force power, Specialization, or Lightsaber Form)
	 */
	public Jedi(String path, String rank, String saberColor, String instructor, String uniqueTrait) {
		this.path = path;
		this.rank = rank;
		this.saberColor = saberColor;
		this.instructor = instructor;
		this.uniqueTrait = uniqueTrait;
		JEDI_COUNTER++;
	}
	
	
	public String getPath() {
		return path;
	}
	
	
	public void setPath(String path) {
		this.path = path;
	}
	
	
	public String getRank() {
		return rank;
	}
	
	
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	
	public String getSaberColor() {
		return saberColor;
	}
	
	
	public void setSaberColor(String saberColor) {
		this.saberColor = saberColor;
	}
	
	
	public String getInstructor() {
		return instructor;
	}
	
	
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	
	
	public String getUniqueTrait() {
		return uniqueTrait;
	}
	
	
	public void setUniqueTrait(String uniqueTrait) {
		this.uniqueTrait = uniqueTrait;
	}
	
	
	public String toString() {
		return "[Path: " + this.path + "\nRank: " + this.rank + "\nSaber Color: " + this.saberColor + "]";
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setname(String name) {
		this.name = name;
	}
	
}
