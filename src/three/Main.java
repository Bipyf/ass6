package three;
import java.util.*;
public class Main {
	public static app ap;
	public static guif fac;
	public static Scanner sc = new Scanner(System.in);
	public static app config() {
	System.out.println("1 for mac /n 2 for win");
	int n = sc.nextInt();
	if (n==1) {
		fac = new macf();
		ap = new app(fac);
	}
	else if (n==2) {
		fac = new winf();
		ap = new app(fac);
	}
	return ap;
	}
	public static void main(String[] args) {
		app os = config();
		os.paint();
	}
}
