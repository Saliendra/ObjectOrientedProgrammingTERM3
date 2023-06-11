package Pictures;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class IssueLogsPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IssueLogsPage frame = new IssueLogsPage();
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
	public IssueLogsPage() {
		setResizable(false);
		setTitle("Issue Logs");
		setBounds(0, 0, 1068, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel IssueLogScreen = new JLabel("");
		IssueLogScreen.setIcon(new ImageIcon(IssueLogsPage.class.getResource("/Pictures/IssueLogScreen.png")));
		IssueLogScreen.setBounds(0, 0, 1050, 591);
		contentPane.add(IssueLogScreen);
		
	}
}
