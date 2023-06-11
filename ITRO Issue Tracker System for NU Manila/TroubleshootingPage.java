package Pictures;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class TroubleshootingPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TroubleshootingPage frame = new TroubleshootingPage();
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
	public TroubleshootingPage() {
		setResizable(false);
		setTitle("Troubleshooting Page");
		setBounds(0, 0, 1068, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel TroubleshootingScreen = new JLabel("");
		TroubleshootingScreen.setIcon(new ImageIcon(TroubleshootingPage.class.getResource("/Pictures/Troubleshooting.png")));
		TroubleshootingScreen.setBounds(0, 0, 1050, 591);
		contentPane.add(TroubleshootingScreen);
	}

}
