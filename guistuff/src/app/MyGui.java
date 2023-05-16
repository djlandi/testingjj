package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyGui extends JFrame {

	private JPanel contentPane;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtGradeLevel;
	private JTextField txtFavGame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyGui frame = new MyGui();
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
	public MyGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 384, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFirstName = new JLabel("Enter First Name:");
		lblFirstName.setBounds(67, 52, 139, 14);
		contentPane.add(lblFirstName);
		
		txtFirstName = new JTextField();
		txtFirstName.setBounds(216, 49, 129, 20);
		contentPane.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		JLabel lblLastName = new JLabel("Enter Last Name:");
		lblLastName.setBounds(67, 106, 115, 14);
		contentPane.add(lblLastName);
		
		txtLastName = new JTextField();
		txtLastName.setColumns(10);
		txtLastName.setBounds(216, 103, 129, 20);
		contentPane.add(txtLastName);
		
		txtGradeLevel = new JTextField();
		txtGradeLevel.setColumns(10);
		txtGradeLevel.setBounds(216, 150, 129, 20);
		contentPane.add(txtGradeLevel);
		
		txtFavGame = new JTextField();
		txtFavGame.setColumns(10);
		txtFavGame.setBounds(216, 196, 129, 20);
		contentPane.add(txtFavGame);
		
		JLabel lblGradeLevel = new JLabel("Enter Grade Level");
		lblGradeLevel.setBounds(67, 153, 115, 14);
		contentPane.add(lblGradeLevel);
		
		JLabel lblFavGame = new JLabel("Enter Fav Game");
		lblFavGame.setBounds(67, 199, 115, 14);
		contentPane.add(lblFavGame);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSubmit.setBounds(140, 269, 89, 23);
		contentPane.add(btnSubmit);
	}
}
