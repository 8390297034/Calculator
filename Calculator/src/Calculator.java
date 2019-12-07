import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {

	JButton b1,b2,b3,b4,b5,b6,b7;
	
	JTextField t1,t2,t3,t4;
	
	JLabel l1,l2,l3,l4;
	
	
	
Calculator()
{
	setSize(500,500);
	setVisible(true);
	setLayout(null);
	
	l1=new JLabel("input1");
	l1.setBounds(20,20,100,50);
	add(l1);
	
	
	t1=new JTextField();
	t1.setBounds(140,20,100,50);
	add(t1);
	
	
	l2=new JLabel("input2");
	l2.setBounds(20,90,100,50);
	add(l2);
	
	t2=new JTextField();
	t2.setBounds(140,90,100,50);
	add(t2);
	

	l3=new JLabel("Result");
	l3.setBounds(20,160,100,50);
	add(l3);
	
	t3=new JTextField();
	t3.setBounds(140,160,100,50);
	add(t3);
	
	
	b1=new JButton("Addition");
	b1.setBounds(20,230,100,50);
	b1.addActionListener(this);
	add(b1);
	

	b2=new JButton("substrction");
	b2.setBounds(140,230,100,50);
	b2.addActionListener(this);
	add(b2);

	
	b3=new JButton("Multiplication");
	b3.setBounds(20,300,100,50);
	b3.addActionListener(this);
	add(b3);


	b4=new JButton("Division");
	b4.setBounds(140,300,100,50);
	b4.addActionListener(this);
	add(b4);

	
	b5=new JButton("Modulus");
	b5.setBounds(140,300,100,50);
	b5.addActionListener(this);
	add(b5);
	
	b6=new JButton("clear");
	b6.setBounds(70,390,100,50);
     b6.addActionListener(this);
     add(b6);
}



@Override
public void actionPerformed(ActionEvent e) {
if(e.getSource()==b1)
{
	int a=Integer.parseInt(t1.getText());
	int b=Integer.parseInt(t2.getText());
     
	int sum =a+b;
	
	t3.setText(Integer.toString(sum));
}

if(e.getSource()==b2)
{
	
	int a=Integer.parseInt(t1.getText());
	int b=Integer.parseInt(t2.getText());
     
	int sum =a-b;
	
	t3.setText(Integer.toString(sum));
	
}

if(e.getSource()==b3)
{
	
	int a=Integer.parseInt(t1.getText());
	int b=Integer.parseInt(t2.getText());
     
	int sum =a*b;
	
	t3.setText(Integer.toString(sum));
}

if(e.getSource()==b4)
{
	int a=Integer.parseInt(t1.getText());
	int b=Integer.parseInt(t2.getText());
     
	int sum =a/b;
	
	t3.setText(Integer.toString(sum));
}

if(e.getSource()==b5)
{
	
	int a=Integer.parseInt(t1.getText());
	int b=Integer.parseInt(t2.getText());
     
	int sum =a%b;
	
	t3.setText(Integer.toString(sum));
}



if(e.getSource()==b6)
{
	
    t1.setText("");
    t2.setText("");
    t3.setText("");
	
}



}






}
