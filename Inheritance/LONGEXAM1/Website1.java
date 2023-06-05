package WindowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Website1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Website1 frame = new Website1();
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
	public Website1() {
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
		
		JLabel backGalbtn = new JLabel("");
		backGalbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				MyWorks works = new MyWorks();
				works.setVisible(true);
			}
		});
		backGalbtn.setBounds(83, 600, 220, 50);
		contentPane.add(backGalbtn);
		
		JLabel nextWeb2btn = new JLabel("");
		nextWeb2btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Website2 web2 = new Website2();
				web2.setVisible(true);
			}
		});
		nextWeb2btn.setBounds(1064, 600, 220, 50);
		contentPane.add(nextWeb2btn);
		
		JLabel Web1lbl = new JLabel("");
		Web1lbl.setIcon(new ImageIcon(Website1.class.getResource("/WindowBuilder/w1.png")));
		Web1lbl.setBounds(0, -39, 1366, 768);
		contentPane.add(Web1lbl);
		
	}

}
