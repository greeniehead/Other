import java.lang.*;

public class Main
{
   public static void main() throws InterruptedException
   {
       //creates variables for the game
       boolean game = true; //keeps while loop runing
       //array prevents infinte looping
       boolean[] doneYet = {false, false, false, false, false, false, false, false, false, false, false, false};
       Character robbie = new Character();// creates character for the game
       Display adventure = new Display("Click", "Button", "To", "Start", robbie, doneYet);
       String typingText; //keeping
       while(game) //keeps running aslong as the game hasn't been completed
       {
          /*
          each location has the booleans that prevent an infinte loop along with renaming the buttons so that
          what appears on the button matchs what action is preformed when the button is clicked 
           */
          if(robbie.getLocation() == 0)//start
          {
            if(!doneYet[0]) 
            {
              System.out.println("Welcome to Robbie's Radtastic RAMpage!\nPush a button to Start\n");
              
              doneYet[0] = true;
            }
          }
          if(robbie.getLocation() == 1) //prolog
          {
              if(!doneYet[1])
              {
                  adventure.setButtons("Continue"," "," "," ");
                  typingText = "It was a dark and stormie night and Robbie was walking home wearing the pride of his existance, his WHITE VANS.\n"
                  + "Suddenly out of no where the HOOPDE appearded. Robbie awoke with a throbbing pain in his head. He must have been attacked.\n"
                  + "He looked down and was horrified to see that his crisp WHITE VANS had been taken and in there place a pair of PINK CROCS.\n"
                  + "Robbie then returned to his home to prepare as he was about to embark on a quest to return the WHITE VANS to his feet!\n"
                  + "Click button to continue!\n\n";
                  scrollingText(typingText);
              
                  doneYet[1] = true;
              }
          }
          if(robbie.getLocation() == 2) //house
          {
              if(!doneYet[2])
              {
                  adventure.setButtons("Leave","Look Around"," "," ");
                  typingText = "Robbie returned home and now is ready to embark on his noble quest.\n\n";
                  scrollingText(typingText);
                  doneYet[2] = true;
              }
          }
          if(robbie.getLocation() == 3)//upper lot
          {
              if(!doneYet[3])
              {
                  adventure.setButtons("Go West","Go South","Look Around","Talk to passerby");
                  adventure.packFrame();
                  typingText = "You have arrived at the town of OPPER LOAT.\n\n";
                  scrollingText(typingText);
                  doneYet[3] = true;
              }
          }
          if(robbie.getLocation() == 4)//south path
          {
              if(!doneYet[4])
              {
                  adventure.setButtons("Go to OTTO SHOOPE","Go to OPPER LOAT","Look Around","Talk to passerby");
                  adventure.packFrame();
                  typingText = "You take the Path.\n\n";
                  scrollingText(typingText);
                  doneYet[4] = true;
              }
          }
          if(robbie.getLocation() == 5) //west
          {
               if(!doneYet[5])
              {
                  adventure.setButtons("Go to CAFE","Go to OPPER LOAT","Look Around","Talk to passerby");
                  adventure.packFrame();
                  typingText = "You take the Path.\n\n";
                  scrollingText(typingText);
                  doneYet[5] = true;
              }
          }
          if(robbie.getLocation() == 6)//autoshopdoor
          {
               if(!doneYet[6])
              {
                  adventure.setButtons("Go inside","Go to LUMBER YARD","Look Around","Take the path north");
                  adventure.packFrame();
                  typingText = "You arrive at the gate of The Castle OTTO SHOOPE.\n\n";
                  scrollingText(typingText);
                  doneYet[6] = true;
              }
          }
          if(robbie.getLocation() == 7)//Wood Shop
          {
               if(!doneYet[7])
              {
                  adventure.setButtons("Go to OTTO SHOOPE","Go to the LIBRARY","Look Around","Talk to Lumber Master G");
                  adventure.packFrame();
                  typingText = "You arrive at the LUMBER YARD.\n\n";
                  scrollingText(typingText);
                  doneYet[7] = true;
              }
          }
          if(robbie.getLocation() == 8)//library
          {
               if(!doneYet[8])
              {
                  adventure.setButtons("Go to the LUMBER YARD","Go to the CAFE","Look Around","Take a book");
                  adventure.packFrame();
                  typingText = "You have arrived at the LIBRARY.\n\n";
                  scrollingText(typingText);
                  doneYet[8] = true;
              }
          }
          if(robbie.getLocation() == 9)//Mosaic
          {
               if(!doneYet[9])
              {
                  adventure.setButtons("Take the path East","Go to LIBRARY","Look Around","Talk to Tavern Folk");
                  adventure.packFrame();
                  typingText = "You have arrived at the MOSAIC TAVERN.\n\n";
                  scrollingText(typingText);
                  doneYet[9] = true;
              }
          }
          if(robbie.getLocation() == 10)//auto Shop
          {
               if(!doneYet[10])
              {
                  adventure.setButtons("Take back your Vans","Leave the castle","Look Around","Talk to LORD URALES");
                  adventure.packFrame();
                  typingText = "You enter the Castle OTTO SHOOPE.\n" +
                  "You see your vans on the far table!\n\n";
                  scrollingText(typingText);
                  doneYet[10] = true;
              }
          }
           if(robbie.getLocation() == 11)//Win
          {
               if(!doneYet[11])
              {
                  adventure.setButtons("Yeah!","I did it","End!","Play again");
                  adventure.packFrame();
                  typingText = "You Win!.\n\n";
                  scrollingText(typingText);
                  if(robbie.resetGame == 0)
                  {
                      break;
                  }
                  doneYet[11] = true;
              }
          }
       }
   }
   //creates text that scrolls and doesn't print all at once
   public static void scrollingText(String typingText) throws InterruptedException
   {
       for(int i = 0; i < typingText.length(); i++)
                  {
                     if(i == typingText.length() - 1)
                     {
                        System.out.print(typingText.substring(i));
                     }
                     else
                     {
                        System.out.print(typingText.substring(i,i+1));
                     }
                     Thread.sleep(5);
                  }
   }

}
