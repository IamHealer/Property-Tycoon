import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionEvent;

public class gameInterface extends JFrame {
	
	static int  index=0;
	private JPanel contentPane;
	private static JPanel gamePanel;
	private int sieve;
	private ArrayList players;
	private static int[] xProperty;
	private static int[] yProperty;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					iniProperty();
					gameInterface frame = new gameInterface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private static void iniProperty() {
		xProperty=new int[40];
		yProperty=new int[40];
		for (int x =0; x<40; x++) {
			
			if(x<=9) {
				
				xProperty[x]=0;
			}
			else if(x<=29 && x>=20) {
				xProperty[x]=1100;
				
			}
			else if (x>=10&&x<=19) {
				
				xProperty[x]=100*(x-9);
			}
			else {
				
				xProperty[x]=1100-(100*(x-29));
				
			}
		}
		
		for (int y =0; y<40; y++) {
			
			if(y<=39&&y>=29) {
				
				yProperty[y]=0;
			}
			else if (y==0) {
				yProperty[y]=0;
			}
			else if(y<=20 && y>=9) {
				yProperty[y]=720;
				
			}
			
			else if (y>=1&&y<=8) {
				
				yProperty[y]=80*y;
			}
			else {
				
				yProperty[y]=720-(80*(y-20));
				
			}
		}
		
		
	}


