import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import backend.dataRetriever;
import java.util.ArrayList;
 
public class App extends Application {
    public dataRetriever myDataRetriever = new dataRetriever();
    public static void main(String[] args) {
        /*for(int i=1; i<teamNumbers.size();i++){
            System.out.print(teamNumbers.get(i)+",");
        }
        */
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        ArrayList<String>teamNumbers = myDataRetriever.getTeamNumbers("dataSets/GreaterDC2018Scouting.csv");
        final String team1 = teamNumbers.get(1);
        final String team2 = teamNumbers.get(2);
        final String team3 = teamNumbers.get(3);
        final String team4 = teamNumbers.get(4);
        final String team5 = teamNumbers.get(5);
        primaryStage.setTitle("Bar Chart Sample");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String, Number> myBarChart = new BarChart<String, Number>(xAxis, yAxis);
        myBarChart.setTitle("Team Scores Summary");
        xAxis.setLabel("Team #");
        yAxis.setLabel("Averages");
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Autonomous");
        series1.getData().add(new XYChart.Data(team1, 25601.34));
        series1.getData().add(new XYChart.Data(team2, 20148.82));
        series1.getData().add(new XYChart.Data(team3, 10000));
        series1.getData().add(new XYChart.Data(team4, 35407.15));
        series1.getData().add(new XYChart.Data(team5, 12000));      
        
        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Teleop");
        series2.getData().add(new XYChart.Data(team1, 57401.85));
        series2.getData().add(new XYChart.Data(team2, 41941.19));
        series2.getData().add(new XYChart.Data(team3, 45263.37));
        series2.getData().add(new XYChart.Data(team4, 117320.16));
        series2.getData().add(new XYChart.Data(team5, 14845.27));  
        
        XYChart.Series series3 = new XYChart.Series();
        series3.setName("Endgame");
        series3.getData().add(new XYChart.Data(team1, 45000.65));
        series3.getData().add(new XYChart.Data(team2, 44835.76));
        series3.getData().add(new XYChart.Data(team3, 18722.18));
        series3.getData().add(new XYChart.Data(team4, 17557.31));
        series3.getData().add(new XYChart.Data(team5, 92633.68));  

        Scene scene  = new Scene(myBarChart,800,600);
        myBarChart.getData().addAll(series1, series2, series3);
        primaryStage.setScene(scene);
        primaryStage.show();

    };
}