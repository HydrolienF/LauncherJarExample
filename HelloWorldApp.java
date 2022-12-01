import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldApp {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("HelloWorldAppLauncherFromLauncherJar");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JLabel label = new JLabel("Hello world from launcher jar app");
                frame.getContentPane().add(label);

                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}