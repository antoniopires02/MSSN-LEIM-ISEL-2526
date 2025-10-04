import processing.core.PApplet;

public class Cartoon implements IProcessingApp {

    private boolean flag = false;

    @Override
    public void setup(PApplet parent) {
    }

    @Override
    public void draw(PApplet parent, float dt, float cX, float cY) {
        if(flag) {
            parent.background(0);
            vampire(parent, cX, cY);
        } else {
            parent.background(255);
            normal(parent, cX, cY);
        }
    }

    private void normal(PApplet parent, float cX, float cY) {
        parent.fill(0, 255, 0);
        parent.ellipse(cX, cY, 300, 250);
        parent.fill(255);
        parent.ellipse(cX - 50, cY - 20, 70, 90);
        parent.ellipse(cX + 50, cY - 20, 70, 90);
        parent.fill(0);
        parent.ellipse(cX - 50, cY - 20, 30, 40);
        parent.ellipse(cX + 50, cY - 20, 30, 40);
        parent.fill(0);
        parent.quad(cX - 50, cY + 50, cX - 35, cY + 80, cX + 35, cY + 80, cX + 50, cY + 50);
        parent.fill(255);
        parent.rect(cX - 25, cY + 50, 20, 20);
    }

    private void vampire(PApplet parent, float cX, float cY) {
        parent.fill(150, 0, 255);
        parent.ellipse(cX, cY, 300, 250);
        parent.fill(255);
        parent.ellipse(cX - 50, cY - 20, 70, 90);
        parent.ellipse(cX + 50, cY - 20, 70, 90);
        parent.fill(255, 0, 0);
        parent.ellipse(cX - 50, cY - 20, 30, 40);
        parent.ellipse(cX + 50, cY - 20, 30, 40);
        parent.fill(0);
        parent.quad(cX - 50, cY + 50, cX - 35, cY + 80, cX + 35, cY + 80, cX + 50, cY + 50);
        parent.fill(255);
        parent.triangle(cX - 25, cY + 50, cX - 15, cY + 50, cX - 20, cY + 60);
        parent.triangle(cX + 25, cY + 50, cX + 15, cY + 50, cX + 20, cY + 60);
    }

    @Override
    public void keyPressed(PApplet parent) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mousePressed(PApplet parent) {
        if(parent.mouseButton == PApplet.LEFT) {
            flag = !flag;
        }
    }
}