	/**
	 * Create the frame.
	 */
	public gameInterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1500, 833);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		gamePanel = new JPanel();
		gamePanel.setBackground(Color.WHITE);
		gamePanel.setBounds(0, 0, 1200, 833);
		contentPane.add(gamePanel);
		gamePanel.setLayout(null);
	
		JPanel player = new JPanel();
		player.setBackground(Color.black);
		player.setBounds(0,0 , 50, 50);
		gamePanel.add(player);
		
		
		
		
		

		
		
		
		JButton btnNewButton_6 = new JButton("SIEVE");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sieve = (int)(Math.random()*10)%6+1;
				if ((sieve+index)>=40) {
					index=sieve+index-40;
				}
				else {
					index=sieve+index;
				}
			
				
				int x=xProperty[index];
				int y=yProperty[index];
				
				
				player.setBounds(x,y, 50, 50);
				System.out.print(sieve+index);
			}
		});
		btnNewButton_6.setBounds(561, 352, 100, 100);
		gamePanel.add(btnNewButton_6);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("0");
		tglbtnNewToggleButton.setBounds(0, 0, 100, 80);
		gamePanel.add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("1");
		tglbtnNewToggleButton_1.setBounds(0, 80, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_1);
		
		JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("2");
		tglbtnNewToggleButton_2.setBounds(0, 160, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_2);
		
		JToggleButton tglbtnNewToggleButton_3 = new JToggleButton("3");
		tglbtnNewToggleButton_3.setBounds(0, 240, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_3);
		
		JToggleButton tglbtnNewToggleButton_4 = new JToggleButton("4");
		tglbtnNewToggleButton_4.setBounds(0, 320, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_4);
		
		JToggleButton tglbtnNewToggleButton_5 = new JToggleButton("5");
		tglbtnNewToggleButton_5.setBounds(0, 400, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_5);
		
		JToggleButton tglbtnNewToggleButton_6 = new JToggleButton("6");
		tglbtnNewToggleButton_6.setBounds(0, 480, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_6);
		
		JToggleButton tglbtnNewToggleButton_7 = new JToggleButton("7");
		tglbtnNewToggleButton_7.setBounds(0, 560, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_7);
		
		JToggleButton tglbtnNewToggleButton_8 = new JToggleButton("8");
		tglbtnNewToggleButton_8.setBounds(0, 640, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_8);
		
		JToggleButton tglbtnNewToggleButton_9 = new JToggleButton("9");
		tglbtnNewToggleButton_9.setBounds(0, 720, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_9);
		
		JToggleButton tglbtnNewToggleButton_10 = new JToggleButton("10");
		tglbtnNewToggleButton_10.setBounds(100, 720, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_10);
		
		JToggleButton tglbtnNewToggleButton_11 = new JToggleButton("11");
		tglbtnNewToggleButton_11.setBounds(200, 720, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_11);
		
		JToggleButton tglbtnNewToggleButton_12 = new JToggleButton("12");
		tglbtnNewToggleButton_12.setBounds(300, 720, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_12);
		
		JToggleButton tglbtnNewToggleButton_13 = new JToggleButton("13");
		tglbtnNewToggleButton_13.setBounds(400, 720, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_13);
		
		JToggleButton tglbtnNewToggleButton_14 = new JToggleButton("14");
		tglbtnNewToggleButton_14.setBounds(500, 720, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_14);
		
		JToggleButton tglbtnNewToggleButton_15 = new JToggleButton("15");
		tglbtnNewToggleButton_15.setBounds(600, 720, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_15);
		
		JToggleButton tglbtnNewToggleButton_16 = new JToggleButton("16");
		tglbtnNewToggleButton_16.setBounds(700, 720, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_16);
		
		JToggleButton tglbtnNewToggleButton_17 = new JToggleButton("17");
		tglbtnNewToggleButton_17.setBounds(800, 720, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_17);
		
		JToggleButton tglbtnNewToggleButton_18 = new JToggleButton("18");
		tglbtnNewToggleButton_18.setBounds(900, 720, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_18);
		
		JToggleButton tglbtnNewToggleButton_19 = new JToggleButton("19");
		tglbtnNewToggleButton_19.setBounds(1000, 720, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_19);
		
		JToggleButton tglbtnNewToggleButton_20 = new JToggleButton("20");
		tglbtnNewToggleButton_20.setBounds(1100, 720, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_20);
		
		JToggleButton tglbtnNewToggleButton_21 = new JToggleButton("21");
		tglbtnNewToggleButton_21.setBounds(1100, 640, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_21);
		
		JToggleButton tglbtnNewToggleButton_22 = new JToggleButton("22");
		tglbtnNewToggleButton_22.setBounds(1100, 560, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_22);
		
		JToggleButton tglbtnNewToggleButton_23 = new JToggleButton("23");
		tglbtnNewToggleButton_23.setBounds(1100, 480, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_23);
		
		JToggleButton tglbtnNewToggleButton_24 = new JToggleButton("24");
		tglbtnNewToggleButton_24.setBounds(1100, 400, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_24);
		
		JToggleButton tglbtnNewToggleButton_25 = new JToggleButton("25");
		tglbtnNewToggleButton_25.setBounds(1100, 320, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_25);
		
		JToggleButton tglbtnNewToggleButton_26 = new JToggleButton("26");
		tglbtnNewToggleButton_26.setBounds(1100, 240, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_26);
		
		JToggleButton tglbtnNewToggleButton_27 = new JToggleButton("27");
		tglbtnNewToggleButton_27.setBounds(1100, 160, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_27);
		
		JToggleButton tglbtnNewToggleButton_28 = new JToggleButton("28");
		tglbtnNewToggleButton_28.setBounds(1100, 80, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_28);
		
		JToggleButton tglbtnNewToggleButton_29 = new JToggleButton("29");
		tglbtnNewToggleButton_29.setBounds(1100, 0, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_29);
		
		JToggleButton tglbtnNewToggleButton_30 = new JToggleButton("30");
		tglbtnNewToggleButton_30.setBounds(1000, 0, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_30);
		
		JToggleButton tglbtnNewToggleButton_31 = new JToggleButton("31");
		tglbtnNewToggleButton_31.setBounds(900, 0, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_31);
		
		JToggleButton tglbtnNewToggleButton_32 = new JToggleButton("32");
		tglbtnNewToggleButton_32.setBounds(800, 0, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_32);
		
		JToggleButton tglbtnNewToggleButton_33 = new JToggleButton("33");
		tglbtnNewToggleButton_33.setBounds(700, 0, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_33);
		
		JToggleButton tglbtnNewToggleButton_34 = new JToggleButton("34");
		tglbtnNewToggleButton_34.setBounds(600, 0, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_34);
		
		JToggleButton tglbtnNewToggleButton_35 = new JToggleButton("35");
		tglbtnNewToggleButton_35.setBounds(500, 0, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_35);
		
		JToggleButton tglbtnNewToggleButton_36 = new JToggleButton("36");
		tglbtnNewToggleButton_36.setBounds(400, 0, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_36);
		
		JToggleButton tglbtnNewToggleButton_37 = new JToggleButton("37");
		tglbtnNewToggleButton_37.setBounds(300, 0, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_37);
		
		JToggleButton tglbtnNewToggleButton_38 = new JToggleButton("38");
		tglbtnNewToggleButton_38.setBounds(200, 0, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_38);
		
		JToggleButton tglbtnNewToggleButton_39 = new JToggleButton("39");
		tglbtnNewToggleButton_39.setBounds(100, 0, 100, 80);
		gamePanel.add(tglbtnNewToggleButton_39);
		
		
		
		
		
		JPanel playerPanel = new JPanel();
		playerPanel.setBackground(Color.BLUE);
		playerPanel.setBounds(1200, 0, 300, 800);
		playerPanel.setLayout(new GridLayout(6,1));
		contentPane.add(playerPanel);
		
		JPanel playePanel_1 = new JPanel();
		playePanel_1.setLayout(new GridLayout(1,2));
		playerPanel.add(playePanel_1);
		
		JButton btnNewButton = new JButton("Player1");
		playePanel_1.add(btnNewButton);
		
		JPanel panel = new JPanel();
		playePanel_1.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Balance:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel playePanel_2 = new JPanel();
		playePanel_2.setLayout(new GridLayout(1,2));
		playerPanel.add(playePanel_2);
		
		JButton btnNewButton_1 = new JButton("Player2");
		playePanel_2.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		playePanel_2.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Balance:");
		panel_1.add(lblNewLabel_1, BorderLayout.CENTER);
		
		JPanel playePanel_3 = new JPanel();
		playePanel_3.setLayout(new GridLayout(1,2));
		playerPanel.add(playePanel_3);
		
		JButton btnNewButton_2 = new JButton("Player3");
		playePanel_3.add(btnNewButton_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.YELLOW);
		playePanel_3.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Balance:");
		panel_2.add(lblNewLabel_2, BorderLayout.CENTER);
		
		JPanel playePanel_4 = new JPanel();
		playePanel_4.setLayout(new GridLayout(1,2));
		playerPanel.add(playePanel_4);
		
		JButton btnNewButton_3 = new JButton("Player4");
		playePanel_4.add(btnNewButton_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		playePanel_4.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("Balance:");
		panel_3.add(lblNewLabel_3, BorderLayout.CENTER);
		
		JPanel playePanel_5 = new JPanel();
		playePanel_5.setLayout(new GridLayout(1,2));
		playerPanel.add(playePanel_5);
		
		JButton btnNewButton_4 = new JButton("Player5");
		playePanel_5.add(btnNewButton_4);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.GREEN);
		playePanel_5.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_4 = new JLabel("Balance:");
		panel_4.add(lblNewLabel_4, BorderLayout.CENTER);
		
		JPanel playePanel_6 = new JPanel();
		playePanel_6.setLayout(new GridLayout(1,2));
		playerPanel.add(playePanel_6);
		
		JButton btnNewButton_5 = new JButton("Player6");
		playePanel_6.add(btnNewButton_5);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.RED);
		playePanel_6.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_5 = new JLabel("Balance:");
		panel_5.add(lblNewLabel_5, BorderLayout.CENTER);
	}
}
