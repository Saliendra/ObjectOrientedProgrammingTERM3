package WindowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Code2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Code2 frame = new Code2();
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
	public Code2() {
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
		
		JLabel backCode1btn = new JLabel("");
		backCode1btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Code1 cd1 = new Code1();
				cd1.setVisible(true);
			}
		});
		backCode1btn.setBounds(77, 602, 223, 48);
		contentPane.add(backCode1btn);
		
		JLabel nextSkillsbtn = new JLabel("");
		nextSkillsbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Skills skl = new Skills();
				skl.setVisible(true);
			}
		});
		nextSkillsbtn.setBounds(1071, 602, 207, 48);
		contentPane.add(nextSkillsbtn);
		
		JLabel Code2lbl = new JLabel("");
		Code2lbl.setIcon(new ImageIcon(Code2.class.getResource("/WindowBuilder/code2.png")));
		Code2lbl.setBounds(0, -39, 1366, 768);
		contentPane.add(Code2lbl);
	}

}
