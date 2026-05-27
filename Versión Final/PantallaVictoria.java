import greenfoot.*;

public class PantallaVictoria extends World
{
    public PantallaVictoria()
    {
        super(20, 15, 32);
        
        GreenfootImage fondo = getBackground();
        fondo.setColor(new Color(0, 70, 0));
        fondo.fill();
        
        fondo.setColor(Color.WHITE);
        fondo.setFont(new Font("Arial", true, false, 70));
        fondo.drawString("¡HAS GANADO!", 70, 170);
        
        addObject(new BotonReiniciar(), 8, 10);
        addObject(new BotonSalir(), 12, 10);
    }
}
