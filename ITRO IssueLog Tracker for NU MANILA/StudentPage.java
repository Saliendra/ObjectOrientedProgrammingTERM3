package defects;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.CardLayout;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class StudentPage extends JFrame {

	public JPanel AboutUsPanel;
	public JPanel contentPane;
	public JLayeredPane layeredPane;
	public JPanel SideBar;
	public JPanel HomePanel;
	public JPanel ResourcePanel;
	public JPanel IssuePanel;
	public JPanel FaqPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPage frame = new AdminPage();
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
	public StudentPage() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		SideBar = new JPanel();
		SideBar.setBackground(new Color(0, 64, 128));
		SideBar.setBounds(10, 11, 95, 540);
		contentPane.add(SideBar);
		SideBar.setLayout(null);
		
		JButton IssueLogbtn = new JButton("");
		IssueLogbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		IssueLogbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				layeredPane.removeAll();
				layeredPane.add(IssuePanel);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		
		IssueLogbtn.setIcon(new ImageIcon(AdminPage.class.getResource("/defects/IssueLogsLogo.png")));
		IssueLogbtn.setBounds(10, 170, 72, 62);
		SideBar.add(IssueLogbtn);
		
		JButton ResourceManagementBtn = new JButton("");
		ResourceManagementBtn.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				layeredPane.removeAll();
				layeredPane.add(ResourcePanel);
				layeredPane.repaint();
				layeredPane.revalidate();	
			}
		});
		ResourceManagementBtn.setIcon(new ImageIcon(AdminPage.class.getResource("/defects/ResourceManagement.png")));
		ResourceManagementBtn.setBounds(10, 97, 72, 62);
		SideBar.add(ResourceManagementBtn);
		
		JButton FaqBtn = new JButton("");
		FaqBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				layeredPane.removeAll();
				layeredPane.add(FaqPanel);
				layeredPane.repaint();
				layeredPane.revalidate();	
			}
		});
		FaqBtn.setIcon(new ImageIcon(AdminPage.class.getResource("/defects/FAQ'sLogo.png")));
		FaqBtn.setBounds(10, 243, 72, 62);
		SideBar.add(FaqBtn);
		
		JButton outBtn = new JButton("Sign Out");
		outBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Do you want to sign out?", "Sign out", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
                    // Perform sign-out actions here
                    JOptionPane.showMessageDialog(null, "You have been signed out successfully.");
                    dispose();
                    Login log = new Login();
                    log.setVisible(true);
				}
			}
		});
		outBtn.setFont(new Font("Tahoma", Font.PLAIN, 9));
		outBtn.setBounds(10, 506, 75, 23);
		SideBar.add(outBtn);
		
		JLabel Menu = new JLabel("Menu Tab");
		Menu.setForeground(new Color(255, 255, 255));
		Menu.setHorizontalAlignment(SwingConstants.CENTER);
		Menu.setBackground(new Color(255, 255, 255));
		Menu.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		Menu.setBounds(12, 26, 70, 23);
		SideBar.add(Menu);
		
		JButton HomeBtn = new JButton("");
		HomeBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				layeredPane.removeAll();
				layeredPane.add(HomePanel);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		HomeBtn.setIcon(new ImageIcon(AdminPage.class.getResource("/defects/Menuu.png")));
		HomeBtn.setBounds(10, 341, 72, 62);
		SideBar.add(HomeBtn);
		
		JButton infoBtn = new JButton("");
		infoBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				layeredPane.removeAll();
				layeredPane.add(AboutUsPanel);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		infoBtn.setIcon(new ImageIcon(AdminPage.class.getResource("/defects/infoBtn.png")));
		infoBtn.setBounds(10, 414, 72, 62);
		SideBar.add(infoBtn);
		
		//Creates the different panels 
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(115, 11, 809, 540);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
				
		//============================================================
		//Home StartUp Panel
				
		HomePanel = new JPanel();
		layeredPane.add(HomePanel, "name_108935504747100");
		HomePanel.setLayout(null);
				
		JLabel homeScreen = new JLabel("");
		homeScreen.setIcon(new ImageIcon(AdminPage.class.getResource("/defects/WelcomePage.png")));
		homeScreen.setHorizontalAlignment(SwingConstants.CENTER);
		homeScreen.setBounds(0, 0, 809, 540);
		HomePanel.add(homeScreen);
				
		//============================================================
		//Resource Management Panel
				
		ResourcePanel = new JPanel();
		ResourcePanel.setBackground(new Color(255, 255, 128));
		layeredPane.add(ResourcePanel, "name_109098461977500");
		ResourcePanel.setLayout(null);
				
		JLabel lblNewLabel = new JLabel("Resource Management");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 809, 540);
		ResourcePanel.add(lblNewLabel);
				
		//==============================================================			
		//IssueLogs Panel
				
		IssuePanel = new JPanel();
		IssuePanel.setBackground(new Color(255, 255, 128));
		layeredPane.add(IssuePanel, "name_109231702185200");
		IssuePanel.setLayout(null);
			
		JLabel IssueLogsScreen = new JLabel("ISSUE LOGS");							
		IssueLogsScreen.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		IssueLogsScreen.setHorizontalAlignment(SwingConstants.CENTER);
		IssueLogsScreen.setBounds(0, 0, 809, 540);
		IssuePanel.add(IssueLogsScreen);
			
		//===============================================================
		//FAQ Panel		
		
		FaqPanel = new JPanel();
		FaqPanel.setBackground(new Color(255, 255, 128));
		layeredPane.add(FaqPanel, "name_110462457463500");			
		FaqPanel.setLayout(null);
								JLabel lblNewLabel_1 = new JLabel("FAQ PANEL");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 0, 809, 540);
		FaqPanel.add(lblNewLabel_1);
								
		//================================================================
		//Information about the Creator Panel
			
		AboutUsPanel = new JPanel();
		layeredPane.add(AboutUsPanel, "name_253381528934800");				
		AboutUsPanel.setLayout(null);
			
		JLabel AboutUsScreen = new JLabel("");
		AboutUsScreen.setIcon(new ImageIcon(AdminPage.class.getResource("/defects/AboutUsPage.png")));
		AboutUsScreen.setBounds(0, 0, 810, 540);
		AboutUsPanel.add(AboutUsScreen);
		
			
	}
}
