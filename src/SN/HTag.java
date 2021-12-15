package SN;

public class HTag extends Tag {

	// if hSize is not set, or is set invalidly, its default is 1
	private int hSize = 1;
	
	public HTag(int hSize) {
		super();
		this.hSize = hSizeValidator(hSize);
	}
	
	public HTag(int hSize, Name name) {
		super(name);
		this.hSize = hSizeValidator(hSize);
	}

	public HTag(int hSize, Id id) {
		super(id);
		this.hSize = hSizeValidator(hSize);
	}
	
	public HTag(int hSize, Name name, Id id) {
		super(name, id);
		this.hSize = hSizeValidator(hSize);
	}
	
	// Make sure that the size is a valid size, if not, size will be 1
	private int hSizeValidator(int hSize) {
		if (hSize >=1 && hSize <= 6) {
			return hSize;
		}
		return 1;
	}
	protected String getOpeningTag() {
		String tag = "<h" + hSize;
		tag = name == null ? tag : tag + " name=\"" + name.getName() + "\""; 
		tag = id == null ? tag : tag + " id=\"" + id.getId() + "\"";
		return tag + ">";
	}
	
	protected String getClosingTag() {
		return "</h" + hSize + ">";
	}
	
	public String getTag() {
		return getOpeningTag() + getClosingTag();
	}
	
}
