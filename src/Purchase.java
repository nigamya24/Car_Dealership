import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Purchase extends JFrame
{
    private JPanel rootPanel;
    private JLabel Mylabel;
    private JTextField Mytext;
    private JTextField Mytext1;
    private JTextField Mytext2;
    private JLabel Mylabel1;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JTextField textField2;
    private JCheckBox requiredCheckBox;
    private JCheckBox notRequiredCheckBox;
    private JButton submitButton;
    private JComboBox comboBox5;
    private JComboBox comboBox6;

    public Purchase()
    {
        add(rootPanel);
        setTitle("Purchase");
        setSize(1000,500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
               if(Mytext.getText().equals(""))
               {
                   JOptionPane.showMessageDialog(new JFrame(),"Please enter name.");
               }
                else if(Mytext1.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(new JFrame(),"Please enter Phone Number.");
                }
               else if(Mytext2.getText().equals(""))
               {
                   JOptionPane.showMessageDialog(new JFrame(),"Please enter Address.");
               }
               else if(comboBox1.getSelectedItem().equals("Choose Build")){
                   JOptionPane.showMessageDialog(new JFrame(),"Please choose build type");
               }
               else if(comboBox5.getSelectedItem().equals("Choose Year")){
                   JOptionPane.showMessageDialog(new JFrame(),"Please choose year");
               }
               else if(comboBox2.getSelectedItem().equals("Select Ownership")){
                   JOptionPane.showMessageDialog(new JFrame(),"Please select ownership");
               }
               else if(comboBox3.getSelectedItem().equals("Choose Manufacturer")){
                   JOptionPane.showMessageDialog(new JFrame(),"Please choose Manufacturer");
               }
               else if(comboBox6.getSelectedItem().equals("Choose Fuel Type")){
                   JOptionPane.showMessageDialog(new JFrame(),"Please choose Fuel Type");
               }

               else if(!(requiredCheckBox.isSelected() || notRequiredCheckBox.isSelected()))
                   JOptionPane.showMessageDialog(new JFrame(), "Please Select FastTag Option");
               else{
                    if(requiredCheckBox.isSelected()){
                       JOptionPane.showMessageDialog(new JFrame(),"Please talk to our executive for the fast tag");
                   }
                   Details d = new Details();
                   d.setVisible(true);
                   String s= Mytext.getText();
                   String st=textField2.getText();
                   String st1=Mytext1.getText();
                   String st2=Mytext2.getText();
                   String s1=comboBox1.getSelectedItem().toString();
                   String s2=comboBox5.getSelectedItem().toString();
                   String s3=comboBox2.getSelectedItem().toString();
                   String s4=comboBox3.getSelectedItem().toString();
                   String s5=comboBox6.getSelectedItem().toString();
                   d.textField1.setText(s);
                   d.textField4.setText(s1);
                   d.textField5.setText(s2);
                   d.textField6.setText(s3);
                   d.textField7.setText(s4);
                   d.textField8.setText(st);
                   d.textField9.setText(s5);
                   d.textField2.setText(st1);
                   if(textField2.getText().equals(""))
                   {
                       d.textField8.setText("NA");
                   }
                   else
                   {
                       String s6=textField2.getText();
                       d.textField8.setText(s6);
                   }
                   d.textField3.setText(st2);
                   if(requiredCheckBox.isSelected()) {
                       d.textField10.setText("Required");
                   }
                   else {
                       d.textField10.setText("Not Required");
                   }
                   dispose();
               }
            }
        });
        requiredCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    notRequiredCheckBox.setEnabled(false);
                }
                else{
                    notRequiredCheckBox.setEnabled(true);

                }

            }
        });
        notRequiredCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange()==ItemEvent.SELECTED){
                    requiredCheckBox.setEnabled(false);
                }
                else{
                    requiredCheckBox.setEnabled(true);
                }

            }
        });
    }
}
