package SN;

public class DivTag extends Tag {

	private String name = null;
	private String id = null;
	
	public String getOpeningTag() {
		String tag = name == null ? "<div" : "<div name = " + name; 
		tag = id == null ? tag : tag + " id = " + id;
		return tag + ">";
	}
	
	public String getClosingTag() {
		return "</div>";
	}
	
	public String getTag() {
		return getOpeningTag() + getClosingTag();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setID(String id) {
		this.id = id;
	}
}
