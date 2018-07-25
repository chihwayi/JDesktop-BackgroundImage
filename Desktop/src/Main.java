/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.net.*;
/**
 *
 * @author kuda
 */
public class Main extends JFrame{
 JDesktopPane  desktop;
int nframes =0;
public Main() {
getContentPane().setLayout(new BorderLayout());
desktop = new JDesktopPane();
createInternalFrame ();
getContentPane().add(BorderLayout.CENTER, desktop);
setJMenuBar(createMenuBar());
addWindowListener (new WindowAdapter() {
public void windowClosing(WindowEvent we) {
System.exit( 0);
}
});
setTitle( "Transparent JInternalFrame Demonstration");
setSize( new Dimension(400,400));
}
protected JMenuBar createMenuBar() {
JMenuBar menuBar =new JMenuBar();
JMenu menu = new JMenu("JDesktopPane");
JMenuItem  menuItem1 =new JMenuItem("Create new JInternalFrame");
menuItem1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
createInternalFrame ();
}
});
menu.add(menuItem1);
menuBar.add(menu );
return menuBar;
}
protected void createInternalFrame() {
JInternalFrame  frame =new JInternalFrame("InternalFrame",
true ,   // resizable
true ,   // closable
true ,   // maximizable
true );  // iconifiable
frame.setVisible( true);
desktop.add(frame) ;
frame.setSize( 200,200);
frame.setLocation( 30*nframes,30*nframes);
nframes++;
frame.setContentPane(new ImageBackgroundPanel(
new ImageIcon("first.png")));
frame.getContentPane().add(new JLabel("Your name"));
frame.getContentPane().add(new JTextField(10));
try {
frame.setSelected( true);
} catch(java.beans.PropertyVetoException e) {}   
}
}
