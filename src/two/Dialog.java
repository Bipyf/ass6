package two;

abstract public class Dialog {
	public void appear() {
	System.out.println("Dialogue appeared.");
	render();
}
	abstract Button createButton();
	public void render() {
		Button okbutton = createButton();
		okbutton.onclick();
		okbutton.render();
	}
	}
