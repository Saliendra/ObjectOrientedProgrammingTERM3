package Pictures;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ResourceManagementPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResourceManagementPage frame = new ResourceManagementPage();
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
	public ResourceManagementPage() {
		setResizable(false);
		setTitle("Resource Management");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1068, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Preview = new JPanel();
		Preview.setBackground(new Color (0x9F8B5A));
		Preview.setBounds(0, 375, 253, 153);
		contentPane.add(Preview);
		Preview.setLayout(null);
		
		JLabel roomPreview = new JLabel("Room Preview");
		roomPreview.setHorizontalAlignment(SwingConstants.CENTER);
		roomPreview.setFont(new Font("Century Gothic", Font.BOLD, 14));
		roomPreview.setBounds(0, 0, 253, 37);
		Preview.add(roomPreview);
		
		JPanel r410 = new JPanel();
		r410.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				r410.setBackground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				r410.setBackground(new Color(0x9F8B5A));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Rm410Page r410 = new Rm410Page();
				r410.setVisible(true);
			}
		});
		r410.setBackground(new Color (0x9F8B5A));
		r410.setBounds(0, 56, 253, 49);
		Preview.add(r410);
		r410.setLayout(null);
		
		JLabel r410btn = new JLabel("ROOM 410");
		r410btn.setHorizontalAlignment(SwingConstants.CENTER);
		r410btn.setFont(new Font("Century Gothic", Font.BOLD, 12));
		r410btn.setBounds(80, 20, 87, 14);
		r410.add(r410btn);
		
		JPanel r413 = new JPanel();
		r413.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				r413.setBackground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				r413.setBackground(new Color(0x9F8B5A));
			}
			public void mouseClicked(MouseEvent e) {
				Rm413Page r413 = new Rm413Page();
				r413.setVisible(true);
			}
		});
		r413.setBackground(new Color (0x9F8B5A));
		r413.setBounds(0, 104, 253, 49);
		Preview.add(r413);
		r413.setLayout(null);
		
		JLabel r413btn = new JLabel("ROOM 413");
		r413btn.setHorizontalAlignment(SwingConstants.CENTER);
		r413btn.setFont(new Font("Century Gothic", Font.BOLD, 12));
		r413btn.setBounds(79, 17, 87, 14);
		r413.add(r413btn);
		
		JPanel Backbutton1 = new JPanel();
		Backbutton1.setBackground(new Color (0x9F8B5A));
		Backbutton1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				StudentMenu student= new StudentMenu();
				student.setVisible(true);
						
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Backbutton1.setBackground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Backbutton1.setBackground(new Color(0x9F8B5A));
			}
		});
		Backbutton1.setBounds(0, 556, 253, 35);
		contentPane.add(Backbutton1);
		Backbutton1.setLayout(null);
		
		JLabel Backbtn1 = new JLabel("Back");
		Backbtn1.setFont(new Font("Century Gothic", Font.BOLD, 12));
		Backbtn1.setBounds(101, 11, 46, 14);
		Backbutton1.add(Backbtn1);
		
		JLabel ResourcePage = new JLabel("");
		ResourcePage.setIcon(new ImageIcon(ResourceManagementPage.class.getResource("/Pictures/ResourceScreen.png")));
		ResourcePage.setBounds(0, 0, 1050, 591);
		contentPane.add(ResourcePage);
	
	}

}
