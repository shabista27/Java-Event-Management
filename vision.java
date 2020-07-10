package mini;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vision extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vision frame = new vision();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public vision()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,4000,3000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("G.H.RAISONI INSTITUTE OF ENGINEERING AND TECHNOLOGY ");
		label.setBounds(0, 0, 0, 0);
		label.setFont(new Font("Century Schoolbook L", Font.BOLD, 37));
		contentPane.add(label);
		
		JLabel lblDepartmentOfComputer = new JLabel("DEPARTMENT OF COMPUTER ENGINEERING &  INFORMATION TECHNOLOGY");
		lblDepartmentOfComputer.setBounds(119, 88, 1356, 30);
		lblDepartmentOfComputer.setHorizontalAlignment(SwingConstants.CENTER);
		lblDepartmentOfComputer.setFont(new Font("FreeSans", Font.BOLD, 24));
		contentPane.add(lblDepartmentOfComputer);
		
		JLabel label_2 = new JLabel("G.H.RAISONI INSTITUTE OF ENGINEERING AND TECHNOLOGY ");
		label_2.setFont(new Font("Century Schoolbook L", Font.BOLD, 37));
		label_2.setBounds(29, 0, 1383, 67);
		contentPane.add(label_2);
		
		JLabel lblNewLabel_1 = new JLabel("VISION");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 30));
		lblNewLabel_1.setBounds(722, 163, 161, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Our vision is to achieve excellent standards of");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_2.setBounds(571, 224, 532, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("quality education by keeping pace with rapidly");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_3.setBounds(571, 253, 478, 22);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblHfdh = new JLabel("changing technologies. Our continuous endeavor");
		lblHfdh.setFont(new Font("Dialog", Font.BOLD, 18));
		lblHfdh.setBounds(571, 284, 564, 22);
		contentPane.add(lblHfdh);
		
		JLabel lblNewLabel_4 = new JLabel("is to create manpowerof global standards with");
		lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_4.setBounds(571, 316, 491, 22);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("capabilities of accepting new challenges.");
		lblNewLabel_5.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_5.setBounds(571, 339, 426, 33);
		contentPane.add(lblNewLabel_5);
		
		JLabel label2 = new JLabel("MISSION");
		label2.setFont(new Font("Dialog", Font.BOLD, 30));
		label2.setBounds(740, 416, 147, 43);
		contentPane.add(label2);
		
		JLabel lblNewLabel_6 = new JLabel("Our efforts are dedicated towards imparting");
		lblNewLabel_6.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_6.setBounds(571, 465, 491, 22);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("quality and value based education to raise the");
		lblNewLabel_7.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_7.setBounds(571, 489, 478, 22);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("satisfaction level of our students. Our strength");
		lblNewLabel_8.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_8.setBounds(571, 516, 532, 22);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("is  directed  towards  creating  competent");
		lblNewLabel_9.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_9.setBounds(571, 540, 491, 22);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("professionals. Our endeavor is to provide all");
		lblNewLabel_10.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_10.setBounds(571, 566, 491, 22);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("possible and sustainable support to promote");
		lblNewLabel_11.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_11.setBounds(571, 589, 506, 28);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("research and development activities.");
		lblNewLabel_12.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_12.setBounds(571, 629, 478, 15);
		contentPane.add(lblNewLabel_12);
		
		JLabel label_1 = new JLabel("DEPARTMENTAL");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Likhan", Font.BOLD, 30));
		label_1.setBounds(-57, 253, 444, 43);
		contentPane.add(label_1);
		
		JLabel label_3 = new JLabel("EVENT");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Likhan", Font.BOLD, 30));
		label_3.setBounds(-13, 309, 327, 43);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("MANAGEMENT.");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Likhan", Font.BOLD, 30));
		label_4.setBounds(-39, 364, 399, 43);
		contentPane.add(label_4);
		
		JButton button = new JButton("Main Menu");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main m=new main();
				m.setVisible(true);
				dispose();
			}
		});
		button.setBounds(29, 489, 192, 41);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Exit...");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_1.setBounds(29, 542, 192, 41);
		contentPane.add(button_1);
		
		JLabel label_5 = new JLabel("");
		label_5.setOpaque(true);
		label_5.setBackground(Color.ORANGE);
		label_5.setBounds(0, 0, 330, 743);
		contentPane.add(label_5);
	
}
}
