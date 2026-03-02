import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Counter counter = new Counter();
    HealthBar healthbar = new HealthBar();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900,450,1); 
        prepare();
    }
    public Counter getCounter()
    {
        return counter; 
    }
    public HealthBar getHealthBar ()
    {
        return healthbar;
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        RocketShip rocketShip = new RocketShip();
        addObject(rocketShip, 458, 309);
        Asteroids asteroids = new Asteroids();
        addObject(asteroids, Greenfoot.getRandomNumber(900), Greenfoot.getRandomNumber(650)); 
        Asteroids asteroids2 = new Asteroids();
        addObject(asteroids2, Greenfoot.getRandomNumber(900), Greenfoot.getRandomNumber(650)); 
        Asteroids asteroids3 = new Asteroids();
        addObject(asteroids3, Greenfoot.getRandomNumber(900), Greenfoot.getRandomNumber(650));
        Asteroids asteroids4 = new Asteroids();
        addObject(asteroids4, Greenfoot.getRandomNumber(900), Greenfoot.getRandomNumber(650));
        addObject(counter,75,56);
        addObject(healthbar,202,57);
    }
}
