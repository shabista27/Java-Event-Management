package mini;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class events extends JFrame {

	private JPanel contentPane;
	private JTable table;
	JFrame event_next,po,verification;
	String driverName = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/project?verifyServerCertificate=false&useSSL=true";
	String userName = "root";
	String password = "root";
	int id;
	int attendence;
	String[] columnNames = {"Number of students attended ","PO's Achieved"};
	String event_name;
	JTextField textField;
	JPasswordField pass;
	
	
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


	public events() {
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
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Khmer OS System", Font.BOLD, 25));
		comboBox.setBounds(827, 275, 391, 41);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Attended by: ");
		lblNewLabel.setFont(new Font("Khmer OS System", Font.BOLD, 18));
		lblNewLabel.setBounds(394, 463, 156, 25);
		contentPane.add(lblNewLabel);
		
		
		try
		{ 
			
		Class.forName(driverName); 
		Connection con = DriverManager.getConnection(url, userName, password);
		String sql = "select * from Event";
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
		

		
		
		JLabel lblSelectEvent = new JLabel("SELECT EVENT:");
		lblSelectEvent.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectEvent.setFont(new Font("Khmer OS System", Font.BOLD, 30));
		lblSelectEvent.setBounds(433, 275, 376, 54);
		contentPane.add(lblSelectEvent);
		
		
		JLabel att = new JLabel();
		att.setFont(new Font("Khmer OS System", Font.BOLD, 45));
		
		att.setBounds(411, 500, 139, 67);
		contentPane.add(att);
		
		/*JLabel po = new JLabel();
		po.setFont(new Font("Khmer OS System", Font.BOLD, 30));
		po.setBounds(632, 500, 139, 67);
		contentPane.add(po);
		*/
		
		
		
	//	JLabel lblProgramOutcomes = new JLabel("Program Outcomes:");
		//lblProgramOutcomes.setFont(new Font("Khmer OS System", Font.BOLD, 18));
		//lblProgramOutcomes.setBounds(601, 463, 170, 25);
		//contentPane.add(lblProgramOutcomes);
		
		JLabel dte = new JLabel();
		dte.setFont(new Font("Khmer OS System", Font.BOLD, 20));
		dte.setBounds(880, 500, 139, 67);
		contentPane.add(dte);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setFont(new Font("Khmer OS System", Font.BOLD, 18));
		lblDate.setBounds(863, 463, 156, 25);
		contentPane.add(lblDate);
		
		JLabel lblGuestOfHonour = new JLabel("Guest Of Honour");
		lblGuestOfHonour.setFont(new Font("Khmer OS System", Font.BOLD, 18));
		lblGuestOfHonour.setBounds(1061, 463, 156, 25);
		contentPane.add(lblGuestOfHonour);
		
		JLabel goh = new JLabel();
		goh.setFont(new Font("Khmer OS System", Font.BOLD, 24));
		goh.setBounds(1095, 500, 271, 67);
		contentPane.add(goh);

		
		JButton btnDetails = new JButton("Details");
		btnDetails.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				event_name = (String) comboBox.getSelectedItem();
				
				try
				{ 
					
				Class.forName(driverName); 
				Connection con = DriverManager.getConnection(url, userName, password);
				String sql = "select * from Event where Name = '"+event_name+"'";
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				int i =0;
				if(rs.next())
				{
					att.setText(rs.getString("Attendedby"));
					//po.setText(rs.getString("Pos"));
					dte.setText(rs.getString("Date"));
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
		btnDetails.setBounds(873, 355, 170, 30);
		contentPane.add(btnDetails);
		
	
		
		
		JButton btnAttendenceSheet = new JButton("Attendence Sheet");
		btnAttendenceSheet.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				showTableData();
				
			}
		});
		btnAttendenceSheet.setBounds(729, 650, 274, 30);
		contentPane.add(btnAttendenceSheet);
		
		JLabel label_1 = new JLabel("DEPARTMENTAL");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Likhan", Font.BOLD, 30));
		label_1.setBounds(-70, 228, 444, 43);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("EVENT");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Likhan", Font.BOLD, 30));
		label_2.setBounds(-12, 283, 327, 43);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("MANAGEMENT.");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Likhan", Font.BOLD, 30));
		label_3.setBounds(-38, 339, 399, 43);
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
		button.setBounds(82, 532, 154, 34);
		button.setVisible(true);
		contentPane.add(button);
		
		
		
		JButton btnExit = new JButton("Exit...");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				dispose();
			}
		});
		btnExit.setBounds(96, 594, 129, 25);
		contentPane.add(btnExit);
		
		JLabel label_4 = new JLabel("");
		label_4.setOpaque(true);
		label_4.setBackground(Color.ORANGE);
		label_4.setBounds(-2, 0, 330, 743);
		contentPane.add(label_4);
		
		JButton btnNewEvent = new JButton("New Event");
		btnNewEvent.addActionListener(new ActionListener(
			) {
			 public void actionPerformed(java.awt.event.ActionEvent evt) {
				 verfication v=new verfication();
				v.setVisible(true);
				
				dispose();
				 
	            }
		});
		btnNewEvent.setBounds(1162, 670, 192, 41);
		contentPane.add(btnNewEvent);
		
		/*JButton btnDetails_1 = new JButton("details");
		btnDetails_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				pos();
			}
		});
		btnDetails_1.setBounds(611, 505, 114, 25);
		contentPane.add(btnDetails_1);
		*/
			
	
	}
	
	protected void showTableData() 
	
	{

		event_next = new JFrame("Database Search Result");
		//event_next.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		event_next.getContentPane().setLayout(new BorderLayout()); 
		String[] columnNames = {"Record","Name","Date","Phone Number"};
		DefaultTableModel model1 = new DefaultTableModel();
		model1.setColumnIdentifiers(columnNames);
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
		
		
		try
		{ 
			
		Class.forName(driverName); 
		Connection con = DriverManager.getConnection(url, userName, password);
		String sql = "SELECT * FROM "+event_name;
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		int i =0;
		while(rs.next())
		{
			r_no=rs.getInt("R_no");
			name = rs.getString("Name");
			date = rs.getString("Date");
			phone = rs.getString("Phone_No");

			model1.addRow(new Object[]{r_no,name,date,phone});
			
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
	
		setVisible(true);

}
	



protected void pos()
{

	po = new JFrame("Database Search Result");
	//po.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	po.getContentPane().setLayout(new BorderLayout()); 
	String[] columnNames = {"PO1","P02","PO3","PO4","PO5","PO6","PO7","PO8","PO9","PO10","PO11","PO12"};
	DefaultTableModel model1 = new DefaultTableModel();
	model1.setColumnIdentifiers(columnNames);
	table = new JTable();
	table.setModel(model1); 
	table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
	table.setFillsViewportHeight(true);
	JScrollPane scroll = new JScrollPane(table);
	scroll.setHorizontalScrollBarPolicy(
	JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	scroll.setVerticalScrollBarPolicy(
	JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
	
	
	
	po.getContentPane().add(scroll);
	po.setVisible(true);
	po.setSize(400,300);
	po.setBounds(500,400,500,200);
	

}


}