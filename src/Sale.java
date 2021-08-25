import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Sale extends JFrame {
    private JPanel SalePanel;
    private JTextField textField4;
    private JButton submitButton;
    private JCheckBox removedCheckBox;
    private JCheckBox canTBeRemovedCheckBox;
    private JCheckBox validCheckBox;
    private JCheckBox expiredCheckBox;
    private JCheckBox pendingCheckBox;
    private JCheckBox noneCheckBox;
    private JTextField textField5;
    public JComboBox comboBox1;
    public JComboBox comboBox2;
    public JComboBox comboBox3;
    public JComboBox comboBox4;
    public JComboBox comboBox5;
    public JComboBox comboBox6;
    private JTextField textField1;

    public Sale() {

        add(SalePanel);

        setTitle("Sale");
        setSize(1000,600);

        removedCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    canTBeRemovedCheckBox.setEnabled(false);
                }
                else{
                    canTBeRemovedCheckBox.setEnabled(true);
                }
            }
        });

        canTBeRemovedCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    removedCheckBox.setEnabled(false);
                }
                else{
                    removedCheckBox.setEnabled(true);
                }
            }
        });

        validCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    expiredCheckBox.setEnabled(false);
                }
                else{
                    expiredCheckBox.setEnabled(true);
                }
            }
        });

        validCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            if(validCheckBox.isSelected()) {
                    if(textField5.getText().equals(""))
                    JOptionPane.showMessageDialog(new JFrame(), "Enter the Expiration Date!");
                }

            }
        });

        expiredCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    validCheckBox.setEnabled(false);
                }
                else{
                    validCheckBox.setEnabled(true);
                }
            }
        });

        noneCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    pendingCheckBox.setEnabled(false);
                }
                else{
                    pendingCheckBox.setEnabled(true);
                }
            }
        });

        pendingCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    noneCheckBox.setEnabled(false);
                }
                else{
                    noneCheckBox.setEnabled(true);
                }
            }
        });


        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //CheckBox Validations

                if(canTBeRemovedCheckBox.isSelected() && expiredCheckBox.isSelected() && pendingCheckBox.isSelected()){
                    JOptionPane.showMessageDialog(new JFrame(), "Can not sell this car!");
                }

                else if(canTBeRemovedCheckBox.isSelected()){
                    JOptionPane.showMessageDialog(new JFrame(),"Remove the Fastag beforehand!");
                }

                else if(pendingCheckBox.isSelected()){
                    JOptionPane.showMessageDialog(new JFrame(),"Clear the pending Challans");
                }

                //Text Fields Validations

                else if(textField4.getText().equals("")) {
                    JOptionPane.showMessageDialog(new JFrame(), "Enter the Expected Price!");
                }

                //Drop-down Menu Validations

                else if(comboBox1.getSelectedItem().equals("Choose Type")){

                    JOptionPane.showMessageDialog(new JFrame(), "Choose Emission Type!");
                }
                else if(comboBox2.getSelectedItem().equals("Choose Owner")){

                    JOptionPane.showMessageDialog(new JFrame(), "Choose Owner!");
                }
                else if(comboBox3.getSelectedItem().equals("Choose Name")){

                    JOptionPane.showMessageDialog(new JFrame(), "Choose Manufacturer Name!");
                }
                else if(comboBox4.getSelectedItem().equals("Choose Year")){

                    JOptionPane.showMessageDialog(new JFrame(), "Choose Manufacture Year!");
                }else if(comboBox5.getSelectedItem().equals("Choose Type")){

                    JOptionPane.showMessageDialog(new JFrame(), "Choose Body Type!");
                }
                else if(comboBox6.getSelectedItem().equals("Choose Type")){

                    JOptionPane.showMessageDialog(new JFrame(), "Choose Fuel Type!");
                }


                /*else if(validCheckBox.isSelected()) {
                    if(textField5.getText().equals(""))
                        JOptionPane.showMessageDialog(new JFrame(), "Enter the Expiration Date!");
                    }
                }*/

                else if(removedCheckBox.isSelected() && noneCheckBox.isSelected()){

                    //SaleConfirm sc = new SaleConfirm();
                    //sc.setVisible(true);
                    String t = comboBox3.getSelectedItem().toString();
                    String t1 = comboBox4.getSelectedItem().toString();
                    String t2 = comboBox5.getSelectedItem().toString();
                    String t3 = comboBox1.getSelectedItem().toString();
                    String t4 = comboBox2.getSelectedItem().toString();
                    String t5 = comboBox6.getSelectedItem().toString();
                    String t6 = textField4.getText();



                    DetailsConfirm dc = new DetailsConfirm();
                    dc.setVisible(true);
                    dc.textField1.setText(t);
                    dc.textField2.setText(t1);
                    dc.textField3.setText(t2);
                    dc.textField4.setText(t3);
                    dc.textField5.setText(t4);
                    dc.textField6.setText(t5);
                    dc.textField7.setText(t6);
                    dc.textField8.setText("Removed");
                    dc.textField10.setText("None Pending");

                    if(validCheckBox.isSelected()){
                        dc.textField9.setText("Valid");
                    }
                    else{
                        dc.textField9.setText("Not Valid");
                    }

                    dispose();
                }

                else{
                    JOptionPane.showMessageDialog(new JFrame(), "Select an Option");
                }


            }
        });
    }


}
