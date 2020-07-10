package mini;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class first extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					first frame = new first();
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
	public first() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,4000,3000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("G.H.RAISONI INSTITUTE OF ENGINEERING AND TECHNOLOGY ");
		label.setFont(new Font("Century Schoolbook L", Font.BOLD, 37));
		label.setBounds(76, 12, 1383, 67);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("DEPARTMENT OF COMPUTER ENGINEERING & INFORMATION TECHNOLOGY");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("FreeSans", Font.BOLD, 24));
		label_1.setBounds(314, 94, 925, 54);
		contentPane.add(label_1);
		
		JButton button = new JButton("LOG IN ");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				login l1=new login();
				l1.setVisible(true);
				dispose();
			}
		});
		button.setBounds(827, 569, 178, 43);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Register");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				registration r1=new registration();
				r1.setVisible(true);
				dispose();
			}
		});
		button_1.setBounds(533, 569, 178, 43);
		contentPane.add(button_1);
		
		JLabel lblDepartmentalEventManagement = new JLabel("DEPARTMENTAL");
		lblDepartmentalEventManagement.setHorizontalAlignment(SwingConstants.CENTER);
		lblDepartmentalEventManagement.setFont(new Font("Likhan", Font.BOLD, 44));
		lblDepartmentalEventManagement.setBounds(565, 312, 444, 43);
		contentPane.add(lblDepartmentalEventManagement);
		
		JLabel lblEvent = new JLabel("EVENT");
		lblEvent.setHorizontalAlignment(SwingConstants.CENTER);
		lblEvent.setFont(new Font("Likhan", Font.BOLD, 44));
		lblEvent.setBounds(627, 395, 327, 43);
		contentPane.add(lblEvent);
		
		JLabel lblManagement = new JLabel("MANAGEMENT.");
		lblManagement.setHorizontalAlignment(SwingConstants.CENTER);
		lblManagement.setFont(new Font("Likhan", Font.BOLD, 44));
		lblManagement.setBounds(565, 466, 399, 43);
		contentPane.add(lblManagement);
		
		JLabel label_3 = new JLabel();
		label_3.setBounds(38, 12, 223, 204);
		contentPane.add(label_3);
		Image img= new ImageIcon(this.getClass().getResource("/college.png")).getImage();
		label_3.setIcon(new ImageIcon(img));
	
		
		JLabel label_2 = new JLabel("");
		label_2.setOpaque(true);
		label_2.setBackground(Color.ORANGE);
		label_2.setBounds(0, -13, 318, 743);
		contentPane.add(label_2);
		
		}
}
