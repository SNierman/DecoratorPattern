package SN;

public class PTag extends Tag {

	Name name = null;
	Id id = null;
	
	public PTag() {
		
	}
	
	public PTag(Name name) {
		this.name = name;
	}
	
	public PTag(Id id) {
		this.id = id;
	}
	
	public PTag(Name name, Id id) {
		this.name = name;
		this.id = id;
	}
	
	protected String getOpeningTag() {
		String tag = "<p";
		tag = name == null ? tag : tag + " name = " + name;
		tag = id == null ? tag : tag + " id = " + id;
		return tag + ">";
	}
	
	protected String getClosingTag() {
		return "</p>";
	}
	
	public String getTag() {
		return getOpeningTag() + getClosingTag();
	}
}
