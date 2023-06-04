package defects;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField userText;
	private JTextField passText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	
	
	public Login() {
		setTitle("Computer Defect Tracker and Record System for NU-Manila ComLabs");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1015, 600);
		this.setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		userText = new JTextField();
		userText.setBackground(Color.WHITE);
		userText.setBounds(60, 371, 154, 20);
		contentPane.add(userText);
		userText.setColumns(10);
		
		JLabel userLbl = new JLabel("USER");
		userLbl.setForeground(new Color(255, 215, 0));
		userLbl.setFont(new Font("Century Gothic", Font.BOLD, 13));
		userLbl.setBounds(60, 356, 46, 14);
		contentPane.add(userLbl);
			
		passText = new JPasswordField();
		passText.setColumns(10);
		passText.setBackground(Color.WHITE);
		passText.setBounds(60, 423, 154, 20);
		contentPane.add(passText);	
	
		JLabel passwordLbl = new JLabel("PASSWORD");
		passwordLbl.setForeground(new Color(255, 215, 0));
		passwordLbl.setFont(new Font("Century Gothic", Font.BOLD, 13));
		passwordLbl.setBounds(60, 409, 100, 14);
		contentPane.add(passwordLbl);	
		
		JButton loginBtn = new JButton("Login");
		loginBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String user = userText.getText();
				String password = passText.getText();
				
				if (user.equals("admin") && password.equals("admin123")) {
					dispose();
					JOptionPane.showMessageDialog(loginBtn, "Login Succesfully");
					AdminPage admin = new AdminPage();
					admin.setVisible(true);
				
				}
				else if(user.equals("student") && password.equals("123")){
					dispose();
					JOptionPane.showMessageDialog(loginBtn, "Login Succesfully");
					StudentPage student = new StudentPage();
					student.setVisible(true);
				
				}
			
				else {
					JOptionPane.showMessageDialog(loginBtn, "Please enter a valid username and password");
				}
			}
		});
		loginBtn.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		loginBtn.setBounds(96, 454, 89, 23);
		contentPane.add(loginBtn);
		
		JLabel loginpg = new JLabel("");
	
		loginpg.setIcon(new ImageIcon(Login.class.getResource("/defects/LoginPage.png")));
		loginpg.setBounds(0, -70, 1005, 700);
		contentPane.add(loginpg);
	
		
		
	}
}
