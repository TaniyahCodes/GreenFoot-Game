import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RocketShip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RocketShip extends OuttaSpaceActors
{
    /**
     * Act - do whatever the RocketShip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int horizontalSpeed = 0;
    int verticalSpeed =  0;
    boolean fired = false;
    boolean hitAsteroid=false;
    public RocketShip()
{
    getImage().scale(getImage().getWidth()/2,getImage().getHeight()/2);  
}
public void act()
    {
        turnCommand();
        accelerateOnCommand();
        disselarateOnCommand();
        setLocation(getX() + horizontalSpeed/3, getY() + verticalSpeed/3);
        //WrapAtEdge();
        bounceAtEdge();
        fireOnCommand();
        hitAsteroids();
    }
public void turnCommand()
{
    if (Greenfoot.isKeyDown("right"))
    {
      setRotation(0);  
    }
    if (Greenfoot.isKeyDown("left"))
    {
      setRotation(180);  
    }
    if (Greenfoot.isKeyDown("down"))
    {
      setRotation(90);  
    }
    if (Greenfoot.isKeyDown("up"))
    {
      setRotation(270);  
    }
}
public void accelerateOnCommand()
{
    if (Greenfoot.isKeyDown("space"))
    {
        if (getRotation() == 0)
        {
           horizontalSpeed++; 
        }
        if (getRotation() == 180)
        {
           horizontalSpeed--; 
        }
        if (getRotation() == 90)
        {
           verticalSpeed++; 
        }
        if (getRotation () == 270)
        {
           verticalSpeed--; 
        }
    }
}
public void disselarateOnCommand(){
    if (Greenfoot.isKeyDown("S")){
        horizontalSpeed = 0;
        verticalSpeed= 0;
    }
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
        setLocation(getX(), 648);
    }
    
    if (getY() == 649) 
    {
        setLocation(getX(), 1);
    }
}

public void bounceAtEdge()
{
    if (getX() == 0)
    {
        horizontalSpeed = -horizontalSpeed;
    }
    if (getY() == 0)
    {
        verticalSpeed= -verticalSpeed;
    }
    if (getX() == 899)
    {
        horizontalSpeed = -horizontalSpeed;
    }
    if (getY() == 449)
    {
        verticalSpeed= -verticalSpeed;
    }
}
public void fireOnCommand()
{
    Projectile projectile = new Projectile();
    if (Greenfoot.isKeyDown("f") && fired == false)
    {
        getWorld().addObject(projectile, getX(), getY());
        projectile.setRotation(getRotation());
        fired = true;
    }
    if (!Greenfoot.isKeyDown("f"))
    {
        fired = false; 
    }
}
public void hitAsteroids()
{
    if(isTouching(AllAsteroids.class)&&hitAsteroid==false)
    {
        MyWorld myWorld = (MyWorld)getWorld();
        HealthBar healthbar = myWorld.getHealthBar();
        healthbar.health--;
        hitAsteroid=true;
    }
    else if (!isTouching(AllAsteroids.class))
    {
        hitAsteroid=false;  
    }
}
}
