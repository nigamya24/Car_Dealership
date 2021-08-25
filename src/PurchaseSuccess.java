import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PurchaseSuccess extends JFrame{
    private JPanel PurchaseSucess;
    private JButton goBackToHomepageButton;

    public PurchaseSuccess(){
        add(PurchaseSucess);
        setSize(1000,500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        goBackToHomepageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Homepage h3 = new Homepage();
                h3.setVisible(true);
                dispose();
            }
        });
    }
}
