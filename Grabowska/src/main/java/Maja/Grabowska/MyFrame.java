package Maja.Grabowska;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	
	JButton btn;
	JTextField tf;
	JLabel l;
	JLabel l1; 
	
	public MyFrame()
	{
		setSize(400,200);
		setLayout(null);
		setTitle("Liczba Pierwsza");
		tf= new JTextField();
		tf.setBounds(30, 30, 30, 30);
		l= new JLabel("Podaj liczbę");
		l.setBounds(30, 70, 300, 30);
		l1= new JLabel("");
		l1.setBounds(150, 30, 200, 30);
		btn = new JButton("OK");
		btn.setBounds(80, 30, 60, 30);
		btn.addActionListener(this);
		add(tf);
		add(l);
		add(btn);
		add(l1);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	

public static void main(String [] args)
{
	final MyFrame frame = new MyFrame();
	frame.setVisible(true);
	
	
	
}

public void actionPerformed(ActionEvent arg0) {

	int n = Integer.parseInt(tf.getText());
	if (App.isOdd(n))
	{
		l1.setText(n + " jest pierwsza");
	}
	else 
	{
		l1.setText(n + " nie jest pierwsza");
	}
}

}
