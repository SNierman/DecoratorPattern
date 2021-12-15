package SN;

public class HTMLMain {

	public static void main(String[] args) {
		
		Tag tag1 = new DivTag(new Name("divname"));		
		System.out.println(tag1.getTag());
		tag1 = new EmDecorator(tag1);
		System.out.println(tag1.getTag());
		tag1 = new UDecorator(tag1);
		System.out.println(tag1.getTag());

		Tag tag2 = new HTag(2, new Name("hname"));
		System.out.println(tag2.getTag());
		tag2 = new ADecorator(tag2, new Name("aname"), new Id("aid"), "www.touroone.edu");
		System.out.println(tag2.getTag());

		Tag tag3 = new InputTag(new InputType("button"), new InputEvent(EventType.onclick, "helloclicker!"), new InputValue("hello"));
		System.out.println(tag3.getTag());
		tag3 = new SmallDecorator(tag3);
		System.out.println(tag3.getTag());
		tag3 = new IDecorator(tag3);
		System.out.println(tag3.getTag());
		
		Tag tag4 = new PTag(new Name("pname"), new Id("pid"));
		System.out.println(tag4.getTag());
		tag4 = new IDecorator(tag4);
		System.out.println(tag4.getTag());
		tag4 = new EmDecorator(tag4, new Name("emname"));
		System.out.println(tag4.getTag());
	}
}
