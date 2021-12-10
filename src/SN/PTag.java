package SN;

public class PTag extends Tag {

	String name = null;
	String id = null;
	
	public String getOpeningTag() {
		String tag = "<p";
		tag = name == null ? tag : tag + " name = " + name;
		tag = id == null ? tag : tag + " id = " + id;
		return tag + ">";
	}
	
	public String getClosingTag() {
		return "</p>";
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
