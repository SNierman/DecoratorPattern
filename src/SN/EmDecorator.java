package SN;

public class EmDecorator extends TagDecorator {

	Tag tag;

	public EmDecorator(Tag tag) {
		this.tag = tag;
	}
	
	protected String getOpeningTag() {
		return "<em>" + tag.getOpeningTag();
	}
	protected String getClosingTag() {
		return tag.getClosingTag() + "</em>";
	}
	
	public String getTag() {
		return getOpeningTag() + getClosingTag();
	}
}
