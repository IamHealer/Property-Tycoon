import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VersionInterface extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VersionInterface frame = new VersionInterface();
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
	public VersionInterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 1400, 738);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(new Rectangle(0, 0, 1400, 700));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel backgroundLabel = new JLabel("background");
		backgroundLabel.setVerticalAlignment(SwingConstants.TOP);
		backgroundLabel.setHorizontalAlignment(SwingConstants.CENTER);
		backgroundLabel.setBackground(Color.WHITE);
		backgroundLabel.setBounds(0, 0, 1400, 700);

	
		
		panel.add(backgroundLabel);
		
		JLabel startImgLabel = new JLabel("Version");
		startImgLabel.setBounds(700, 250, 200, 50);
		panel.add(startImgLabel);
		
		JButton fullButton = new JButton("Full Game");
		fullButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PlayerInterface PI= new PlayerInterface();
				PI.setVisible(true);
			}
		});
		fullButton.setBounds(650, 448, 150, 50);
		panel.add(fullButton);
		
		JButton abridgedButton = new JButton("abridgedButton");
		abridgedButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SetTimeDialog STD=new SetTimeDialog ();
				STD.setVisible(true);
			}
		});
		abridgedButton.setBounds(650, 520, 150, 50);
		panel.add(abridgedButton);
		
		JButton helpButton = new JButton("HELP");
		helpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HelpDialog hD=new HelpDialog();
				hD.setVisible(true);
			}
		});
		helpButton.setBounds(1293, 10, 97, 23);
		panel.add(helpButton);
	}

}
