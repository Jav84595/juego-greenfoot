import greenfoot.*;

public class BotonSalir extends Actor
{
    public BotonSalir()
    {
        GreenfootImage imagen = new GreenfootImage(120, 40);
        imagen.setColor(new Color(150, 0, 0));
        imagen.fillRect(0, 0, 120, 40);
        imagen.setColor(Color.WHITE);
        imagen.setFont(new Font("Arial", true, false, 20));
        imagen.drawString("Salir", 35, 28);
        setImage(imagen);
    }
    
    public void act()
    {
        if (Greenfoot.mousePressed(this))
        {
            Greenfoot.stop();
        }
    }
}
