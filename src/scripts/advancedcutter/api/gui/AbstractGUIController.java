package scripts.advancedcutter.api.gui;

import com.allatori.annotations.DoNotRename;

import javafx.fxml.Initializable;

@DoNotRename
public abstract class AbstractGUIController implements Initializable {

	private GUI gui = null;

	public void setGUI(GUI gui) {
		this.gui = gui;
	}

	public GUI getGUI() {
		return this.gui;
	}

}