package two;

public class HtmlBut implements Button {
	public void render() {
		System.out.println("Web button was rendered.");
	}
	public void onclick() {
		System.out.println("Web dialogue was closed");
	}
}
