package proxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageProxy implements Icon {
    ImageIcon imageIcon;
    URL imageURL;
    Thread retreevalThread;
    boolean retrieving = false;

    public ImageProxy(URL url){
        imageURL = url;
    }

    public int getIconWidth(){
        if(imageIcon != null){
            return imageIcon.getIconWidth();
        }else {
            return 800;
        }
    }

    public int getIconHeight(){
        if(imageIcon != null){
            return imageIcon.getIconWidth();
        }else {
            return 600;
        }
    }
    @Override
    public void paintIcon(Component component, Graphics graphics, int x, int y) {
        if(imageIcon != null){
            imageIcon.paintIcon(component, graphics, x, y);
        }else{
            graphics.drawString("Loading image. Please wait...", x+300, y+190);
            if(!retrieving){
                retrieving = true;
                retreevalThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try{
                            imageIcon = new ImageIcon(imageURL, "CD COVER");
                            component.repaint();
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                });
                retreevalThread.start();
            }
        }
    }
}
