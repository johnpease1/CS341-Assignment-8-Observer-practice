//import java.util.Observable;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;


public class message {
	private String message;
	private final PropertyChangeSupport support = new PropertyChangeSupport(this);
	
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		support.addPropertyChangeListener(listener);
	}
	
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		support.removePropertyChangeListener(listener);
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public void setMessage(String newMessage) {
		String oldMessage = this.message;
		this.message=newMessage;
		
		support.firePropertyChange("message",oldMessage,newMessage);
	}
}