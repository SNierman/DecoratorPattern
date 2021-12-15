package SN;

public class EmDecorator extends TagDecorator {

	private Tag tag;

	public EmDecorator(Tag tag) {
		super();
		this.tag = tag;
	}
	
	public EmDecorator(Tag tag, Name name) {
		super(name);
		this.tag = tag;
	}
	
	public EmDecorator(Tag tag, Id id) {
		super(id);
		this.tag = tag;
	}
	
	public EmDecorator(Tag tag, Name name, Id id) {
		super(name, id);
		this.tag = tag;
	}
	
	protected String getOpeningTag() {
		String currTag = "<em";
		currTag = name == null ? currTag : currTag + " name=\"" + name.getName() + "\""; 
		currTag = id == null ? currTag : currTag + " id=\"" + id.getId() + "\"";
		return currTag + ">" + tag.getOpeningTag();
	}
	
	protected String getClosingTag() {
		return tag.getClosingTag() + "</em>";
	}
	
	public String getTag() {
		return getOpeningTag() + getClosingTag();
	}
}
