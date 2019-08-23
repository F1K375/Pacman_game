import greenfoot.*;

/**
 * Write a description of class hantu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hantu extends move
{
    /**
     * Act - do whatever the hantu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static GreenfootSound die = new GreenfootSound("die.wav");
    private String Arah = null;
    public void act() 
    {
       if(bisagerak){
           gerak();
           int x = getX();
           int y = getY();
           if(x == 545 && y == 310)
                setLocation(545,308);
           else if(x == 545 && y == 308)
                setLocation(545,306);
           else if(x == 545 && y == 306)
                setLocation(545,304);
           else if(x == 545 && y == 304)
                setLocation(545,302);
           else if(x == 545 && y == 302)
                setLocation(545,300);
           else if(x == 545 && y == 300)
                setLocation(545,298);
           else if(x == 545 && y == 298)
                setLocation(545,296);
           else if(x == 545 && y == 296)
                setLocation(545,294);
           
           if(Hit(pacman.class)){
                die.play();
                Hitghost();}
           
       }
                
       
    }    
    
    private void gerak(){
        if(Arah!=null && Hitwall(Arah))
            jalan(Arah);
        else{
            int acak = Greenfoot.getRandomNumber(4);
            setArah(acak);
            gerak();
        }
    }
    
    private void jalan(String arah){
        if(arah == "kanan")
            setLocation(getX()+2,getY());
        if(arah == "kiri")
            setLocation(getX()-2,getY());
        if(arah == "atas")
            setLocation(getX(),getY()-2);
        if(arah == "bawah")
            setLocation(getX(),getY()+2);
    }
    
    private String setArah(int random){
        if(random == 0)
            Arah = "kanan";
        else if(random == 1)
            Arah = "bawah";
        else if(random == 2)
            Arah = "kiri";
        else
            Arah = "atas";
        return Arah;
    }
}
