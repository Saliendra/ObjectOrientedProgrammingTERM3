package WindowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Homepage {

	public JFrame mainFr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage window = new Homepage();
					window.mainFr.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Homepage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFr = new JFrame();
		mainFr.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		mainFr.setResizable(false);
		mainFr.setTitle("ACE SALIENDRA - INF224 ");
		mainFr.setBackground(new Color(255, 255, 255));
		mainFr.setBounds(100, 100, 1366, 768);
		mainFr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFr.getContentPane().setLayout(null);
		mainFr.setLocationRelativeTo(null);
	
		
		JLabel AboutMelbl = new JLabel("");
		AboutMelbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AboutMe abt1 = new AboutMe();
				abt1.setVisible(true);
				mainFr.dispose();
		
	
		}
			
		});
		AboutMelbl.setBounds(307, 604, 226, 46);
		mainFr.getContentPane().add(AboutMelbl);
		
		JLabel myWorkslbl = new JLabel("");
		myWorkslbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MyWorks myworks = new MyWorks();
				myworks.setVisible(true);
				mainFr.dispose();
			}
		});
		myWorkslbl.setBounds(572, 604, 226, 46);
		mainFr.getContentPane().add(myWorkslbl);
		
		JLabel Contactlbl = new JLabel("");
		Contactlbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Contactinfo mycontact = new Contactinfo();
				mycontact.setVisible(true);
				mainFr.dispose();
			}
			
		});
		Contactlbl.setBounds(835, 604, 226, 46);
		mainFr.getContentPane().add(Contactlbl);
		
		JLabel Homepage = new JLabel("");
		Homepage.setBackground(new Color(249, 249, 249));
		Homepage.setIcon(new ImageIcon(Homepage.class.getResource("/WindowBuilder/Home.png")));
		Homepage.setBounds(10, -28, 1366, 768);
		mainFr.getContentPane().add(Homepage);
	}

	public void setVisible(boolean b) {
		 this.mainFr.setVisible(true);
		
	}

	

}