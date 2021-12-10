package SN;

public class InputValue {

	String value;
	
	public InputValue(String value) {
		this.value = value;
	}
	
	public String getInputValue() {
		if (value != "")
			return "value=\"" + value + "\" ";
		return "";
	}
}
