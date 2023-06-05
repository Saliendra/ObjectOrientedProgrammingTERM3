package WindowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Website2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Website2 frame = new Website2();
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
	public Website2() {
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
		
		JLabel backWeb1btn = new JLabel("");
		backWeb1btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Website1 web1 = new Website1();
				web1.setVisible(true);
			}
		});
		backWeb1btn.setBounds(80, 599, 225, 53);
		contentPane.add(backWeb1btn);
		
		JLabel nextWeb3btn = new JLabel("");
		nextWeb3btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Website3 web3 = new Website3();
				web3.setVisible(true);
			}
		});
		nextWeb3btn.setBounds(1063, 599, 225, 53);
		contentPane.add(nextWeb3btn);
		
		JLabel Web2lbl = new JLabel("");
		Web2lbl.setIcon(new ImageIcon(Website2.class.getResource("/WindowBuilder/w2.png")));
		Web2lbl.setBounds(0, -39, 1366, 768);
		contentPane.add(Web2lbl);
		
		
	}

}
