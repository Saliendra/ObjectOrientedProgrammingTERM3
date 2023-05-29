package WindowBuilder;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AboutMe extends JFrame {

	private JPanel contentPane;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutMe frame1 = new AboutMe();
					frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public AboutMe() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setBounds(100, 100, 1366, 768);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel backbtn1 = new JLabel("");
		backbtn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Homepage mainFr = new Homepage();
				mainFr.setVisible(true);
			
				
			}
		});
		backbtn1.setBounds(111, 579, 220, 49);
		contentPane.add(backbtn1);
		
		JLabel meLbl = new JLabel("");
		meLbl.setIcon(new ImageIcon(AboutMe.class.getResource("/WindowBuilder/About.png")));
		meLbl.setHorizontalAlignment(SwingConstants.TRAILING);
		meLbl.setBounds(0, -39, 1366, 768);
		contentPane.add(meLbl);
		
		
	}

	
	
	}
