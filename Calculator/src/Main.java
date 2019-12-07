
import javax.swing.*;
import java.awt.event.*;
public class Main extends JFrame implements ActionListener {
	JButton b1,b2,b3,b4,b5;
	
	Main()
	{
		setSize(500,500);
		setVisible(true);
		setLayout(null);
		
		
		b1=new JButton("Calculator");
		b1.setBounds(50,50,200,100);
		b1.addActionListener(this);
		add(b1);
		
		
		
		
		 }
	
	
	public static void main(String args[])
	{
		Main m=new Main();
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	 if(e.getSource()==b1)
	 {
			Calculator c=new Calculator();
	 }
	 
	 
	 
	}

}
