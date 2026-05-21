import greenfoot.*;

public class Enemigo extends Actor {

    // Velocidad
    private int velocidadX = 1;
    private int velocidadY = 1;

    // Delay de movimiento
    private int moveDelay = 0;

    // Animación
    private int animCounter = 0;

    // Sprites
    private GreenfootImage idleImage;
    private GreenfootImage moveImage;

    public Enemigo() {

        // Quieto
        idleImage = new GreenfootImage("Enemigo_parado.png");
        idleImage.scale(50, 50);

        // Caminando
        moveImage = new GreenfootImage("Enemigo_moviendose.png");
        moveImage.scale(50, 50);

        setImage(idleImage);

        // Dirección inicial aleatoria
        cambiarDireccion();
    }

    public void act() {

        mover();
        animate();
    }

    private void mover() {

        // Delay entre movimientos
        if (moveDelay > 0) {

            moveDelay--;
            return;
        }

        // Colisión horizontal
        if (getOneObjectAtOffset(velocidadX, 0, Muro.class) != null) {

            cambiarDireccion();

        } else {

            setLocation(getX() + velocidadX, getY());
        }

        // Colisión vertical
        if (getOneObjectAtOffset(0, velocidadY, Muro.class) != null) {

            cambiarDireccion();

        } else {

            setLocation(getX(), getY() + velocidadY);
        }

        // Bordes horizontales
        if (getX() <= 15 || getX() >= getWorld().getWidth() - 15) {

            cambiarDireccion();
        }

        // Bordes verticales
        if (getY() <= 15 || getY() >= getWorld().getHeight() - 15) {

            cambiarDireccion();
        }

        // A veces cambia dirección solo
        if (Greenfoot.getRandomNumber(100) < 3) {

            cambiarDireccion();
        }

        // Delay de movimiento
        moveDelay = 6;
    }

    private void cambiarDireccion() {

        int direccion = Greenfoot.getRandomNumber(4);

        switch(direccion) {

            case 0:
                velocidadX = 1;
                velocidadY = 0;
                break;

            case 1:
                velocidadX = -1;
                velocidadY = 0;
                break;

            case 2:
                velocidadX = 0;
                velocidadY = 1;
                break;

            case 3:
                velocidadX = 0;
                velocidadY = -1;
                break;
        }
    }

    public void animate() {

        animCounter++;

        if (animCounter < 10) {

            setImage(idleImage);

        } else {

            setImage(moveImage);
        }

        if (animCounter >= 20) {

            animCounter = 0;
        }
    }

    public void morir() {

        getWorld().removeObject(this);
    }
}