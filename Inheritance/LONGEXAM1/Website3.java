package WindowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Website3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Website3 frame = new Website3();
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
	public Website3() {
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
		
		JLabel backWeb2btn = new JLabel("");
		backWeb2btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Website2 web2 = new Website2();
				web2.setVisible(true);
			}
		});
		backWeb2btn.setBounds(82, 601, 222, 49);
		contentPane.add(backWeb2btn);
		
		JLabel nextCode1btn = new JLabel("");
		nextCode1btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Code1 cd1 = new Code1();
				cd1.setVisible(true);
			}
		});
		nextCode1btn.setBounds(1063, 601, 222, 49);
		contentPane.add(nextCode1btn);
		
		JLabel web3lbl = new JLabel("");
		web3lbl.setIcon(new ImageIcon(Website3.class.getResource("/WindowBuilder/w3.png")));
		web3lbl.setBounds(0, -39, 1366, 768);
		contentPane.add(web3lbl);
	}

}
