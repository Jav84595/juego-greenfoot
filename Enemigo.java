import greenfoot.*;

public class Enemigo extends Actor {

    private int velocidadX = 2;
    private int velocidadY = 2;
    private int animCounter = 0;

    public void act() {
        mover();
        animate();
    }

    private void mover() {
        setLocation(getX() + velocidadX, getY() + velocidadY);

        // Rebota en los bordes horizontales
        if (getX() <= 15 || getX() >= getWorld().getWidth() - 15) {
            velocidadX *= -1;
        }

        // Rebota en los bordes verticales
        if (getY() <= 15 || getY() >= getWorld().getHeight() - 15) {
            velocidadY *= -1;
        }
    }

    public void animate() {
        animCounter++;
        GreenfootImage imagen;

        if (animCounter < 10) {
            imagen = new GreenfootImage("Enemigo_parado.png");
        } else {
            imagen = new GreenfootImage("Enemigo_moviendose.png");
        }

        imagen.scale(50, 50);
        setImage(imagen);

        if (animCounter >= 20) {
            animCounter = 0;
        }
    }

    public void morir() {
        getWorld().removeObject(this);
    }
}