package SN;

public class StrongDecorator extends TagDecorator {

	Tag tag;

	public StrongDecorator(Tag tag) {
		this.tag = tag;
	}
	
	public String getOpeningTag() {
		return "<strong>" + tag.getOpeningTag();
	}
	public String getClosingTag() {
		return tag.getClosingTag() + "</strong>";
	}
	public String getTag() {
		return getOpeningTag() + getClosingTag();
	}
}
