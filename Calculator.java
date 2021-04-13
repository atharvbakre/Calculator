package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField display;
	private double firstnum;
	private double secondnum;
	private String operation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 331, 393);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		display = new JTextField();
		display.setFont(new Font("Arial", Font.PLAIN, 15));
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setBounds(10, 11, 294, 37);
		frame.getContentPane().add(display);
		display.setColumns(10);

		JButton buttonSquare = new JButton(" x\u00B2");
		buttonSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(display.getText() != null) {
						String result;
						double num = Double.parseDouble(display.getText().toString());
						num = num*num;
						result = Double.toString(num);
						display.setText(result);
					}
				}catch(Exception e1) {
					
				}

			}
		});
		buttonSquare.setFont(new Font("Arial", Font.BOLD, 20));
		buttonSquare.setBounds(10, 59, 66, 48);
		frame.getContentPane().add(buttonSquare);

		JButton buttonClear = new JButton("C");
		buttonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				display.setText(null);

			}
		});
		buttonClear.setFont(new Font("Arial", Font.BOLD, 20));
		buttonClear.setBounds(86, 59, 66, 48);
		frame.getContentPane().add(buttonClear);

		JButton buttonPercent = new JButton("%");
		buttonPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(display.getText().toString());
				display.setText("");
				operation = "%";
				
			}
		});
		buttonPercent.setFont(new Font("Arial", Font.BOLD, 20));
		buttonPercent.setBounds(162, 59, 66, 48);
		frame.getContentPane().add(buttonPercent);

		JButton buttonDivide = new JButton("/");
		buttonDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(display.getText().toString());
				display.setText("");
				operation = "/";
				
			}
		});
		buttonDivide.setFont(new Font("Arial", Font.BOLD, 20));
		buttonDivide.setBounds(238, 59, 66, 48);
		frame.getContentPane().add(buttonDivide);

		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String value = display.getText() + button_7.getText();
				display.setText(value);
			}
		});
		button_7.setFont(new Font("Arial", Font.BOLD, 20));
		button_7.setBounds(10, 118, 66, 48);
		frame.getContentPane().add(button_7);

		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String value = display.getText() + button_4.getText();
				display.setText(value);
			}
		});
		button_4.setFont(new Font("Arial", Font.BOLD, 20));
		button_4.setBounds(10, 177, 66, 48);
		frame.getContentPane().add(button_4);

		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String value = display.getText() + button_1.getText();
				display.setText(value);
			}
		});
		button_1.setFont(new Font("Arial", Font.BOLD, 20));
		button_1.setBounds(10, 236, 66, 48);
		frame.getContentPane().add(button_1);

		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String value = display.getText() + button_8.getText();
				display.setText(value);
			}
		});
		button_8.setFont(new Font("Arial", Font.BOLD, 20));
		button_8.setBounds(86, 118, 66, 48);
		frame.getContentPane().add(button_8);

		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String value = display.getText() + button_5.getText();
				display.setText(value);
			}
		});
		button_5.setFont(new Font("Arial", Font.BOLD, 20));
		button_5.setBounds(86, 177, 66, 48);
		frame.getContentPane().add(button_5);

		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String value = display.getText() + button_2.getText();
				display.setText(value);
			}
		});
		button_2.setFont(new Font("Arial", Font.BOLD, 20));
		button_2.setBounds(86, 236, 66, 48);
		frame.getContentPane().add(button_2);

		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String value = display.getText() + button_9.getText();
				display.setText(value);
			}
		});
		button_9.setFont(new Font("Arial", Font.BOLD, 20));
		button_9.setBounds(162, 118, 66, 48);
		frame.getContentPane().add(button_9);

		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String value = display.getText() + button_6.getText();
				display.setText(value);
			}
		});
		button_6.setFont(new Font("Arial", Font.BOLD, 20));
		button_6.setBounds(162, 177, 66, 48);
		frame.getContentPane().add(button_6);

		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String value = display.getText() + button_3.getText();
				display.setText(value);
			}
		});
		button_3.setFont(new Font("Arial", Font.BOLD, 20));
		button_3.setBounds(162, 236, 66, 48);
		frame.getContentPane().add(button_3);

		JButton buttonSubstract = new JButton("-");
		buttonSubstract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(display.getText().toString());
				display.setText("");
				operation = "-";
				
			}
		});
		buttonSubstract.setFont(new Font("Arial", Font.BOLD, 20));
		buttonSubstract.setBounds(236, 118, 66, 48);
		frame.getContentPane().add(buttonSubstract);

		JButton buttonMultiply = new JButton("*");
		buttonMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(display.getText().toString());
				display.setText("");
				operation = "*";
				
			}
		});
		buttonMultiply.setFont(new Font("Arial", Font.BOLD, 20));
		buttonMultiply.setBounds(238, 177, 66, 48);
		frame.getContentPane().add(buttonMultiply);

		JButton buttonAdd = new JButton("+");
		buttonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(display.getText().toString());
				display.setText("");
				operation = "+";
				
			}
		});
		buttonAdd.setFont(new Font("Arial", Font.BOLD, 20));
		buttonAdd.setBounds(238, 236, 66, 107);
		frame.getContentPane().add(buttonAdd);

		JButton buttonDot = new JButton(".");
		buttonDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String value = display.getText() + buttonDot.getText();
				display.setText(value);
			}
		});
		buttonDot.setFont(new Font("Arial", Font.BOLD, 20));
		buttonDot.setBounds(86, 295, 66, 48);
		frame.getContentPane().add(buttonDot);

		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String value = display.getText() + button_0.getText();
				display.setText(value);
			}
		});
		button_0.setFont(new Font("Arial", Font.BOLD, 20));
		button_0.setBounds(10, 295, 66, 48);
		frame.getContentPane().add(button_0);

		JButton buttonEqulas = new JButton("=");
		buttonEqulas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				secondnum = Double.parseDouble(display.getText().toString());
				String result;
				switch(operation) {
					case "+":
						result = Double.toString(firstnum + secondnum);
						display.setText(result);
						break;
					case "-":
						result = Double.toString(firstnum - secondnum);
						display.setText(result);
						break;
					case "*":
						result = Double.toString(firstnum * secondnum);
						display.setText(result);
						break;
					case "/":
						result = Double.toString(firstnum / secondnum);
						display.setText(result);
						break;
					case "%":
						result = Double.toString(firstnum % secondnum);
						display.setText(result);
						break;
				}
				
			}
		});
		buttonEqulas.setFont(new Font("Arial", Font.BOLD, 20));
		buttonEqulas.setBounds(162, 295, 66, 48);
		frame.getContentPane().add(buttonEqulas);
	}

}
