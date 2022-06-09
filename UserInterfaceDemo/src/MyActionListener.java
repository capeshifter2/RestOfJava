import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
public class MyActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("ARISE, ROBOTS");
		Button source = (Button) arg0.getSource();
		System.out.println(source.getName());
	}

}
