package SN;

public class SmallDecorator extends TagDecorator {

	private Tag tag;

	public SmallDecorator(Tag tag) {
		super();
		this.tag = tag;
	}
	
	public SmallDecorator(Tag tag, Name name) {
		super(name);
		this.tag = tag;
	}
	
	public SmallDecorator(Tag tag, Id id) {
		super(id);
		this.tag = tag;
	}
	
	public SmallDecorator(Tag tag, Name name, Id id) {
		super(name, id);
		this.tag = tag;
	}
	
	protected String getOpeningTag() {
		String currTag = "<small";
		currTag = name == null ? currTag : currTag + " name=\"" + name.getName() + "\""; 
		currTag = id == null ? currTag : currTag + " id=\"" + id.getId() + "\"";
		return currTag  + ">" + tag.getOpeningTag();
	}
	protected String getClosingTag() {
		return tag.getClosingTag() + "</small>";
	}
	
	public String getTag() {
		return getOpeningTag() + getClosingTag();
	}
}
