/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccer;

/**
 *
 * @author alistan
 */
public class Team {
   private String teamName;
   private Player[] playerArray;
   private int pointsTotal;
   private int goalsTotal;
   
   public Team (){};
   public Team (String teamName){
       this.teamName = teamName;
   }
   public Team (String teamName, Player[] playerArray) {
       this(teamName );
       this.playerArray = playerArray;
   }

    /**
     * @return the teamName
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * @param teamName the teamName to set
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * @return the playerArray
     */
    public Player[] getPlayerArray() {
        return playerArray;
    }

    /**
     * @param playerArray the playerArray to set
     */
    public void setPlayerArray(Player[] playerArray) {
        this.setPlayerArray(playerArray);
    }

    /**
     * @return the pointsTotal
     */
    public int getPointsTotal() {
        return pointsTotal;
    }

    /**
     * @param pointsTotal the pointsTotal to set
     */
    public void setPointsTotal(int pointsTotal) {
        this.pointsTotal = pointsTotal;
    }
    
    public void incPointsTotal (){
        this.pointsTotal += pointsTotal;
    }

    /**
     * @return the goalsTotal
     */
    public int getGoalsTotal() {
        return goalsTotal;
    }

    /**
     * @param goalsTotal the goalsTotal to set
     */
    public void setGoalsTotal(int goalsTotal) {
        this.goalsTotal = goalsTotal;
    }
    
    public void incTotalGoals (int goals){
        this.goalsTotal = this.goalsTotal + goals;
    }
}
