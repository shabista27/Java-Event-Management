package mini;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollBar;

public class attendence extends JFrame {

	private JPanel contentPane;
	int id;
	int att;
	static String event;
	String driverName = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/project?verifyServerCertificate=false&useSSL=true";
	String userName = "root";
	String password = "root";
	private JTextField name;
	private JTextField c_name;
	private JTextField phone_no;
	private JTextField email_id;
	String student,cl,mail,no;
	private JTable table;
	String[] columnNames = {"Name","CLass","Phone Number","Email Id"};
	DefaultTableModel model1 = new DefaultTableModel();
	private JTable table_1;
	private JTable table_2;

	
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					attendence frame = new attendence(event);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void valuePassed(int fid, int fatt,String n)
	{
		
		id=fid;
		fatt=att;
		event=n;
		
	}
	public attendence(String event)
	{
		System.out.print(event);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,4000,3000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("G.H.RAISONI INSTITUTE OF ENGINEERING AND TECHNOLOGY ");
		label.setFont(new Font("Century Schoolbook L", Font.BOLD, 37));
		label.setBounds(43, 12, 1383, 67);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("DEPARTMENT OF COMPUTER ENGINEERING & INFORMATION TECHNOLOGY");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("FreeSans", Font.BOLD, 24));
		label_1.setBounds(252, 91, 927, 54);
		contentPane.add(label_1);
		
		JLabel lblEnterAttendenceSheet = new JLabel("Enter Attendence Sheet");
		lblEnterAttendenceSheet.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterAttendenceSheet.setFont(new Font("Khmer OS System", Font.BOLD, 30));
		lblEnterAttendenceSheet.setBounds(380, 170, 597, 34);
		contentPane.add(lblEnterAttendenceSheet);
		
		JLabel lblName = new JLabel("Name : ");
		lblName.setFont(new Font("Khmer OS System", Font.BOLD, 25));
		lblName.setBounds(17, 248, 135, 34);
		contentPane.add(lblName);
		
		JLabel lblPhoneNo = new JLabel("Phone No:");
		lblPhoneNo.setFont(new Font("Khmer OS System", Font.BOLD, 25));
		lblPhoneNo.setBounds(17, 383, 135, 46);
		contentPane.add(lblPhoneNo);
		
		JLabel lblClass = new JLabel("Class: ");
		lblClass.setFont(new Font("Khmer OS System", Font.BOLD, 25));
		lblClass.setBounds(17, 322, 110, 34);
		contentPane.add(lblClass);
		
		JLabel lblEmailid = new JLabel("Email Id: ");
		lblEmailid.setFont(new Font("Khmer OS System", Font.BOLD, 25));
		lblEmailid.setBounds(12, 467, 140, 34);
		contentPane.add(lblEmailid);
		
		name = new JTextField();
		name.setBounds(108, 248, 289, 28);
		contentPane.add(name);
		name.setColumns(10);
		
		c_name = new JTextField();
		c_name.setColumns(10);
		c_name.setBounds(108, 322, 289, 28);
		contentPane.add(c_name);
		
		phone_no = new JTextField();
		phone_no.setColumns(10);
		phone_no.setBounds(151, 383, 289, 28);
		contentPane.add(phone_no);
		
		email_id = new JTextField();
		email_id.setColumns(10);
		email_id.setBounds(136, 467, 289, 28);
		contentPane.add(email_id);
		
		DefaultTableModel model = new DefaultTableModel();
		
		table_2 = new JTable(model);
		model.setColumnIdentifiers(columnNames);
		
		table_2.setBounds(500, 216, 854, 471);
		contentPane.add(table_2);
		
		
		JScrollPane scrollPane = new JScrollPane(table_2);
		scrollPane.setBounds(463, 216, 854, 471);
		contentPane.add(scrollPane);
		
		JButton btnSubmit = new JButton("Next Entry");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				student=name.getText();
				cl=c_name.getText();
				no=phone_no.getText();
				mail=email_id.getText();
				
				try
				{ 
					
				Class.forName(driverName); 
				Connection conn = DriverManager.getConnection(url, userName, password);
				int i=1;
				
					String query = " insert into "+event +" (Name,Class,Phone_No,Email_ID) values(?, ?, ?, ?)";
					 PreparedStatement preparedStmt = conn.prepareStatement(query);
					  
					preparedStmt.setString(1, student);
					preparedStmt.setString(2, cl);
					preparedStmt.setString(3, no);
					preparedStmt.setString(4, mail);
					//preparedStmt.setInt(4,id);
				
					
					model.addRow(new Object[]{student,cl,no,mail});
					i++;
					preparedStmt.execute();

				
							   
				conn.close();
				}
				catch(Exception ex)
				{	
					System.out.print("from attendence");

					
				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
				JOptionPane.ERROR_MESSAGE);
				
				}
				
				
			}
			
		});
		btnSubmit.setBounds(43, 531, 114, 34);
		contentPane.add(btnSubmit);
		
		JButton btnDone = new JButton("Done");
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				main m=new main();
				m.setVisible(true);
				dispose();
			}
		});
		btnDone.setBounds(339, 662, 114, 25);
		contentPane.add(btnDone);
		
	
		
		
	
	
		
		

}
}
