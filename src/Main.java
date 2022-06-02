import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;
import java.util.Locale;

public class Main extends JComponent {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("strelka");
        jFrame.setSize(new Dimension(600,400));
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(new GridBagLayout());
   //     jFrame.getContentPane().add(new Main());

        GraphicsPanel graphicsPanel=new GraphicsPanel();
        jFrame.add(graphicsPanel,new GridBagConstraints(0,0,1,1,1,1,
                GridBagConstraints.NORTH,GridBagConstraints.BOTH,new Insets(2,2,2,2),0,0));

        jFrame.setVisible(true);

    }}
//    public void paint(Graphics painter) {
//        painter.setColor(Color.BLACK);
//
//        painter.drawLine(200, 200, 200, 300);
//        painter.drawLine(250, 200, 250, 300);
//        painter.drawLine(200, 300, 250, 300);
//        painter.drawLine(200, 200, 150, 200);
//        painter.drawLine(250, 200, 300, 200);
//        painter.drawLine(150, 200, 225, 100);
//        painter.drawLine(300,200,225,100);
//    }}
