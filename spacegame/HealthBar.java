import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends Actor
{
    int health = 20;
    int healthBarWidth = 80;
    int healthBarHeight = 10;
    int pixelsPerHealthPoint= healthBarWidth/health;
    /**
     * Act - do whatever the HealthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public HealthBar()
    {
        update();
    }
    public void act()
    {
        update();
        YouLose();
    }
    public void update()
    {
        setImage(new GreenfootImage(healthBarWidth + 2, healthBarHeight + 2));
        getImage().setColor(Color.WHITE);
        getImage().drawRect(0,0,healthBarWidth + 1, healthBarHeight +1);
        getImage().setColor(Color.RED);
        getImage().fillRect(1,1,health * pixelsPerHealthPoint,healthBarHeight);
    }
    public void YouLose ()
    {
        if(health<=0)
        {
            getWorld().addObject(new YouLose(), 375, 300);
            Greenfoot.stop();
        }
    }
}
