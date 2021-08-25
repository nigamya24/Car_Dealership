import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CONFIRMATION extends JFrame {
    private JPanel Panel_Confirm;
    private JButton goBackButton;
    private JButton submitButton;
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

    public CONFIRMATION(){
        add(Panel_Confirm);
        setSize(1000,500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
        goBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                RENTAL R = new RENTAL();
                R.setVisible(true);
                dispose();
            }
        });
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                SUCCESS S = new SUCCESS();
                S.setVisible(true);
                dispose();
            }
        });
    }
}
