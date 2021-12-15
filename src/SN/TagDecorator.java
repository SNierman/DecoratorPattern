package SN;

public abstract class TagDecorator extends Tag {

	
	public TagDecorator() {
		super();
	}
	
	public TagDecorator(Name name) {
		super(name);
	}
	
	public TagDecorator(Id id) {
		super(id);
	}
	
	public TagDecorator(Name name, Id id) {
		super(name, id);
	}
	
	public abstract String getTag();
	
}
