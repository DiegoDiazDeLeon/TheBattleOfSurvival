import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Title title = new Title();
        addObject(title,528,85);

        Play play = new Play();
        addObject(play,523,255);
        Instrucciones instrucciones = new Instrucciones();
        addObject(instrucciones,521,350);
        Records records = new Records();
        addObject(records,521,437);
        Salir salir = new Salir();
        addObject(salir,521,525);
    }
}