import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

// the world of worms
class WormWorld extends World {
    public int WIDTH = 200;
    public int HEIGHT = 200;
    Segment head;

    public WormWorld() {
        this.head = new Segment(this);
    }

    private WormWorld(Segment s) {
        this.head = s;
    }

    public World onTick() {
        // Implement the logic for onTick
        return this;
    }

    public World onKeyEvent(String ke) {
        return new WormWorld(this.head.move(this));
    }

    @Override
    public boolean draw(Graphics g) {
        // Implement the drawing logic
        g.clearRect(0, 0, WIDTH, HEIGHT); // Clear the canvas
        head.draw(g); // Draw the head segment
        return true;
    }

    public static void main(String[] args) {
        WormWorld world = new WormWorld();
        world.bigBang(400, 400, 0.1); // Initialize the canvas with width, height, and tick rate
    }
}

// one segment of the worm
class Segment extends Posn {
    IColor SEGCOL = new Red();
    int RADIUS = 5;

    public Segment(WormWorld w) {
        this.x = w.WIDTH / 2;
        this.y = w.HEIGHT / 2;
    }

    private Segment(Segment s) {
        this.x = s.x;
        this.y = s.y;
    }

    public Segment move(Segment pre) {
        return new Segment(pre);
    }

    public Segment restart(WormWorld w) {
        return new Segment(w);
    }

    public void draw(Graphics g) {
        g.setColor(SEGCOL.getColor());
        g.fillOval(x - RADIUS, y - RADIUS, 2 * RADIUS, 2 * RADIUS);
    }
}

// Assuming Posn and IColor are defined somewhere
class Posn {
    int x;
    int y;
}

interface IColor {
    java.awt.Color getColor();
}

class Red implements IColor {
    public java.awt.Color getColor() {
        return java.awt.Color.RED;
    }
}
