package mini;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import mini.main;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class session1 extends JFrame {

	String driverName = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/project?verifyServerCertificate=false&useSSL=true";
	String userName = "root";
	String password = "root";
	String event_name="";
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					session1 frame = new session1();
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
	public session1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,5000,5000);
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
		lblDepartmentOfComputer.setBounds(323, 86, 967, 54);
		contentPane.add(lblDepartmentOfComputer);
		
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
		

		
	
		
		JLabel lblSelectSessionName = new JLabel("EVENTS CONDUCTED BY OUR DEPARTMENT:");
		lblSelectSessionName.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectSessionName.setFont(new Font("Khmer OS System", Font.BOLD, 30));
		lblSelectSessionName.setBounds(427, 314, 768, 54);
		contentPane.add(lblSelectSessionName);
		
		JLabel label1 = new JLabel("");
		label1.setOpaque(true);
		label1.setBackground(Color.ORANGE);
		label1.setBounds(-6, 0, 351, 743);
		contentPane.add(label1);
		
		

		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Khmer OS System", Font.BOLD, 25));
		comboBox.setBounds(561, 410, 391, 41);
		contentPane.add(comboBox);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				dispose();
			}
		});
		btnExit.setBounds(1025, 608, 114, 25);
		contentPane.add(btnExit);
		

		
		
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
	
		
	
}
