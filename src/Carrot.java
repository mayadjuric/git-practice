import processing.core.PApplet;

public class Carrot extends DrawableComponent{
    private PApplet p;
    private int x;
    private int y;

    public Carrot(PApplet p, int x, int y){
        this.p = p;
        this.x = x;
        this.y = y;
    }

    public void calculate(){

    }

    public void draw() {
        this.calculate();
        p.circle(x, y, 10);
    }
}
