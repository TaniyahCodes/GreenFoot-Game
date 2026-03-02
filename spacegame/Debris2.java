import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Debris2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Debris2 extends  AllAsteroids
{
    
    /**
     * Act - do whatever the Debris2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Asteroids asteroids = new Asteroids();
    public Debris2()
    {
        getImage().scale(getImage().getWidth()/4, getImage().getHeight()/4);
        setRotation(asteroids.getRotation());
        setRotation(Greenfoot.getRandomNumber(360));
    }
    public void act()
    {
        move(3);
        WrapAtEdge();
    }
   
   }

