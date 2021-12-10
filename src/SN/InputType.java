package SN;

public class InputType {

	String type;
	
	public InputType(String type) {
		this.type = type;
	}

	public String getInputType() {
		if (type != "")
			return "type=\"" + type + "\" ";
		return "";
	}
}
