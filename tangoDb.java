import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.ArrayList;


public class tangoDb extends JFrame implements ActionListener {
	
	public static void main(String[] args) {
		new tangoDb();		
	}
	
	static final String URL = "jdbc:mysql://localhost:3306/tango";
	static final String USER = "root";
	static final String PASS = "";
	static final String SQL = "SELECT * FROM words";
	
	static String space = "        ";
	static JTextArea textArea = new JTextArea(5, 20);
	JTextField textFieldTango = new JTextField(20);
	JTextField textFieldFurigana = new JTextField(20);
	JTextField textFieldEnglish = new JTextField(20);
	
	JLabel labelTango = new JLabel("単語", JLabel.CENTER);
	JLabel labelFurigana = new JLabel("ふりがな", JLabel.CENTER);
	JLabel labelEnglish = new JLabel("英語", JLabel.CENTER);
	
	JButton button1;
	
	public tangoDb() {
		setTitle("Tango Client");
		
//		getContentPane().setLayout(new GridLayout(2,1));
		JScrollPane scrollPane = new JScrollPane(textArea);
		getContentPane().add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 4));
		getContentPane().add(BorderLayout.SOUTH, panel);

		button1 = new JButton("入力");
		panel.add(textFieldTango);
		panel.add(textFieldFurigana);
		panel.add(textFieldEnglish);
		panel.add(button1);
		panel.add(labelTango);
		panel.add(labelFurigana);
		panel.add(labelEnglish);
		
		button1.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 400);
		setVisible(true);
		textArea.append("id" + space +  "単語" + space + "ふりがな" + space + "英語" + space + "\n");
		printToTextArea();
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		if (ae.getSource() == button1) {
			sendWord(textFieldTango.getText(), textFieldFurigana.getText(), textFieldEnglish.getText());
			System.out.println("ボタン１が押されました");
			printToTextArea();
		}
		
	}
	
	public static void sendWord(String tango, String furigana, String english) {
		final String INSERT = "INSERT INTO `words`(`tango`, `furigana`, `english`) VALUES (`";
		
		final String SQL = (INSERT + "`" + tango + "`, `" + furigana + "`, `" + english + "`;");
		
			try(
					Connection cnct = DriverManager.getConnection(URL, USER, PASS);
					Statement stmt = cnct.createStatement();) {
				
				stmt.execute(SQL);
				System.out.println("処理をしました");
				
			}catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
	public static void printToTextArea() {
		ArrayList<tangoWord> tangoList = tangoQuery();
		for (tangoWord tangoWord : tangoList) {
			textArea.append(tangoWord.id +space + tangoWord.tango + space + tangoWord.furigana + space + tangoWord.english);
		}
	}
	
	public static ArrayList<tangoWord> tangoQuery() {
		
		ArrayList<tangoWord> wordList = new ArrayList<>();
		
		try(	Connection conn = DriverManager.getConnection(URL, USER, PASS);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(SQL);) {

			while (rs.next()) {	
				tangoWord word = new tangoWord(rs.getInt("id"), rs.getString("tango"), rs.getString("furigana"),
                        rs.getString("english"), rs.getDate("created_date"));
				
				wordList.add(word);
				
				System.out.println(
						"単語：　" + rs.getString("tango"));
				System.out.println(
						"ふりがな：　" + rs.getString("furigana"));
				System.out.println(
						"英語：　" + rs.getString("english"));
				System.out.println("");
			}
		}catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("処理が完了しました");
		}
		return wordList;
	}

}
