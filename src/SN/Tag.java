package SN;

public abstract class Tag {
	
	//Name and ID have wrapper classes so the user can use none, one or both and
	//the constructor will know exactly what the user wants
	Name name = null;
	Id id = null;
	
	// Different constructors depending on what the user wants in his tag
	public Tag() {
		
	}
	
	public Tag(Name name) {
		this.name = name;
	}
	
	public Tag(Id id) {
		this.id = id;
	}
	
	public Tag(Name name, Id id) {
		this.name = name;
		this.id = id;
	}
	
	// opening and closing tags are protected because you will never need them
	// outside the class because they are always concatenated before being used
	// since they are always used together
	protected abstract String getOpeningTag();	
	protected abstract String getClosingTag();
	public abstract String getTag();

}
