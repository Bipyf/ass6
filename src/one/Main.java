package one;

public class Main {
	
	public static void main(String[] args) {
	singlleton ob1 = singlleton.getInstance(1);
	singlleton ob2 = singlleton.getInstance(2);
	System.out.println("if both of them are equal then program works");
	System.out.println(ob1);
	System.out.println(ob2);
	}

}
