package SN;

public class InputEvent {

	EventType eventType;
	String eventValue;
	
	public InputEvent(EventType eventType, String eventValue) {
		this.eventType = eventType;
		this.eventValue = eventValue;
	}
	
	public String getInputEvent() {
		if (eventType != null)
			return eventType.toString() + "=\"" + eventValue + "\" ";
		return "";
	}
}
