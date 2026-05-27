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
        ". . . . . . . . . . . . . B B B . . . .",
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
    private int balizasTotales = 0;
    public MiMundo()
    {
        // Mundo
        super(30, 20, TAMANIO_CELDA);

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
        balizasTotales = getObjects(Baliza.class).size();
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
        Baliza baliza = new Baliza();
        addObject(baliza,1,2);
        Baliza baliza2 = new Baliza();
        addObject(baliza2,10,1);
        Baliza baliza3 = new Baliza();
        addObject(baliza3,14,13);
        Baliza baliza4 = new Baliza();
        addObject(baliza4,18,14);
        Baliza baliza5 = new Baliza();
        addObject(baliza5,9,10);
        Baliza baliza6 = new Baliza();
        addObject(baliza6,1,9);
        Baliza baliza7 = new Baliza();
        addObject(baliza7,19,8);
        Baliza baliza8 = new Baliza();
        addObject(baliza8,4,0);
        baliza.setLocation(1,2);
        Caja caja = new Caja();
        addObject(caja,2,3);
        baliza8.setLocation(7,2);
        Camino camino = new Camino();
        addObject(camino,20,6);
        Camino camino2 = new Camino();
        addObject(camino2,21,6);
        Camino camino3 = new Camino();
        addObject(camino3,22,6);
        Camino camino4 = new Camino();
        addObject(camino4,22,7);
        Camino camino5 = new Camino();
        addObject(camino5,22,8);
        Camino camino6 = new Camino();
        addObject(camino6,22,9);
        Camino camino7 = new Camino();
        addObject(camino7,23,9);
        Camino camino8 = new Camino();
        addObject(camino8,24,9);
        Camino camino9 = new Camino();
        addObject(camino9,26,9);
        Camino camino10 = new Camino();
        addObject(camino10,27,9);
        Camino camino11 = new Camino();
        addObject(camino11,28,9);
        Camino camino12 = new Camino();
        addObject(camino12,29,9);
        Camino camino13 = new Camino();
        addObject(camino13,25,9);
        Muro muro = new Muro();
        addObject(muro,8,16);
        Muro muro2 = new Muro();
        addObject(muro2,9,16);
        Muro muro3 = new Muro();
        addObject(muro3,10,16);
        muro3.setLocation(11,16);
        Muro muro4 = new Muro();
        addObject(muro4,11,16);
        Muro muro5 = new Muro();
        addObject(muro5,12,16);
        Baliza baliza9 = new Baliza();
        addObject(baliza9,22,3);
        Baliza baliza10 = new Baliza();
        addObject(baliza10,26,6);
        Baliza baliza11 = new Baliza();
        addObject(baliza11,26,2);
        Baliza baliza12 = new Baliza();
        addObject(baliza12,23,11);
        Baliza baliza13 = new Baliza();
        addObject(baliza13,27,15);
        Baliza baliza14 = new Baliza();
        addObject(baliza14,22,16);
        Baliza baliza15 = new Baliza();
        addObject(baliza15,16,17);
        Baliza baliza16 = new Baliza();
        addObject(baliza16,5,18);
        Baliza baliza17 = new Baliza();
        addObject(baliza17,0,16);
        Baliza baliza18 = new Baliza();
        addObject(baliza18,2,17);
        enemigo.setLocation(17,4);
        enemigo.setLocation(18,5);
        enemigo.setLocation(19,4);
        removeObject(enemigo);
        Muro muro6 = new Muro();
        addObject(muro6,10,16);
        Monte monte = new Monte();
        addObject(monte,1,18);
        Monte monte2 = new Monte();
        addObject(monte2,1,19);
        Monte monte3 = new Monte();
        addObject(monte3,0,18);
        Agua agua = new Agua();
        addObject(agua,0,19);
        Caja caja2 = new Caja();
        addObject(caja2,21,1);
        Caja caja3 = new Caja();
        addObject(caja3,28,0);
        Caja caja4 = new Caja();
        addObject(caja4,29,0);
        Caja caja5 = new Caja();
        addObject(caja5,29,1);
        Caja caja6 = new Caja();
        addObject(caja6,0,1);
        Caja caja7 = new Caja();
        addObject(caja7,1,1);
        Caja caja8 = new Caja();
        addObject(caja8,2,1);
        removeObject(caja8);
        removeObject(caja7);
        removeObject(caja6);
        Camino camino14 = new Camino();
        addObject(camino14,5,13);
        Camino camino15 = new Camino();
        addObject(camino15,5,14);
        Camino camino16 = new Camino();
        addObject(camino16,5,15);
        Camino camino17 = new Camino();
        addObject(camino17,5,16);
        Camino camino18 = new Camino();
        addObject(camino18,5,17);
        Camino camino19 = new Camino();
        addObject(camino19,6,17);
        Camino camino20 = new Camino();
        addObject(camino20,6,18);
        Camino camino21 = new Camino();
        addObject(camino21,6,19);
        addObject(caja6,10,17);
        addObject(caja7,11,15);
        Muro muro7 = new Muro();
        addObject(muro7,16,18);
        Muro muro8 = new Muro();
        addObject(muro8,16,19);
        Muro muro9 = new Muro();
        addObject(muro9,17,19);
        muro9.setLocation(17,18);
        Muro muro10 = new Muro();
        addObject(muro10,17,18);
        Muro muro11 = new Muro();
        addObject(muro11,26,10);
        Muro muro12 = new Muro();
        addObject(muro12,26,11);
        Muro muro13 = new Muro();
        addObject(muro13,26,12);
        Muro muro14 = new Muro();
        addObject(muro14,27,12);
        Muro muro15 = new Muro();
        addObject(muro15,28,12);
        Muro muro16 = new Muro();
        addObject(muro16,29,12);
        Muro muro17 = new Muro();
        addObject(muro17,27,10);
        Muro muro18 = new Muro();
        addObject(muro18,28,10);
        Muro muro19 = new Muro();
        addObject(muro19,29,10);
        Agua agua2 = new Agua();
        addObject(agua2,27,11);
        Agua agua3 = new Agua();
        addObject(agua3,28,11);
        Agua agua4 = new Agua();
        addObject(agua4,29,11);
        agua2.setLocation(27,11);
        Muro muro20 = new Muro();
        addObject(muro20,27,11);
        removeObject(muro20);
        agua4.setLocation(29,11);
        addObject(muro20,29,11);
        Muro muro21 = new Muro();
        addObject(muro21,29,2);
        Muro muro22 = new Muro();
        addObject(muro22,29,3);
        Monte monte4 = new Monte();
        addObject(monte4,27,13);
        Monte monte5 = new Monte();
        addObject(monte5,29,18);
        Monte monte6 = new Monte();
        addObject(monte6,20,19);
        Monte monte7 = new Monte();
        addObject(monte7,11,17);
        Monte monte8 = new Monte();
        addObject(monte8,10,15);
        Monte monte9 = new Monte();
        addObject(monte9,21,0);
        Monte monte10 = new Monte();
        addObject(monte10,22,0);
        addObject(enemigo,23,4);
        Enemigo enemigo2 = new Enemigo();
        addObject(enemigo2,22,15);
        Enemigo enemigo3 = new Enemigo();
        addObject(enemigo3,3,16);
        Enemigo enemigo4 = new Enemigo();
        addObject(enemigo4,12,10);
        Enemigo enemigo5 = new Enemigo();
        addObject(enemigo5,17,3);
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

    public void gameOver()
    {
        musica.stop();
        Greenfoot.setWorld(new PantallaGameOver());
    }

    public void act()
    {
        verificarVictoria();
        mostrarContador();
    }

    private void verificarVictoria()
    {
        // Contar balizas en el mundo
        int balizasRestantes = getObjects(Baliza.class).size();
        
        if (balizasRestantes == 0)
        {
            musica.stop();
            Greenfoot.setWorld(new PantallaVictoria());
        }
    }

private void mostrarContador()
{
    int balizasRestantes = getObjects(Baliza.class).size();
    int balizasRecolectadas = balizasTotales - balizasRestantes;
    
    GreenfootImage fondo = getBackground();
    
    // Limpiar la zona superior
    fondo.setColor(new Color(230, 153, 51));
    fondo.fillRect(0, 0, getWidth() * 32, 50);
    
    // Redibujar la cuadrícula en la zona superior
    fondo.setColor(new Color(210, 130, 30));
    for (int i = 0; i < getWidth(); i++)
    {
        fondo.drawLine(
            i * TAMANIO_CELDA,
            0,
            i * TAMANIO_CELDA,
            50
        );
    }
    
    // Dibujar texto
    fondo.setColor(Color.BLACK);
    fondo.setFont(new Font("Arial", true, false, 20));
    fondo.drawString("Balizas: " + balizasRecolectadas + " / " + balizasTotales, 20, 35);
}
}