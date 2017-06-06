import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import java.lang.*;

public class Display implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private JTextField text;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private Character robbie;
    private boolean[] doneYet;
    //Creates a zero argument constructor for the buttons
    public Display(String a, String b, String c, String d, Character r, boolean[] doneYet) {
        frame = new JFrame();
        frame.setSize(500,500);
        frame.setTitle("Robbie's radtastic RAMpage");
        frame.setVisible(true);
        robbie = r;
        this.doneYet = doneYet;
        
        panel = new JPanel();
        frame.add(panel);
        
        
        button1 = new JButton(a);
        button2 = new JButton(b);
        button3 = new JButton(c);
        button4 = new JButton(d);
        
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        frame.pack();
        
    }
    //actionPerformed Method that tells the buttons what to do
    //button pressed is passed in from another class that has the code for the buttons actions 
    public void actionPerformed(ActionEvent e){
        try{
            buttonPressed(e);
        }
        catch (InterruptedException i){
            
        }
    }
    //makes it so all the buttons are in the frame
    public void packFrame() {
        frame.pack();
    }
    //Sets buttons text
    public void setButtons(String a, String b, String c, String d) {
        button1.setText(a);
        button2.setText(b);
        button3.setText(c);
        button4.setText(d);
    }
    //has the code for which button does what and changes according to where the character is in the game.
    public void buttonPressed(ActionEvent e) throws InterruptedException {
        if(robbie.getLocation() == 0)//Start
        {
            if(e.getSource() == button1) {
                robbie.setLocation(1);//moves character to prolouge        
            }
            if(e.getSource() == button2) {
                 robbie.setLocation(1);
            }
            if(e.getSource() == button3) {
                 robbie.setLocation(1);
            }
            if(e.getSource() == button4) {
                 robbie.setLocation(1);
            }
        }
        else if(robbie.getLocation() == 1)//Prolouge
        {
            if(e.getSource() == button1) {
                robbie.setLocation(2); //moves character to robbies cave(robbies house)
            }
            if(e.getSource() == button2) {
                robbie.setLocation(2);
            }
            if(e.getSource() == button3) {
                robbie.setLocation(2);
            }
            if(e.getSource() == button4) {
                robbie.setLocation(2);
            }
        }
        else if(robbie.getLocation() == 2)//Robbies Cave
        {
            if(e.getSource() == button1) {
                robbie.setLocation(3); //moves character to OPER LOAT (upper lot)
            }
            if(e.getSource() == button2) {
                Main.scrollingText("You are in your house. Everything is white. The walls, the bed, the kitchen and the dog.\n" +
                "It reminds you of your beloved vans. You must get them back.\n\n"); //shows surroundings
            }
            if(e.getSource() == button3) {
                
            }
            if(e.getSource() == button4) {
                
            }
        }
        else if(robbie.getLocation() == 3)//Upper Lot
        {
            if(e.getSource() == button1) {
                 robbie.setLocation(5); //moves character to west path
                 doneYet[5] = false;
            }
            if(e.getSource() == button2) {
                robbie.setLocation(4); // moves character to south path
                doneYet[4] = false;
            }
            if(e.getSource() == button3) { //shows surroundings
                Main.scrollingText("You look around and see a dark black ground beneath a worn white grid of territorial lines.\n" +
                "With a meticulous attention to potential tail lights you proceed through the LOT,\n"+
                "and approach a fork in the road... You see two paths, the west one leads to the Mosaic Tavern, and so takes you to\n"+
                "the lands of AUTO SHOP\n\n");
            }
            if(e.getSource() == button4) {
                Main.scrollingText("You try to talk to people but no wants to associate with a man in pink crocs.\n\n");
            }
        }
        else if(robbie.getLocation() == 4)//South Path
        {
            if(e.getSource() == button1) { //moves character to autoshop door
                robbie.setLocation(6);
                doneYet[6] = false;
            }
            if(e.getSource() == button2) { //moves character to upperlot
                robbie.setLocation(3);
                doneYet[3] = false;
            }
            if(e.getSource() == button3) { //shows surroundings
                 Main.scrollingText(" A booming sound erupts from behind you, and before you have time to turn \n" +
                 "around, you see the great HOOPDE jet past towards the lands of AUTO SHOP, the HOOPDE \n" +
                 "is the treasured stallion of the AUTO SHOP KING, LORD URALES… you are nearly there, and \n" +
                 "that much closer to being reunited with your crisp white vans…\n\n");
            }
            if(e.getSource() == button4) { 
                Main.scrollingText("There's no one around.\n\n");
            }
        }
        else if(robbie.getLocation() == 5) //West Path
        {
            if(e.getSource() == button1) { //moves character to mosaic
                robbie.setLocation(9);
                doneYet[9] = false;
            }
            if(e.getSource() == button2) { //moves character to upper lot
                robbie.setLocation(3);
                doneYet[3] = false;
            }
            if(e.getSource() == button3) { //shows surroundings
                Main.scrollingText("As you walk down a long trail to the Mosaic Tavern, you can start to hear the \n" + 
                "laughs of villagers in the nearby houses… the ridicule you’ll suffer through on this, most dark \n" +
                "day, will leave its mark on your reputation… Finally, you see the Mosaic Tavern ahead...\n\n");
            }
            if(e.getSource() == button4) {
                 Main.scrollingText("You try to talk to people but no wants to associate with a man in pink crocs.\n\n");
            }
        }
        else if(robbie.getLocation() == 6) // AutoShop Door
        {
            if(e.getSource() == button1) { 
                if(!robbie.getKey())//checks to see if the player has the key boolean set to true. If not he doesn't progress. 
                {
                    Main.scrollingText("The Door is locked. There must be a key nearby.\n\n");
                }
                else
                {
                    robbie.setLocation(10); //enters autoshop
                    doneYet[10] = false;
                }
            }
            if(e.getSource() == button2) {
                robbie.setLocation(7);//moves player to lumber yard
                doneYet[7] = false;
            }
            if(e.getSource() == button3) {
                 Main.scrollingText("You see the AUTO SHOP DOOR… it’s locked... \n" +
                 "someone from LUMBER YARD probably has a key\n\n");
            }
            if(e.getSource() == button4) {
                robbie.setLocation(3);//moves player to north/south path
                 doneYet[3] = false;
            }
       }
        else if(robbie.getLocation() == 7) // Wood Shop
        {
            if(e.getSource() == button1) {
                robbie.setLocation(6); //moves to autoshop door
                doneYet[6] = false; 
            }
            if(e.getSource() == button2) {
                robbie.setLocation(9); //moves to liberary
                doneYet[9] = false;
            }
            if(e.getSource() == button3) {
                if(!robbie.getKey()) //changes what the surrounding area looks like after you have the key                
                {
                    Main.scrollingText("You look around and see G, he is building a new set of tables for \n" +
                    "the MOSAIC TAVERN and looks quite tired… he has the key to OTTO SHOOP on his belt...\n\n"); //before key has been obtained
                }
                else
                {
                    Main.scrollingText("Lumber Master G has perked up and is working steadily");
                }
            }
            if(e.getSource() == button4) {
                if(!robbie.getCoffee()) //checks to see if you have the coffee item 
                {
                    Main.scrollingText("You approach Lumber Master G...\n"+
                    "\"Alright Robbie, what do you want?\"\n" +
                    "\"I need the key to the OTTO SHOOP\"\n" +
                    "\"Hmmm if you can get me some COFFEE from the MOSAIC TAVERN I'll give you the key\"\n\n");
                }
                else
                {
                     Main.scrollingText("*You give him the COFFEE*\n\"Thank you! Here's the key to OTTO SHOOP.\" \n Lumber Master G perks up and continues work\n\n");
                     robbie.setItemKey(); 
                }
            }
        }
        else if(robbie.getLocation() == 9) // mosaic
        {
            if(e.getSource() == button1) {//moves player to west/east path
                robbie.setLocation(5);
                doneYet[5] = false;
            }
            if(e.getSource() == button2) {//moves player to liberary
                robbie.setLocation(8);
                doneYet[8] = false;
            }
            if(e.getSource() == button3) {
                Main.scrollingText("You look around and see several serving tables and a vast sea of hungry \n" +
                "villagers, while most are engrossed in conversation and their meals, still many take note of your \n" +
                "CROCS, whispers and murmurs of your CROCS take over the conversations… beyond the \n" +
                "crowd is a lone coffee stand, and a food counter if only you had money. \n\n");
            }
            if(e.getSource() == button4) {//character obtains coffee. if character already has coffe he will have a different outcome.
                if(!robbie.getCoffee())
                {
                    //without coffee 
                    Main.scrollingText("You try to talk with people however they are all repulsed by your choice in footwear.\n" +
                    "One man takes pity on you and buys you a COFFEE\n\n");
                    robbie.setItemCoffee();
                }
                else
                {
                    Main.scrollingText("You try to talk to people but no wants to associate with a man in pink crocs.\n\n"); //after coffee obtained
                }
            }
        }
        else if(robbie.getLocation() == 8) // liberary
        {
            if(e.getSource() == button1) {
                robbie.setLocation(7); //moves character to lumber yard
                doneYet[7] = false;
            }
            if(e.getSource() == button2) {
                robbie.setLocation(9); //moves character to mosaic
                doneYet[9] = false;
            }
            if(e.getSource() == button3) {
                Main.scrollingText("You look around and see a wide selection of books to choose from, the room is \n" + 
                "nearly empty otherwise, this seems to be a good place to escape the villager's ridicule. On the \n" +
                "wall are three books that look interesting, one about 80s hair bands, one is the owner’s manual \n" +
                "of the HOOPDE, and the last book is called … “CAUTION DO NOT READ”... If you leave the \n" +
                "library you can see the LUMBER YARD ahead.\n\n"); //shows surroundings
            }
            if(e.getSource() == button4) { //obtains the book needed to progress later
                Main.scrollingText("You take the HOOPDE owner's manual.\n\n");
                robbie.setItemBook();
            }
        }
        else if(robbie.getLocation() == 10) // AutoShop
        {
            if(e.getSource() == button1) { //checks to see if the character has the book and has different outcomes as such.
                if(!robbie.getBook())
                {//if doesn't have book
                    Main.scrollingText("You reach for your vans...\n" +
                    "\"WOAH, WOAH, WHAT'S GO'N ON HERE!\"\n" +
                    "LORD URALES approaches, and looks at you slightly sideways with his \n" +
                    "arms crossed in front of himself. He tells you that if you would like your vans back, you must find \n" +
                    "the owner’s manual of his precious HOOPDE so he can repair it.\n\n");
                }
                else
                {//if has the book
                    Main.scrollingText("You give the HOOPDE owner's manual to Lord Eurales.\n" +
                    "\"Thank you I've been looking everywhere for this! You can have your vans back.\"");
                    robbie.setLocation(11);
                }
            }
            if(e.getSource() == button2) {
                robbie.setLocation(6); //moves the player back outside the autoshop
                doneYet[6] = false;
            }
            if(e.getSource() == button3) {
                Main.scrollingText("(“You look around and see the garage in disarray, shelves have been emptied onto \n"+
                "the floor and every car has been clearly searched, Someone wants to find \n" +
                "Something BAD…\n" +
                "The quest continues, but you can tell you’re almost done..."); //shows surroundings
            }
            if(e.getSource() == button4) {
                Main.scrollingText("There's no one around except LORD URALES\n\n");
            }
        }
        else if(robbie.getLocation() == 11) // Win
        {
            if(e.getSource() == button1) {
                Main.scrollingText("Dayum you good at this game.\n\n");
            }
            if(e.getSource() == button2) {
                Main.scrollingText("Congrats!\n\n");
            }
            if(e.getSource() == button3) { //ends the code
                robbie.resetGame(); 
            }
            if(e.getSource() == button4) {
                robbie.setLocation(0);
                doneYet[0] = false;
                doneYet[1] = false;
                doneYet[2] = false;
                robbie.setItemKeyF();
                robbie.setItemBookF();
                robbie.setItemCoffeeF();
            }
        }
    }
}
