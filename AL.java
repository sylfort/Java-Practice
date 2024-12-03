import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AL extends JFrame implements ActionListener {

	public static void main(String[] args) {
		// TODO make a button that displays how many times it was clicked
		new AL();

	}
	
	JButton button1;
	JButton button2;
	TextField text = new TextField(20);
	int counter = 0;
	
	AL(){
		button1 = new JButton("button");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new GridLayout(2, 1));
		
		button1.addActionListener(this);
		getContentPane().add(button1);
		
		add(text);
		
		setSize(200, 200);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == button1) {
			counter++;
			System.out.println("ボタン１が押されました");
			text.setText("Button Clicked " + counter + " times");
		}
}

}
