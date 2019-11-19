//import java.util.Observable;
//import java.util.Observer;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ObserverWindow implements PropertyChangeListener  {

	private JLabel label;

	// CONSTRUCTOR
	ObserverWindow() {
		JFrame frame = new JFrame("Observer Window");
		label = new JLabel("   I AM OBSERVING THE SUBJECT WINDOW.");
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 150);
		frame.setLocation(200, 200);
		frame.setVisible(true);
		
		message bean = new message();
		bean.addPropertyChangeListener(e -> label.setText((String) e.getNewValue()));
		
		new ControllerWindow(bean);
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		
	}

	/*
	 * // The Observer interface requires the implementation of update() abstract
	 * method public void update(ObservableSubject o, Object data) { //Display the
	 * number of taps that occur on the observed window. label.setText((String)
	 * data); }
	 * 
	 * @Override public void propertyChange(PropertyChangeEvent evt) {
	 * label.setText(evt.toString());
	 * 
	 * }
	 * 
	 * public void changeData(String data) { // TODO Auto-generated method stub
	 * 
	 * }
	 */

}