import javax.swing.*;
import java.awt.*;

public class About extends JFrame {
    About() {
        setBounds(100, 100, 500, 400);
        setTitle("About");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ImageIcon icon = new ImageIcon(getClass().getResource("notepad_icon.png"));
        setIconImage(icon.getImage());
        setLayout(null);

        JLabel iconLabel =  new JLabel(new ImageIcon(getClass().getResource("notepad_icon.png")));
        iconLabel.setBounds(100, 50, 80, 80);
        add(iconLabel);

        JLabel textLabel = new JLabel("<html>About<br>You know what a Notepad is, don't you?<br>SO!!!<br>Why are you here!</html>");
        textLabel.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,12));
        textLabel.setBounds(100, 50, 350, 300);
        add(textLabel);
    }

    public static void main(String[] args) {
        new About().setVisible(true);
    }
}
