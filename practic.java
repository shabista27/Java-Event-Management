package mini;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class practic extends JFrame 
{
	String driverName = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/project?verifyServerCertificate=false&useSSL=true";
	String userName = "root";
	String password = "root";
	String n="";
	String attendence="";
	String dt="";
	String guest="";
	float pos=0;
	int res=0;
	String nam="";
	int fid;
	int fatt;
	
	private JPanel contentPane;
	private JTextField name;
	private JTextField att;
	private JTextField goh;
	private JTextField date;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new_event frame = new new_event();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public practic() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,4000,3000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("G.H.RAISONI INSTITUTE OF ENGINEERING AND TECHNOLOGY ");
		label.setFont(new Font("Century Schoolbook L", Font.BOLD, 37));
		label.setBounds(54, 12, 1383, 67);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("DEPARTMENT OF COMPUTER ENGINEERING & INFORMATION TECHNOLOGY");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("FreeSans", Font.BOLD, 24));
		label_1.setBounds(342, 78, 927, 54);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("DEPARTMENTAL");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Likhan", Font.BOLD, 30));
		label_2.setBounds(-78, 295, 444, 43);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("EVENT");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Likhan", Font.BOLD, 30));
		label_3.setBounds(-20, 350, 327, 43);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("MANAGEMENT.");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Likhan", Font.BOLD, 30));
		label_4.setBounds(-46, 406, 399, 43);
		contentPane.add(label_4);
		
		JButton button = new JButton("Main Menu");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				main m=new main();
				m.setVisible(true);
				dispose();
			}
		});
		button.setBounds(54, 569, 154, 34);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Exit....");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_1.setBounds(54, 615, 154, 34);
		contentPane.add(button_1);
		
		JLabel label_5 = new JLabel("");
		label_5.setOpaque(true);
		label_5.setBackground(Color.ORANGE);
		label_5.setBounds(0, 0, 341, 743);
		contentPane.add(label_5);
		
		JLabel lblNewLabel = new JLabel("New Events Or Workshop");
		lblNewLabel.setFont(new Font("Khmer OS System", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(471, 154, 597, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblWhatYouWant = new JLabel("What you want to enter :");
		lblWhatYouWant.setFont(new Font("Khmer OS System", Font.BOLD, 25));
		lblWhatYouWant.setBounds(353, 235, 321, 34);
		contentPane.add(lblWhatYouWant);
		
		JRadioButton rdbtnEvents = new JRadioButton("Event");
		rdbtnEvents.setFont(new Font("Dialog", Font.BOLD, 20));
		rdbtnEvents.setBackground(Color.WHITE);
		rdbtnEvents.setBounds(692, 235, 144, 38);
		contentPane.add(rdbtnEvents);
		
		JRadioButton rdbtnWorkshop = new JRadioButton("Workshop");
		rdbtnWorkshop.setFont(new Font("Dialog", Font.BOLD, 20));
		rdbtnWorkshop.setBackground(Color.WHITE);
		rdbtnWorkshop.setBounds(850, 232, 144, 38);
		contentPane.add(rdbtnWorkshop);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Event Name: ");
		lblNewLabel_1.setFont(new Font("Khmer OS System", Font.BOLD, 20));
		lblNewLabel_1.setBounds(368, 316, 184, 34);
		contentPane.add(lblNewLabel_1);
		
		name = new JTextField();
		name.setBounds(614, 320, 314, 27);
		contentPane.add(name);
		name.setColumns(10);
		
		JLabel lblNoOfStudents = new JLabel("No Of Students Attended : ");
		lblNoOfStudents.setFont(new Font("Khmer OS System", Font.BOLD, 20));
		lblNoOfStudents.setBounds(368, 395, 242, 34);
		contentPane.add(lblNoOfStudents);
		
		att = new JTextField();
		att.setColumns(10);
		att.setBounds(614, 395, 314, 27);
		contentPane.add(att);
		JLabel lblGuestOfHonour = new JLabel("Guest Of Honour : ");
		lblGuestOfHonour.setFont(new Font("Khmer OS System", Font.BOLD, 20));
		lblGuestOfHonour.setBounds(368, 471, 184, 34);
		contentPane.add(lblGuestOfHonour);
		
		goh = new JTextField();
		goh.setColumns(10);
		goh.setBounds(614, 475, 314, 27);
		contentPane.add(goh);
		
		JLabel lblProgramOutcomesAcheievd = new JLabel("Program Outcomes Achieved: ");
		lblProgramOutcomesAcheievd.setFont(new Font("Khmer OS System", Font.BOLD, 20));
		lblProgramOutcomesAcheievd.setBounds(368, 547, 293, 34);
		contentPane.add(lblProgramOutcomesAcheievd);
		
		JLabel lblDate = new JLabel("Date Of Event :");
		lblDate.setFont(new Font("Khmer OS System", Font.BOLD, 20));
		lblDate.setBounds(368, 654, 232, 34);
		contentPane.add(lblDate);
		
		date = new JTextField();
		date.setColumns(10);
		date.setBounds(614, 658, 314, 27);
		contentPane.add(date);
		JCheckBox PO1 = new JCheckBox("PO1");
		PO1.setFont(new Font("Khmer OS System", Font.BOLD, 20));
		PO1.setBackground(Color.WHITE);
		PO1.setBounds(653, 553, 75, 23);
		contentPane.add(PO1);
		
		JCheckBox PO2 = new JCheckBox("PO2");
		PO2.setFont(new Font("Khmer OS System", Font.BOLD, 20));
		PO2.setBackground(Color.WHITE);
		PO2.setBounds(732, 553, 75, 23);
		contentPane.add(PO2);
		
		JCheckBox PO3 = new JCheckBox("PO3");
		PO3.setFont(new Font("Khmer OS System", Font.BOLD, 20));
		PO3.setBackground(Color.WHITE);
		PO3.setBounds(811, 553, 75, 23);
		contentPane.add(PO3);
		
		JCheckBox PO4 = new JCheckBox("PO4");
		PO4.setFont(new Font("Khmer OS System", Font.BOLD, 20));
		PO4.setBackground(Color.WHITE);
		PO4.setBounds(884, 553, 75, 23);
		contentPane.add(PO4);
		
		JCheckBox PO5 = new JCheckBox("PO5");
		PO5.setFont(new Font("Khmer OS System", Font.BOLD, 20));
		PO5.setBackground(Color.WHITE);
		PO5.setBounds(958, 553, 75, 23);
		contentPane.add(PO5);
		
		JCheckBox PO6 = new JCheckBox("PO6");
		PO6.setFont(new Font("Khmer OS System", Font.BOLD, 20));
		PO6.setBackground(Color.WHITE);
		PO6.setBounds(653, 580, 75, 23);
		contentPane.add(PO6);
		
		JCheckBox PO7 = new JCheckBox("PO7");
		PO7.setFont(new Font("Khmer OS System", Font.BOLD, 20));
		PO7.setBackground(Color.WHITE);
		PO7.setBounds(732, 580, 75, 23);
		contentPane.add(PO7);
		
		JCheckBox PO8 = new JCheckBox("PO8");
		PO8.setFont(new Font("Khmer OS System", Font.BOLD, 20));
		PO8.setBackground(Color.WHITE);
		PO8.setBounds(811, 580, 75, 23);
		contentPane.add(PO8);
		
		JCheckBox PO9 = new JCheckBox("PO9");
		PO9.setFont(new Font("Khmer OS System", Font.BOLD, 20));
		PO9.setBackground(Color.WHITE);
		PO9.setBounds(884, 580, 75, 23);
		contentPane.add(PO9);
		
		JCheckBox PO10 = new JCheckBox("PO10");
		PO10.setFont(new Font("Khmer OS System", Font.BOLD, 20));
		PO10.setBackground(Color.WHITE);
		PO10.setBounds(958, 580, 75, 23);
		contentPane.add(PO10);
		
		JCheckBox PO11 = new JCheckBox("PO11");
		PO11.setFont(new Font("Khmer OS System", Font.BOLD, 20));
		PO11.setBackground(Color.WHITE);
		PO11.setBounds(653, 608, 85, 23);
		contentPane.add(PO11);
		
		JCheckBox PO12 = new JCheckBox("PO12");
		PO12.setFont(new Font("Khmer OS System", Font.BOLD, 20));
		PO12.setBackground(Color.WHITE);
		PO12.setBounds(811, 608, 97, 23);
		contentPane.add(PO12);
		


		
		JButton btnEnterAttendenceSheet = new JButton("Enter Attendence Sheet");
		btnEnterAttendenceSheet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				n=name.getText();
				attendence=att.getText();
				guest=goh.getText();
				dt=date.getText();
				if(PO1.isSelected())
				{
					res+=20;
				}
				if(PO2.isSelected())
				{
					res+=10;
				}
				if(PO3.isSelected())
				{
					res+=10;
				}
				if(PO4.isSelected())
				{
					res+=5;
				}
				if(PO5.isSelected())
				{
					res+=10;
				}
				if(PO6.isSelected())
				{
					res+=5;
				}
				if(PO7.isSelected())
				{
					res+=5;
				}
				if(PO8.isSelected())
				{
					res+=10;
				}
				if(PO9.isSelected())
				{
					res+=10;
				}
				if(PO10.isSelected())
				{
					res+=10;
				}
				if(PO11.isSelected())
				{
					res+=5;
				}
				if(PO12.isSelected())
				{
					res+=5;
				}
				int flag=1;
				if(!n.matches("[a-zA-Z- ]+"))
				{
					JOptionPane.showMessageDialog(null,"Invalid name......");
					flag=0;
				}
				if(!attendence.matches(("[0-9]+")))
				{
					JOptionPane.showMessageDialog(null,"Attendence is not Numerical");
					flag=0;
				}
				if(!guest.matches("[a-zA-Z]+"))
				{
					JOptionPane.showMessageDialog(null,"Invalid Guest Name");
					flag=0;
				}
				
				pos=res;
				
				
				try
				{ 
					
				Class.forName(driverName); 
				Connection con = DriverManager.getConnection(url, userName, password);
				int i =0;
				
				if(rdbtnEvents.isSelected())
				{
					String query = " insert into trial (Name,Attendedby,Date,Guest,Pos) values(?, ?, ?, ?, ?)";
					PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(query);
					
					if(flag==1)
					{
					preparedStmt.setString(1,n);
					preparedStmt.setString(2,attendence);
					preparedStmt.setString(3,dt);
					preparedStmt.setString(4,guest);
					preparedStmt.setFloat(5,pos);
					
					i++;
					}
					
					
					preparedStmt.execute();
				      
				      con.close();
					}
					if(i <1)
					{
					JOptionPane.showMessageDialog(null, "No Record Found","Error",
					JOptionPane.ERROR_MESSAGE);
					}
					
					
					if(rdbtnWorkshop.isSelected())
					{
						String query = " insert into trial1 (Name,Attendedby,Pos,Guest,Date) values(?, ?, ?, ?, ?)";
						PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(query);
						
						if(flag==1)
						{
						preparedStmt.setString(1,n);
						preparedStmt.setString(2,attendence);
						preparedStmt.setFloat(3,pos);
						preparedStmt.setString(4,guest);
						preparedStmt.setString(5,dt);
						
						i++;
						}
						
						
						preparedStmt.execute();
					      
					      con.close();
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
				
			
				
				try
				{ 
					
				Class.forName(driverName); 
				Connection con = DriverManager.getConnection(url, userName, password);
				String sql = "SELECT Event_Id,Attendedby,Name FROM trial where Name= '"+n+"'";
				PreparedStatement ps = con.prepareStatement(sql);
				
				ResultSet rs = ps.executeQuery();
			
				if(rs.next())
				{
				
					fid = rs.getInt("Event_id");
					fatt=rs.getInt("Attendedby");
					nam=rs.getString("Name");
					
				}
				}
				
				
					
				catch(Exception ex)
				{
					
				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
				JOptionPane.ERROR_MESSAGE);
				}
				
				
			try 
			{
				
				 String sql= "CREATE TABLE "+nam+" (" 
				            + "Record_Number INT NOT NULL primary key AUTO_INCREMENT,"  
				            + "Name VARCHAR(90),"
				            + "Class Varchar(30)," 
				            + "Phone_No varchar(10),"  
				            + "Email_ID varchar(80),"
				            + "Event_Id int)";  
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection(url,userName ,password);
				Statement statement=con.createStatement();
				statement = con.createStatement();
		      
		        statement.executeUpdate(sql);
					 
				
			}
			
			catch(Exception e1) 
			{
			
				System.out.println(e1);
				
			}
		
				
			
			attendence att=new attendence(nam);
			att.setVisible(true);
			
			
			dispose();
			}
			
		});
		btnEnterAttendenceSheet.setBounds(1037, 424, 259, 54);
		contentPane.add(btnEnterAttendenceSheet);

	}			
	



}