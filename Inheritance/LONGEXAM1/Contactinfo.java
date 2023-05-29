package WindowBuilder;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Contactinfo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contactinfo frame2 = new Contactinfo();
					frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Contactinfo() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setBounds(100, 100, 1366, 768);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel backbtn2 = new JLabel("");
		backbtn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Homepage mainFr = new Homepage();
				mainFr.setVisible(true);
			
			}
		});
		backbtn2.setBounds(83, 600, 218, 51);
		contentPane.add(backbtn2);
		
		JLabel contactLbl = new JLabel("");
		contactLbl.setIcon(new ImageIcon(Contactinfo.class.getResource("/WindowBuilder/Contact.png")));
		contactLbl.setHorizontalAlignment(SwingConstants.LEFT);
		contactLbl.setBounds(0, -39, 1366, 768);
		contentPane.add(contactLbl);
		
		
	}

}
