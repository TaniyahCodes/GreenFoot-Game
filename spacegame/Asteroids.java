import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class asteroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroids extends AllAsteroids
{
    int horizontalSpeed=Greenfoot.getRandomNumber(5) + 1;
    int verticalSpeed= Greenfoot.getRandomNumber(5) + 1;
    /**
     * Act - do whatever the asteroid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Asteroids()
    {
        
        if (Greenfoot.getRandomNumber(5) == 1)
        {
          horizontalSpeed = -horizontalSpeed;  
        }
        if (Greenfoot.getRandomNumber(5) == 1)
        {
          verticalSpeed = -verticalSpeed;  
        }
    }
    public void act()
    {
        setLocation(getX() + horizontalSpeed, getY() + verticalSpeed);
        WrapAtEdge();
        //bounceAtEdge();
    }
}