import greenfoot.*;  
public class mainMenu extends World
{
    static scoreCounter scoreKeeper = new scoreCounter(); //creating a scorecounter to be used from the other worlds
    public mainMenu()
    {
        super(900, 550, 1); //constructing a world of 900 by 550
    }
    public void startMenu() {
        addObject(scoreKeeper, 60, 20); //adding a score keeping text
        Greenfoot.start();
    }
    public void act() {
        MouseInfo mouse = Greenfoot.getMouseInfo(); //initializes the mouse as an object
        int x = mouse.getX(); //gets the mouse coordinatese
        int y = mouse.getY();
        if (Greenfoot.mouseClicked(null)) { //checks when the mouse is clicked
            if (x > 50 && x < 193) {//checks where the mouse is clicked
                if (y > 150 && y < 310) {
                    blackJack BLACKJACK = new blackJack(); //initiates blackjack
                    Greenfoot.setWorld(BLACKJACK); //changes the background
                    BLACKJACK.startBJ(); //calls the blackjack starter method
                }
                else if (y > 330 && y < 490) {
                    oldMaid OLDMAID = new oldMaid(); //initiates oldMaid
                    Greenfoot.setWorld(OLDMAID); //changes the background  
                    OLDMAID.startOM(); //calls the oldmaid starter method
                }
            }
            else if (x > 240 && x < 384) {
                if (y > 150 && y < 310) {
                    goFish GOFISH = new goFish(); //initiates go fish
                    Greenfoot.setWorld(GOFISH); //changes background
                    GOFISH.startGF(); //calls the go fish starter method
                }
                else if (y > 330 && y < 490) {
                    War WAR = new War(); //initiates war
                    Greenfoot.setWorld(WAR); //changes background
                    WAR.startWar(); //calls the war starter method
                }
            }
        }
    }
}