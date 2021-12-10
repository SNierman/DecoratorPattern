package SN;

public class UDecorator extends TagDecorator {

	Tag tag;
	
	public UDecorator(Tag tag) {
		this.tag = tag;
	}
	
	public String getOpeningTag() {
		return "<u>" + tag.getOpeningTag();
	}
	public String getClosingTag() {
		return tag.getClosingTag() + "</u>";
	}
	
	public String getTag() {
		return getOpeningTag() + getClosingTag();
	}
}
