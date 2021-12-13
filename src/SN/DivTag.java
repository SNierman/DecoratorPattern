package SN;

public class DivTag extends Tag {

	// Name and id had to be separate objects so that the user
	// can choose to have one and not the other
	private Name name = null;
	private Id id = null;
	
	public DivTag() {
		
	}
	
	public DivTag(Name name) {
		this.name = name;
	}
	
	public DivTag(Id id) {
		this.id = id;
	}
	
	public DivTag(Name name, Id id) {
		this.name = name;
		this.id = id;
	}
	
	protected String getOpeningTag() {
		String tag = name == null ? "<div" : "<div name = " + name; 
		tag = id == null ? tag : tag + " id = " + id;
		return tag + ">";
	}
	
	protected String getClosingTag() {
		return "</div>";
	}
	
	public String getTag() {
		return getOpeningTag() + getClosingTag();
	}
	
}
