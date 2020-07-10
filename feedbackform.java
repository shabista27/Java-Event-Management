package mini;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JComboBox;

public class feedbackform extends JFrame {

	private JPanel contentPane;
	private JTextField name1;
	private JTextField textField_1;
	private JTextField textField;

	String driverName = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/project?verifyServerCertificate=false&useSSL=true";
	String userName = "root";
	String Password = "root";
	String rating="";
	String dest="";
	String session="";
	String feedback="";
	String s="";
	String event_name="";
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					feedbackform frame = new feedbackform();
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
	public feedbackform() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,5000,5000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("G.H.RAISONI INSTITUTE OF ENGINEERING AND TECHNOLOGY");
		lblNewLabel.setFont(new Font("Century Schoolbook L", Font.BOLD, 37));
		lblNewLabel.setBounds(43, 30, 1311, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("FEEDBACK FORM");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 30));
		lblNewLabel_1.setBounds(565, 129, 547, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel name = new JLabel("NAME:");
		name.setFont(new Font("Dialog", Font.BOLD, 20));
		name.setBounds(449, 186, 111, 23);
		contentPane.add(name);
		
		name1 = new JTextField();
		
		name1.setBounds(591, 186, 333, 28);
		contentPane.add(name1);
		name1.setColumns(10);
		
		JLabel lblDesignation = new JLabel("DESIGNATION:");
		lblDesignation.setFont(new Font("Dialog", Font.BOLD, 17));
		lblDesignation.setBounds(439, 262, 156, 15);
		contentPane.add(lblDesignation);
		
		JRadioButton rdbtnStudent = new JRadioButton("STUDENT");
		rdbtnStudent.setFont(new Font("Dialog", Font.BOLD, 17));
		rdbtnStudent.setBounds(593, 259, 144, 23);
		contentPane.add(rdbtnStudent);
		
		JRadioButton rdbtnTeacher = new JRadioButton("TEACHER");
		rdbtnTeacher.setFont(new Font("Dialog", Font.BOLD, 17));
		rdbtnTeacher.setBounds(593, 300, 144, 23);
		contentPane.add(rdbtnTeacher);
		
		JRadioButton rdbtnGuest = new JRadioButton("GUEST");
		rdbtnGuest.setFont(new Font("Dialog", Font.BOLD, 17));
		rdbtnGuest.setBounds(593, 340, 144, 23);
		contentPane.add(rdbtnGuest);
		
		JLabel lblNewLabel_2 = new JLabel("FEEDBACK:");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNewLabel_2.setBounds(449, 387, 123, 15);
		contentPane.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(591, 461, 403, 24);
		contentPane.add(comboBox);
		
		try
		{ 
			
		Class.forName(driverName); 
		Connection con = DriverManager.getConnection(url, userName, Password);
		String sql = "select * from Session";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		int i =0;
		while(rs.next())
		{
			comboBox.addItem(rs.getString("Session_Name"));
			
		i++; 
		}
		if(i <1)
		{
		JOptionPane.showMessageDialog(null, "No Record Found","Error",
		JOptionPane.ERROR_MESSAGE);
		}
		}
		catch(Exception ex)
		{
		JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
		JOptionPane.ERROR_MESSAGE);
		}
		
	
		
		textField_1 = new JTextField();
		textField_1.setBounds(591, 387, 403, 43);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblRating = new JLabel("RATING:");
		lblRating.setFont(new Font("Dialog", Font.BOLD, 17));
		lblRating.setBounds(465, 532, 102, 15);
		contentPane.add(lblRating);
		
		JRadioButton rdbtnOutstanding = new JRadioButton("OUTSTANDING");
		rdbtnOutstanding.setFont(new Font("Dialog", Font.BOLD, 14));
		rdbtnOutstanding.setBounds(581, 529, 144, 23);
		contentPane.add(rdbtnOutstanding);
		
		JRadioButton rdbtnGood = new JRadioButton("GOOD");
		rdbtnGood.setFont(new Font("Dialog", Font.BOLD, 14));
		rdbtnGood.setBounds(581, 568, 144, 23);
		contentPane.add(rdbtnGood);
		
		JRadioButton rdbtnNotSatisfied = new JRadioButton("NOT SATISFIED");
		rdbtnNotSatisfied.setFont(new Font("Dialog", Font.BOLD, 14));
		rdbtnNotSatisfied.setBounds(581, 608, 156, 23);
		contentPane.add(rdbtnNotSatisfied);
		
		JLabel lblSessionName = new JLabel("Session Name:");
		lblSessionName.setFont(new Font("Dialog", Font.BOLD, 17));
		lblSessionName.setBounds(439, 470, 165, 15);
		contentPane.add(lblSessionName);
		
	
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if(rdbtnOutstanding.isSelected())
				{
					rating="Outstanding";
				}
				else if(rdbtnNotSatisfied.isSelected())
				{
					rating="Not Satisfied";
				}
				else
				{
					rating="Good";
				}
				if(rdbtnStudent.isSelected())
				{
					 dest="Student";
				}
				else if(rdbtnTeacher.isSelected())
				{
					 dest="Teacher";
				}
				else
				{
					 dest="Guest";
				}
				
			    s=name1.getText();
			    feedback=textField_1.getText();
			    event_name = (String) comboBox.getSelectedItem();
			    
			    
			    
			    try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection(url,userName,Password);
					String query = " insert into feedback (Name,Designation,rating,feedback,Session) values(?, ?, ?, ?, ?)";
					PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(query);
					
					preparedStmt.setString(1,s);
					preparedStmt.setString(2,dest);
					preparedStmt.setString(3,rating);
					preparedStmt.setString(4,feedback);
					preparedStmt.setString(5,event_name);
					
					
					
					preparedStmt.execute();
				      
				      con.close();
				}
				catch(Exception ex)
				{
				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
				JOptionPane.ERROR_MESSAGE);
				}
			    JOptionPane.showMessageDialog(null,"Sucessfully Feedback Recorded....Thank You");
				feedbacks f=new feedbacks();
				f.setVisible(true);
			    dispose();
				
			}
			
		});
		
		btnSubmit.setFont(new Font("Dialog", Font.BOLD, 14));
		btnSubmit.setBounds(1048, 630, 127, 28);
		contentPane.add(btnSubmit);
		
		JLabel lblWords = new JLabel("(50 words only)");
		lblWords.setBounds(449, 414, 123, 15);
		contentPane.add(lblWords);
		
		JLabel label = new JLabel("DEPARTMENTAL");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Likhan", Font.BOLD, 30));
		label.setBounds(-69, 209, 444, 43);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("EVENT");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Likhan", Font.BOLD, 30));
		label_1.setBounds(-25, 265, 327, 43);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("MANAGEMENT.");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Likhan", Font.BOLD, 30));
		label_2.setBounds(-51, 320, 399, 43);
		contentPane.add(label_2);
		
		JButton button = new JButton("Main Menu");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			main m=new main();
			m.setVisible(true);
			dispose();
			}
		});
		button.setBounds(41, 458, 192, 41);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Exit...");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_1.setBounds(41, 511, 192, 41);
		contentPane.add(button_1);
		
		JLabel label_3 = new JLabel("");
		label_3.setOpaque(true);
		label_3.setBackground(Color.ORANGE);
		label_3.setBounds(0, 0, 330, 743);
		contentPane.add(label_3);
		
		JLabel SessionName = new JLabel("Session Name:");
		SessionName.setFont(new Font("Dialog", Font.BOLD, 17));
		SessionName.setBounds(439, 470, 165, 15);
		contentPane.add(SessionName);
		
		
		
		
	
	}
}