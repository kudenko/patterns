package proxy;

import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class ImageProxyTestDrive {

    ImageComponent imageComponent;
    JFrame frame = new JFrame("CD COVER view");
    JMenuBar menuBar;
    JMenu menu;
    Hashtable cds = new Hashtable();

    public static void main(String[] args) throws MalformedURLException {
        ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
    }

    public ImageProxyTestDrive() throws MalformedURLException {
        cds.put("Test image", "https://s00.yaplakal.com/pics/pics_original/3/4/0/1598043.jpg");
        cds.put("Test2 image", "https://s00.yaplakal.com/pics/pics_original/5/4/0/1598045.jpg");
        cds.put("Test3 image", "https://s00.yaplakal.com/pics/pics_original/8/4/0/1598048.jpg");

        URL initialURL = new URL((String)cds.get("Test image"));
        menuBar = new JMenuBar();
        menu = new JMenu("Test Albums");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        for(Enumeration e = cds.keys(); e.hasMoreElements();){
            String name = (String) e.nextElement();
            JMenuItem menuItem = new JMenuItem(name);
            menu.add(menuItem);
            menuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    imageComponent.setIcon(new ImageProxy(getCDUrl(actionEvent.getActionCommand())));
                    frame.repaint();
                }
            });
        }

        Icon icon = new ImageProxy(initialURL);
        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);
    }
    URL getCDUrl(String name){
        try{
            return new URL((String)cds.get(name));
        }catch (MalformedURLException e){
            e.printStackTrace();
            return null;
        }
    }
}
