import processing.core.PApplet;

public interface IProcessingApp {
	void setup(PApplet parent);

	void draw(PApplet parent, float dt, float cX, float cY);

	void keyPressed(PApplet parent);

	void mousePressed(PApplet parent);
}