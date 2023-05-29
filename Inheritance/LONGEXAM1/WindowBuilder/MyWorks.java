package WindowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyWorks extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyWorks frame3 = new MyWorks();
					frame3.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}



	public MyWorks() {
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
		
		JLabel nextbtn = new JLabel("");
		nextbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Skills skl = new Skills();
				skl.setVisible(true);
				
						
			}
		});
		nextbtn.setBounds(1066, 602, 215, 49);
		contentPane.add(nextbtn);
		
		JLabel backbtn3 = new JLabel("");
		backbtn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Homepage mainFr = new Homepage();
				mainFr.setVisible(true);
			}
		});
		backbtn3.setBounds(85, 602, 210, 49);
		contentPane.add(backbtn3);
		
		JLabel worksLbl = new JLabel("New label");
		worksLbl.setIcon(new ImageIcon(MyWorks.class.getResource("/WindowBuilder/MyWorks.png")));
		worksLbl.setBounds(0, -39, 1366, 768);
		contentPane.add(worksLbl);
		
		
		
		
	}

}