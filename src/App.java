import processing.core.PApplet;

import java.util.ArrayList;

public class App extends PApplet {

    private Button resetButton;
    private ArrayList<Carrot> carrots;

    public void setup() {
        //all setup code here
        frameRate(30);
        resetButton = new Button(this, 10, 10, "reset");
        carrots = new ArrayList<>();
    }

    public void settings() {
        //only to set the size
        size(500, 500);
    }

    public void draw(){
        // Global Draw Logic
        background(64);
        rect(mouseX, mouseY, 5, 5);
        resetButton.draw();
        for (Carrot c: carrots) {
            c.draw();
        }
    }

    public void mouseClicked(){
        if(resetButton.isClicked()){
            System.out.println("clicked");
            carrots.clear();
        }
        else{
            carrots.add(new Carrot(this, mouseX, mouseY));
        }
    }

    public static void main(String[] passedArgs) {
        String[] appletArgs = new String[] { "App" };
        PApplet.main(appletArgs);
    }
}