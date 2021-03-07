package three;

public class app {
	public Button butt; 
	public checkbox cbox;
	public app(guif fac) {
		butt = fac.createButton();
		cbox = fac.createCheckbox();
	}
	public void paint() {
		butt.paint();
		cbox.paint();
	}
}
