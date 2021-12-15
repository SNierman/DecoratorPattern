package SN;

public class PTag extends Tag {
	
	public PTag() {
		super();
	}
	
	public PTag(Name name) {
		super(name);
	}
	
	public PTag(Id id) {
		super(id);
	}
	
	public PTag(Name name, Id id) {
		super(name, id);
	}
	
	protected String getOpeningTag() {
		String tag = "<p";
		tag = name == null ? tag : tag + " name=\"" + name.getName() + "\"";
		tag = id == null ? tag : tag + " id=\"" + id.getId() + "\"";
		return tag + ">";
	}
	
	protected String getClosingTag() {
		return "</p>";
	}
	
	public String getTag() {
		return getOpeningTag() + getClosingTag();
	}
}
