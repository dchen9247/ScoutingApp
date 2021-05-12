import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import backend.averager;
import backend.dataRetriever;

public class HelloFX extends Application {

    @Override
    public void start(Stage stage) {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        Scene scene = new Scene(new StackPane(l), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        dataRetriever myDataRetriever = new dataRetriever();
        averager myAverager = new averager();
        //System.out.println(myDataRetriever.getData("ScoutingApp/Backend/GreaterDC2018Scouting.csv"));
        String[][]data = myDataRetriever.getData("dataSets/GreaterDC2018Scouting.csv");
        myDataRetriever.printData(data);
        System.out.println(myAverager.getAverageAutoSwitch(data, "1731"));
        System.out.println(myAverager.getAverageAutoScale(data, "1731"));
        System.out.println(myAverager.getAverageTeleSwitch(data, "1731"));
        System.out.println(myAverager.getAverageTeleScale(data, "1731"));
        System.out.println(myAverager.getAverageVault(data, "1731"));
        System.out.println(myAverager.getAverageClimb(data, "1731"));
        
        launch();
    }

}