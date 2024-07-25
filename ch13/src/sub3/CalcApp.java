package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class CalcApp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcApp frame = new CalcApp();
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
	public CalcApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 289, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("나눔고딕", Font.PLAIN, 24));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("0");
		textField.setBounds(12, 10, 248, 51);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.setBounds(12, 80, 53, 51);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.setBounds(77, 80, 53, 51);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("9");
		btnNewButton_1_1.setBounds(142, 80, 53, 51);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("/");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1_1.setBounds(207, 80, 53, 51);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_2 = new JButton("4");
		btnNewButton_2.setBounds(12, 141, 53, 51);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1_2 = new JButton("5");
		btnNewButton_1_2.setBounds(77, 141, 53, 51);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_1_2 = new JButton("6");
		btnNewButton_1_1_2.setBounds(142, 141, 53, 51);
		contentPane.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_1_1_1 = new JButton("x");
		btnNewButton_1_1_1_1.setBounds(207, 141, 53, 51);
		contentPane.add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_3 = new JButton("1");
		btnNewButton_3.setBounds(12, 202, 53, 51);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_1_3 = new JButton("2");
		btnNewButton_1_3.setBounds(77, 202, 53, 51);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_1_3 = new JButton("3");
		btnNewButton_1_1_3.setBounds(142, 202, 53, 51);
		contentPane.add(btnNewButton_1_1_3);
		
		JButton btnNewButton_1_1_1_2 = new JButton("-");
		btnNewButton_1_1_1_2.setBounds(207, 202, 53, 51);
		contentPane.add(btnNewButton_1_1_1_2);
		
		JButton btnNewButton_3_1 = new JButton("C");
		btnNewButton_3_1.setBounds(12, 263, 53, 51);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_1_3_1 = new JButton("0");
		btnNewButton_1_3_1.setBounds(77, 263, 53, 51);
		contentPane.add(btnNewButton_1_3_1);
		
		JButton btnNewButton_1_1_3_1 = new JButton("=");
		btnNewButton_1_1_3_1.setBounds(142, 263, 53, 51);
		contentPane.add(btnNewButton_1_1_3_1);
		
		JButton btnNewButton_1_1_1_2_1 = new JButton("+");
		btnNewButton_1_1_1_2_1.setBounds(207, 263, 53, 51);
		contentPane.add(btnNewButton_1_1_1_2_1);
	}

}
