import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;

public class Graphics2DExample extends JFrame {
    public static void main(String[] args) {
        new Graphics2DExample();
    }

    Graphics2DExample() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(new MyPanel2());
        setSize(600, 600);
        setVisible(true);
    }

    class MyPanel2 extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g); 
            Graphics2D g2d = (Graphics2D) g; 

            int N = 20;
            int r = 180;
            int[] arrayX = new int[N];
            int[] arrayY = new int[N];
            String[] arrayXString = new String[N];

            for (int i = 0; i < N; i++) {
                arrayX[i] = (int) (250 + r * Math.cos(2 * Math.PI * i / N));
                arrayY[i] = (int) (250 + r * Math.sin(2 * Math.PI * i / N));
                arrayXString[i] = String.valueOf(arrayX[i]) + ", " + String.valueOf(arrayY[i]);
            }

            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    g2d.drawLine(arrayX[i], arrayY[i], arrayX[j], arrayY[j]);
                }
            }

            for (int i = 0; i < N; i++) {
                r = 210;
                int x = (int) (250 + r * Math.cos(2 * Math.PI * i / N));
                int y = (int) (250 + r * Math.sin(2 * Math.PI * i / N));
                int stringWidth = g2d.getFontMetrics().stringWidth(arrayXString[i]);
                int stringHeight = g2d.getFontMetrics().getHeight();
                g2d.translate(x - stringWidth / 2, y + stringHeight / 3); 
                g2d.drawString(arrayXString[i], 0, 0); 
                g2d.translate(-(x - stringWidth / 2), -(y + stringHeight / 3));
            }
        }
    }
}
