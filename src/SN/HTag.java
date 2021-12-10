package SN;

public class HTag extends Tag {

	// if hSize is not set, or is set invalidly, its default is 1
	int hSize = 1;
	String name = null;
	String id = null;
	
	public HTag(int hSize) {
		super();
		if (hSize >=1 && hSize <= 6) {
			this.hSize = hSize;
		}
	}

	public String getOpeningTag() {
		String tag = name == null ? "<h" + hSize : "<div name = " + name; 
		tag = id == null ? tag : tag + " id = " + id;
		return tag + ">";
	}
	
	public String getClosingTag() {
		return "</h" + hSize + ">";
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
