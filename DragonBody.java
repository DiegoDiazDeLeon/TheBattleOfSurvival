import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DragonBody here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DragonBody extends Actor
{
    private GreenfootSound canonSound = new GreenfootSound("CanonDragonSoundFN.mp3");
    private GreenfootSound misilSound = new GreenfootSound("misil.mp3");
    /**
     * Act - do whatever the DragonBody wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        shot();
    }
    
    public void shot()
    {
             int misil=Greenfoot.getRandomNumber(80+1);
             int energyBall=Greenfoot.getRandomNumber(120+1);
       if(energyBall==100)
       {
          EnergyBall ball = new EnergyBall();
          getWorld().addObject(ball, 800 , 180);
          Greenfoot.playSound("CanonDragonSoundFN.mp3");
       }
       if(misil==11){
           misil misi = new misil();
           getWorld().addObject(misi, 970 , 580);
           misilSound.play();
        }
         
    } 
}
