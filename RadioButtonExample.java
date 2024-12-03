import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonExample extends JFrame implements ActionListener {

	public static void main(String[] args) {
		new RadioButtonExample();

	}
	
	JRadioButton button1;
	JRadioButton button2;
	JRadioButton button3;
	
	public RadioButtonExample() {
		getContentPane().setLayout(new FlowLayout());
		button1 = new JRadioButton("button1", true);
		button2 = new JRadioButton("button2");
		button3 = new JRadioButton("button3");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(button1);
		bg.add(button2);
		bg.add(button3);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		getContentPane().add(button1);
		getContentPane().add(button2);
		getContentPane().add(button3);
		
		setSize(200,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(button1.isSelected()) {
			System.out.println("button1");
		}
		if(button2.isSelected()) {
			System.out.println("button2");
		}
		if(button3.isSelected()) {
			System.out.println("button3");
		}
	}

}
