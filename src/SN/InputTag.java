package SN;

public class InputTag extends Tag {

	private InputType type = new InputType("");
	private InputEvent event = new InputEvent("", "");
	private InputValue value = new InputValue("");
	private Name name = null;
	private Id id = null;

	public InputTag() {

	}

	public InputTag(Name name) {
		this.name = name;
	}

	public InputTag(Id id) {
		this.id = id;
	}

	public InputTag(Name name, Id id) {
		this.name = name;
		this.id = id;
	}

	public InputTag(InputType type) {
		this.type = type;
	}

	public InputTag(InputType type, Name name) {
		this.type = type;
		this.name = name;
	}

	public InputTag(InputType type, Id id) {
		this.type = type;
		this.id = id;
	}

	public InputTag(InputType type, Name name, Id id) {
		this.type = type;
		this.name = name;
		this.id = id;
	}
	
	public InputTag(InputType type, InputValue value) {
		this.type = type;
		this.value = value;
	}
	
	public InputTag(InputType type, InputValue value, Name name) {
		this.type = type;
		this.value = value;
		this.name = name;
	}
	
	public InputTag(InputType type, InputValue value, Id id) {
		this.type = type;
		this.value = value;
		this.id = id;
	}
	
	public InputTag(InputType type, InputValue value, Name name, Id id) {
		this.type = type;
		this.value = value;
		this.name = name;
		this.id = id;
	}

	public InputTag(InputType type, InputEvent event) {
		this.type = type;
		this.event = event;
	}
	
	public InputTag(InputType type, InputEvent event, Name name) {
		this.type = type;
		this.event = event;
		this.name = name;
	}
	
	public InputTag(InputType type, InputEvent event, Id id) {
		this.type = type;
		this.event = event;
		this.id = id;
	}
	
	public InputTag(InputType type, InputEvent event, Name name, Id id) {
		this.type = type;
		this.event = event;
		this.name = name;
		this.id = id;
	}
	
	public InputTag(InputEvent event, InputValue value) {
		this.event = event;
		this.value = value;
	}

	public InputTag(InputEvent event, InputValue value, Id id) {
		this.event = event;
		this.value = value;
		this.id = id;
	}

	public InputTag(InputEvent event, InputValue value, Name name, Id id) {
		this.event = event;
		this.value = value;
		this.name = name;
		this.id = id;
	}

	public InputTag(InputEvent event, InputValue value, Name name) {
		this.event = event;
		this.value = value;
		this.name = name;
	}

	public InputTag(InputType type, InputEvent event, InputValue value) {
		this.type = type;
		this.event = event;
		this.value = value;
	}
	
	public InputTag(InputType type, InputEvent event, InputValue value, Name name) {
		this.type = type;
		this.event = event;
		this.value = value;
		this.name = name;
	}
	
	public InputTag(InputType type, InputEvent event, InputValue value, Id id) {
		this.type = type;
		this.event = event;
		this.value = value;
		this.id = id;
	}
	
	public InputTag(InputType type, InputEvent event, InputValue value, Name name, Id id) {
		this.type = type;
		this.event = event;
		this.value = value;
		this.name = name;
		this.id = id;
	}

	protected String getOpeningTag() {
		String tag = "<input " + type.getInputType() + event.getInputEvent() + value.getInputValue();
		tag = name == null ? tag : tag + " name = " + this.name;
		tag = id == null ? tag : tag + " id = " + id;
		return tag + ">";
	}

	protected String getClosingTag() {
		return "</input>";
	}

	public String getTag() {
		return getOpeningTag() + getClosingTag();
	}

}
