import java.util.*;

class Player {
   
// state
  public String playerName;
  public int playerHealth;

// default constructor 
  public Player () {
   
  }

// parameterized constructors 
   public Player (String playerName, int playerHealth) {
     this.playerName = playerName;
     this.playerHealth = playerHealth;
   }

// behavior
  // attack method - blank? interfaces will override what the attack will be; maybe bare fists? resulting in fail encounter?
   

// getter and setter

   public String getPlayerName () {
     return this.playerName;
   }

   public void setPlayerName (String playerName ) {
     this.playerName = playerName;
   } 

   public int getPlayerHealth () {
     return this.playerHealth;
   }

   public void setPlayerHealth (int playerHealth ) {
     this.playerHealth = playerHealth;
   }

   



  // end of class
}

// need health - preset to 100?
// skill/attack power comes from weapon
// empty constructor for weapon choice?