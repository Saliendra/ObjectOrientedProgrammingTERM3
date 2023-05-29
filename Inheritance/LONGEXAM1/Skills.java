package WindowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Skills extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Skills frame = new Skills();
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
	public Skills() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setBounds(100, 100, 1366, 768);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel backbtn4 = new JLabel("");
		backbtn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				MyWorks myworks = new MyWorks();
				myworks.setVisible(true);
			
			}
		});
		backbtn4.setBounds(82, 606, 217, 53);
		getContentPane().add(backbtn4);
		setLocationRelativeTo(null);
		
		JLabel skillsLbl = new JLabel("");
		skillsLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Homepage mainFr = new Homepage();
				mainFr.setVisible(true);
			}
		});
		skillsLbl.setIcon(new ImageIcon(Skills.class.getResource("/WindowBuilder/MySkills.png")));
		skillsLbl.setBounds(0, -39, 1366, 768);
		getContentPane().add(skillsLbl);
		
		JLabel backbtn5 = new JLabel("");
		backbtn5.setBounds(1068, 606, 217, 53);
		getContentPane().add(backbtn5);
		
	

		
	}

}
