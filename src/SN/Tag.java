package SN;

public abstract class Tag {
	
	/**
	 * questions:
	 * 		does there have to be an option to put text between the tags?
	 * 		how would I do that?
	 * 		do all fields have to be protected?
	 * 
	 * 		abstract out methods, concatenate
	 * 		should the name and id methods be in the parent class if the decorators can't use them?
	 */
	
	
	protected abstract String getOpeningTag();	
	protected abstract String getClosingTag();
	public abstract String getTag();

}
