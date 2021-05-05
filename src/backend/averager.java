package backend;
public class averager{
    public averager(){
    }
    public static void main(String[]args){
    }
    public double getAverageAutoSwitch(String[][]data, String teamNumber){
        int totalAutoSwitch = 0;
        int matchesPlayed = 0;
        for(int row=0; row<data.length; row++){
            if(data[row][1].equals(teamNumber)){
                totalAutoSwitch+=Integer.parseInt(data[row][2]);
                matchesPlayed++;
            }
        }
        return (double) totalAutoSwitch/matchesPlayed;
    }
    public double getAverageAutoScale(String[][]data, String teamNumber){
        int totalAutoScale = 0;
        int matchesPlayed = 0;
        for(int row=0; row<data.length; row++){
            if(data[row][1].equals(teamNumber)){
                totalAutoScale+=Integer.parseInt(data[row][3]);
                matchesPlayed++;
            }
        }
        return (double) totalAutoScale/matchesPlayed;
    }
    public double getAverageTeleSwitch(String[][]data, String teamNumber){
        int totalTeleSwitch = 0;
        int matchesPlayed = 0;
        for(int row=0; row<data.length; row++){
            if(data[row][1].equals(teamNumber)){
                totalTeleSwitch+=Integer.parseInt(data[row][4]);
                matchesPlayed++;
            }
        }
        return (double) totalTeleSwitch/matchesPlayed;
    }
    public double getAverageTeleScale(String[][]data, String teamNumber){
        int totalTeleScale = 0;
        int matchesPlayed = 0;
        for(int row=0; row<data.length; row++){
            if(data[row][1].equals(teamNumber)){
                totalTeleScale+=Integer.parseInt(data[row][5]);
                matchesPlayed++;
            }
        }
        return (double) totalTeleScale/matchesPlayed;
    }
    public double getAverageVault(String[][]data, String teamNumber){
        int totalVault= 0;
        int matchesPlayed = 0;
        for(int row=0; row<data.length; row++){
            if(data[row][1].equals(teamNumber)){
                totalVault+=Integer.parseInt(data[row][6]);
                matchesPlayed++;
            }
        }
        return (double) totalVault/matchesPlayed;
    }
    public double getAverageClimb(String[][]data, String teamNumber){
        int totalClimb= 0;
        int matchesPlayed = 0;
        for(int row=0; row<data.length; row++){
            if(data[row][1].equals(teamNumber)){
                totalClimb+=Integer.parseInt(data[row][7]);
                matchesPlayed++;
            }
        }
        return (double) totalClimb/matchesPlayed;
    }

}
