import greenfoot.*;

public class PantallaGameOver extends World
{
    public PantallaGameOver()
    {
        super(20, 15, 32);
        
        GreenfootImage fondo = getBackground();
        fondo.setColor(Color.BLACK);
        fondo.fill();
        
        fondo.setColor(Color.WHITE);
        fondo.setFont(new Font("Arial", true, false, 60));
        fondo.drawString("HAS PERDIDO", 125, 155);
        
        addObject(new BotonReiniciar(), 8, 10);
        addObject(new BotonSalir(), 12, 10);
    }
}
