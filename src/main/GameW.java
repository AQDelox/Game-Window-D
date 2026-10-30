import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;

public class GameW {

    public static void main(String [] args) {

        JFrame window = new JFrame();

        
        // WindowSize: ->

        final int WINW = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        final int WINH = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        //

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setAlwaysOnTop(true);

        window.setPreferredSize(new Dimension(WINW, WINH));

        window.pack();

        window.setLocationRelativeTo(null);

        window.getContentPane().setBackground(Color.black);

        window.setTitle("HERE IS OUR WINDOW!");

        

        window.setVisible(true);


    }

}
