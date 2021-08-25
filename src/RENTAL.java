import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class RENTAL extends JFrame {
    private JPanel Panel_Root;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JTextField textField4;
    private JCheckBox requiredCheckBox;
    private JComboBox comboBox6;
    private JButton submitButton;
    private JCheckBox notRequiredCheckBox;

    public RENTAL(){
        add(Panel_Root);
        setTitle("RENTAL");
        setSize(1000,500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(textField1.getText().equals(""))
                    JOptionPane.showMessageDialog(new JFrame(), "Please Enter Name");
                else if(textField2.getText().equals(""))
                    JOptionPane.showMessageDialog(new JFrame(), "Please Enter Phone Number");
                else if(textField3.getText().equals(""))
                    JOptionPane.showMessageDialog(new JFrame(), "Please Enter Address");
                else if(comboBox1.getSelectedItem().equals("Choose Build"))
                    JOptionPane.showMessageDialog(new JFrame(), "Please Select Build Type");
                else if(comboBox2.getSelectedItem().equals("Choose Year"))
                    JOptionPane.showMessageDialog(new JFrame(), "Please Select Year");
                else if(comboBox3.getSelectedItem().equals("Select Ownership"))
                    JOptionPane.showMessageDialog(new JFrame(), "Please Select Ownership");
                else if(comboBox4.getSelectedItem().equals("Choose Manufacturer"))
                    JOptionPane.showMessageDialog(new JFrame(), "Please Select Manufacturer");
                else if(comboBox6.getSelectedItem().equals("Choose Fuel Type"))
                    JOptionPane.showMessageDialog(new JFrame(), "Please Select Fuel Type");
                else if(!(requiredCheckBox.isSelected() || notRequiredCheckBox.isSelected()))
                    JOptionPane.showMessageDialog(new JFrame(), "Please Select FastTag Option");
                else{
                    if(requiredCheckBox.isSelected())
                        JOptionPane.showMessageDialog(new JFrame(), "Please talk to our executive regarding FastTag.");
                    CONFIRMATION C = new CONFIRMATION();
                    C.setVisible(true);
                    String S1 = textField1.getText();
                    String S2 = textField2.getText();
                    String S3 = textField3.getText();
                    String S4 = comboBox1.getSelectedItem().toString();
                    String S5 = comboBox2.getSelectedItem().toString();
                    String S6 = comboBox3.getSelectedItem().toString();
                    String S7 = comboBox4.getSelectedItem().toString();
                    String S8 = comboBox6.getSelectedItem().toString();
                    C.textField1.setText(S1);
                    C.textField2.setText(S2);
                    C.textField3.setText(S3);
                    C.textField4.setText(S4);
                    C.textField5.setText(S5);
                    C.textField6.setText(S6);
                    C.textField7.setText(S7);
                    if(textField4.getText().equals(""))
                        C.textField8.setText("NA");
                    else {
                        String S9 = textField4.getText();
                        C.textField8.setText(S9);
                    }
                    if(requiredCheckBox.isSelected())
                        C.textField9.setText("Required");
                    else
                        C.textField9.setText("Not Required");
                    C.textField10.setText(S8);
                    dispose();
                }
            }
        });
        requiredCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent IE) {
                if (IE.getStateChange() == ItemEvent.SELECTED)
                    notRequiredCheckBox.setEnabled(false);
                else
                    notRequiredCheckBox.setEnabled(true);
                }
        });
        notRequiredCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent IE) {
                if(IE.getStateChange() == ItemEvent.SELECTED)
                    requiredCheckBox.setEnabled(false);
                else
                    requiredCheckBox.setEnabled(true);
            }
        });
    }
}
