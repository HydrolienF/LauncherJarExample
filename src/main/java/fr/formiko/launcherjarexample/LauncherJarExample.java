package fr.formiko.launcherjarexample;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LauncherJarExample {

    public static void main(String[] args) {
        // return version
        if (args.length > 0 && args[0].replace("-", "").equalsIgnoreCase("version")) {
            try {
                InputStream is = LauncherJarExample.class.getClassLoader().getResourceAsStream("version.md");
                String version = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8)).lines()
                        .collect(Collectors.joining("\n")).strip();
                System.out.println(version);
                System.exit(0);
            } catch (Exception e) {
                System.out.println("Fail to get version in DesktopLauncher.");
            }
        }

        // Hello world frame
        javax.swing.SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("HelloWorldAppLauncherFromLauncherJar");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel label = new JLabel("Hello world from launcher jar app");
            frame.getContentPane().add(label);

            frame.pack();
            frame.setVisible(true);
        });
    }
}