package mini;

import java.awt.BorderLayout;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Canvas;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.util.regex.Pattern;
import java.awt.Color;
import javax.swing.JPasswordField;

public class registration extends JFrame
{

	private JPanel contentPane;
	private JTextField name;
	private JTextField dob;
	private JTextField phone;
	private JTextField city;
	private JTextField email;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	String gender="";
	String dest="";
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registration frame = new registration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	String driverName = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/project?verifyServerCertificate=false&useSSL=true";
	String userName = "root";
	String Password = "root";
	
	public registration()
	{

		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,4000,3000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel title = new JLabel("G.H.RAISONI INSTITUTE OF ENGINEERING AND TECHNOLOGY ");
		title.setFont(new Font("Century Schoolbook L", Font.BOLD, 37));
		title.setBounds(70, 12, 1383, 67);
		contentPane.add(title);
		
		JLabel lblBranchComputer = new JLabel("DEPARTMENT OF COMPUTER ENGINEERING &  INFORMATION TECHNOLOGY");
		lblBranchComputer.setHorizontalAlignment(SwingConstants.CENTER);
		lblBranchComputer.setFont(new Font("FreeSans", Font.BOLD, 24));
		lblBranchComputer.setBounds(333, 91, 978, 54);
		contentPane.add(lblBranchComputer);
		
		JLabel lblRegistrationForm = new JLabel("REGISTRATION FORM");
		lblRegistrationForm.setFont(new Font("FreeSans", Font.BOLD, 23));
		lblRegistrationForm.setBounds(27, 157, 331, 50);
		contentPane.add(lblRegistrationForm);
		
		JLabel lblName = new JLabel("NAME: ");
		lblName.setFont(new Font("Khmer OS System", Font.BOLD, 17));
		lblName.setBounds(189, 231, 66, 39);
		contentPane.add(lblName);
		
		JLabel lblFacultystudent = new JLabel("DESIGNATION:");
		lblFacultystudent.setFont(new Font("Khmer OS System", Font.BOLD, 17));
		lblFacultystudent.setBounds(188, 360, 151, 41);
		contentPane.add(lblFacultystudent);
		
		JLabel lblYear = new JLabel("YEAR:");
		lblYear.setFont(new Font("Khmer OS System", Font.BOLD, 17));
		lblYear.setBounds(189, 323, 66, 25);
		contentPane.add(lblYear);
		
		JRadioButton Student = new JRadioButton("STUDENT");
		Student.setBounds(357, 368, 144, 23);
		contentPane.add(Student);
		
		JRadioButton Teacher = new JRadioButton("TEACHER");
		Teacher.setBounds(357, 395, 144, 23);
		contentPane.add(Teacher);
		
		JRadioButton Guest = new JRadioButton("GUEST");
		Guest.setBounds(357, 422, 144, 23);
		contentPane.add(Guest);
			
		
		String branch[]= {"Computer Engineering","Information Technology"};
		JComboBox drop1 = new JComboBox(branch);
			
		
		drop1.setBounds(357, 281, 190, 25);
		contentPane.add(drop1);
		
		String year[]= {"S.E","T.E","B.E","Other..."};
		JComboBox drop2 = new JComboBox(year);
		String y = (String)drop2.getSelectedItem();
		drop2.setBounds(357, 321, 144, 24);
		contentPane.add(drop2);
		
		name = new JTextField();
		name.setBounds(357, 231, 360, 23);
		
		contentPane.add(name);
		name.setColumns(10);
		
		JLabel lblDateOfBirth = new JLabel("DATE OF BIRTH:");
		lblDateOfBirth.setFont(new Font("Khmer OS System", Font.BOLD, 17));
		lblDateOfBirth.setBounds(189, 476, 170, 33);
		contentPane.add(lblDateOfBirth);
		
		dob = new JTextField();
		dob.setBounds(357, 476, 144, 25);
		
		contentPane.add(dob);
		dob.setColumns(10);
		
		JLabel lblYyyymmdd = new JLabel("(YYYY-MM-DD)");
		lblYyyymmdd.setBounds(189, 498, 116, 23);
		contentPane.add(lblYyyymmdd);
		
		JLabel lblGender = new JLabel("GENDER:");
		lblGender.setFont(new Font("Khmer OS System", Font.BOLD, 17));
		lblGender.setBounds(189, 552, 101, 39);
		contentPane.add(lblGender);
		
		JRadioButton Female = new JRadioButton("FEMALE");
		Female.setBounds(360, 559, 95, 23);
		contentPane.add(Female);
		
		JRadioButton Male = new JRadioButton("MALE");
		Male.setBounds(459, 559, 81, 23);
		contentPane.add(Male);
		
		JRadioButton Other = new JRadioButton("OTHER");
		Other.setBounds(548, 559, 144, 23);
		contentPane.add(Other);
		
		
		JLabel lblBranch = new JLabel("BRANCH:");
		lblBranch.setFont(new Font("Khmer OS System", Font.BOLD, 17));
		lblBranch.setBounds(189, 282, 81, 24);
		contentPane.add(lblBranch);
		
		JLabel lblPhoneNo = new JLabel("PHONE NO: ");
		lblPhoneNo.setFont(new Font("Khmer OS System", Font.BOLD, 17));
		lblPhoneNo.setBounds(842, 237, 124, 27);
		contentPane.add(lblPhoneNo);
		
		phone = new JTextField();
		phone.setBounds(996, 231, 165, 25);
		
		contentPane.add(phone);
		phone.setColumns(10);
		
		JLabel lblCity = new JLabel("CITY:");
		lblCity.setFont(new Font("Khmer OS System", Font.BOLD, 17));
		lblCity.setBounds(842, 281, 86, 27);
		contentPane.add(lblCity);
		
		city = new JTextField();
		city.setBounds(996, 281, 165, 25);
		
		contentPane.add(city);
		city.setColumns(10);
		
		JLabel lblEmailId = new JLabel("EMAIL ID:");
		lblEmailId.setFont(new Font("Khmer OS System", Font.BOLD, 17));
		lblEmailId.setBounds(842, 324, 108, 23);
		contentPane.add(lblEmailId);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(996, 324, 170, 22);
		contentPane.add(email);
		
		JLabel lblPassword = new JLabel("PASSWORD:");
		lblPassword.setFont(new Font("Khmer OS System", Font.BOLD, 17));
		lblPassword.setBounds(842, 369, 108, 23);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
				
		passwordField.setBounds(996, 367, 170, 22);
		contentPane.add(passwordField);
		
		JLabel lblReenterPassword = new JLabel("CONFIRM PASSWORD:");
		lblReenterPassword.setFont(new Font("Khmer OS System", Font.BOLD, 17));
		lblReenterPassword.setBounds(842, 423, 201, 23);
		contentPane.add(lblReenterPassword);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(1036, 424, 170, 22);
		contentPane.add(passwordField_1);
		
		
		JButton submit1 = new JButton("SUBMIT");
		submit1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(Female.isSelected())
				{
					 gender="F";
				}
				else if(Male.isSelected())
				{
					gender="M";
				}
				else
				{
					 gender="O";
				}
				if(Student.isSelected())
				{
					 dest="Student";
				}
				else if(Teacher.isSelected())
				{
					 dest="Teacher";
				}
				else
				{
					 dest="Guest";
				}
				
				String s=name.getText();
				String city1=city.getText();
				String date=dob.getText();
				String num=phone.getText();
				String branch1 = (String)drop1.getSelectedItem();
				String mail=email.getText();
				String password=passwordField.getText();
				String conpassword=passwordField_1.getText(); 
				String y = (String)drop2.getSelectedItem();
				int flag=1;
				if(!s.matches("[a-zA-Z]+"))
				{
					JOptionPane.showMessageDialog(null,"Invalid name......");
					flag=0;
				}
				if(!num.matches(("[0-9]+")))
				{
					JOptionPane.showMessageDialog(null,"Invalid Phone Number......");
					flag=0;
				}
				if(!city1.matches("[a-zA-Z]+"))
				{
					JOptionPane.showMessageDialog(null,"Invalid City......");
					flag=0;
				}
				if(!date.matches("[0-9--]+"))
				{
					JOptionPane.showMessageDialog(null,"Invalid Date of Birth......");
					flag=0;
				}
				
				if(!(password.equals(conpassword)))
				{
					JOptionPane.showMessageDialog(null,"Password doesnt match");
					flag=0;
				}
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection(url,userName,Password);
					String query = " insert into REGISTRATION (Name,Branch,Year,DOB,Gender,Ph_No,city,Email,Designation,password) values(?, ?, ?, ?, ?, ?, ? ,? ,? ,?)";
					PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(query);
					if(flag==1)
					{
					preparedStmt.setString(1,s);
					preparedStmt.setString(2,branch1);
					preparedStmt.setString(3,y);
					preparedStmt.setString(4, date);
					preparedStmt.setString(5, gender);
					preparedStmt.setString(6, num);
					preparedStmt.setString(7, city1);
					preparedStmt.setString(8, mail);
					preparedStmt.setString(9, dest);
					preparedStmt.setString(10, password);
					}
					
					
					preparedStmt.execute();
				      
				      con.close();
				}
				catch(Exception ex)
				{
				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
				JOptionPane.ERROR_MESSAGE);
				}
				login l= new login();
				l.setVisible(true);
				dispose();
			}
			
		});
		
		submit1.setBounds(854, 532, 124, 33);
		contentPane.add(submit1);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				first m= new first();
				m.setVisible(true);
				dispose();
			}
		});
		btnCancel.setBounds(1026, 532, 124, 33);
		contentPane.add(btnCancel);
		
		JLabel label = new JLabel("");
		label.setOpaque(true);
		label.setBackground(Color.ORANGE);
		label.setBounds(0, -12, 318, 743);
		contentPane.add(label);
		
		
		
	}
}

