import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
/*
 * Created by JFormDesigner on Tue Aug 11 15:52:17 MSK 2020
 */



/**
 * @author Ilia Nevrov
 */
public class MainWindow extends JFrame {
    private final String name1;
    private final String name2;
    int scoree1=0;
    int scoree2=0;
    String scoreS1;
    String scoreS2;
    Random random = new Random();
    int randNum = random.nextInt(100);
    int number=0;


    private void player1ButtonActionPerformed(ActionEvent e) {
        smallerLabel.setVisible(false);
        biggerLabel.setVisible(false);
        String guess1 = player1Field.getText();
        int guessInt1 = Integer.parseInt(guess1);
        if ( guessInt1 > randNum ){
            smallerLabel.setVisible(true);
            scoree1++;
            scoreS1 = String.valueOf(scoree1);
            score1.setText(scoreS1);
        }
        else if ( guessInt1 < randNum ){
            biggerLabel.setVisible(true);
            scoree1++;
            scoreS1 = String.valueOf(scoree1);
            score1.setText(scoreS1);
        } else JOptionPane.showMessageDialog(null, "Поздравляем, вы угадали!");
    }



    private void player2ButtonActionPerformed(ActionEvent e) {
        smallerLabel.setVisible(false);
        biggerLabel.setVisible(false);
        String guess2 = player2Field.getText();
        int guessInt2 = Integer.parseInt(guess2);
        if ( guessInt2 > randNum ){
            smallerLabel.setVisible(true);
            scoree2++;
            scoreS2 = String.valueOf(scoree2);
            score2.setText(scoreS2);
        }
        else if ( guessInt2 < randNum ){
            biggerLabel.setVisible(true);
            scoree2++;
            scoreS2 = String.valueOf(scoree2);
            score2.setText(scoreS2);
        } else JOptionPane.showMessageDialog(null, "Поздравляем, вы угадали!");
    }



    public MainWindow(String name1, String name2) {
        this.name1=name1;
        this.name2=name2;
        String number = null;
        initComponents();
        player1Label.setText(name1);
        player2Label.setText(name2);
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        mainLabel = new JLabel();
        player1Field = new JTextField();
        player2Field = new JTextField();
        player1Label = new JLabel();
        player2Label = new JLabel();
        player1Button = new JButton();
        player2Button = new JButton();
        scoreLabel1 = new JLabel();
        scoreLabel2 = new JLabel();
        score1 = new JLabel();
        score2 = new JLabel();
        biggerLabel = new JLabel();
        smallerLabel = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- mainLabel ----
        mainLabel.setText("\u041a\u0430\u043a\u043e\u0435 \u0447\u0438\u0441\u043b\u043e \u0437\u0430\u043a\u0430\u0433\u0430\u0434\u043d\u043e?");
        mainLabel.setFont(mainLabel.getFont().deriveFont(mainLabel.getFont().getSize() + 20f));
        contentPane.add(mainLabel);
        mainLabel.setBounds(new Rectangle(new Point(95, 55), mainLabel.getPreferredSize()));
        contentPane.add(player1Field);
        player1Field.setBounds(80, 200, 135, player1Field.getPreferredSize().height);
        contentPane.add(player2Field);
        player2Field.setBounds(390, 200, 135, 30);

        //---- player1Label ----
        player1Label.setText("\u0418\u0433\u0440\u043e\u043a 1");
        contentPane.add(player1Label);
        player1Label.setBounds(new Rectangle(new Point(120, 175), player1Label.getPreferredSize()));

        //---- player2Label ----
        player2Label.setText("\u0418\u0433\u0440\u043e\u043a 2");
        contentPane.add(player2Label);
        player2Label.setBounds(new Rectangle(new Point(430, 175), player2Label.getPreferredSize()));

        //---- player1Button ----
        player1Button.setText("\u0423\u0433\u0430\u0434\u0430\u0442\u044c");
        player1Button.addActionListener(e -> player1ButtonActionPerformed(e));
        contentPane.add(player1Button);
        player1Button.setBounds(80, 235, 135, player1Button.getPreferredSize().height);

        //---- player2Button ----
        player2Button.setText("\u0423\u0433\u0430\u0434\u0430\u0442\u044c");
        player2Button.addActionListener(e -> player2ButtonActionPerformed(e));
        contentPane.add(player2Button);
        player2Button.setBounds(390, 235, 135, 30);

        //---- scoreLabel1 ----
        scoreLabel1.setText("\u0421\u0447\u0435\u0442:");
        contentPane.add(scoreLabel1);
        scoreLabel1.setBounds(new Rectangle(new Point(85, 275), scoreLabel1.getPreferredSize()));

        //---- scoreLabel2 ----
        scoreLabel2.setText("\u0421\u0447\u0435\u0442:");
        contentPane.add(scoreLabel2);
        scoreLabel2.setBounds(395, 275, 36, 16);

        //---- score1 ----
        score1.setText("0");
        contentPane.add(score1);
        score1.setBounds(new Rectangle(new Point(125, 275), score1.getPreferredSize()));

        //---- score2 ----
        score2.setText("0");
        contentPane.add(score2);
        score2.setBounds(new Rectangle(new Point(435, 275), score2.getPreferredSize()));

        //---- biggerLabel ----
        biggerLabel.setText("\u0411\u043e\u043b\u044c\u0448\u0435");
        biggerLabel.setFont(biggerLabel.getFont().deriveFont(biggerLabel.getFont().getSize() + 5f));
        biggerLabel.setVisible(false);
        contentPane.add(biggerLabel);
        biggerLabel.setBounds(new Rectangle(new Point(210, 125), biggerLabel.getPreferredSize()));

        //---- smallerLabel ----
        smallerLabel.setText("\u041c\u0435\u043d\u044c\u0448\u0435");
        smallerLabel.setFont(smallerLabel.getFont().deriveFont(smallerLabel.getFont().getSize() + 5f));
        smallerLabel.setVisible(false);
        contentPane.add(smallerLabel);
        smallerLabel.setBounds(new Rectangle(new Point(315, 125), smallerLabel.getPreferredSize()));

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
    private JTextField player1Field;
    private JTextField player2Field;
    private JLabel player1Label;
    private JLabel player2Label;
    private JButton player1Button;
    private JButton player2Button;
    private JLabel scoreLabel1;
    private JLabel scoreLabel2;
    private JLabel score1;
    private JLabel score2;
    private JLabel biggerLabel;
    private JLabel smallerLabel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
