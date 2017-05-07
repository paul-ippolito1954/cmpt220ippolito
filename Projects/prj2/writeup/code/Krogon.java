/**
File: Krogon.java
Author: Paul Ippolito
Course: CMPT220
Assignment: Project 2
Due Date: May 9 2017
Version 1.3
* This file contains the text-based game "The Wrath of Krogon 2".
* The player can choose a name in the beginning and from then on 
* choose either directions to travel, search an area for items,
* or pick up items. The object of the game is to escape the monster
* Krogon, but endings change depending on what item the player possesses.
* Keep in mind you also only have a limited amount of moves. It's also 
* possible to KILL Krogon...just find the right item
*/

import java.util.Scanner;
import java.util.ArrayList;

public class Krogon{
  public static void main(String[] args){
    //Prints title
    System.out.println("The Wrath of Krogon 2");
    System.out.println("=====================");
    player(); //calls player function
  }
  
  //Initial character name and backstory area
  public static void player(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Choose a name: ");
    String name = scan.next();
    System.out.println(name + "! The monster Krogon has attacked the city!");
    System.out.println("You must escape at all costs, " + name + "!");
    System.out.println("You have a limited number of moves!!");
    game(); //starts the game
  }
  
  //Method that controls entire game:
  // Includes while true loop that checks players
  // input, keeps track of players inventory,
  // and decides endings as well as whether to play again or not
  public static void game(){
    Scanner input = new Scanner(System.in);
    
    //Locations
    String start = "You awaken in the ruins of your home.";
    String hospital = "You discover the hospital. Most of it is still intact.";
    String harbor = "You discover the harbor. Should be a boat nearby...";
    String boat = "You board, start the boat, and escape Krogon!";
    String secret = "You have found the secret area after breaking the wall.";
    String krogon = "You encounter the beast Krogon:";
    String armory = "You find an armory, much of the weapons are gone...";
    String park = "You discover the local park, which is now on fire.";
    String statue = "Ironically, you find a memorial statue of Krogon.";
    String roof = "From the roof, you can see that the city is in flames.";
    
    
    //Boolean variables to prevent player from getting points again
    //once a location has been visited
    boolean startVisit = true;
    boolean hospVisit = false;
    boolean secretVisit = false;
    boolean armVisit = false;
    boolean harbVisit = false;
    boolean parkVisit = false;
    boolean statVisit = false;
    boolean roofVisit = false;
    
    // array for inventory
    ArrayList<String> inventory = new ArrayList<String>();
    
    //Variables changed within game
    int moves = 30;
    int points = 0;
    String currLoc = start;
    System.out.println(start);
    
    //Game loop
    while(true){
      System.out.println("Enter a direction (n, s , e, or w) or command: ");
      System.out.println("Press h for list of commands or q to quit");
      // You CAN type out the full word: so north, south, etc.
      String cmd = input.next();
      moves -= 1;
      
      //navigation north
      if (cmd.equals("n") || cmd.equals("north")){
        
        if (currLoc == start){
          currLoc = hospital;
          if (hospVisit == false){
            hospVisit = true;
            points += 5;
          }
          else
            points += 0;
        }
        
        else if (currLoc == armory){
          currLoc = start;
          points += 0;
        }
        
        else if (currLoc == hospital){
          currLoc = roof;
          if (roofVisit == false){
            roofVisit = true;
            points += 5;
          }
          else
            points +=0;
        }
        
        else if (currLoc == statue)
          currLoc = park;
        
        else
          System.out.println("Can't go there");
       
      }
      //navigation south
      else if (cmd.equals("s") || cmd.equals("south")){
        if (currLoc == hospital){
          currLoc = start;
          points += 0;
        }
        else if (currLoc == start){
          currLoc = armory;
          if (armVisit == false){
            armVisit = true;
            points += 5;
          }
          else
            points += 0;
        }
        
        else if (currLoc == roof)
          currLoc = hospital;
        
        else if (currLoc == park){
          currLoc = statue;
          if (statVisit == false){
            statVisit = true;
            points += 5;
          }
          else
            points += 0;
        }
        
        else
          System.out.println("Can't go there");
      }
      //navigation east
      else if (cmd.equals("e") || cmd.equals("east")){
        if (currLoc == start){
          if (inventory.contains("axe")){
            currLoc = secret;
            if (secretVisit == false){
              secretVisit = true;
              points += 5;
            }
            else
              points += 0;
          }
          else
            System.out.println("There's a wall blocking you. Find an axe.");
        }
        
        else if (currLoc == harbor){
          currLoc = start;
          points += 0;
        }
        
        else if (currLoc == armory){
          currLoc = krogon;
          points += 0;
          System.out.println(currLoc);
          break;
        }
        
        else if (currLoc == park)
          currLoc = armory;
        
        else
          System.out.println("Can't go there");
      }
      //navigation west
      else if (cmd.equals("w") || cmd.equals("west")){
        if (currLoc == start){
          currLoc = harbor;
          if (harbVisit == false){
            harbVisit = true;
            points += 5;
          }
          else
            points += 0;
        }
        else if (currLoc == harbor){
          if (inventory.contains("key")){
            currLoc = boat;
            points += 200;
            System.out.println(currLoc);
            break;
          }
          else
            System.out.println("You need a key to start the boat!");
        }
        else if (currLoc == secret)
          currLoc = start;
        
        else if (currLoc == armory){
          currLoc = park;
          if (parkVisit == false){
            parkVisit = true;
            points += 5;
          }
          else
            points += 0;
        }
        
        else
          System.out.println("Can't go there");
      }
      // help command
      else if (cmd.equals("h") || cmd.equals("help")){
        System.out.println("Commands are n, s, e, w, h, q, p, x, t, and i.");
        System.out.println("You can also enter the words take or search.");
        continue;
      }
      // quit command
      else if (cmd.equals("q") || cmd.equals("quit")){
        System.out.println("You decide to do nothing. Krogon stomps on you.");
        break;
      }
      // display points
      else if (cmd.equals("p") || cmd.equals("points")){
        System.out.println("You currently have " + points + " points.");
        continue;
      }
      
      // Check inventory
      else if (cmd.equals("i") || cmd.equals("inventory"))
        System.out.println(inventory);
      
      //Search for items
      else if (cmd.equals("x") || cmd.equals("search")){
        if (currLoc == hospital)
          System.out.println("You see a burger on the floor.");
        
        else if (currLoc == armory)
          System.out.println("You see an RPG leaning on the wall.");
        
        else if (currLoc == secret)
          System.out.println("You see a giant bag of money.");
        
        else if (currLoc == roof)
          System.out.println("You see an axe on a wall.");
        
        else if (currLoc == statue)
          System.out.println("You look in the statue's mouth and see a key.");
        
        else
          System.out.println("There are no items to take.");
      }
      
      // Take items if they are present
      else if (cmd.equals("t") || cmd.equals("take")){
        
        if (currLoc == hospital){
          if (inventory.contains("burger"))
            System.out.println("You already have the burger.");
          else{
            inventory.add("burger");
            System.out.println("You pick up the most likely stale burger...");
          }
        }
        
        else if (currLoc == armory){
          if (inventory.contains("RPG"))
            System.out.println("You already have the RPG.");
          else{
            inventory.add("RPG");
            System.out.println("Secured the RPG and some ammo.");
          }
        }
        
        else if (currLoc == secret){
          if (inventory.contains("cash"))
            System.out.println("You already have the cash.");
          else{
            inventory.add("cash");
            System.out.println("Secured the $1000000 cash!");
          }
        }
        
        else if (currLoc == roof){
          if (inventory.contains("axe"))
            System.out.println("You already have the axe!");
          else{
            inventory.add("axe");
            System.out.println("Grabbed an axe!");
          }
        }
        
        else if (currLoc == statue){
          if (inventory.contains("key"))
            System.out.println("You already have the key!");
          else{
            inventory.add("key");
            System.out.println("Obtained a key for a boat!");
          }
        }
        
        else{
          System.out.println("There is nothing here to take...");
        }
      }
      
      else
        System.out.println("Can't go there");
      
      System.out.println(currLoc);
      
      if(moves == 0){
        System.out.println("You've run out of moves!!");
        break;
      }
    }
    
    // win conditions and game over. Multi-endings of game
    if (currLoc == boat){
      if (inventory.contains("cash"))
        System.out.println("You've survived and now you're rich!");
      else
        System.out.println("You may have lived, but you forgot a cool item.");
    }
    
    else if (currLoc == krogon){
      if (inventory.contains("RPG")){
        System.out.println("You fire at his head, killing the beast!");
        points += 500;
        if (inventory.contains("cash"))
          System.out.println("Krogon is dead AND you're rich! Congrats!");
        else
          System.out.println("Krogon is dead, but you missed an item.");
      }
      else
        System.out.println("Krogon kills you. You should've found a weapon!");
      
    }
    System.out.println("You finshed with " + points + " points.");
    System.out.println("GAME OVER");
    System.out.println("Copyright Paul Ippolito 2017");
    Scanner restart = new Scanner(System.in);
    
    //Prompts user to play again
    System.out.println("Play Again (y or n)?");
    String answer = restart.next();
    if (answer.equals("y"))
      player(); //restarts game from very beginning
    else
      System.out.println("Goodbye");
  }
}