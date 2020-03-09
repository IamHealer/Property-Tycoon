import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class PlayerInterface extends JFrame {

	private JPanel contentPane;
	private JLabel playerLabel;
	private JLabel aiLabel ;
	private static int aiNum =0;
	private static int playerNum=0;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayerInterface frame = new PlayerInterface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private static void addPlayerNum() {
		
		if(aiNum+playerNum<6) {
			playerNum++;
		}
	}
	private static void minusPlayerNum() {
		
		if(playerNum!=0) {
			playerNum--;
		}
	}
	
	private static void addAiNum() {
		
		if(aiNum+playerNum<6) {
			aiNum++;
		}
	}
	private static void minusAiNum() {
		
		if(aiNum!=0) {
			aiNum--;
		}
	}

	/**
	 * Create the frame.
	 */
	public PlayerInterface() {
		
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
		
		
		JLabel chooseImgLabel = new JLabel("choosing");
		chooseImgLabel.setBounds(700, 250, 200, 50);
		panel.add(chooseImgLabel);

		
		playerLabel = new JLabel("player: " + playerNum);
		playerLabel.setBounds(700, 466, 58, 15);
		panel.add(playerLabel);
		
		aiLabel = new JLabel("ai: " + aiNum);
		aiLabel.setBounds(700, 546, 58, 15);
		panel.add(aiLabel);
		
		JButton plusPlayerButton = new JButton("+");
		plusPlayerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addPlayerNum();
				playerLabel.setText("player: " + playerNum);
				
			}
		});
		plusPlayerButton.setBounds(883, 462, 97, 23);
		panel.add(plusPlayerButton);
		
		JButton plusAIButton = new JButton("+");
		plusAIButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addAiNum();
				aiLabel.setText("ai: " + aiNum);
			
			}
		});
		plusAIButton.setBounds(883, 542, 97, 23);
		panel.add(plusAIButton);
		
		JButton minusPlayerButton = new JButton("-");
		minusPlayerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				minusPlayerNum();
				playerLabel.setText("player: " + playerNum);
			}
		});
		minusPlayerButton.setBounds(495, 462, 97, 23);
		panel.add(minusPlayerButton);
		
		JButton minusAiButton = new JButton("-");
		minusAiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				minusAiNum();
				aiLabel.setText("ai: " + aiNum);
				
			}
		});
		minusAiButton.setBounds(495, 542, 97, 23);
		panel.add(minusAiButton);
		
		JButton okButton = new JButton("OK");
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				gameInterface GI = new gameInterface();
				GI.setVisible(true);
			}
		});
		okButton.setBounds(1287, 664, 103, 36);
		panel.add(okButton);
	}

}
