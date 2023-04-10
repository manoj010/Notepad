import javax.swing.*;
public class Notepad extends JFrame {
    JMenuBar menuBar = new JMenuBar();
    JMenu file = new JMenu("File");
    JMenu edit = new JMenu("Edit");
    JMenu help = new JMenu("Help");

    JMenuItem newFile = new JMenuItem("New");
    JMenuItem openFile = new JMenuItem("Open");
    JMenuItem saveFile = new JMenuItem("Save");
    JMenuItem print = new JMenuItem("Print");
    JMenuItem exit = new JMenuItem("Exit");

    JMenuItem cut = new JMenuItem("Cut");
    JMenuItem copy = new JMenuItem("Copy");
    JMenuItem paste = new JMenuItem("Paste");
    JMenuItem select_all = new JMenuItem("Select All");
    JMenuItem about = new JMenuItem("About");

    Notepad() {
        setTitle("Notepad");
        setBounds(100, 70, 700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon(getClass().getResource("notepadicon.png"));
        setIconImage(icon.getImage());

        setJMenuBar(menuBar);

        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);

        file.add(newFile);
        file.add(openFile);
        file.add(saveFile);
        file.add(print);
        file.add(exit);

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(select_all);

        help.add(about);

    }
}
