import greenfoot.*;
/**
 * Write a description of class move here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class move extends Actor
{
    /**
     * Act - do whatever the move wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public boolean bisagerak = true;
    
    public boolean Hitwall(String arah){
        int x;
        int y;
        if(arah == "kiri"){
            x=getX()-2;
            y=getY();
        }else if(arah == "kanan"){
            x=getX()+2;
            y=getY();
        }else if(arah == "atas"){
            x=getX();
            y=getY()-2;
        }else{
            x=getX();
            y=getY()+2;}
        int Xttp = getX();
        int Yttp = getY();
        setLocation(x,y);
        Actor dinding = getOneIntersectingObject(Tembok.class);
        setLocation(Xttp,Yttp);
        return dinding == null;
    }
    
    public boolean Hit(Class cls){
        Actor ac = getOneIntersectingObject(cls);
        return ac!=null;
    }
    
    public void Hitghost(){
        Bkground world = (Bkground) getWorld();
        world.GameOver();
    }
}
