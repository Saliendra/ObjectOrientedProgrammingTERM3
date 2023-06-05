package WindowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Code1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Code1 frame = new Code1();
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
	public Code1() {
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
		
		JLabel backWeb3Btn = new JLabel("");
		backWeb3Btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Website3 web3 = new Website3();
				web3.setVisible(true);
				
			}
		});
		backWeb3Btn.setBounds(84, 602, 219, 49);
		contentPane.add(backWeb3Btn);
		
		JLabel nextCode2btn = new JLabel("");
		nextCode2btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Code2 c2 = new Code2();
				c2.setVisible(true);
			}
		});
		nextCode2btn.setBounds(1065, 602, 219, 49);
		contentPane.add(nextCode2btn);
		
		JLabel Code1lbl = new JLabel("");
		Code1lbl.setIcon(new ImageIcon(Code1.class.getResource("/WindowBuilder/code1.png")));
		Code1lbl.setBounds(0, -39, 1366, 768);
		contentPane.add(Code1lbl);
		
	
	}

}
