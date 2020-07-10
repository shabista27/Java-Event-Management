package mini;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class verfication extends JFrame {

	private JPanel username;
	private JPasswordField password;

	String driverName = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/project?verifyServerCertificate=false&useSSL=true";
	String userName = "root";
	String Password = "root";
	private JTextField textField;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					verfication frame = new verfication();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public verfication()
	{
		
		setBounds(460, 280, 360, 160);
		username = new JPanel();
		username.setBackground(new Color(240, 255, 240));
		username.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(username);
		username.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username : ");
		lblUsername.setForeground(UIManager.getColor("Button.foreground"));
		lblUsername.setFont(new Font("Dialog", Font.BOLD, 16));
		lblUsername.setBounds(12, 12, 126, 29);
		username.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setForeground(UIManager.getColor("Button.foreground"));
		lblPassword.setFont(new Font("Dialog", Font.BOLD, 16));
		lblPassword.setBounds(12, 53, 126, 21);
		username.add(lblPassword);
		
		password = new JPasswordField();
		password.setBounds(146, 55, 182, 20);
		username.add(password);
		
		textField = new JTextField();
		textField.setBounds(146, 17, 182, 21);
		username.add(textField);
		textField.setColumns(10);
		
		JButton btnSubmit = new JButton("Login");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String user=textField.getText();
				String pass=password.getText();
				String dest="Admin";
				
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
						new_event n=new new_event();
						n.setVisible(true);
						
						dispose();
						
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Invalid"+"!");
						events ev= new events();
						ev.setVisible(true);
						
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
		btnSubmit.setBounds(249, 87, 79, 25);
		username.add(btnSubmit);
		
		
	}
	
	
}
