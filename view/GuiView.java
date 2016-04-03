import javafx.scene.Scene;

public class GuiView extends Scene {
	
	Parent root;

	public GuiView(Parent root) {
		super(root);
		this.root = root;
	}

	public Parent getRoot() {return root;}
}