;import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    
    MyWorld world;
    GreenfootSound mainMusic = new GreenfootSound("maintheme.mp3");
    PuntajeYVidas puntos;
    PuntajeYVidas vidas;
    LifeEnemy lifeEnemy;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    

        super(1024, 600, 1); 
        prepare();
        
        puntos =new PuntajeYVidas (0, "Puntaje ");
        vidas =new PuntajeYVidas(3, "Vidas ");
        Greenfoot.delay(50);
        addObject(puntos,150,85);
        addObject(vidas,150,115);

        
          

    }
    

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Jugador jugador = new Jugador();
        addObject(jugador,475,397);
        jugador.setLocation(488,455);
        DragonHead dragonHead = new DragonHead();
        addObject(dragonHead,490,78);

        

       
        lifeEnemy = new LifeEnemy(300,0,0,20);

        addObject(lifeEnemy,750,85);
        
        
        
        
    }
    public void act(){
     mainMusic.playLoop();
    }
    public void borrarvida(){
        world.removeObject(lifeEnemy);
    }

    
}
