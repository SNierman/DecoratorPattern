package SN;

public class InputTag extends Tag {

	InputType type = new InputType("");
	InputEvent event = new InputEvent("", "");
	InputValue value = new InputValue("");
	String name = null;
	String id = null;
	
	public InputTag() {
		
	}
	
	public InputTag(InputType type) {
		this.type = type;
	}
	
	public InputTag(InputEvent event) {
		this.event = event;
	}
	
	public InputTag(InputValue value) {
		this.value = value;
	}
	
	public InputTag(InputType type, InputEvent event) {
		this.type = type;
		this.event = event;
	}
	
	public InputTag(InputType type, InputValue value) {
		this.type = type;
		this.value = value;
	}
	
	public InputTag(InputEvent event, InputValue value) {
		this.event = event;
		this.value = value;
	}
	
	public InputTag(InputType type, InputEvent event, InputValue value) {
		this.type = type;
		this.event = event;
		this.value = value;
	}
	
	public String getOpeningTag() {
		String tag = "<input " + type.getInputType() + event.getInputEvent() + value.getInputValue();
		tag = name == null ? tag : tag + " name = " + this.name;
		tag = id == null ? tag : tag + " id = " + id;
		return  tag + ">";
	}
	
	public String getClosingTag() {
		return "</input>";
	}
	
	public String getTag() {
		return getOpeningTag() + getClosingTag();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setID(String id) {
		this.id = id;
	}
}
