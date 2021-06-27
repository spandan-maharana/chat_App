import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window2 extends JFrame {
	static String username2;
//	private JTextField display2;
//	private JTextField text2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window2 frame = new Window2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Window2() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 393, 461);
		getContentPane().setLayout(null);
		
		 send2 = new JButton("SEND");
		send2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = text2.getText();
				if(s.equals("")) {
					return;
				}
				display2.append(username2 + ":" + s + "\n");
				Window1.sendText();
				text2.setText("");
			}
		});
		send2.setBounds(278, 376, 89, 35);
		getContentPane().add(send2);
		
		 label2 = new JLabel("Chat Window for: "+username2);
		label2.setBounds(10, 11, 171, 35);
		getContentPane().add(label2);
		
		JButton clear2 = new JButton("CLEAR");
		clear2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display2.setText("");
			}
		});
		clear2.setBounds(278, 17, 89, 23);
		getContentPane().add(clear2);
		
		 display2 = new JTextArea();
		display2.setBounds(10, 57, 357, 283);
		getContentPane().add(display2);
		
		 text2 = new JTextArea();
		text2.setBounds(10, 351, 258, 60);
		getContentPane().add(text2);
	}

	
	
	public static void sendText() {
		String s=Window1.text1.getText();
		if(s.equals("")) {
			return;
		}
		display2.append(Window1.username1 + ":" +s+ "\n");
	}
	private javax.swing.JLabel label2;
	private javax.swing.JButton send2;
	private static javax.swing.JTextArea display2;
	public static javax.swing.JTextArea text2;
	
	

}
