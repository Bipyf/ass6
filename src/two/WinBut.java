package two;

public class WinBut implements Button {
	public void render() {
		System.out.println("The windows button was rendered.");
	}
	public void onclick() {
		System.out.println("The windows dialog was closed");
	}
}
