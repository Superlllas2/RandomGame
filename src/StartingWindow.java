import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Tue Aug 11 16:00:41 MSK 2020
 */



/**
 * @author Ilia Nevrov
 */
public class StartingWindow extends JFrame {
    public StartingWindow() {
        initComponents();
        setVisible(true);
    }

    private void playButtonActionPerformed(ActionEvent e) {
        String name1 = player1Field.getText();
        String name2 = player2Field.getText();
        MainWindow mainWindow = new MainWindow(name1, name2);
        mainWindow.setVisible(true);
        setVisible(false);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        mainLabel = new JLabel();
        player1Label = new JLabel();
        player2Label = new JLabel();
        player1Field = new JTextField();
        player2Field = new JTextField();
        playButton = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- mainLabel ----
        mainLabel.setText("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u043d\u0438\u043a\u043d\u0435\u0439\u043c\u044b \u0438\u0433\u0440\u043e\u043a\u043e\u0432");
        mainLabel.setFont(mainLabel.getFont().deriveFont(mainLabel.getFont().getSize() + 20f));
        contentPane.add(mainLabel);
        mainLabel.setBounds(new Rectangle(new Point(70, 55), mainLabel.getPreferredSize()));

        //---- player1Label ----
        player1Label.setText("\u0418\u0433\u0440\u043e\u043a 1");
        player1Label.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(player1Label);
        player1Label.setBounds(new Rectangle(new Point(145, 155), player1Label.getPreferredSize()));

        //---- player2Label ----
        player2Label.setText("\u0418\u0433\u0440\u043e\u043a 2");
        player2Label.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(player2Label);
        player2Label.setBounds(new Rectangle(new Point(380, 155), player2Label.getPreferredSize()));
        contentPane.add(player1Field);
        player1Field.setBounds(120, 185, 105, player1Field.getPreferredSize().height);
        contentPane.add(player2Field);
        player2Field.setBounds(355, 185, 105, 30);

        //---- playButton ----
        playButton.setText("\u0418\u0433\u0440\u0430\u0442\u044c!");
        playButton.addActionListener(e -> playButtonActionPerformed(e));
        contentPane.add(playButton);
        playButton.setBounds(240, 270, 110, 45);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        setSize(600, 400);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel mainLabel;
    private JLabel player1Label;
    private JLabel player2Label;
    private JTextField player1Field;
    private JTextField player2Field;
    private JButton playButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
