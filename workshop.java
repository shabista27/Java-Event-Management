package mini;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
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
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTable;

public class workshop extends JFrame {

	private JPanel contentPane;
	private JTable table;
	JFrame event_next;
	String driverName = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/project?verifyServerCertificate=false&useSSL=true";
	String userName = "root";
	String password = "root";
	int id;
	String attendence;
	String[] columnNames = {"Number of students attended ","PO's Achieved"};
	String workshop_name;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					events frame = new events();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public workshop() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,4000,3000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("G.H.RAISONI INSTITUTE OF ENGINEERING AND TECHNOLOGY ");
		label.setFont(new Font("Century Schoolbook L", Font.BOLD, 37));
		label.setBounds(63, 12, 1383, 67);
		contentPane.add(label);
		
		JLabel lblDepartmentOfComputer = new JLabel("DEPARTMENT OF COMPUTER ENGINEERING &  INFORMATION TECHNOLOGY");
		lblDepartmentOfComputer.setHorizontalAlignment(SwingConstants.CENTER);
		lblDepartmentOfComputer.setFont(new Font("FreeSans", Font.BOLD, 24));
		lblDepartmentOfComputer.setBounds(323, 86, 895, 54);
		contentPane.add(lblDepartmentOfComputer);
		

		JLabel att = new JLabel("");
		att.setFont(new Font("Khmer OS System", Font.BOLD, 40));
		att.setBounds(378, 506, 141, 98);
		contentPane.add(att);
		
