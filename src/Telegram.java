
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Telegram {

    private final JFrame mainFrame;

    public Telegram() {
        mainFrame = new JFrame();

        mainFrame.setTitle("Telegram v0.9");
        mainFrame.setBounds(new Rectangle(300, 500));
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        top.add(textArea, BorderLayout.CENTER);
        mainFrame.add(top);

        JPanel mess = new JPanel();
        JTextField messenge = new JFormattedTextField();
        mess.setLayout(new GridLayout(1, 3));
        mainFrame.add(mess, BorderLayout.SOUTH);
        mess.add(messenge);
        JButton jButton = new JButton("send");
        StringBuffer m = new StringBuffer();
        m.append(messenge.getText() + '\n');
        jButton.addActionListener(e -> {
            JButton source = (JButton) e.getSource();
            textArea.setText(m.append(messenge.getText() + '\n').toString());
        });
        messenge.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_ENTER:
                        textArea.setText(m.append(messenge.getText() + '\n').toString());
                        break;
                }            }
        });
        mess.add(jButton);
        mainFrame.setVisible(true);
    }

}
