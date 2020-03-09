import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SetTimeDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private static int time =30;
	private JLabel timeLabel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			SetTimeDialog dialog = new SetTimeDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * add 5 mins in time.
	 */
	private static void addTime() {
		
		time+=5;
		
	}
	
	/**
	 * minus 5 mins in time.
	 */
	private static void minusTime() {	
		if(time!=0) {
			time-=5;
		}
		
		
	}
	
	


	/**
	 * Create the dialog.
	 */
	public SetTimeDialog() {
		setBounds(600, 300, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		{
			JLabel setTimeImgLabel = new JLabel("Set time Img");
			setTimeImgLabel.setBounds(174, 52, 115, 40);
			contentPanel.add(setTimeImgLabel);
		}
		
		{
			timeLabel = new JLabel(""+time);
			timeLabel.setBounds(174, 136, 58, 15);
			contentPanel.add(timeLabel);
		}
		{
			JButton plusButton = new JButton("+");
			plusButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					SetTimeDialog.addTime();
					timeLabel.setText(""+time);
					
				}
			});
			plusButton.setBounds(242, 132, 45, 23);
			contentPanel.add(plusButton);
		}
		{
			JButton minusButton = new JButton("-");
			minusButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					SetTimeDialog.minusTime();
					timeLabel.setText(""+time);
				}
			});
			minusButton.setBounds(291, 132, 45, 23);
			contentPanel.add(minusButton);
		}
		{
			JButton btnOk = new JButton("OK");
			btnOk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
					PlayerInterface PI= new PlayerInterface();
					PI.setVisible(true);
				}
			});
			btnOk.setBounds(191, 205, 58, 23);
			contentPanel.add(btnOk);
	
		}
	}
	

}
