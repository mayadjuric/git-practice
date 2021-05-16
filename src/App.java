import processing.core.PApplet;

public class App extends PApplet {

    private Button resetButton;

    public void setup() {
        //all setup code here
        frameRate(30);
        resetButton = new Button(this, 10, 10, "hghfjdkdkdjbvhcklsefio");
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

    }

    public void mouseClicked(){
        if(resetButton.isClicked()){
            System.out.println("clicked");
        }
    }

    public static void main(String[] passedArgs) {
        String[] appletArgs = new String[] { "App" };
        PApplet.main(appletArgs);
    }
}