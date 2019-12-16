package lineone;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Draw extends JFrame {


		int x = 500;
		int y = 500;
		int dx = x--;
		int dy = y--;
		private Ball ball;
		
		public Draw (Ball ball) {
			super("My first Window");
			setBounds(50,50, 500, 500);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			this.ball = ball;
		
		  Timer timer = new Timer(5, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				repaint();
				
			}
		  });
          timer.start();
		}
	
	



public static void main(String[] args) {
	Speed speed = new Speed(11, 10);
	Ball ball = new Ball(100, 100, 20, speed);
	Draw app = new Draw(ball);
	app.setVisible(true);
}
		public void paint(Graphics g ) {
	        Graphics2D g1 = (Graphics2D) g;

	        g1.setPaint(Color.white);
	        g1.fillRect(0, 0, this.getWidth(), this.getHeight());
	        g1.setPaint(Color.green);
	        g1.fillOval(
	            this.ball.left(),
	            this.ball.top(),
	            this.ball.diametr(),
	            this.ball.diametr()
	        );
	        
	        this.ball.move();

	        Speed speed = this.ball.getSpeed();
	        if (this.ball.left() < 0 || this.ball.right() > this.getWidth()) {
	            speed.x = -speed.x;
	        }
	        if (this.ball.top() < 0 || this.ball.bottom() > this.getHeight()) {
	            speed.y = -speed.y;
	        }

	        try {
			    Thread.sleep(10);
		    } catch (InterruptedException e) {
			    e.printStackTrace();
		    }
	    }

	
}