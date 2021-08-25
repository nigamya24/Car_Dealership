import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Homepage extends JFrame {
    private JPanel HomePanel;
    private JButton saleButton;
    private JButton purchaseButton;
    private JButton rentalServiceButton;

    public Homepage() {

        setSize(1000,600);

        add(HomePanel);
        saleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Sale s = new Sale();
                s.setVisible(true);
                dispose();

            }
        });

        rentalServiceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                RENTAL r = new RENTAL();
                r.setVisible(true);
                dispose();
            }
        });

        purchaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Purchase p = new Purchase();
                p.setVisible(true);
                dispose();

            }
        });
    }

}
