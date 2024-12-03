import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ScrollBarExample extends JFrame implements AdjustmentListener {

	public static void main(String[] args) {
		new ScrollBarExample();
	}
	
	JScrollBar scrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 50, 5, 0 ,105);
	JLabel label = new JLabel("50", JLabel.CENTER);
	
	ScrollBarExample() {
		scrollBar.addAdjustmentListener(this);
		getContentPane().add(BorderLayout.NORTH, scrollBar);
		getContentPane().add(BorderLayout.CENTER, label);
		
		setSize(50, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void adjustmentValueChanged(AdjustmentEvent ae) {
		label.setText("" + ((JScrollBar)ae.getSource()).getValue());
	}

}
