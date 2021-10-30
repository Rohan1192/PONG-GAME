import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class GameFrame extends JFrame {

	GamePanel panel;
	private GamePanel gamepanel;
	GameFrame(){
		panel = new GamePanel();
		this.add(panel);
		this.setTitle("pong Game");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	    gamepanel = null;
		gamepanel.start();
	}
}
