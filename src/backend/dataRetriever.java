package backend;
import java.io.BufferedReader;
import java.io.FileReader;  
import java.io.IOException;  
import java.util.ArrayList;
public class dataRetriever{
    public dataRetriever(){
    }
    public static void main(String[]args){
    }
    public String[][] getData(String fileName){
        String csvLine = "";
        String separator = ",";
        ArrayList<String[]> lines = new ArrayList<String[]>();
        //String[]tempArray = new String[8];
        //String [][]GreaterDC2018 = new String[391][8];
        try {
            BufferedReader myReader = new BufferedReader(new FileReader(fileName)); 
            while((csvLine = myReader.readLine()) !=null){
                /*for(int row = 0; row<GreaterDC2018.length; row++){
                    for(int i=0; i<tempArray.length; i++){
                        tempArray = csvLine.split(separator);
                        GreaterDC2018[row][i] = tempArray[i];
                    }
                }
                */
                String[] scoutingArray = csvLine.split(separator);  
                lines.add(scoutingArray);
                //System.out.println("Match #: " + scoutingArray[0] + ", Team #: " + scoutingArray[1] + ", Auto Switch: " + scoutingArray[2] + ", Auto Scale: " + scoutingArray[3] + ", Tele Switch: " + scoutingArray[4] + ", Tele Scale: " + scoutingArray[5] + ", Vault: " + scoutingArray[6] + ", Climb: " + scoutingArray[7]);
                //System.out.println(scoutingArray[0] + ", " + scoutingArray[1] + ", " + scoutingArray[2] + ", " + scoutingArray[3] + ", " + scoutingArray[4] + ", " + scoutingArray[5] + ", " + scoutingArray[6] + ", " + scoutingArray[7]);    
            }
            String[][] scouting2DArray = new String[lines.size()][0];
            lines.toArray(scouting2DArray);
            /*for(int row = 0; row<scouting2DArray.length; row++){
                for(int column = 0; column<scouting2DArray[0].length; column++){
                    if(column<scouting2DArray[0].length-1){
                        System.out.print(scouting2DArray[row][column]+ ", ");
                    }
                    else{
                        System.out.println(scouting2DArray[row][column]);
                    }
                }
            }
            */
            myReader.close();
            return scouting2DArray;
        }
        catch(IOException e){
            e.printStackTrace();
        }
        String[][] blank2DArray = new String[0][0];
        return blank2DArray;
    }
    public void printData(String[][]data){
        for(int row = 0; row<data.length; row++){
                for(int column = 0; column<data[0].length; column++){
                    if(column<data[0].length-1){
                        System.out.print(data[row][column]+ ", ");
                    }
                    else{
                        System.out.println(data[row][column]);
                    }
                }
        }

    }
}
