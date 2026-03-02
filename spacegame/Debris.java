import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Debris here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Debris extends  AllAsteroids
{
    /**
     * Act - do whatever the Debris wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Asteroids asteroids = new Asteroids();
    public Debris()
    {
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
        setRotation(asteroids.getRotation());
        setRotation(Greenfoot.getRandomNumber(360));
    }
    public void act()
    {
         move(3);
         WrapAtEdge();
    }
      
}
