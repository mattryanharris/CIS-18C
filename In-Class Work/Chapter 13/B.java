import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class B {

	public static void main(String[] args) {
		JFrame f = new JFrame("Hourly Pay");
		f.setSize(460, 260);
		
		final Container c = f.getContentPane();
		c.setBackground(Color.black);
		c.setLayout(null);
		
		final JLabel lblPay = new JLabel("Hourly Pay: ");
		lblPay.setOpaque(true);
		lblPay.setLocation(25, 50);
		lblPay.setSize(110, 35);
		lblPay.setBackground(Color.black);
		lblPay.setForeground(Color.green);
		lblPay.setFont(new Font("courier new", Font.BOLD, 14));
		lblPay.setHorizontalAlignment(JLabel.LEFT);
		c.add(lblPay);
		
		
		final JLabel lblHours = new JLabel("Hours worked: ");
		lblHours.setOpaque(true);
		lblHours.setLocation(25, 100);
		lblHours.setSize(130, 35);
		lblHours.setBackground(Color.black);
		lblHours.setForeground(Color.green);
		lblHours.setFont(new Font("courier new", Font.BOLD, 14));
		lblHours.setHorizontalAlignment(JLabel.LEFT);
		c.add(lblHours);
		
		final JLabel lblGrossPay = new JLabel("Gross Pay: ");
		lblGrossPay.setOpaque(true);
		lblGrossPay.setLocation(25, 150);
		lblGrossPay.setSize(110, 35);
		lblGrossPay.setBackground(Color.black);
		lblGrossPay.setForeground(Color.green);
		lblGrossPay.setFont(new Font("courier new", Font.BOLD, 14));
		lblGrossPay.setHorizontalAlignment(JLabel.LEFT);
		c.add(lblGrossPay);
		
		final JLabel lblGross = new JLabel("");
		lblGross.setOpaque(true);
		lblGross.setLocation(150, 150);
		lblGross.setSize(110, 35);
		lblGross.setBackground(Color.white);
		lblGross.setForeground(Color.black);
		lblGross.setFont(new Font("courier new", Font.BOLD, 14));
		lblGross.setHorizontalAlignment(JLabel.CENTER);
		c.add(lblGross);
		
		final JTextField txtPay = new JTextField("");
		txtPay.setOpaque(true);
		txtPay.setLocation(150, 50);
		txtPay.setSize(110, 35);
		txtPay.setBackground(Color.white);
		txtPay.setForeground(Color.black);
		txtPay.setFont(new Font("courier new", Font.BOLD, 14));
		txtPay.setHorizontalAlignment(JLabel.CENTER);
		c.add(txtPay);
		
		final JTextField txtPayHours = new JTextField("");
		txtPayHours.setOpaque(true);
		txtPayHours.setLocation(150, 100);
		txtPayHours.setSize(110, 35);
		txtPayHours.setBackground(Color.white);
		txtPayHours.setForeground(Color.black);
		txtPayHours.setFont(new Font("courier new", Font.BOLD, 14));
		txtPayHours.setHorizontalAlignment(JLabel.CENTER);
		c.add(txtPayHours);
		
		final JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setOpaque(true);
		btnCalculate.setLocation(300, 50);
		btnCalculate.setSize(110, 35);
		btnCalculate.setBackground(Color.green);
		btnCalculate.setForeground(Color.black);
		btnCalculate.setFont(new Font("courier new", Font.BOLD, 14));
		btnCalculate.setHorizontalAlignment(JLabel.CENTER);
		c.add(btnCalculate);
		
		final JButton btnClear = new JButton("Clear");
		btnClear.setOpaque(true);
		btnClear.setLocation(300, 100);
		btnClear.setSize(110, 35);
		btnClear.setBackground(Color.red);
		btnClear.setForeground(Color.black);
		btnClear.setFont(new Font("courier new", Font.BOLD, 14));
		btnClear.setHorizontalAlignment(JLabel.CENTER);
		c.add(btnClear);
		
		//add listners for Calculate Button
		btnCalculate.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ev) {
			DecimalFormat currency = new DecimalFormat("0.00");
			double pay = Double.parseDouble(txtPay.getText());
			double hours = Double.parseDouble(txtPayHours.getText());
			lblGross.setText("$" + currency.format(pay * hours));
		}
		});
		
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				txtPay.setText("");
				txtPayHours.setText("");
				lblGross.setText("");
			}
			});
		

		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		
	}
}

