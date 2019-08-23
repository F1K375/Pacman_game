import greenfoot.*;

/**
 * Write a description of class Opening here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Opening extends World
{

    /**
     * Constructor for objects of class Opening.
     * 
     */
    private Start mulai;
    public Opening()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        int[] Watermark = {
                0,0,0,0,1,1,1,0,1,1,1,0,1,1,0,1,1,1,0,0,0,0,1,1,1,0,
                0,1,1,1,1,1,1,0,1,1,1,0,1,0,1,1,1,1,0,1,1,0,1,1,1,0,
                0,0,0,0,1,1,1,0,1,1,1,0,0,1,1,1,1,1,0,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,0,1,1,1,0,1,0,1,1,1,1,0,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,0,1,1,1,0,1,1,0,1,1,1,0,1,1,1,1,1,1,0
            };
        createArena(Watermark);
        mulai = new Start();
        addObject(mulai, 499, 389);
    }

    public void act(){
        if(Greenfoot.mouseClicked(mulai))
             Greenfoot.setWorld(new Bkground());
        
    }

    private void createArena(int arena[]){
        int a=0;
        for(int y=50;y<6*30;y+=30){
            for(int x=90;x<29*30;x+=30){
                int b=arena[a];
                if(b==0){
                    addObject(new Tembok(),x,y);}
                else if(b==1){}
                if(a<arena.length-1)
                    a++;
            }
        }
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
}
