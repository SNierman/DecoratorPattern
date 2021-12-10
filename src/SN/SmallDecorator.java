package SN;

public class SmallDecorator extends TagDecorator {

	Tag tag;

	public SmallDecorator(Tag tag) {
		this.tag = tag;
	}
	
	public String getOpeningTag() {
		return "<small>" + tag.getOpeningTag();
	}
	public String getClosingTag() {
		return tag.getClosingTag() + "</small>";
	}
	
	public String getTag() {
		return getOpeningTag() + getClosingTag();
	}
}
