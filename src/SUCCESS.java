import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SUCCESS extends JFrame{
    private JPanel Panel_Success;
    private JButton goToHomePageButton;

    public SUCCESS(){
        add(Panel_Success);
        setSize(1000,500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        goToHomePageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Homepage h2 = new Homepage();
                h2.setVisible(true);
                dispose();
            }
        });
    }

}
