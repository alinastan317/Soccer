/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccer;

import java.util.ArrayList;

/**
 *
 * @author alistan
 */
public class Game {
    private Team homeTeam;
    private Team awayTeam;
    private Goal[] goals;
   // private GameEvent[] events;
    
    public Game(){}
    public Game(Team homeTeam, Team awayTeam){
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }
    /**
     * @return the homeTeam
     */
    public Team getHomeTeam() {
        return homeTeam;
    }

    /**
     * @param homeTeam the homeTeam to set
     */
    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    /**
     * @return the awayTeam
     */
    public Team getAwayTeam() {
        return awayTeam;
    }

    /**
     * @param awayTeam the awayTeam to set
     */
    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    /**
     * @return the goals
     */
    public Goal[] getGoals() {
        return goals;
    }

    /**
     * @param goals the goals to set
     */
    public void setGoals(Goal[] goals) {
        this.goals = goals;
    }
       
    /*public void playGame(int maxGoals){
        int numberOfGoals = (int) (Math.random() * (maxGoals + 1));
        //System.out.println(numberOfGoals);
        
        Goal[] theGoals = new Goal[numberOfGoals];
        //System.out.println(theGoals.length);
        this.setGoals(theGoals);
        GameUtils.addGameGoals(currGame);
    }*/
    public void playGame(){
        // playGame(6);
        ArrayList <Goal> eventList = new ArrayList();
        Goal currEvent;
        for (int i=0; i < 90; i++){
            if (Math.random() > 0.95) {
                //System.out.println(i); 
                currEvent = new Goal();
                currEvent.setTheTeam(Math.random() > 0.5 ? homeTeam:awayTeam);
                currEvent.setThePlayer(currEvent.getTheTeam().getPlayerArray()[(int)(Math.random()*currEvent.getTheTeam().getPlayerArray().length)]);
                currEvent.setTheTime(i);
                eventList.add(currEvent);   
            }
            this.goals = new Goal[eventList.size()];
            eventList.toArray(goals);
        }
    }
    
    
    public String getDescription(){
        int homeTeamGoals = 0;
        int awayTeamGoals = 0;
        StringBuilder returnString = new StringBuilder();
        returnString.append(homeTeam.getTeamName() + " vs " + awayTeam.getTeamName() + "/n");
        for (Goal currGoal : this.getGoals()){
            if (currGoal.getTheTeam() == homeTeam){
                homeTeamGoals++;
                theTeams[0].incGoalsTotal(1);
            }
            else {
                awayTeamGoals++;
                theTeams[1].incGoalsTotal(1);
            }
            returnString.append("Goal scored after ");
            returnString.append(currGoal.getTheTime());
            returnString.append(" min by ");
            returnString.append(currGoal.getThePlayer().getPlayerName());
            returnString.append(" of ");
            returnString.append(currGoal.getTheTeam().getTeamName());
            returnString.append("/n");
        if (homeTeamGoals == awayTeamGoals){
            returnString.append("It's a draw!");
            homeTeam.incPointsTotal(1);
            awayTeam.incPointsTotal(1);
        }
        else if (homeTeamGoals > awayTeamGoals){
            returnString.append(homeTeam.getTeamName() + " win");
            homeTeam.incPointsTotal(2);
        }
        else {
            returnString.append(awayTeam.getTeamName() + " win");
            awayTeam.incPointsTotal(2);
        }
        returnString.append(homeTeam.getTeamName() + " vs " + awayTeam.getTeamName() + "/n");
    }
        return returnString.toString();
    }

}
