package com.example;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import javax.swing.Timer;// for ambiguity

/* @author Innocent: https://github.com/INNOCENT-ops806 **/
public class App {
	static	 final class SimpleFrame extends JFrame{
		private JLabel timerLabel = new JLabel();
		private int remainingSeconds = 300; // 5 minutes which is the default
		private Timer timer;

		public SimpleFrame(){
			super("Time to drink water!!");
			this.setSize(900,500);
			this.setLocationRelativeTo(null);
			this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);// To prevent snoozing action or avoiding dehydrating
			this.setLayout(new BorderLayout());

			timerLabel = new JLabel();
			timerLabel.setFont(new Font("Sans serif", Font.BOLD,50));// you can customize this to your own liking
			timerLabel.setHorizontalAlignment(JLabel.CENTER);

			// handling when the user wants to snooze, which they cannot haha :)
			this.addWindowListener(new WindowAdapter(){
				@Override
				public void windowClosing(WindowEvent e) {
					JOptionPane.showMessageDialog(SimpleFrame.this,
							"This timer cannot be interrupted. Please take a moment to rest and stretch!",
							"Attention!",
							JOptionPane.WARNING_MESSAGE);
				}	
			});
			timer = new Timer(1000, new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
					remainingSeconds--;	
					int minutes = remainingSeconds / 60;
					int seconds  = remainingSeconds % 60;
					timerLabel.setText(String.format("%2d:%02d", minutes, seconds));

					if(remainingSeconds <= 60){
						timerLabel.setForeground(Color.RED);	// To show emegence 
					}else{
						timerLabel.setForeground(Color.BLACK);	// To show emegence 
					}
					if(remainingSeconds <= 0){
						timer.stop();	
						Toolkit.getDefaultToolkit().beep();
						SimpleFrame.this.dispose();// after dehydration time dispose the frame
					}
				}	
			});
			timer.start();
			this.add(timerLabel,BorderLayout.CENTER);
			this.setVisible(true);
		}// "It's so lonely out here" ~ raysan5
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {new SimpleFrame();
		});
	}
}
