import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OuttaSpaceActors here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OuttaSpaceActors extends Actor
{
    /**
     * Act - do whatever the OuttaSpaceActors wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public void WrapAtEdge() {
    if (getX() == 0) 
    {
        setLocation(898, getY());
    }
    if (getX() == 899) 
    {
        setLocation(1, getY());
    }

    if (getY() == 0) 
    {
        setLocation(getX(), 448);
    }
    
    if (getY() == 449) 
    {
        setLocation(getX(), 1);
    }
    }    
}
