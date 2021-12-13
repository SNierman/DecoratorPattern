package SN;

public class IDecorator extends TagDecorator {

	private Tag tag;

	public IDecorator(Tag tag) {
		this.tag = tag;
	}
	
	protected String getOpeningTag() {
		return "<i>" + tag.getOpeningTag();
	}

	protected String getClosingTag() {
		return tag.getClosingTag();
	}

	public String getTag() {
		return getOpeningTag() + getClosingTag();
	}

}
