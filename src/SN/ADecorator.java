package SN;

public class ADecorator extends TagDecorator {

	private Tag tag;
	private String href;
	
	public ADecorator(Tag tag, String href) {
		super();
		this.tag = tag;
		this.href = href;
	}
	
	public ADecorator(Tag tag, Name name, String href) {
		super(name);
		this.tag = tag;
		this.href = href;
	}
	
	public ADecorator(Tag tag, Id id, String href) {
		super(id);
		this.tag = tag;
		this.href = href;
	}
	
	public ADecorator(Tag tag, Name name, Id id, String href) {
		super(name, id);
		this.tag = tag;
		this.href = href;
	}
	
	protected String getOpeningTag() {
		String currTag = "<a href=" + href;
		currTag = name == null ? currTag : currTag + " name=\"" + name.getName() + "\""; 
		currTag = id == null ? currTag : currTag + " id=\"" + id.getId() + "\"";
		return currTag  + ">" + tag.getOpeningTag();
	}
	
	protected String getClosingTag() {
		return tag.getClosingTag() + "</a>";
	}
	
	public String getTag() {
		return getOpeningTag() + getClosingTag();
	}
}
