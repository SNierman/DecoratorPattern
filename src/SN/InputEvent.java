package SN;

public class InputEvent {

	String eventType;
	String eventValue;
	
	public InputEvent(String eventType, String eventValue) {
		this.eventType = eventType;
		this.eventValue = eventValue;
	}
	
	public String getInputEvent() {
		if (eventType != "")
			return eventType + "=\"" + eventValue + "\" ";
		return "";
	}
}
