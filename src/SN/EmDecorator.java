package SN;

public class EmDecorator extends TagDecorator {

	Tag tag;

	public EmDecorator(Tag tag) {
		this.tag = tag;
	}
	
	public String getOpeningTag() {
		return "<em>" + tag.getOpeningTag();
	}
	public String getClosingTag() {
		return tag.getClosingTag() + "</em>";
	}
	
	public String getTag() {
		return getOpeningTag() + getClosingTag();
	}
}
