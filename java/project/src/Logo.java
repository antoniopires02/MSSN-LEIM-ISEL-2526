import processing.core.PApplet;

public class Logo implements IProcessingApp {

	private int colorLogo = 0;

	@Override
	public void setup(PApplet parent) {
		parent.background(255);
	}

	@Override
	public void draw(PApplet parent, float dt, float cX, float cY) {
		parent.background(255);
		drawLogo(parent, cX, cY);
	}

	@Override
	public void keyPressed(PApplet parent) {
		throw new UnsupportedOperationException("keyPressed");
	}

	@Override
	public void mousePressed(PApplet parent) {
		if (parent.mouseButton == PApplet.LEFT) {
			colorLogo = parent.color(0, 0, 255);
		} else if (parent.mouseButton == PApplet.RIGHT) {
			colorLogo = parent.color(0);
		}
	}

	private void drawLogo(PApplet parent, float cX, float cY) { // Draw Volvo Logo

		// float cX = parent.width / 2f;
		// float cY = parent.height / 2f;

		parent.stroke(colorLogo);
		parent.strokeWeight(25);
		parent.noFill();
		// Circle
		parent.ellipse(cX, cY, 250, 250);
		parent.fill(colorLogo);
		// Middle rectangle
		parent.rect(cX - 100, cY - 25, 200, 50);
		// Arrow
		parent.triangle(cX + 140, cY - 135, cX + 115, cY - 135, cX + 140, cY - 110);
		parent.quad(
				cX + 100, cY - 100,
				cX + 125, cY - 125,
				cX + 130, cY - 120,
				cX + 102, cY - 90);
		// 'VOLVO' text
		parent.fill(255);
		parent.textSize(50);
		parent.textAlign(PApplet.CENTER, PApplet.CENTER);
		parent.text("VOLVO", cX, cY);
	}
}