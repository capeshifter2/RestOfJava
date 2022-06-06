import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.*;
public class MyListener implements WindowListener{

	@Override
	public void windowActivated(WindowEvent arg0) {
		System.out.println("Activated");
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		System.out.println("Closed");
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.out.println("Closing");
		((Frame)arg0.getSource()).dispose();
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		System.out.println("Deactivated");		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		System.out.println("Deiconified");
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		System.out.println("Iconified");
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		System.out.println("Opened");
		
	}

}
