package SN;

public abstract class Tag {
	
	/**
	 * questions:
	 * 		does there have to be an option to put text between the tags?
	 * 		how would I do that?
	 * 		do all fields have to be protected?
	 * 
	 */
	
	// opening and closing tags are protected because you will never need them
	// outside the class because they are always concatenated before being used
	// since they are always used together
	protected abstract String getOpeningTag();	
	protected abstract String getClosingTag();
	public abstract String getTag();

}
