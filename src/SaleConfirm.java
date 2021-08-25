import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaleConfirm extends JFrame {
    private JButton goToMainPageButton;
    private JPanel SCPanel;

    public SaleConfirm() {

        add(SCPanel);
        setSize(1000,600);

        goToMainPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Homepage h1 = new Homepage();
                h1.setVisible(true);
                dispose();
            }
        });

    }

}
