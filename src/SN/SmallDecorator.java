package SN;

public class SmallDecorator extends TagDecorator {

	Tag tag;

	public SmallDecorator(Tag tag) {
		this.tag = tag;
	}
	
	protected String getOpeningTag() {
		return "<small>" + tag.getOpeningTag();
	}
	protected String getClosingTag() {
		return tag.getClosingTag() + "</small>";
	}
	
	public String getTag() {
		return getOpeningTag() + getClosingTag();
	}
}
