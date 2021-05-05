package backend;
public class tester{
    public static void main(String[]args){
        System.out.println(System.getProperty("user.dir"));
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
        
    }
}