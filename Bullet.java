import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Bullet extends Actor
{
    int position;
    int numBu;
    
    public Bullet(int direction){
        position=direction;
    }
    public void act() 
    {
        
        setImage("bullet"+numBu+".png");
        switch(position)
        {
           case 0: numBu=0;
                   setLocation(getX()+12,getY());
                   break;
           case 1: numBu=1;
                   setLocation(getX()-12,getY());
                   break;
           case 2: numBu=2;
                   setLocation(getX()+12,getY()-8);
                   break;
           case 3: numBu=3;
                   setLocation(getX()-12,getY()-8);
                   break;
           case 4: numBu=0;
                   setLocation(getX()+12,getY());
                   break;
           case 5: numBu=1;
                   setLocation(getX()-12,getY());
                   break;
        }
            Actor DragonHead = getOneObjectAtOffset(-3,-2, DragonHead.class);
            Actor DragonFront = getOneObjectAtOffset(0,0, DragonFront.class);
            Actor DragonBody = getOneObjectAtOffset(0,0, DragonBody.class);
        if(getX()>=getWorld().getWidth()-3 || (getX())<=3){
           getWorld().removeObject(this);
        }
        else if(DragonHead != null || DragonFront != null || DragonBody != null)
        {
            MyWorld world= (MyWorld)getWorld();
            world.lifeEnemy.decrementar();
            world.puntos.incrementar();
            getWorld().removeObject(this);
            if(world.lifeEnemy.ObtenerValor()==200){
                world.removeObject(DragonHead);
                DragonFront dragonFront =new DragonFront();
                world.addObject(dragonFront,890,400);
                dragonFront.shotLacer();
            }    
            else if(world.lifeEnemy.ObtenerValor()==100){
                world.removeObject(DragonFront);
                DragonBody dragonBody =new DragonBody();
                world.addObject(dragonBody,940,310);
                
            
            }
            else if(world.lifeEnemy.ObtenerValor()==0){
               world.removeObject(DragonBody);
               //you win png
            }
        }
       
       
       
        
    }   
    
     
    
    }
