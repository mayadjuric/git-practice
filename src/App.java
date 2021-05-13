import processing.core.PApplet;

public class App extends PApplet {
    public void setup() {
        frameRate(30);
    }

    public void settings() {
        size(500, 500);
    }

    public void draw(){
        // Global Draw Logic
        background(64);
        rectMode(CENTER);
        rect(mouseX, mouseY, 5, 5);


        if (mousePressed) {
            // ... example of handling mouse clicks
        }

        if (keyPressed) {
            // example of handling keypresses
            if (key == 'a'){
                // ...
            } else if (key == 'b'){
                // ...
            }
        }
    }

    public static void main(String[] passedArgs) {
        String[] appletArgs = new String[] { "App" };
        PApplet.main(appletArgs);
    }
}