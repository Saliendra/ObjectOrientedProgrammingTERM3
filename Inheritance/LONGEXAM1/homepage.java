package ACE;

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

public class homepage {

	private JFrame frmAceSaliendra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homepage window = new homepage();
					window.frmAceSaliendra.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public homepage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAceSaliendra = new JFrame();
		frmAceSaliendra.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		frmAceSaliendra.setResizable(false);
		frmAceSaliendra.setTitle("ACE SALIENDRA - INF224 ");
		frmAceSaliendra.setBackground(new Color(255, 255, 255));
		frmAceSaliendra.setBounds(100, 100, 1366, 768);
		frmAceSaliendra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAceSaliendra.getContentPane().setLayout(null);
		frmAceSaliendra.setLocationRelativeTo(null);
	
		
		JLabel AboutMelbl = new JLabel("");
		AboutMelbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AboutMe abt1 = new AboutMe();
				abt1.setVisible(true);
				frmAceSaliendra.dispose();
		
	
		}
			
		});
		AboutMelbl.setBounds(318, 604, 200, 46);
		frmAceSaliendra.getContentPane().add(AboutMelbl);
		
		JLabel myWorkslbl = new JLabel("");
		myWorkslbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MyWorks myworks = new MyWorks();
				myworks.setVisible(true);
				frmAceSaliendra.dispose();
			}
		});
		myWorkslbl.setBounds(585, 604, 194, 46);
		frmAceSaliendra.getContentPane().add(myWorkslbl);
		
		JLabel Contactlbl = new JLabel("");
		Contactlbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Contactinfo mycontact = new Contactinfo();
				mycontact.setVisible(true);
				frmAceSaliendra.dispose();
			}
			
		});
		Contactlbl.setBounds(851, 604, 194, 46);
		frmAceSaliendra.getContentPane().add(Contactlbl);
		
		JLabel Homepage = new JLabel("");
		Homepage.setBackground(new Color(249, 249, 249));
		Homepage.setIcon(new ImageIcon("C:\\Users\\National University\\Downloads\\MicrosoftTeams-image (4).png"));
		Homepage.setBounds(0, -39, 1366, 768);
		frmAceSaliendra.getContentPane().add(Homepage);
	}
}
