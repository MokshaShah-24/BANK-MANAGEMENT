//// PinChange.java
//import javax.swing.*;
//import java.awt.event.*;
//
//public class PinChange extends JFrame implements ActionListener {
//    JPasswordField oldPinField, newPinField;
//    JButton changeButton;
//
//    public PinChange() {
//        setTitle("Change PIN");
//        setSize(300, 200);
//        setLayout(null);
//        setLocationRelativeTo(null);
//
//        JLabel oldPinLabel = new JLabel("Old PIN:");
//        oldPinLabel.setBounds(30, 30, 80, 25);
//        add(oldPinLabel);
//
//        oldPinField = new JPasswordField();
//        oldPinField.setBounds(120, 30, 120, 25);
//        add(oldPinField);
//
//        JLabel newPinLabel = new JLabel("New PIN:");
//        newPinLabel.setBounds(30, 70, 80, 25);
//        add(newPinLabel);
//
//        newPinField = new JPasswordField();
//        newPinField.setBounds(120, 70, 120, 25);
//        add(newPinField);
//
//        changeButton = new JButton("Change PIN");
//        changeButton.setBounds(80, 110, 120, 30);
//        changeButton.addActionListener(this);
//        add(changeButton);
//
//        setVisible(true);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        String oldPin = new String(oldPinField.getPassword());
//        String newPin = new String(newPinField.getPassword());
//
//        // You should implement Account.verifyPin() and Account.changePin() methods.
//        if (Account.verifyPin(oldPin)) {
//            Account.changePin(newPin);
//            JOptionPane.showMessageDialog(this, "PIN changed successfully!");
//            dispose(); // close the window
//        } else {
//            JOptionPane.showMessageDialog(this, "Incorrect old PIN!", "Error", JOptionPane.ERROR_MESSAGE);
//        }
//    }
//}
