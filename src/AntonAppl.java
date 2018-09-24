import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class AntonAppl {
    public static void main(String[] args) {
        JFrame anton_application = new JFrame("Anton Application");
        anton_application.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        anton_application.getContentPane().setBackground(Color.CYAN);

        JPanel jPanel = new JPanel();
        jPanel.setPreferredSize(new Dimension(1000, 500));
        jPanel.setBackground(Color.cyan);
        jPanel.setLayout(new GridBagLayout());
        anton_application.add(jPanel);
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 3;


        JButton click = new JButton("show me mem");
        click.setPreferredSize(new Dimension(140, 24));
        click.addActionListener(new ScActionListener());
        click.setBackground(Color.white);
        jPanel.add(click, gridBagConstraints);


        anton_application.pack();
        anton_application.setVisible(true);
    }

    private static class ScActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Desktop desktop = Desktop.getDesktop();
            File file = new File("C:\\Новая папка\\Моя (Антона) папка\\Разные изображения\\Демотиваторы");
            File[] files = file.listFiles();
            try {
                desktop.open(files[(int) (Math.random() * files.length)]);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            System.out.println();
        }
    }
}
