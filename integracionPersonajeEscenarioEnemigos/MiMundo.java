import greenfoot.*;

public class MiMundo extends World
{
    // Música de fondo
    private GreenfootSound musica =
        new GreenfootSound("musicaGreenfoot.mp3");

    // Tamaño de cada celda
    public static final int TAMANIO_CELDA = 32;

    // Mapa
    private String[] mapa = {
        "M A A M . . . . . . . . . B B B . . . .",
        ". . . . . . . . . . . . . B A B . . . D",
        ". . . . . . . . . . . . . B B B . . . .",
        ". . P . . . . . . . . . . . B . . . . .",
        ". . . . . . . . . B B B . . . . . . . .",
        ". . . . . . . . . B B B . . . . . . . .",
        ". . . . . . . . . B A B . . . C C C C C",
        "H . . . . . . . . B B B . . . C . . . .",
        ". . . . . B B B . . B . . . . C . . . .",
        ". . . . . B B B . . . . . . . C . B M B",
        "M . . . . B B B . . . . . . . C . B B B",
        "C C M . . . B . . . . . . . . C . B A B",
        ". C C C C C C C C C C C C C C C . B B B",
        "H . . . C . . . H . . . . . . . . . . .",
        ". . . . D . . . . . . . . . . . . . . ."
    };

    public MiMundo()
    {
        // Mundo
        super(20, 15, TAMANIO_CELDA);

        // Música
        musica.setVolume(40);
        musica.playLoop();

        // Fondo
        GreenfootImage fondo = getBackground();

        // Color desierto
        fondo.setColor(new Color(230, 153, 51));
        fondo.fill();

        // Cuadrícula
        fondo.setColor(new Color(210, 130, 30));
        drawGrid(fondo);

        // Construir escenario
        crearEscenario();

        // Objetos iniciales
        prepare();
    }

    private void crearEscenario()
    {
        for (int fila = 0; fila < mapa.length; fila++)
        {
            String linea = mapa[fila].replace(" ", "");

            for (int col = 0; col < linea.length(); col++)
            {
                char tipo = linea.charAt(col);

                int x = col;
                int y = fila;

                switch (tipo)
                {
                    case 'B':
                        addObject(new Muro(), x, y);
                        break;

                    case 'A':
                        addObject(new Agua(), x, y);
                        break;

                    case 'M':
                        addObject(new Monte(), x, y);
                        break;

                    case 'C':
                        addObject(new Camino(), x, y);
                        break;

                    case 'H':
                        addObject(new Caja(), x, y);
                        break;

                    case 'D':
                        addObject(new Baliza(), x, y);
                        break;

                    case 'P':
                        addObject(new Robot(), x, y);
                        break;
                }
            }
        }
    }

    // Dibujar cuadrícula
    private void drawGrid(GreenfootImage fondo)
    {
        for (int i = 0; i < getWidth(); i++)
        {
            fondo.drawLine(
                i * TAMANIO_CELDA,
                0,
                i * TAMANIO_CELDA,
                getHeight() * TAMANIO_CELDA
            );
        }

        for (int i = 0; i < getHeight(); i++)
        {
            fondo.drawLine(
                0,
                i * TAMANIO_CELDA,
                getWidth() * TAMANIO_CELDA,
                i * TAMANIO_CELDA
            );
        }
    }

    // Objetos iniciales
    private void prepare()
    {
        Explorer explorer = new Explorer();
        addObject(explorer, 5, 4);

        Enemigo enemigo = new Enemigo();
        addObject(enemigo, 17, 4);
    }

    // Pausar música
    public void stopped()
    {
        musica.pause();
    }

    // Reanudar música
    public void started()
    {
        musica.playLoop();
    }
}