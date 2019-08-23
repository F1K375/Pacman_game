import greenfoot.*;
import java.awt.Color;
/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level extends Actor
{
    /**
     * Act - do whatever the Level wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Level(int level){
        setImage(new GreenfootImage("Level " + level, 50, Color.WHITE, Color.BLACK));
    }
}
