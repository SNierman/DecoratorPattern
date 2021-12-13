package SN;

public class StrongDecorator extends TagDecorator {

	private Tag tag;

	public StrongDecorator(Tag tag) {
		this.tag = tag;
	}
	
	protected String getOpeningTag() {
		return "<strong>" + tag.getOpeningTag();
	}
	protected String getClosingTag() {
		return tag.getClosingTag() + "</strong>";
	}
	public String getTag() {
		return getOpeningTag() + getClosingTag();
	}
}
