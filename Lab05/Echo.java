import java.util.*;

class Echo {
	  public static void main(String[] args) {
		      Scanner sc = new Scanner(System.in);
		      
			System.out.println("What is your name?");
			String name = sc.next();
			System.out.println("Hello, " + name + ".");
			
			sc.close();

			MyFrame f = new MyFrame();
			f.setVisible(true);
	 }
}
