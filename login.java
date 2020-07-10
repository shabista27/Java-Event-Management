package mini;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;



public class login extends JFrame
{

	private JPanel contentPane;
	private JTextField username;
	private JPasswordField password;
	String dest="";

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	
	
	public login()
	{
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 5000, 5000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("G.H.RAISONI INSTITUTE OF ENGINEERING AND TECHNOLOGY");
		lblNewLabel.setFont(new Font("Century Schoolbook L", Font.BOLD, 37));
		lblNewLabel.setBounds(66, 29, 1311, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("LOGIN");
		lblNewLabel_1.setFont(new Font("Khmer OS System", Font.BOLD, 27));
		lblNewLabel_1.setBounds(795, 116, 190, 43);
		contentPane.add(lblNewLabel_1);
		
		JLabel Username = new JLabel("USERNAME:");
		Username.setFont(new Font("Dialog", Font.BOLD, 22));
		Username.setBounds(569, 220, 175, 28);
		contentPane.add(Username);
		
		JLabel label_2 = new JLabel("PASSWORD:");
		label_2.setFont(new Font("Dialog", Font.BOLD, 22));
		label_2.setBounds(569, 286, 175, 28);
		contentPane.add(label_2);
		
		JLabel label_1 = new JLabel("DESIGNATION:");
		label_1.setFont(new Font("Dialog", Font.BOLD, 22));
		label_1.setBounds(569, 380, 190, 34);
		contentPane.add(label_1);
		
		username = new JTextField();
		
		username.setBounds(762, 220, 344, 27);
		contentPane.add(username);
		username.setColumns(10);
		
		password = new JPasswordField();
		
		password.setBounds(762, 286, 344, 28);
		contentPane.add(password);
		
		String dest[]= {"Student","Teacher","Admin"};
		JComboBox comboBox_1 = new JComboBox(dest);
		comboBox_1.setBounds(777, 388, 245, 24);
		contentPane.add(comboBox_1);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				String user=username.getText();
				String pass=password.getText();
				String dest = (String)comboBox_1.getSelectedItem();
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection(url,userName,Password);
					Statement stmt=con.createStatement();
					String sql="select * from REGISTRATION where Email='"
						    +user+"'and password='"+pass+"'and Designation = '"+dest+"'";
						 
					ResultSet rs=stmt.executeQuery(sql);
					
					if (rs.next())
					{
						JOptionPane.showMessageDialog(null," logged.."+"!");
						if(dest=="Student")
						{
							session1 s = new session1();
							s.setVisible(true);
							dispose();
						}
						else if(dest=="Admin" || dest=="Teacher")
						{
							main b= new main();
							b.setVisible(true);
							dispose();
						}
						else
						{
							main b= new main();
							b.setVisible(true);
							dispose();
					    }
						
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Invalid"+"!");
						login o = new login();
						o.setVisible(true);
						dispose();
					}
					
					
					dispose();
					
				}
				catch(Exception ex)
				{
				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
				JOptionPane.ERROR_MESSAGE);
				}
				
				
			}
		});
		btnLogin.setFont(new Font("Dialog", Font.BOLD, 20));
		btnLogin.setBounds(813, 560, 144, 28);
		contentPane.add(btnLogin);
		
		JLabel lblAreYouA = new JLabel("Are you a new user?");
		lblAreYouA.setFont(new Font("Dialog", Font.BOLD, 15));
		lblAreYouA.setBounds(740, 634, 245, 15);
		contentPane.add(lblAreYouA);
		
		JButton btnSignIn = new JButton("Sign up");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				registration register = new registration();
				register.setVisible(true);
				dispose();
			}
		});
		btnSignIn.setBounds(931, 629, 114, 25);
		contentPane.add(btnSignIn);
		
		JLabel label_3 = new JLabel("EVENT");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Likhan", Font.BOLD, 30));
		label_3.setBounds(10, 302, 327, 43);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("DEPARTMENTAL");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Likhan", Font.BOLD, 30));
		label_4.setBounds(-48, 247, 444, 43);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("MANAGEMENT.");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Likhan", Font.BOLD, 30));
		label_5.setBounds(-16, 358, 399, 43);
		contentPane.add(label_5);
		
		
		
		
		
		JButton button = new JButton("Exit....");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				dispose();
			}
		});
		button.setBounds(84, 479, 154, 34);
		contentPane.add(button);
		
		JLabel label = new JLabel("");
		label.setOpaque(true);
		label.setBackground(Color.ORANGE);
		label.setBounds(-6, 0, 351, 743);
		contentPane.add(label);
	
		
	}
}