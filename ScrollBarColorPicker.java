import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ScrollBarColorPicker extends JFrame implements AdjustmentListener {

	public static void main(String[] args) {
		new ScrollBarColorPicker();

	}
	
	JScrollBar scrollRed = new JScrollBar(JScrollBar.HORIZONTAL, 128, 5, 0, 260);
	JScrollBar scrollGreen = new JScrollBar(JScrollBar.HORIZONTAL, 128, 5, 0, 260);
	JScrollBar scrollBlue = new JScrollBar(JScrollBar.HORIZONTAL, 128, 5, 0, 260);
	
	JLabel color = new JLabel("   ");
	JLabel labelRed = new JLabel("R:128", JLabel.CENTER);
	JLabel labelGreen = new JLabel("G:128", JLabel.CENTER);
	JLabel labelBlue = new JLabel("B:128", JLabel.CENTER);

	public ScrollBarColorPicker() {
		getContentPane().setLayout(new GridLayout(7,1));
		
		getContentPane().add(scrollRed);
		getContentPane().add(labelRed);
		getContentPane().add(scrollGreen);
		getContentPane().add(labelGreen);
		getContentPane().add(scrollBlue);
		getContentPane().add(labelBlue);
		getContentPane().add(color);
		
		scrollRed.addAdjustmentListener(this);
		scrollGreen.addAdjustmentListener(this);
		scrollBlue.addAdjustmentListener(this);
		
		scrollRed.setOpaque(true);
		scrollGreen.setOpaque(true);
		labelBlue.setOpaque(true);
		color.setOpaque(true);
		
		scrollRed.setBackground(new Color(scrollRed.getValue(), 0, 0));
		scrollGreen.setBackground(new Color(0, scrollGreen.getValue(), 0));
		scrollBlue.setBackground(new Color(0, 0, scrollBlue.getValue()));
		color.setBackground(new Color(scrollRed.getValue(), scrollGreen.getValue(), scrollBlue.getValue()));
		
		setSize(200,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void adjustmentValueChanged(AdjustmentEvent ae) {
		JScrollBar sb =(JScrollBar)ae.getSource();
				
		if(sb == scrollRed) {

			labelRed.setText("R:" + sb.getValue());
		}
		if(sb == scrollGreen) {

			labelGreen.setText("G:" + sb.getValue());
		}
		if(sb == scrollBlue) {

			labelBlue.setText("B:" + sb.getValue());
		}
		
		scrollRed.setBackground(new Color(scrollRed.getValue(), 0, 0));
		scrollGreen.setBackground(new Color(0, scrollGreen.getValue(), 0));
		scrollBlue.setBackground(new Color(0, 0, scrollBlue.getValue()));
		color.setBackground(new Color(scrollRed.getValue(), scrollGreen.getValue(), scrollBlue.getValue()));
	}
}
