package WindowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Resume extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resume frame = new Resume();
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
	public Resume() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setBounds(100, 100, 1366, 768);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel backMySkillsbtn = new JLabel("");
		backMySkillsbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Skills skl = new Skills();
				skl.setVisible(true);
			}
		});
		backMySkillsbtn.setBounds(84, 603, 212, 47);
		contentPane.add(backMySkillsbtn);
		
		JLabel Homebtn4 = new JLabel("");
		Homebtn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				MyWorks works = new MyWorks();
				works.setVisible(true);
			}
		});
		Homebtn4.setBounds(1064, 603, 223, 47);
		contentPane.add(Homebtn4);
		
		JLabel Resumelbl = new JLabel("");
		Resumelbl.setIcon(new ImageIcon(Resume.class.getResource("/WindowBuilder/Resume.png")));
		Resumelbl.setBounds(0, -39, 1366, 768);
		contentPane.add(Resumelbl);
		
		
	}

}
