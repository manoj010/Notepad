import javax.swing.*;
public class About extends JFrame {
    About() {
        setBounds(100, 100, 500, 400);
        setTitle("About");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ImageIcon icon = new ImageIcon(getClass().getResource("notepadicon.png"));
        setIconImage(icon.getImage());
        setLayout(null);

        JLabel iconLabel =  new JLabel(new ImageIcon(getClass().getResource("notepadicon.png")));
        iconLabel.setBounds(100, 50, 80, 80);
        add(iconLabel);
    }

    public static void main(String[] args) {
        new About().setVisible(true);
    }
}
