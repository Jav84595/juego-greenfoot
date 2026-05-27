import greenfoot.*;

public class BotonReiniciar extends Actor
{
    public BotonReiniciar()
    {
        GreenfootImage imagen = new GreenfootImage(120, 40);
        imagen.setColor(new Color(0, 150, 0));
        imagen.fillRect(0, 0, 120, 40);
        imagen.setColor(Color.WHITE);
        imagen.setFont(new Font("Arial", true, false, 20));
        imagen.drawString("Reiniciar", 15, 28);
        setImage(imagen);
    }
    
    public void act()
    {
        if (Greenfoot.mousePressed(this))
        {
            Greenfoot.setWorld(new MiMundo());
        }
    }
}