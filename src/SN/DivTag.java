package SN;

public class DivTag extends Tag {
	
	public DivTag() {
		super();
	}
	
	public DivTag(Name name) {
		super(name);
	}
	
	public DivTag(Id id) {
		super(id);
	}
	
	public DivTag(Name name, Id id) {
		super(name, id);
	}
	
	
	protected String getOpeningTag() {
		String tag = "<div";
		tag = name == null ? tag : tag + " name=\"" + name.getName() + "\""; 
		tag = id == null ? tag : tag + " id=\"" + id.getId() + "\"";
		return tag + ">";
	}
	
	protected String getClosingTag() {
		return "</div>";
	}
	
	public String getTag() {
		return getOpeningTag() + getClosingTag();
	}
	
}
