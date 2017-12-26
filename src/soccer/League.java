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
public class League {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        League theLeague = new League();
        Team[] theTeams = theLeague.createTeams();
        Game[] theGames = theLeague.createGames(theTeams);
       
        Game currGame = theGames[0];       
        //currGame.playGame(3);
        for (Game currGame : theGames){
            currGame.playGame();
            break;
            System.out.println(currGame.getDescription());
        }
            theLeague.showBestTeam(theTeams);
        
        /*
        Goal goal1 = new Goal();
        goal1.thePlayer = currGame.homeTeam.playerArray[2];   
        goal1.theTeam = currGame.homeTeam;
        goal1.theTime = 55;
        
        Goal[] theGoals = {goal1};
        currGame.goals = theGoals;
        
        System.out.println("Goal scored after " + 
        currGame.goals[0].theTime + " min by " + 
        currGame.goals[0].thePlayer.playerName + " of " + 
        currGame.goals[0].theTeam.teamName);  */    
        
        //System.out.println(currGame.goals[0].thePlayer.playerName);
       /* 
        System.out.println("--- Searching for %Rob% ---");
        for(Player thePlayer : team2.playerArray){
            if (thePlayer.playerName.matches(".*Rob.*")){
                System.out.println ("Found similar name: " + thePlayer.playerName);
                System.out.println ("Last name is: " + thePlayer.playerName.split(" ")[1]);
                }
            }
        System.out.println("--- Team 1 Players ---");
        StringBuilder familyNameFirst = new StringBuilder();
        
        for (Player thePlayer : team1.playerArray) {
            String name[] = thePlayer.playerName.split(" ");
            //System.out.println (thePlayer.playerName);
            familyNameFirst.append(name[1]);
            familyNameFirst.append(" ");
            familyNameFirst.append(name[0]);
            System.out.println(familyNameFirst);
            familyNameFirst.delete(0, familyNameFirst.length());
        }
        */
  
    }//main
    
    public Team[] createTeams (){
        //team1
        Player player1 = new Player("George Hann");  
        Player player2 = new Player("Gregory Guarini");
        Player player3 = new Player("Graham Trim"); 
        
        Player[] thePlayers1 = {player1, player2, player3};
        
        Team team1 = new Team("The Greens", thePlayers1);
        
        //team2
        Player[] thePlayers2 = new Player[3];
        
        thePlayers2[0] = new Player("Robert Linn"); 
        thePlayers2[1] = new Player("Robbie Woods");
        thePlayers2[2] = new Player("Richard Bodner");

        Team team2 = new Team("The Reds", thePlayers2);
        
        
        Team [] theTeams = {team1, team2};
        return theTeams;
    }
    
    public Game[] createGames (Team[] theTeams){
        Game theGame = new Game(theTeams[0], theTeams[1]);
        Game theGame2 = new Game(theTeams[1], theTeams[0]);
        Game theGame3 = new Game(theTeams[0], theTeams[1]);
        Game theGame4 = new Game(theTeams[1], theTeams[0]);
        Game[] theGames = {theGame, theGame2, theGame3, theGame4};
        return theGames;
    }       
    
    public void showBestTeam(Team[] theTeams){
        Team currBestTeam = theTeams[0];
        System.out.println("/nTeam Points");
        for(Team currTeam : theTeams){
            System.out.println(currTeam.getTeamName() + ":" + currTeam.getPointsTotal());
            if (currTeam.getPointsTotal() > currBestTeam.getPointsTotal()) {
                currBestTeam = currTeam;
            }
            else if (currTeam.getPointsTotal() == currBestTeam.getGoalsTotal()){
                if (currTeam.getGoalsTotal() > currBestTeam.getGoalsTotal()) {
                    currBestTeam = currTeam;
                }
            }
        System.out.println("The winner of the league is " + currBestTeam.getTeamName() + currTeam.getGoalsTotal());
        }
    }
}
    