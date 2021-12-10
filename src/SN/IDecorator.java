package SN;

public class IDecorator extends TagDecorator {

	Tag tag;

	public IDecorator(Tag tag) {
		this.tag = tag;
	}
	
	public String getOpeningTag() {
		return "<i>" + tag.getOpeningTag();
	}

	public String getClosingTag() {
		return tag.getClosingTag();
	}

	public String getTag() {
		return getOpeningTag() + getClosingTag();
	}

}
