import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class DivisionCalculator {
public static void main(String[] args) {
JFrame frame = new JFrame("Integer Division Calculator");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(300, 200);
frame.setLayout(new GridLayout(4, 2, 10, 10));
JLabel num1Label = new JLabel("Num1:");
JTextField num1Field = new JTextField();
JLabel num2Label = new JLabel("Num2:");
JTextField num2Field = new JTextField();
JLabel resultLabel = new JLabel("Result:");
JTextField resultField = new JTextField();
resultField.setEditable(false);
JButton divideButton = new JButton("Divide");
divideButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
try {
int num1 = Integer.parseInt(num1Field.getText());
int num2 = Integer.parseInt(num2Field.getText());
int result = num1 / num2;
resultField.setText(String.valueOf(result));
} catch (NumberFormatException ex) {
JOptionPane.showMessageDialog(frame, "Please enter valid integers
for Num1 and Num2.", "Input Error", JOptionPane.ERROR_MESSAGE);
} catch (ArithmeticException ex) {

JOptionPane.showMessageDialog(frame, "Division by zero is not
allowed.", "Arithmetic Error", JOptionPane.ERROR_MESSAGE);
}
}
});
frame.add(num1Label);
frame.add(num1Field);
frame.add(num2Label);
frame.add(num2Field);
frame.add(resultLabel);
frame.add(resultField);
frame.add(new JLabel());
frame.add(divideButton);
frame.setVisible(true);
}
}
