import greenfoot.*;
import java.util.List;
import java.awt.Color;
import java.awt.*;
/**
 * Write a description of class Bkground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bkground extends World
{

    /**
     * Constructor for objects of class Bkground.
     * 
     */
    public int levelup = 1;
    private mulailagi lagi;
    private keluar exit;
    private Score updatescore;
    //public move mv = new move();
    private static GreenfootSound start = new GreenfootSound("start.wav");
    private static GreenfootSound win = new GreenfootSound("winning.wav");
    public Bkground()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        setPaintOrder(mulailagi.class,keluar.class,youwin.class,Tembok.class,pacman.class,hantu.class);
        start.play();
        chooselvl();
    }
    
    public void chooselvl(){
        if(levelup == 1)
            Level_1();
        else if(levelup == 2)
            Level_2();
        else if(levelup ==3)
            Level_3();
        else
            GameWin();
    }
    
    private void Level_2(){
        removeObjects(getObjects(Actor.class));
        addObject(new Level(levelup), 500, 25);
        int[] Level2 = {
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,2,2,2,2,2,2,2,0,2,2,2,2,2,2,2,0,2,2,2,2,0,2,2,2,2,2,2,2,0,
                0,2,0,0,0,2,2,2,0,2,2,2,2,0,0,0,0,0,0,0,2,0,2,2,2,0,0,0,2,0,
                0,2,0,2,2,2,0,2,0,0,0,0,2,2,2,2,0,2,2,2,2,0,2,0,2,2,2,0,2,0,
                0,2,0,2,0,2,0,2,2,2,2,2,2,2,2,2,0,2,2,2,2,2,2,0,2,0,2,0,2,0,
                0,2,2,2,0,2,0,0,0,2,0,0,2,2,0,0,0,0,0,2,2,0,0,0,2,0,2,2,2,0,
                0,2,2,2,0,2,0,2,2,2,2,2,2,1,1,1,1,1,1,1,2,2,2,0,2,0,2,2,2,0,
                0,0,0,0,0,2,0,2,2,2,2,2,2,1,0,0,1,0,0,1,2,2,2,0,2,0,0,0,0,0,
                0,0,0,0,0,2,2,2,2,2,0,0,2,1,0,3,1,3,0,1,2,2,2,2,2,0,0,0,0,0,
                0,2,2,2,0,2,0,0,0,2,0,0,2,1,0,3,3,3,0,1,2,0,0,0,2,0,2,2,2,0,
                0,2,2,2,0,2,0,2,2,2,2,2,2,1,0,0,0,0,0,1,2,2,2,0,2,0,2,2,2,0,
                0,2,0,2,0,2,0,2,0,2,2,2,2,1,1,1,0,1,1,1,2,0,2,0,2,0,2,0,2,0,
                0,2,0,2,2,2,2,2,0,2,0,0,2,2,2,2,1,2,2,2,2,0,2,2,2,2,2,0,2,0,
                0,2,0,0,0,2,0,0,0,2,2,2,2,0,0,0,0,0,0,0,2,0,0,0,2,0,0,0,2,0,
                0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,2,2,2,2,2,2,2,2,2,2,2,2,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
            };
        addObject(new gerbang(),545,340); 
        updatescore = new Score();
        addObject(updatescore, 100, 25);
        addObject(new pacman(),545,429);
        
        createArena(Level2);
    }
    
    private void Level_3(){
        removeObjects(getObjects(Actor.class));
        addObject(new Level(levelup), 500, 25);
        int[] Level3 = {
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,2,2,2,0,2,2,2,2,2,0,2,2,2,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,0,
                0,2,0,2,2,2,0,2,0,2,2,2,0,2,0,0,2,0,0,2,0,0,2,0,0,2,0,0,2,0,
                0,2,0,0,2,0,0,2,0,0,2,0,0,2,0,0,2,0,0,2,0,0,2,0,0,2,0,0,2,0,
                0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,
                0,2,0,0,0,2,2,0,2,0,0,0,0,2,0,0,0,0,0,2,0,0,0,2,0,2,0,0,2,0,
                0,2,2,2,2,2,2,0,2,2,2,2,0,1,1,1,1,1,1,1,0,2,2,2,0,2,2,2,2,0,
                0,2,0,0,2,0,2,0,0,0,0,2,0,1,0,0,1,0,0,1,0,2,0,0,0,2,0,2,2,0,
                0,2,2,0,2,0,2,0,2,2,2,2,2,1,0,3,3,3,0,1,2,2,2,2,0,2,0,2,2,0,
                0,2,2,0,0,0,2,0,2,2,0,0,0,1,0,3,3,3,0,1,0,0,0,2,0,2,0,0,2,0,
                0,2,2,2,2,0,2,2,2,2,0,2,2,1,0,0,0,0,0,1,2,2,0,2,2,2,0,2,2,0,
                0,2,0,0,0,0,0,0,0,2,0,2,0,1,1,1,0,1,1,1,0,2,0,2,0,0,0,2,2,0,
                0,2,2,2,2,2,2,2,2,2,2,2,0,2,2,2,1,2,2,2,0,2,2,2,2,2,2,2,2,0,
                0,2,2,0,2,0,2,0,2,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,2,2,0,2,2,0,
                0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
            };
        addObject(new gerbang(),545,340); 
        updatescore = new Score();
        addObject(updatescore, 100, 25);
        addObject(new pacman(),545,429);
        
        createArena(Level3);
    }
    
    private void Level_1(){
        removeObjects(getObjects(Actor.class));
        addObject(new Level(levelup), 500, 25);
        int[] Level1 = {
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,2,2,2,2,0,2,2,2,2,2,2,0,2,0,2,0,2,0,2,0,2,2,2,2,2,2,2,2,0,
                0,2,0,0,2,0,2,0,0,0,0,2,0,2,2,2,2,2,2,2,0,2,2,0,0,0,0,2,2,0,
                0,2,0,0,2,0,2,0,0,0,0,2,0,2,2,0,2,0,2,2,0,2,2,0,0,0,0,2,2,0,
                0,2,2,2,2,0,2,2,2,2,2,2,0,2,2,1,2,1,2,2,0,2,2,2,2,2,2,2,2,0,
                0,2,2,2,2,2,2,2,2,2,2,2,0,0,0,1,0,1,0,0,0,2,2,2,2,2,2,2,2,0,
                0,2,0,0,0,0,0,2,2,0,2,2,2,1,1,1,1,1,1,1,2,2,2,0,2,2,2,0,2,0,
                0,2,0,2,2,2,2,2,2,0,2,2,2,1,0,0,1,0,0,1,2,2,2,0,2,0,2,0,2,0,
                0,2,0,2,2,2,2,2,2,0,0,0,0,1,0,1,3,1,0,1,0,0,0,0,2,2,2,0,2,0,
                0,2,0,0,0,0,0,2,2,0,2,2,2,1,0,3,3,3,0,1,2,2,2,0,2,2,2,0,2,0,
                0,2,0,2,2,2,2,2,2,0,2,2,2,1,0,0,0,0,0,1,2,2,2,0,2,0,2,0,2,0,
                0,2,0,2,0,0,0,2,2,2,2,2,0,1,1,1,0,1,1,1,0,2,2,2,2,2,2,0,2,0,
                0,2,0,2,0,0,0,2,2,2,2,2,0,2,2,2,1,2,2,2,0,2,2,2,2,2,2,0,2,0,
                0,2,0,2,2,2,2,2,2,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,2,2,2,0,2,0,
                0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
            };
        addObject(new gerbang(),545,340); 
        updatescore = new Score();
        addObject(updatescore, 100, 25);
        addObject(new pacman(),545,429);
        
        createArena(Level1);
    }
    
    public Score Update(){
        return updatescore;
    } 
    
    private void createArena(int arena[]){
        int a=0;
        for(int y=70;y<18*30;y+=30){
            for(int x=65;x<32*30;x+=30){
                int b=arena[a];
                if(b==0){
                    addObject(new Tembok(),x,y);}
                else if(b==1){}
                else if(b==2){
                    addObject(new food(),x,y);
                }else if(b==3){
                    addObject(new hantu(),x,y);}
                if(a<arena.length-1)
                    a++;
            }
        }
    }
    
    private void GameWin(){
        win.play();
        List mv = getObjects(move.class);
        for(int i = 0;i<mv.size();i++) {
            move mov = (move) mv.get(i);
            mov.bisagerak = false; }
        addObject(new youwin(), 545,250);
        lagi = new mulailagi();
        addObject(lagi, 425,340);
        exit = new keluar();
        addObject(exit, 665,340);
    }
    
    public void GameOver(){
        List mv = getObjects(move.class);
        for(int i = 0;i<mv.size();i++) {
            move mov = (move) mv.get(i);
            mov.bisagerak = false; }
        addObject(new gameover(), 545,250);
        lagi = new mulailagi();
        addObject(lagi, 425,340);
        exit = new keluar();
        addObject(exit, 665,340);
    }
    
    public void act(){
        if(Greenfoot.mouseClicked(lagi)){
              Greenfoot.setWorld(new Bkground());
        }else if(Greenfoot.mouseClicked(exit)){
              Greenfoot.setWorld(new Opening());
              Greenfoot.stop();}
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    
}
    
    

