import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.SystemColor;
import java.net.URL;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StartInterface extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartInterface frame = new StartInterface();
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
	public StartInterface() {
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
		
		JLabel startImgLabel = new JLabel("Start");
		startImgLabel.setBounds(700, 250, 200, 50);
		panel.add(startImgLabel);
		
		JButton startButton = new JButton("Start");
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				VersionInterface VI=new VersionInterface();
				VI.setVisible(true);
			}
		});
		startButton.setBounds(650, 448, 150, 50);
		panel.add(startButton);
	}
}
