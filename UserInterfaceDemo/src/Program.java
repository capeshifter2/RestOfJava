import java.awt.*;
import java.awt.event.*;

public class Program {
	
	private static final int padding = 20;
	private static Frame myFrame = new Frame("Demo Frame");
	private static Button button = new Button("F!rst!!");
	public static void main(String[] args) {
		
		System.out.println("Hello Java!");
		myFrame.setSize(800, 600);
		myFrame.setVisible(true);
		myFrame.addWindowListener(new MyListener());
		myFrame.setLayout(null);
		
		Insets insets = myFrame.getInsets();
		
		
		button.setBounds(insets.left + padding, insets.top + padding, 80, 20);
		myFrame.add(button);
		button.setBackground(Color.blue);
		ActionListener aListener = new MyActionListener();
		button.addActionListener(aListener);
		Button button2 = new Button();
		
		TextArea myTextArea = new TextArea();
		myTextArea.setBounds(button.getX(), 
		        button.getY() + button.getHeight() + padding, 
			     myFrame.getWidth() - padding - insets.left - insets.right - padding, 
				  myFrame.getHeight() - (button.getY() + button.getHeight() + padding));
		
		myFrame.add(myTextArea);
		myTextArea.setEditable(false);
		System.out.println(insets);
		System.out.println("Bye!");
	}
}
