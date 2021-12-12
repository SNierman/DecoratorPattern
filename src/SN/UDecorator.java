package SN;

public class UDecorator extends TagDecorator {

	Tag tag;
	
	public UDecorator(Tag tag) {
		this.tag = tag;
	}
	
	protected String getOpeningTag() {
		return "<u>" + tag.getOpeningTag();
	}
	protected String getClosingTag() {
		return tag.getClosingTag() + "</u>";
	}
	
	public String getTag() {
		return getOpeningTag() + getClosingTag();
	}
}
