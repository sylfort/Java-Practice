import javax.swing.*;
import java.awt.event.*;

public class MenuExample extends JFrame implements ActionListener {

	public static void main(String[] args) {
		new MenuExample();

	}
	
	JMenuBar menuBar = new JMenuBar();
	JMenu menuFile = new JMenu("ファイル");
	JMenuItem openItem = new JMenuItem("開く");
	JMenuItem closeItem = new JMenuItem("終了");
	
	public MenuExample() {
		
		
		menuFile.add(openItem);
		menuFile.add(closeItem);
		menuBar.add(menuFile);
		setJMenuBar(menuBar);
		
		openItem.addActionListener(this);
		closeItem.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == openItem) {
			System.out.println("open item");
		}
		if(ae.getSource() == closeItem) {
			System.exit(0);
		}
	}

}
