import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Details extends JFrame
{

    private JButton goBackButton;
    private JButton submitButton;
    private JPanel Details;
    public JTextField textField1;
    public JTextField textField2;
    public JTextField textField3;
    public JTextField textField4;
    public JTextField textField5;
    public JTextField textField6;
    public JTextField textField7;
    public JTextField textField8;
    public JTextField textField9;
    public JTextField textField10;

    public Details()
    {
        add(Details);
        setSize(1000,500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        textField1.setEditable(false);
        textField4.setEditable(false);
        textField5.setEditable(false);
        textField6.setEditable(false);
        textField7.setEditable(false);
        textField8.setEditable(false);
        textField9.setEditable(false);
        textField2.setEditable(false);
        textField10.setEditable(false);
        textField3.setEditable(false);
        goBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                Purchase p1 = new Purchase();
                p1.setVisible(true);
                dispose();
            }
        });

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                PurchaseSuccess s = new PurchaseSuccess();
                s.setVisible(true);
                dispose();

            }
        });
    }
}