		JLabel label_1 = new JLabel("DEPARTMENTAL");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Likhan", Font.BOLD, 30));
		label_1.setBounds(-53, 269, 444, 43);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("EVENT");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Likhan", Font.BOLD, 30));
		label_2.setBounds(5, 324, 327, 43);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("MANAGEMENT.");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Likhan", Font.BOLD, 30));
		label_3.setBounds(-21, 380, 399, 43);
		contentPane.add(label_3);
		
		
		JButton button = new JButton("MAIN MENU ");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				main m=new main();
				m.setVisible(true);
				dispose();
			}
		});
		button.setBounds(80, 549, 154, 34);
		button.setVisible(true);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Exit....");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_1.setBounds(80, 608, 154, 34);
		contentPane.add(button_1);
		
		
		
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Khmer OS System", Font.BOLD, 25));
		comboBox.setBounds(821, 274, 391, 41);
		contentPane.add(comboBox);
		
		try
		{ 
			
		Class.forName(driverName); 
		Connection con = DriverManager.getConnection(url, userName, password);
		String sql = "select * from Workshop";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		int i =0;
		while(rs.next())
		{
			comboBox.addItem(rs.getString("Name"));
			
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
		
		
		
		
		JLabel lblSelectEvent = new JLabel("SELECT WORKSHOP:");
		lblSelectEvent.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectEvent.setFont(new Font("Khmer OS System", Font.BOLD, 30));
		lblSelectEvent.setBounds(392, 266, 376, 54);
		contentPane.add(lblSelectEvent);
		
		JLabel label_4 = new JLabel("");
		label_4.setOpaque(true);
		label_4.setBackground(Color.ORANGE);
		label_4.setBounds(-11, -12, 343, 743);
		contentPane.add(label_4);
		
		JLabel lblNewLabel = new JLabel("Attended By :");
		lblNewLabel.setFont(new Font("Khmer OS System", Font.BOLD, 18));
		lblNewLabel.setBounds(344, 471, 141, 25);
		contentPane.add(lblNewLabel);
		
		//JLabel label_6 = new JLabel("Program Outcomes:");
		//label_6.setFont(new Font("Khmer OS System", Font.BOLD, 18));
		//label_6.setBounds(572, 471, 170, 25);
		//contentPane.add(label_6);
		
		JLabel Pos = new JLabel();
		Pos.setFont(new Font("Khmer OS System", Font.BOLD, 30));
		Pos.setBounds(603, 508, 139, 67);
		contentPane.add(Pos);
		
		JLabel label_8 = new JLabel("Date:");
		label_8.setFont(new Font("Khmer OS System", Font.BOLD, 18));
		label_8.setBounds(834, 471, 156, 25);
		contentPane.add(label_8);
		
		JLabel date = new JLabel();
		date.setFont(new Font("Khmer OS System", Font.BOLD, 20));
		date.setBounds(851, 508, 139, 67);
		contentPane.add(date);
		
		JLabel label_10 = new JLabel("Guest Of Honour");
		label_10.setFont(new Font("Khmer OS System", Font.BOLD, 18));
		label_10.setBounds(1032, 471, 156, 25);
		contentPane.add(label_10);
		
		JLabel goh = new JLabel();
		goh.setFont(new Font("Khmer OS System", Font.BOLD, 24));
		goh.setBounds(1066, 508, 271, 67);
		contentPane.add(goh);
		
		JButton btnDetails = new JButton("Details");
		btnDetails.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				workshop_name = (String) comboBox.getSelectedItem();
				
				
				
				try
				{ 
				
				Class.forName(driverName); 
				Connection con = DriverManager.getConnection(url, userName, password);
				String sql = "select * from Workshop where Name = '"+workshop_name+"'";
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				int i =0;
				
				if(rs.next())
				{
					
					att.setText(rs.getString("Attendedby"));
					Pos.setText(rs.getString("Pos"));
					date.setText(rs.getString("Date"));
					goh.setText(rs.getString("Guest"));
					
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
				
			
			}
			
		});
		btnDetails.setBounds(939, 359, 170, 30);
		contentPane.add(btnDetails);
		
		
		JButton btnAttendenceSheet = new JButton("Attendence Sheet");
		btnAttendenceSheet.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				showTableData();
			}
		});
		btnAttendenceSheet.setBounds(726, 650, 170, 30);
		contentPane.add(btnAttendenceSheet);
		
		JButton btnNewWorkshop = new JButton("New Workshop");
		btnNewWorkshop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				verfication v=new verfication();
				v.setVisible(true);
				dispose();
			}
		});
		btnNewWorkshop.setBounds(1190, 674, 147, 25);
		contentPane.add(btnNewWorkshop);
		

		
		

		

		
		
	
	}
	
	protected void showTableData() 
	
	{

		event_next = new JFrame("Attendence");
		
		event_next.getContentPane().setLayout(new BorderLayout()); 
		
		DefaultTableModel model1 = new DefaultTableModel();
		
		table = new JTable();
		table.setModel(model1); 
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setFillsViewportHeight(true);
		JScrollPane scroll = new JScrollPane(table);
		scroll.setHorizontalScrollBarPolicy(
		JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(
		JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 

		long r_no=0;
		String name="";
		String phone ="";
		String date="";
		String Bname="BLOOD_DONATION";
		float Hb;
		String bg;
		 
		try
		{ 
			
		Class.forName(driverName); 
		Connection con = DriverManager.getConnection(url, userName, password);
		String sql = "SELECT * FROM "+workshop_name;
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		int i =0;
		while(rs.next())
		{
			if(workshop_name.contentEquals(Bname))
			{
				r_no=rs.getInt("Record_no");
				name = rs.getString("Name");
				bg = rs.getString("blood_group");
				Hb=rs.getFloat("HB");
				phone = rs.getString("Ph_No");
			
			String[] blood= {"Record_No","Name","blood_group","fit","Phone Numbers"};

			model1.setColumnIdentifiers(blood);
			model1.addRow(new Object[]{r_no,name,bg,Hb,phone});
			}
			else
			{
				r_no=rs.getInt("Record_no");
				name = rs.getString("Name");
				date = rs.getString("Date");
				phone = rs.getString("Ph_No");
				
				
				String[] columnNames = {"Record","Name","Date","Phone Number"};
				model1.setColumnIdentifiers(columnNames);
				model1.addRow(new Object[]{r_no,name,date,phone});
			}
			
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
		
		event_next.getContentPane().add(scroll);
		event_next.setVisible(true);
		event_next.setSize(400,300);
		event_next.setBounds(0,0,4000,3000);
		
		JButton button_6 = new JButton("Exit....");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				dispose();
			}
		});
		button_6.setBounds(80, 608, 154, 34);
		contentPane.add(button_6);
		
		JButton button_4 = new JButton("LOG IN ");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				login l=new login();
				l.setVisible(true);
				dispose();
			}
		});
		
		button_4.setBounds(80, 556, 154, 34);
		contentPane.add(button_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setOpaque(true);
		label_5.setBackground(Color.ORANGE);
		label_5.setBounds(2, 0, 318, 743);
		contentPane.add(label_5);
		
		
		
	

}
	}

