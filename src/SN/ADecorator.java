package SN;

public class ADecorator extends TagDecorator {

	private Tag tag;
	private String href;
	
	public ADecorator(Tag tag, String href) {
		this.tag = tag;
		this.href = href;
	}
	
	protected String getOpeningTag() {
		return "<a href=\"" + href + "\">" + tag.getOpeningTag() ;
	}
	
	protected String getClosingTag() {
		return tag.getClosingTag() + "</a>";
	}
	
	public String getTag() {
		return getOpeningTag() + getClosingTag();
	}
}
