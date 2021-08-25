import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DetailsConfirm extends JFrame {
    private JPanel DCPanel;
    public JTextField textField1;
    public JTextField textField2;
    public JTextField textField3;
    public JTextField textField4;
    public JTextField textField5;
    public JTextField textField6;
    public JTextField textField7;
    private JButton submitButton;
    private JButton goBackButton;
    public JTextField textField8;
    public JTextField textField9;
    public JTextField textField10;


    public DetailsConfirm(){

        add(DCPanel);
        setSize(1000,600);

        textField1.setEditable(false);
        textField2.setEditable(false);
        textField3.setEditable(false);
        textField4.setEditable(false);
        textField5.setEditable(false);
        textField6.setEditable(false);
        textField7.setEditable(false);
        textField8.setEditable(false);
        textField9.setEditable(false);
        textField10.setEditable(false);

        //Font newTextFieldFont = new Font(BOLD);

        textField1.setFont(textField1.getFont().deriveFont(Font.BOLD));
        textField2.setFont(textField2.getFont().deriveFont(Font.BOLD));
        textField3.setFont(textField3.getFont().deriveFont(Font.BOLD));
        textField4.setFont(textField4.getFont().deriveFont(Font.BOLD));
        textField5.setFont(textField5.getFont().deriveFont(Font.BOLD));
        textField6.setFont(textField6.getFont().deriveFont(Font.BOLD));
        textField7.setFont(textField7.getFont().deriveFont(Font.BOLD));
        textField8.setFont(textField8.getFont().deriveFont(Font.BOLD));
        textField9.setFont(textField9.getFont().deriveFont(Font.BOLD));
        textField10.setFont(textField10.getFont().deriveFont(Font.BOLD));


        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                SaleConfirm sc = new SaleConfirm();
                sc.setVisible(true);
                dispose();
            }
        });

        goBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Sale s = new Sale();
                s.setVisible(true);
                dispose();
            }
        });


    }
}
