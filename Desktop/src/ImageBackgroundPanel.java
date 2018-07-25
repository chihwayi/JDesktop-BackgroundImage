/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author kuda
 */
public class ImageBackgroundPanel extends JPanel{
 private ImageIcon bgImage;
public ImageBackgroundPanel(ImageIcon bgImage) {
this.bgImage = bgImage;
}
public void paintComponent(Graphics g) {       
g.drawImage(bgImage.getImage(), 0, 0 ,this);         
   
}
}