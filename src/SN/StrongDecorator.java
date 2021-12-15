package SN;

public class StrongDecorator extends TagDecorator {

	private Tag tag;

	public StrongDecorator(Tag tag) {
		super();
		this.tag = tag;
	}
	
	public StrongDecorator(Tag tag, Name name) {
		super(name);
		this.tag = tag;
	}
	
	public StrongDecorator(Tag tag, Id id) {
		super(id);
		this.tag = tag;
	}
	
	public StrongDecorator(Tag tag, Name name, Id id) {
		super(name, id);
		this.tag = tag;
	}
	
	protected String getOpeningTag() {
		String currTag = "<strong";
		currTag = name == null ? currTag : currTag + " name=\"" + name.getName() + "\""; 
		currTag = id == null ? currTag : currTag + " id=\"" + id.getId() + "\"";
		return currTag  + ">" + tag.getOpeningTag();
	}
	
	protected String getClosingTag() {
		return tag.getClosingTag() + "</strong>";
	}
	public String getTag() {
		return getOpeningTag() + getClosingTag();
	}
}
