import greenfoot.*;

public class Explorer extends Actor
{
    private int animCounter = 0;
    private boolean moving = false;
    
    private int moveDelay = 0;
    private int moveSpeed = 1;

    private GreenfootImage idleImage;
    private GreenfootImage walkImage;

    
    public Explorer()
    {
        GreenfootImage imagen = getImage();
        imagen.scale(50, 50); // ajusta el tamaño aquí
        setImage(imagen);
    }
    
    public void act() 
    {   
        moveAndTurn();
        animate();
        recolectarBaliza();    
    }   
    
public void moveAndTurn()
{
    moving = false;

    // Delay entre movimientos
    if (moveDelay > 0)
    {
        moveDelay--;
        return;
    }

    // IZQUIERDA
    if (Greenfoot.isKeyDown("left"))
    {
        if (getOneObjectAtOffset(-moveSpeed, 0, Muro.class) == null)
        {
            setLocation(getX() - moveSpeed, getY());
            moving = true;
        }
    }

    // DERECHA
    if (Greenfoot.isKeyDown("right"))
    {
        if (getOneObjectAtOffset(moveSpeed, 0, Muro.class) == null)
        {
            setLocation(getX() + moveSpeed, getY());
            moving = true;
        }
    }

    // ARRIBA
    if (Greenfoot.isKeyDown("up"))
    {
        if (getOneObjectAtOffset(0, -moveSpeed, Muro.class) == null)
        {
            setLocation(getX(), getY() - moveSpeed);
            moving = true;
        }
    }

    // ABAJO
    if (Greenfoot.isKeyDown("down"))
    {
        if (getOneObjectAtOffset(0, moveSpeed, Muro.class) == null)
        {
            setLocation(getX(), getY() + moveSpeed);
            moving = true;
        }
    }

    // Tiempo de espera después de moverse
    if (moving)
    {
        moveDelay = 4;
    }
}
    
    public void animate()
    {
        if (moving)
        {
            animCounter++;
            GreenfootImage imagen;
            
            if (animCounter < 10)
            {
                imagen = new GreenfootImage("robot_parado.png");
            }
            else
            {
                imagen = new GreenfootImage("robot_moviendo.png");
            }
            
            imagen.scale(60, 60); // mismo tamaño en ambas imágenes
            setImage(imagen);
            
            if (animCounter >= 10)
            {
                animCounter = 0; // reinicia el ciclo
            }
        }
        else
        {
            animCounter = 0;
            GreenfootImage imagen = new GreenfootImage("robot_parado.png");
            imagen.scale(60, 60);
            setImage(imagen);
        }
    }
    
    private void recolectarBaliza()
{
    Actor baliza = getOneIntersectingObject(Baliza.class);
    if (baliza != null)
    {
        getWorld().removeObject(baliza);
    }
}
}