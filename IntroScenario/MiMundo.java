import greenfoot.*;

public class MiMundo extends World
{
    // Tamaño exacto de cada celda en píxeles (óptimo para mapas de 20x15)
    public static final int TAMANIO_CELDA = 32;

    // Tu matriz del boceto: 20 columnas de ancho por 15 filas de alto
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
        // Creamos el lienzo del juego (640x480 píxeles en total)
        super(20, 15, TAMANIO_CELDA); 
        
        // Coloreamos el fondo de un tono arenoso/anaranjado como el de tu imagen
        GreenfootImage fondo = getBackground();
        fondo.setColor(new Color(230, 153, 51)); // Color naranja desierto
        fondo.fill();
        
        // Dibujar una cuadrícula opcional para guiarte (puedes borrar estas 2 líneas si no la quieres)
        fondo.setColor(new Color(210, 130, 30));
        drawGrid(fondo);

        // Construir el mapa de inmediato
        crearEscenario();
    }

    private void crearEscenario()
    {
        for (int fila = 0; fila < mapa.length; fila++) {
            String linea = mapa[fila].replace(" ", ""); 
            
            for (int col = 0; col < linea.length(); col++) {
                char tipo = linea.charAt(col);
                
                // Ubicación exacta centrada en la cuadrícula
                int x = col;
                int y = fila;

                switch (tipo) {
                    case 'B': addObject(new Muro(), x, y); break;
                    case 'A': addObject(new Agua(), x, y); break;
                    case 'M': addObject(new Monte(), x, y); break;
                    case 'C': addObject(new Camino(), x, y); break;
                    case 'H': addObject(new Caja(), x, y); break;
                    case 'D': addObject(new Baliza(), x, y); break;
                    case 'P': addObject(new Robot(), x, y); break;
                }
            }
        }
    }

    // Dibuja las líneas de la cuadrícula en el fondo
    private void drawGrid(GreenfootImage fondo) {
        for(int i = 0; i < getWidth(); i++) {
            fondo.drawLine(i * TAMANIO_CELDA, 0, i * TAMANIO_CELDA, getHeight() * TAMANIO_CELDA);
        }
        for(int i = 0; i < getHeight(); i++) {
            fondo.drawLine(0, i * TAMANIO_CELDA, getWidth() * TAMANIO_CELDA, i * TAMANIO_CELDA);
        }
    }
}