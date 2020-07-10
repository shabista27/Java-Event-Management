package mini;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class program_outcomes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					program_outcomes frame = new program_outcomes();
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
	public program_outcomes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,5000,5000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		JLabel lblNewLabel = new JLabel("G.H.RAISONI INSTITUTE OF ENGINEERING AND TECHNOLOGY");
		lblNewLabel.setFont(new Font("Century Schoolbook L", Font.BOLD, 37));
		lblNewLabel.setBounds(12, 12, 1311, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DEPARTMENT OF COMPUTER ENGINEERING & INFORMATION TECHNOLOGY");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 27));
		lblNewLabel_1.setBounds(187, 84, 1275, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("DEPARTMENT PROGRAM OUTCOMES (POs)");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 25));
		lblNewLabel_2.setBounds(448, 226, 652, 43);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("1.To develop the ability for applying the basic knowledge and skills from mathematics,sciences, and engineering.");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3.setBounds(389, 337, 1117, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("2.To analyze and develop computer based systems.");
		lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_4.setBounds(389, 364, 570, 15);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("3.To identify,formulate, and provide solutions to engineering problems.");
		lblNewLabel_5.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_5.setBounds(389, 391, 745, 15);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("4.To design and develop software systems and process to meet requirements of society.");
		lblNewLabel_6.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_6.setBounds(389, 418, 1038, 15);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("5.To use and apply modern software and hardware tools.");
		lblNewLabel_7.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_7.setBounds(389, 437, 658, 27);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("6.To develop an understanding of the social and ethical responsibilities of an engineer.");
		lblNewLabel_8.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_8.setBounds(389, 468, 840, 15);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("7.To inculcate self motivation and team work to address multidisciplinary areas.");
		lblNewLabel_9.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_9.setBounds(389, 495, 745, 15);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("8.Ability to function on multidisciplinary teams.");
		lblNewLabel_10.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_10.setBounds(389, 522, 587, 15);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("9.To groom communication and presentation skills for development of domain interface with society.");
		lblNewLabel_11.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_11.setBounds(393, 549, 1097, 15);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("10.To apply the knowledge acquired in interdisciplinary areas and projects.");
		lblNewLabel_12.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_12.setBounds(389, 576, 729, 15);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("11.To develop lifelong learning skills for keeping pace with rapidly changing technology.");
		lblNewLabel_13.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_13.setBounds(389, 603, 1012, 15);
		contentPane.add(lblNewLabel_13);
		
		JButton button_1 = new JButton("Main Menu");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main m=new main();
				m.setVisible(true);
				dispose();
			}
		});
		button_1.setBounds(27, 477, 192, 41);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Exit...");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				dispose();
			}
		});
		button_2.setBounds(27, 530, 192, 41);
		contentPane.add(button_2);
		
		JLabel label = new JLabel("DEPARTMENTAL");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Likhan", Font.BOLD, 30));
		label.setBounds(-83, 225, 444, 43);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("EVENT");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Likhan", Font.BOLD, 30));
		label_1.setBounds(-39, 281, 327, 43);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("MANAGEMENT.");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Likhan", Font.BOLD, 30));
		label_2.setBounds(-65, 336, 399, 43);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setOpaque(true);
		label_3.setBackground(Color.ORANGE);
		label_3.setBounds(0, 0, 330, 743);
		contentPane.add(label_3);
		
	}

}