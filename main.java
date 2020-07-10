package mini;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JToggleButton;

public class main extends JFrame {

	private JPanel contentPane;

	
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try {
					main frame = new main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public main() 
	{
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,4000,3000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("G.H.RAISONI INSTITUTE OF ENGINEERING AND TECHNOLOGY ");
		label.setFont(new Font("Century Schoolbook L", Font.BOLD, 37));
		label.setBounds(53, 26, 1383, 67);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("DEPARTMENT OF COMPUTER ENGINEERING & INFORMATION TECHNOLOGY");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("FreeSans", Font.BOLD, 24));
		label_1.setBounds(332, 132, 927, 54);
		contentPane.add(label_1);
		
		JLabel lblVisionAndMission = new JLabel(" VISION AND MISSION ");
		lblVisionAndMission.setHorizontalAlignment(SwingConstants.CENTER);
		lblVisionAndMission.setFont(new Font("Khmer OS System", Font.BOLD, 26));
		lblVisionAndMission.setBounds(345, 618, 342, 45);
		contentPane.add(lblVisionAndMission);
		
		JLabel lblP = new JLabel("PROGRAM OUTCOMES");
		lblP.setHorizontalAlignment(SwingConstants.CENTER);
		lblP.setFont(new Font("Khmer OS System", Font.BOLD, 26));
		lblP.setBounds(755, 618, 461, 45);
		contentPane.add(lblP);
		
		JLabel lblEvents = new JLabel("EVENTS");
		
		lblEvents.setHorizontalAlignment(SwingConstants.CENTER);
		lblEvents.setFont(new Font("Khmer OS System", Font.BOLD, 26));
		lblEvents.setBounds(332, 328, 342, 45);
		contentPane.add(lblEvents);
		
		JLabel lblWorkshop = new JLabel("WORKSHOPS");
		lblWorkshop.setHorizontalAlignment(SwingConstants.CENTER);
		lblWorkshop.setFont(new Font("Khmer OS System", Font.BOLD, 26));
		lblWorkshop.setBounds(846, 328, 342, 45);
		contentPane.add(lblWorkshop);
		
		JButton button = new JButton("");
		Image img3= new ImageIcon(this.getClass().getResource("/vision.png")).getImage();
		button.setIcon(new ImageIcon(img3));
		button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				vision v=new vision();
				v.setVisible(true);
				dispose();
			}
		});
		button.setBounds(460, 530, 95, 76);
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		Image img4= new ImageIcon(this.getClass().getResource("/po.png")).getImage();
		button_1.setIcon(new ImageIcon(img4));
		button_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				program_outcomes o = new program_outcomes();
				o.setVisible(true);
				dispose();
			}
			
		});
		button_1.setBounds(932, 530, 95, 76);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("");
		Image img= new ImageIcon(this.getClass().getResource("/eventf.png")).getImage();
		button_2.setIcon(new ImageIcon(img));

		button_2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				events event= new events();
				event.setVisible(true);
				dispose();
			}
		});
		button_2.setBounds(460, 240, 88, 76);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("");
		Image img1= new ImageIcon(this.getClass().getResource("/workshop.png")).getImage();
		button_3.setIcon(new ImageIcon(img1));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				workshop w =new workshop();
				w.setVisible(true);
				dispose();
			}
		});
		button_3.setBounds(977, 240, 95, 76);
		contentPane.add(button_3);
		
		JLabel label_2 = new JLabel("DEPARTMENTAL");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Likhan", Font.BOLD, 30));
		label_2.setBounds(-53, 269, 444, 43);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("EVENT");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Likhan", Font.BOLD, 30));
		label_3.setBounds(5, 324, 327, 43);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("MANAGEMENT.");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Likhan", Font.BOLD, 30));
		label_4.setBounds(-21, 380, 399, 43);
		contentPane.add(label_4);
		
		JButton button_6 = new JButton("Exit....");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				dispose();
			}
		});
		button_6.setBounds(81, 552, 154, 34);
		contentPane.add(button_6);
		


				
		JLabel label_5 = new JLabel("");
		label_5.setOpaque(true);
		label_5.setBackground(Color.ORANGE);
		label_5.setBounds(-21, 0, 341, 743);
		contentPane.add(label_5);
		
		JButton btnNewButton = new JButton("");
		Image img5= new ImageIcon(this.getClass().getResource("/feedback.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(img5));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				feedbacks f =new feedbacks();
				f.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(692, 355, 88, 76);
		contentPane.add(btnNewButton);
		

		
		JLabel lblNewLabel = new JLabel("FEEDBACK");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Khmer OS System", Font.BOLD, 26));
		lblNewLabel.setBounds(613, 443, 248, 54);
		contentPane.add(lblNewLabel);
		
		
		
		
	}
}
