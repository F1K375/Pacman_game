import greenfoot.*;
/**
 * Write a description of class pacman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pacman extends move
{
    /**
     * Act - do whatever the pacman wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static GreenfootSound eat = new GreenfootSound("wakka.wav");
    public void act(){
        if(bisagerak){
            String arah = ArahGerak();
            Bkground ground = (Bkground) getWorld();
            Score Nilai = ground.Update();
            if(Hitwall(arah)){
                arahTerakhir = arah;
                gerak(arah);
            }else if(Hitwall(arahTerakhir)){
                gerak(arahTerakhir);
            }if(Hit(food.class)){
                eat.play();
                removeTouching(food.class);
                Nilai.update(10);}
        }
    }
    
    private String ArahGerak(){
        String arah = null;
        if(Greenfoot.isKeyDown("Left"))
            arah = "kiri";
        if(Greenfoot.isKeyDown("Right"))
            arah = "kanan";   
        if(Greenfoot.isKeyDown("Up"))
            arah = "atas";
        if(Greenfoot.isKeyDown("Down"))
            arah = "bawah";
        if(arah!=null)
            return arah;
        else
            return arahTerakhir;
    }
    
    private void gerak (String arah){
        if(arah == "kanan"){
            setLocation(getX()+2,getY());
            setRotation(0);
        }else if(arah == "kiri"){
            setLocation(getX()-2,getY());
            setRotation(180);
        }else if(arah == "atas"){
            setLocation(getX(),getY()-2);
            setRotation(270);
        }else if(arah == "bawah"){
            setLocation(getX(),getY()+2);
            setRotation(90);}
    }
    
    private String arahTerakhir = null;
}
