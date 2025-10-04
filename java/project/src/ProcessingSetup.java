import processing.core.PApplet;

public class ProcessingSetup extends PApplet {
	private static IProcessingApp app;
	private float lastUpdateTime;
	//private float timer = 0;
	private float cX;
	private float cY;
	private float x;
	private float y;
	private float easing = 0.05f;

	@Override
	public void settings() {
		size(500, 500);
	}

	@Override
	public void setup() { // Executado uma vez no início
		app.setup(this);
		lastUpdateTime = millis();
		cX = width / 2f;
		cY = height / 2f;
	}

	@Override
	public void draw() {
		float now = millis();
		float dt = (now - lastUpdateTime) / 1000f;
		lastUpdateTime = now;
		app.draw(this, dt, cX, cY);

		// Instancia em posições aleatórias a cada 2 segundos
		/*
		 * timer += dt;
		 * if (timer >= 2f) {
		 * float randomX = random(width);
		 * float randomY = random(height);
		 * app.draw(this, dt, randomX, randomY);
		 * timer = 0;
		 * }
		 */

		// Easing
		float targetX = mouseX;
		float dx = targetX - x;
		x += dx * easing;

		float targetY = mouseY;
		float dy = targetY - y;
		y += dy * easing;

		app.draw(this, dt, x, y);
		
	}

	@Override
	public void mousePressed() {
		app.mousePressed(this);
	}

	@Override
	public void keyPressed() {
		app.keyPressed(this);
	}

	public static void main(String[] args) {
		//app = new Logo();
		app = new Cartoon();
		PApplet.main(ProcessingSetup.class);
	}
}
