import javax.swing.*;
import java.awt.*;

public class GraphicsPanel extends JPanel implements  Runnable
{

     private static  final long serialVersionUID=6791888953399961746L;

 private  Line line;
// private Line line2;
// private Line line3;

    public GraphicsPanel(){
  line = new Line(200, 200, 200, 350);
       // line2= new Line(200, 200, 150, 250);
     //   line3= new Line(200, 200, 250, 250);

        (new Thread(this)).start();

    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
         Graphics2D g2 = (Graphics2D) g;
            ((Graphics2D)g).setComposite(AlphaComposite.getInstance(AlphaComposite.SRC));
         g2.draw(line);
        // g2.draw(line2);
        // g2.draw(line3);
    }


    @Override
    public void run() {
  while (true){
      try {

          line.move();
          //line2.move();
          //line3.move();
          super.repaint();
          Thread.sleep(1000);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }

  }
    }
}
