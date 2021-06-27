import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window1 extends JFrame {
	static String username1;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window1 frame = new Window1();
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
	public Window1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 393, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 display1 = new JTextArea();
		display1.setBounds(10, 53, 354, 286);
		contentPane.add(display1);
		
		text1 = new JTextArea();
		text1.setBounds(12, 350, 253, 61);
		contentPane.add(text1);
		
		 send1 = new JButton("SEND");
		send1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = text1.getText();
				if(s.equals("")) {
					return;
				}
				display1.append(username1 + ":" + s + "\n");
				Window2.sendText();
				text1.setText("");
			}
		});
		send1.setBounds(275, 382, 89, 29);
		contentPane.add(send1);
		
		 label1 = new JLabel("Chat Window for: "+username1);
		label1.setBounds(10, 17, 152, 29);
		contentPane.add(label1);
		
		JButton clear = new JButton("CLEAR");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display1.setText("");
			}
		});
		clear.setBounds(275, 16, 89, 26);
		contentPane.add(clear);
	}
	
	public static void sendText() {
		String s=Window2.text2.getText();
		if(s.equals("")) {
			return;
		}
		display1.append(Window2.username2 + ":" +s+ "\n");
	}
	private javax.swing.JLabel label1;
	private static javax.swing.JTextArea display1;
	private javax.swing.JButton send1;
	public static javax.swing.JTextArea text1;
	

}
