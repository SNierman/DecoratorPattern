package SN;

public class HTMLMain {

	public static void main(String[] args) {
		Tag tag1 = new DivTag();
		
		System.out.println(tag1.getTag());
		tag1 = new EmDecorator(tag1);
		System.out.println(tag1.getTag());
		tag1 = new UDecorator(tag1);
		System.out.println(tag1.getTag());

		Tag tag2 = new HTag(2);
		System.out.println(tag2.getTag());
		System.out.println(tag2.getTag());
		tag2 = new ADecorator(tag2, "www.touroone.edu");
		System.out.println(tag2.getTag());

		Tag tag3 = new InputTag(new InputType("button"), new InputValue("hello"));
		System.out.println(tag3.getTag());
		tag3 = new SmallDecorator(tag3);
		System.out.println(tag3.getTag());
		tag3 = new IDecorator(tag3);
		System.out.println(tag3.getTag());

	}
}
