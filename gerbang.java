import greenfoot.*;

/**
 * Write a description of class gerbang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gerbang extends Actor
{
    /**
     * Act - do whatever the gerbang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(isTouching(pacman.class)){
           Bkground ground = (Bkground)getWorld();
           ground.levelup++;
           ground.chooselvl();
       }   
    }    
}
