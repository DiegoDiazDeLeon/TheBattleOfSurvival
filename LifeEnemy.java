import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LifeEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LifeEnemy extends Actor
{
    /**
     * Act - do whatever the LifeEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage image;
    int counter;
    String mensagge;
    int x, y, height, conten;
    
    
    
    
    public LifeEnemy (int disminuirvida, int x, int y,int height) 
    {
        this.counter = disminuirvida;
        image = new GreenfootImage(250,150);
        image.setColor(new greenfoot.Color(200,0,0,255));
        image.setFont(new greenfoot.Font ("Verdana", 24));
        this.x = x;
        this.y = y;
        this.height = height;
        draw();
    }    
    
    public void draw()
    {
        image.clear();
        image.setColor(new Color(200,200,0,255));
        image.drawRect(x,y,conten, height);
        image.setColor(new Color (255,255,255,255));
        image.drawString(String.valueOf(counter),25,19);
        setImage(image);
    }
    
    public void increment()
    {
        counter++;
        draw();
    }
        
    public void decrement()
    {
        counter--;
        draw();
    }
    
    public int getValue()
    {
        return counter;
    }  
}
