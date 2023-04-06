import java.util.*; 

class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println();

    System.out.println("In the magical lands of the Forgotten Realm, there exists a perilous dungeon named 'Dungeon of Chaos' were great treasure awaits the brave souls daring enough to set foot inside of it.");
    System.out.println();

    System.out.println("Brave adventurer, what is your name?");
    System.out.println();

    String name = input.nextLine();
    System.out.println();

    System.out.println("Welcome " + name + " to the Dungeon of Chaos! Riches await you and may your attempt be successful!");
    System.out.println();

    System.out.println("As you prepare to enter the murky dungeon, you hoist your weapon of choice in preparation for any danger ahead.");
    System.out.println();

    System.out.println("\nAre you a magic caster or a melee fighter?\n"
                      + "1) Magic Caster\n"
                      + "2) Melee Fighter\n"
                      + "(any other input will result in no weapons !)");
    System.out.println();
    
    int weaponChoice = input.nextInt();
    System.out.println();

    switch(weaponChoice){
      case 1: System.out.println("Your magic staff thrums with powerful energy as you pull it close.");
        break;
      case 2: System.out.println("Your sword glints brightly, the sharp blade poised to defend against any foe.");
        break;
      default: System.out.println("Truely brave is the adventurer who chooses to face the dangers ahead with nothing but fists!");
        break;
    }
    System.out.println();

    





    




// closes scanner 
  input.close();
    // end of method
  }



  // end of class 
}


// simple fighting game in console
// player class that has name taken from user input
// player extends melee fighter or magic fighter find a way to have player choose
// monster class w/ health and attack -only 1 monster or an array of monsters
// maybe run option that ends interaction completely 
// once player class chosen print stats - name- health- weapon