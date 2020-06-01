import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnergyBall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnergyBall extends Actor
{
    private int xVelocity=2;
    private int xDirection=-1;
    /**
     * Act - do whatever the EnergyBall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x= getX();
        int y= getY();
        setLocation(x + xVelocity * xDirection,y);
        Actor Jugador = getOneObjectAtOffset(0,0, Jugador.class); 
        if(isAtEdge()){
         getWorld().removeObject(this);
        }else if(Jugador != null)
        {
            MyWorld world= (MyWorld)getWorld();
            world.vidas.decrementardoble();
            world.puntos.decrementar();
            getWorld().removeObject(this);
            if(world.vidas.ObtenerValor()<=0){
               world.removeObject(Jugador);
               Greenfoot.setWorld(new GameOver());
            }
        }
    }    
}
