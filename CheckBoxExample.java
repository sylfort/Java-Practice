import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxExample extends JFrame implements ActionListener {

	public static void main(String[] args) {
		new CheckBoxExample();

	}
	
	JCheckBox checkBox; 
	JButton button; 
	TextField text = new TextField(20);
	
	public CheckBoxExample() {
		getContentPane().setLayout(new FlowLayout());
		checkBox = new JCheckBox("PROMO 10%");
		checkBox.addActionListener(this);
		getContentPane().add(checkBox);
		button = new JButton("Apply Cupon");
		getContentPane().add(button);
		button.addActionListener(this);
		
		getContentPane().add(text);
		
		setVisible(true);
		setSize(200, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(checkBox.isSelected() && ae.getSource() == button) {
			text.setText("10% OFF Cupon applied!");
		}
	}

}
