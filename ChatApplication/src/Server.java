import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Server extends JFrame {

	private JPanel contentPane;
	private JTextField name1;
	private JTextField name2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Server frame = new Server();
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
	public Server() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 251);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("1st Username");
		lblNewLabel.setBounds(192, 27, 106, 14);
		contentPane.add(lblNewLabel);
		
		name1 = new JTextField();
		name1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createRoom();
			}
		});
		name1.setBounds(103, 52, 259, 29);
		contentPane.add(name1);
		name1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("2nd Username");
		lblNewLabel_1.setBounds(192, 92, 106, 14);
		contentPane.add(lblNewLabel_1);
		
		name2 = new JTextField();
		name2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createRoom();
			}
		});
		name2.setBounds(103, 108, 259, 29);
		contentPane.add(name2);
		name2.setColumns(10);
		
		JButton btnNewButton = new JButton("JOIN ROOM");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createRoom();
			}
		});
		btnNewButton.setBounds(179, 159, 106, 23);
		contentPane.add(btnNewButton);
	}

	public void createRoom() {
		String p1,p2;
		p1=name1.getText();
		p2=name2.getText();
		if(p1.equals("")||p2.equals("")) {
			JOptionPane.showMessageDialog(null, "Please Enter a Valid Username");
			return;
		}
		Window1.username1 = name1.getText();
		Window2.username2 = name2.getText();
		chatRoom.createRoom();
	}
}
