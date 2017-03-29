/**
 * Created by LAUW on 2/28/17.
 */
public class BaseballGame{
    private String firstTeam;
    private String secondTeam;
    private int[] firstTeamScores;
    private int[] secondTeamScores;

    public BaseballGame(String firstTeam, String secondTeam, int numInnings) {
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
        firstTeamScores = new int[numInnings];
        secondTeamScores = new int[numInnings];
        for(int i = 0; i < numInnings; ++i){
            firstTeamScores[i] = -1;
            secondTeamScores[i] = -1;
        }
    }

    private int numInningsSet(int arr[]){
        for(int i = 0; i < arr.length; ++i){
            if(arr[i] == -1)
                return i;
        }
        return arr.length;
    }

    public String getFirstTeam() {
        return firstTeam;
    }

    public void setFirstTeam(String firstTeam) {
        this.firstTeam = firstTeam;
    }

    public String getSecondTeam() {
        return secondTeam;
    }

    public void setSecondTeam(String secondTeam) {
        this.secondTeam = secondTeam;
    }

    public int[] getFirstTeamScores() {
        return firstTeamScores;
    }

    public void setFirstTeamScores(int inning, int score) {
        if(numInningsSet(firstTeamScores) >= inning - 1){
            firstTeamScores[inning - 1] = score;
        }
        else {
            System.out.println("Error. Innings before " + inning + " are not currently set..");
        }
    }

    public int[] getSecondTeamScores() {
        return secondTeamScores;
    }

    public void setSecondTeamScores(int inning, int score) {
        if(numInningsSet(secondTeamScores) >= inning - 1){
            secondTeamScores[inning - 1] = score;
        }
        else {
            System.out.println("Error. Innings before " + inning + " are not currently set..");
        }
    }

    public String getWinner(){
        if(numInningsSet(firstTeamScores) == firstTeamScores.length && numInningsSet(secondTeamScores) == secondTeamScores.length){
            int count1 = 0;
            int count2 = 0;
            for(int i = 0; i < firstTeamScores.length; ++i){
                count1 += firstTeamScores[i];
                count2 += secondTeamScores[i];
            }
            if(count1 > count2){
                return firstTeam;
            }
            else if(count2 > count1){
                return secondTeam;
            }
            else{
                return "Draw";
            }
        }
        else{
            return "Innings are not over..";
        }
    }

}


