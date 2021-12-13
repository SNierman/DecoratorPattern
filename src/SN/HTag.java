package SN;

public class HTag extends Tag {

	// if hSize is not set, or is set invalidly, its default is 1
	private int hSize = 1;
	private Name name = null;
	private Id id = null;
	
	public HTag(int hSize) {
		this.hSize = hSizeValidator(hSize);
	}
	
	public HTag(int hSize, Name name) {
		this.hSize = hSizeValidator(hSize);
		this.name = name;		
	}

	public HTag(int hSize, Id id) {
		this.hSize = hSizeValidator(hSize);
		this.id = id;
	}
	
	public HTag(int hSize, Name name, Id id) {
		this.hSize = hSizeValidator(hSize);
		this.name = name;
		this.id = id;
	}
	private int hSizeValidator(int hSize) {
		if (hSize >=1 && hSize <= 6) {
			return hSize;
		}
		return 1;
	}
	protected String getOpeningTag() {
		String tag = name == null ? "<h" + hSize : "<div name = " + name; 
		tag = id == null ? tag : tag + " id = " + id;
		return tag + ">";
	}
	
	protected String getClosingTag() {
		return "</h" + hSize + ">";
	}
	
	public String getTag() {
		return getOpeningTag() + getClosingTag();
	}
	
}
