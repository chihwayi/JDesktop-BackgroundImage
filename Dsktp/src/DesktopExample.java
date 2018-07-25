/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
/**
 *
 * @author kuda
 */
public class DesktopExample {
 public static void main(String[] args) throws IOException {
        BufferedImage image = ImageIO.read(new File("first.png"));
        JDesktopPane pane = new JDesktopPane();
        pane.setBorder(new CentredBackgroundBorder(image));
        JInternalFrame internal = new JInternalFrame("example", true, true, true, true);
        internal.setBounds(100, 100, 300,200);
        internal.setVisible(true);
        pane.add(internal);
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame f = new JFrame("DesktopExample");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setContentPane(pane);
        f.setExtendedState(Frame.MAXIMIZED_BOTH);
        f.setVisible(true);   
}
}