import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Niveles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Niveles extends World
{
    GreenfootSound mainMusic = new GreenfootSound("maintheme.mp3");
    /**
     * Constructor for objects of class Niveles.
     * 
     */
    public Niveles()
    { 
        super(1024, 600, 1); 
         Player player = new Player();
        addObject(player,475,397);
        player.setLocation(488,455);
    }
    
    public void act(){
     mainMusic.playLoop();
    }
}
