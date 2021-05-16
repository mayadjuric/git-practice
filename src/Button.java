import processing.core.PApplet;

public class Button extends DrawableComponent{
//ToDo: make button text vertically centered

    private PApplet p;
    private int x;
    private int y;
    private String buttonText;
    private float width;
    private float height;
    private int padding = 10;

    public Button(PApplet p, int x, int y, String buttonText){
        this.p = p;
        this.x = x;
        this.y = y;
        this.buttonText = buttonText;
    }

    public void calculate(){
        width = p.textWidth(buttonText)  + 2 * padding;
        height = p.textAscent() + p.textDescent();
    }

    public void draw(){
        this.calculate();
        p.stroke(0);
        p.fill(255);
        p.rect(x, y, width, height);
        p.fill(0);
        p.text(buttonText, x + padding, y + height/2);
    }

    public boolean isClicked(){
        return p.mouseX >= x && p.mouseX <= x + width && p.mouseY >= y && p.mouseY <= y + height;
    }


}
