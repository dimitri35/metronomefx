package tp.metronome.View;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import fr.istic.java.version2.adapteur.AdapteurMateriel;

/**
 * Métronome V2
 * @author dounia
 *
 */
public class Metronome2 extends Application {
	
	private Stage Stage;
	
	//public static VueMetronome vue  ;
	
	//public final static IHM ihm = new IHM() ;
	//  private Pane rootLayout;

	/*
	 * (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage stage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("View.fxml"));
		Scene scene = new Scene(root);
	    
        stage.setTitle("Métronome V2");
        stage.setScene(scene);
        stage.show();
        
		//this.primaryStage = primaryStage;
        //this.primaryStage.setTitle("Métronome");

        //initRootLayout();
	}

	/*public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Metronome.class.getResource("View/View.fxml"));
            rootLayout = (Pane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public Stage getPrimaryStage() {
        return primaryStage;
    }
	*/
	
	public static void main(String[] args) {
		Controller.vue = new AdapteurMateriel() ;
		launch(args);
	}
}
