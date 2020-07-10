package mini;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;

public class feedbacks extends JFrame {
	JFrame event_next;
	private JTable table;
	private JPanel contentPane;
	String driverName = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/project?verifyServerCertificate=false&useSSL=true";
	String userName = "root";
	String password = "root";
	String event_name="";
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					feedbacks frame = new feedbacks();
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
	public feedbacks() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,5000,5000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("G.H.RAISONI INSTITUTE OF ENGINEERING AND TECHNOLOGY ");
		label.setFont(new Font("Century Schoolbook L", Font.BOLD, 37));
		label.setBounds(67, 12, 1383, 67);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("DEPARTMENT OF COMPUTER ENGINEERING &  INFORMATION TECHNOLOGY");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("FreeSans", Font.BOLD, 24));
		label_1.setBounds(276, 91, 1052, 54);
		contentPane.add(label_1);
		
		JLabel lblSelectSessionName = new JLabel("SELECT SESSION NAME  : ");
		lblSelectSessionName.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectSessionName.setFont(new Font("Khmer OS System", Font.BOLD, 30));
		lblSelectSessionName.setBounds(532, 256, 444, 54);
		contentPane.add(lblSelectSessionName);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Khmer OS System", Font.BOLD, 25));
		comboBox.setBounds(560, 322, 391, 41);
		contentPane.add(comboBox);
		
		JButton btnFeedbacks = new JButton("Feedbacks");
		btnFeedbacks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				event_name = (String) comboBox.getSelectedItem();
				showTableData();
			}
		});
		btnFeedbacks.setBounds(580, 483, 341, 30);
		contentPane.add(btnFeedbacks);
		
		JLabel label_2 = new JLabel("DEPARTMENTAL");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Likhan", Font.BOLD, 30));
		label_2.setBounds(-74, 261, 444, 43);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("EVENT");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Likhan", Font.BOLD, 30));
		label_3.setBounds(-30, 317, 327, 43);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("MANAGEMENT.");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Likhan", Font.BOLD, 30));
		label_4.setBounds(-56, 372, 399, 43);
		contentPane.add(label_4);
		
		JButton button = new JButton("Main Menu");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main m=new main();
				m.setVisible(true);
				dispose();
				
			}
		});
		button.setBounds(30, 564, 192, 41);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Exit...");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_1.setBounds(30, 616, 192, 41);
		contentPane.add(button_1);
		
		JLabel label_5 = new JLabel("");
		label_5.setOpaque(true);
		label_5.setBackground(Color.ORANGE);
		label_5.setBounds(0, 0, 330, 743);
		contentPane.add(label_5);
		
		JButton button_2 = new JButton("New Feedback");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				feedbackform ff=new feedbackform();
				ff.setVisible(true);
				dispose();
			}
		});
		button_2.setBounds(1124, 624, 204, 25);
		contentPane.add(button_2);
		try
		{ 
			
		Class.forName(driverName); 
		Connection con = DriverManager.getConnection(url, userName, password);
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
		
	}
	

protected void showTableData() 

{

	event_next = new JFrame("Database Search Result");
	event_next.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	event_next.getContentPane().setLayout(new BorderLayout()); 
	String[] columnNames = {"Name","Designation","Rating","Feedbacks","Session"};
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
	String name="";
	String desi="";
	String rate="";
	String feedback="";
	String session="";
	
	
	
	try
	{ 
		
	Class.forName(driverName); 
	Connection con = DriverManager.getConnection(url, userName, password);
	String sql = "SELECT Name,Designation,rating,feedback,Session FROM feedback where Session='"+event_name+"'";
	PreparedStatement ps = con.prepareStatement(sql);
	
	ResultSet rs = ps.executeQuery();
	int i =0;
	while(rs.next())
	{
		name = rs.getString("Name");
		desi = rs.getString("Designation");
		rate = rs.getString("rating");
		feedback = rs.getString("feedback");
		session = rs.getString("Session");
	
		

		model1.addRow(new Object[]{name,desi,rate,feedback,session});
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
	


}
}




