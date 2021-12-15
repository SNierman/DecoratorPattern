package SN;

public class InputTag extends Tag {

	private InputType type = new InputType("");
	private InputEvent event = new InputEvent(null, "");
	private InputValue value = new InputValue("");

	public InputTag() {
		super();
	}

	public InputTag(Name name) {
		super(name);
	}

	public InputTag(Id id) {
		super(id);
	}

	public InputTag(Name name, Id id) {
		super(name, id);
	}

	public InputTag(InputType type) {
		super();
		this.type = type;
	}

	public InputTag(InputType type, Name name) {
		super(name);
		this.type = type;
	}

	public InputTag(InputType type, Id id) {
		super(id);
		this.type = type;
	}

	public InputTag(InputType type, Name name, Id id) {
		super(name, id);
		this.type = type;
	}
	
	public InputTag(InputType type, InputValue value) {
		super();
		this.type = type;
		this.value = value;
	}
	
	public InputTag(InputType type, InputValue value, Name name) {
		super(name);
		this.type = type;
		this.value = value;
	}
	
	public InputTag(InputType type, InputValue value, Id id) {
		super(id);
		this.type = type;
		this.value = value;
	}
	
	public InputTag(InputType type, InputValue value, Name name, Id id) {
		super(name, id);
		this.type = type;
		this.value = value;
	}

	public InputTag(InputType type, InputEvent event) {
		super();
		this.type = type;
		this.event = event;
	}
	
	public InputTag(InputType type, InputEvent event, Name name) {
		super(name);
		this.type = type;
		this.event = event;
	}
	
	public InputTag(InputType type, InputEvent event, Id id) {
		super(id);
		this.type = type;
		this.event = event;
	}
	
	public InputTag(InputType type, InputEvent event, Name name, Id id) {
		super(name, id);
		this.type = type;
		this.event = event;
	}
	
	public InputTag(InputEvent event, InputValue value) {
		super();
		this.event = event;
		this.value = value;
	}

	public InputTag(InputEvent event, InputValue value, Name name) {
		super(name);
		this.event = event;
		this.value = value;
	}
	
	public InputTag(InputEvent event, InputValue value, Id id) {
		super(id);
		this.event = event;
		this.value = value;
	}

	public InputTag(InputEvent event, InputValue value, Name name, Id id) {
		super(name, id);
		this.event = event;
		this.value = value;
	}

	

	public InputTag(InputType type, InputEvent event, InputValue value) {
		super();
		this.type = type;
		this.event = event;
		this.value = value;
	}
	
	public InputTag(InputType type, InputEvent event, InputValue value, Name name) {
		super(name);
		this.type = type;
		this.event = event;
		this.value = value;
	}
	
	public InputTag(InputType type, InputEvent event, InputValue value, Id id) {
		super(id);
		this.type = type;
		this.event = event;
		this.value = value;
	}
	
	public InputTag(InputType type, InputEvent event, InputValue value, Name name, Id id) {
		super(name, id);
		this.type = type;
		this.event = event;
		this.value = value;
	}

	protected String getOpeningTag() {
		String tag = "<input " + type.getInputType() + event.getInputEvent() + value.getInputValue();
		tag = name == null ? tag : tag + " name=\"" + name.getName() + "\"";
		tag = id == null ? tag : tag + " id=\"" + id.getId() + "\"";
		return tag + ">";
	}

	protected String getClosingTag() {
		return "</input>";
	}

	public String getTag() {
		return getOpeningTag() + getClosingTag();
	}

}
