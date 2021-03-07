package two;
import java.util.*;
public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static Dialog d;
	public static void init() {
			System.out.println("config");
		int config = sc.nextInt();
		if (config==1) {
			d = new WinDia();
		}
		else if (config==2) {
			d = new WebDia();
		}
		}
	public static void main(String args[]) {
		init();
		d.render();
}
}