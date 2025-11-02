// Main Frame
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrameGUI extends JFrame implements ActionListener
{
    JButton transactionbtn;

    public MainFrameGUI()
    {
        setTitle("BANK MANAGEMENT SYSTEM");
        setSize(1480, 1480);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel title = new JLabel("WELCOME TO BANK MANAGEMENT SYSTEM");
        title.setFont(new Font("Times New Roman", Font.BOLD, 32));
        title.setBounds(350, 20, 860, 70);
        add(title);

        transactionbtn = new JButton("CASH DEPOSIT");
        transactionbtn.setBounds(530, 140, 260, 70);
        transactionbtn.setForeground(Color.WHITE);
        transactionbtn.setBackground(new Color(30,40,125));
        transactionbtn.setFont(new Font("Arial", Font.BOLD, 18));
        transactionbtn.addActionListener(this);
        add(transactionbtn);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == transactionbtn)
        {
             new TransactionGUI();
        }
    }

    public static void main(String[] args)
    {
        MainFrameGUI mfGUI = new MainFrameGUI();
    }
}