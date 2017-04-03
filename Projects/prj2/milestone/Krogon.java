/**
File: Krogon.java
Author: Paul Ippolito
Course: CMPT220
Assignment: Project 2
Due Date: May 9 2017
Version 1.0
* This file contains the text-based game "The Wrath of Krogon".
* The player can choose a name in the beginning and from then on 
* choose either directions to travel, search an area for items,
* or pick up items. The object of the game is to escape the monster
* Krogon, but endings change depending on what item the player possesses.
*/

import java.util.Scanner;

public class Krogon{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    //Locations
    String start = "You awaken in the ruins of your home.";
    String hospital = "You discover the hospital";
    String harbor = "You discover the harbor and a boat";
    String boat = "You board the boat and escape Krogon!";
    String secret = "You have found the secret area...";
    String krogon = "You encounter the beast Krogon and he kills you.";
    String armory = "You find an armory, but all the weapons are gone.";
    
    //Boolean variables to prevent player from getting points again
    //once a location has been visited
    boolean startVisit = true;
    boolean hospVisit = false;
    boolean secretVisit = false;
    boolean armVisit = false;
    boolean harbVisit = false;
    
    
    
    //Start of game
    
    //Prints title
    System.out.println("The Wrath of Krogon 2");
    System.out.println("=====================");
    player();
    
    int points = 0;
    String currLoc = start;
    System.out.println(start);
    while(true){
      System.out.println("Enter a direction (n, s , e, or w) or command: ");
      System.out.println("Press h for list of commands or q to quit");
      String cmd = input.next();
      //navigation north
      if (cmd.equals("n")){
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
        else
          System.out.println("Can't go there");
       
      }
      //navigation south
      else if (cmd.equals("s")){
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
        else
          System.out.println("Can't go there");
      }
      //navigation east
      else if (cmd.equals("e")){
        if (currLoc == start){
          currLoc = secret;
          if (secretVisit == false){
            secretVisit = true;
            points += 5;
          }
          else
            points += 0;
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
        else
          System.out.println("Can't go there");
      }
      //navigation west
      else if (cmd.equals("w")){
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
          currLoc = boat;
          points += 200;
          System.out.println(currLoc);
          break;
        }
        else if (currLoc == secret)
          currLoc = start;
      }
      // help command
      else if (cmd.equals("h")){
        System.out.println("Commands are n, s, e, w, h, q, and p.");
        continue;
      }
      // quit command
      else if (cmd.equals("q")){
        System.out.println("You decide to do nothing. Krogon stomps on you.");
        break;
      }
      // display points
      else if (cmd.equals("p")){
        System.out.println("You currently have " + points + " points.");
        continue;
      }
      else
        System.out.println("Can't go there");
      
      System.out.println(currLoc);
    }
    
    System.out.println("You finshed with " + points + " points.");
    System.out.println("GAME OVER");
  }
  
  public static void player(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Choose a name: ");
    String name = scan.next();
    System.out.println(name + "! The monster Krogon has attacked the city!");
    System.out.println("You must escape at all costs, " + name + "!");
  }
}