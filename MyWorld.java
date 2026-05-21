import greenfoot.*;

public class MyWorld extends World {

    public MyWorld() {
        super(600, 400, 1);
        addObject(new Enemigo(), 300, 200);
    }
}
