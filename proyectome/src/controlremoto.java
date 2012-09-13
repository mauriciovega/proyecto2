






import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;
import com.sun.lwuit.Display;
import com.sun.lwuit.Form;
import com.sun.lwuit.Label;
import com.sun.lwuit.layouts.BorderLayout;
import com.sun.lwuit.plaf.UIManager;
import com.sun.lwuit.util.Resources;

public class controlremoto extends MIDlet {

	public controlremoto() {
		// TODO Auto-generated constructor stub
	}

	protected void destroyApp(boolean arg0) throws MIDletStateChangeException {
		// TODO Auto-generated method stub

	}

	protected void pauseApp() {
		// TODO Auto-generated method stub

	}

	protected void startApp() throws MIDletStateChangeException {
		
		// TODO Auto-generated method stub
		Display.init(this);
		
		try{
			Resources r = Resources.open("/tema1.res");
			UIManager.getInstance().setThemeProps(
			r.getTheme(r.getThemeResourceNames()[0])
			);
			} catch (java.io.IOException e) {
			}
			Form f = new Form();
			f.setTitle("Hello World");
			f.setLayout(new BorderLayout());
			f.addComponent(BorderLayout.CENTER, new Label("I am a Label"));
			f.show();


		}

	}


