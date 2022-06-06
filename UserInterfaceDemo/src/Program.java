import java.awt.*;

public class Program {
	public static void main(String[] args) {
		System.out.println("Hello Java!");
		Frame myFrame = new Frame("Demo Frame");
		myFrame.setSize(600, 400);
		myFrame.setVisible(true);
		myFrame.addWindowListener(new MyListener());
		Insets insets = myFrame.getInsets();
		Button button = new Button();
		button.setSize(20, 20);
		myFrame.add(new Panel().add(button));
		System.out.println(insets);
		System.out.println("Bye!");
	}
}
