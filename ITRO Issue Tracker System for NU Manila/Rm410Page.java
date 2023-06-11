package Pictures;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Rm410Page extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rm410Page frame = new Rm410Page();
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
	public Rm410Page() {
		setResizable(false);
		setTitle("PREVIEW: ROOM 410");
		setBounds(0, 0, 1068, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel rm410page = new JLabel("");
		rm410page.setIcon(new ImageIcon(Rm410Page.class.getResource("/Pictures/Room410.png")));
		rm410page.setBounds(0, 0, 1050, 591);
		contentPane.add(rm410page);
		
	}

}
