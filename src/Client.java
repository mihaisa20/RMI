import java.awt.ComponentOrientation;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.rmi.*;
import java.util.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;



public class Client extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	static JTextField textArea; 
	private static double curent;
	static String Action=new String();
	private static String aux=new String();
	private static JTextField textField_1;
	public Client()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 435, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				plus(arg0);
			}
		});

        
		plus.setFont(new Font("Tahoma", Font.PLAIN, 22));
		plus.setBounds(34, 194, 57, 51);
		contentPane.add(plus);
		
		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				minus(e);
			}
		});
		minus.setFont(new Font("Tahoma", Font.PLAIN, 28));
		minus.setBounds(101, 192, 57, 51);
		contentPane.add(minus);
		JButton impartire = new JButton("/");
		impartire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				imp(e);
			}
		});
		impartire.setFont(new Font("Tahoma", Font.PLAIN, 24));
		impartire.setBounds(172, 193, 57, 51);
		contentPane.add(impartire);

		JButton invers = new JButton("1/x");
		invers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inv(e);
			}
		});
		invers.setFont(new Font("Tahoma", Font.PLAIN, 13));
		invers.setBounds(34, 282, 57, 51);
		contentPane.add(invers);
		JButton putere = new JButton("x^y");
		putere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				putere(e);
			}
		});
		putere.setFont(new Font("Tahoma", Font.PLAIN, 13));
		putere.setBounds(172, 282, 57, 51);
		contentPane.add(putere);
		JButton radical = new JButton("sqrt");
		radical.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radical(e);
			}
		});
		radical.setFont(new Font("Tahoma", Font.PLAIN, 13));
		radical.setBounds(251, 282, 57, 51);
		contentPane.add(radical);
		JButton factorial = new JButton("x !");
		factorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fact(e);
			}
		});
		factorial.setFont(new Font("Tahoma", Font.PLAIN, 13));
		factorial.setBounds(101, 282, 57, 51);
		contentPane.add(factorial);
		JButton inmultire = new JButton("*");
		inmultire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inm(e);
			}
		});
		inmultire.setFont(new Font("Tahoma", Font.PLAIN, 13));
		inmultire.setBounds(251, 194, 57, 51);
		contentPane.add(inmultire);
		JButton memplus = new JButton("M+");
		memplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mplus(arg0);
			}
		});
		memplus.setFont(new Font("Tahoma", Font.PLAIN, 15));
		memplus.setBounds(34, 118, 57, 51);
		contentPane.add(memplus);
		JButton memminus = new JButton("M-");
		memminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mminus(e);
			}
		});
		memminus.setFont(new Font("Tahoma", Font.PLAIN, 15));
		memminus.setBounds(101, 118, 57, 51);
		contentPane.add(memminus);
		JButton memstoc= new JButton("MS");
		memstoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ms(e);
			}
		});
		memstoc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		memstoc.setBounds(172, 118, 57, 51);
		contentPane.add(memstoc);
		JButton memcurent = new JButton("MC");
		memcurent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mc(e);
			}
		});
		memcurent.setFont(new Font("Tahoma", Font.PLAIN, 15));
		memcurent.setBounds(319, 118, 57, 51);
		contentPane.add(memcurent);
		JButton init= new JButton("C");
		init.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clear(arg0);
			}
		});
		init.setFont(new Font("Tahoma", Font.PLAIN, 15));
		init.setBounds(318, 194, 58, 51);
		contentPane.add(init);

		
		textArea = new JTextField();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 22));
		textArea.setBounds(12, 31, 267, 51);
		textArea.setEditable(false);
		textArea.setHorizontalAlignment(JTextField.RIGHT);
		contentPane.add(textArea);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Monospaced", Font.PLAIN, 22));
		textField_1.setBounds(302, 31, 107, 51);
		textField_1.setHorizontalAlignment(JTextField.RIGHT);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnMr = new JButton("MR");
		btnMr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mr(e);
			}
		});
		btnMr.setBounds(251, 118, 58, 51);
		btnMr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(btnMr);
	}
  
protected void mr(ActionEvent e) {
		// TODO Auto-generated method stu
	Action="mr";
		
	}

protected void radical(ActionEvent e) {
		// TODO Auto-generated method stub
	Action="radical";	
	}

protected void putere(ActionEvent e) {
		// TODO Auto-generated method stub
	Action="putere";
		
	}

protected void fact(ActionEvent e) {
		// TODO Auto-generated method stub
	Action="fact";
		
	}

protected void inv(ActionEvent e) {
		// TODO Auto-generated method stub
		Action="invers";
	}

protected void inm(ActionEvent e) {
		// TODO Auto-generated method stub
		Action="inm";
	}

protected void mc(ActionEvent e) {
		// TODO Auto-generated method stub
	Action="mc";
	}

protected void ms(ActionEvent e) {
	Action="ms";
		// TODO Auto-generated method stub
		
	}

protected void mminus(ActionEvent e) {
		// TODO Auto-generated method stub
		Action="memminus";
	}

protected void mplus(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Action="memplus";
	}

protected void imp(ActionEvent e) {
		Action="imp";
	}

protected void minus(ActionEvent e) {
		// TODO Auto-generated method stub
		Action="minus";
	}

protected void plus(ActionEvent arg0) {
		// TODO Auto-generated method stub
	Action="plus";
	}

protected void clear(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Action="clean";
	}
protected static void aux()
{
	aux=textField_1.getText();
	curent = 0;
	if(!aux.equals(""))
	curent=Double.parseDouble(aux);
	Action="";
}

public static void main(String[] args)  throws RemoteException {
	  EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client frame = new Client();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    int val; Scanner sc = new Scanner(System.in);
    String url =  "rmi://" + "localhost" + ":" + 893 + "/Ob";
    I_Generator Ob = null; 
    I serv = null;
    try { 
      Ob = (I_Generator) Naming.lookup(url);
    }
    catch(Exception e) {
      System.out.println("Conectare esuata");
      System.exit(0);
    }
    try { 
     serv = Ob.server_propriu(); 
    }
    catch(Exception e) {System.out.println("Crearea serverului propriu esuata"); }
    Action="";aux="";
    for( ; ; ) {
		if(Action.equals("plus"))
		{ 	
		aux();
		serv.pune(curent);
		textArea.setText("");
		textArea.setText(Double.toString(serv.curent()));
		}
		else if(Action.equals("minus"))
		{ 	
		aux();
		serv.minus(curent);
		textArea.setText("");
		textArea.setText(Double.toString(serv.curent()));
		}
		else if(Action.equals("imp"))
		{ 	
		aux();
		if(curent!=0)
		{
		serv.imp(curent);
		textArea.setText("");
		textArea.setText(Double.toString(serv.curent()));
		}
		else textArea.setText("Numarul nu se poate diviza la 0");
		}
		
		else if(Action.equals("inm"))
		{ 	
		aux();
		serv.inm(curent);
		textArea.setText("");
		textArea.setText(Double.toString(serv.curent()));
		}
		else if(Action.equals("radical"))
		{ 	
		aux();
		if(curent>0)
		{
		serv.rad(curent);
		textArea.setText("");
		textArea.setText(Double.toString(serv.curent()));}
		else textArea.setText("Numarul trebuie sa fie pozitiv");
		}
		else if(Action.equals("invers"))
		{ 	
		aux();
		if(curent!=0)
		{
		serv.invers(curent);
		textArea.setText("");
		textArea.setText(Double.toString(serv.curent()));
		}
		else textArea.setText("Numarul nu se poate diviza la 0");
		}
		else if(Action.equals("putere"))
		{ 	
		aux();
		serv.putere(curent);
		textArea.setText("");
		textArea.setText(Double.toString(serv.curent()));
		}
		else if(Action.equals("fact"))
		{ 	
		aux();
		if(curent==(int)curent&&curent>0)
		{
		serv.fact(curent);
		textArea.setText("");
		textArea.setText(Double.toString(serv.curent()));
		}
		else textArea.setText("Numarul trebuie sa fie natural");
		}
		else if(Action.equals("memplus"))
		{ 	
		aux();
		serv.memplus(curent);
		textArea.setText("");
		textArea.setText(Double.toString(serv.curent()));
		}
		else if(Action.equals("memminus"))
		{ 	
		aux();
		serv.memminus(curent);
		textArea.setText("");
		textArea.setText(Double.toString(serv.curent()));
		}
		else if(Action.equals("mr"))
		{ 	
		aux();
		serv.mr(curent);
		textArea.setText("");
		textArea.setText(Double.toString(serv.curent()));
		}
		else if(Action.equals("ms"))
		{ 	
		aux();
		serv.ms(curent);
		textArea.setText("");
		textArea.setText(Double.toString(serv.curent()));
		}
		else if(Action.equals("clean"))
		{ 	
		aux();
		serv.clean(curent);
		textArea.setText("");
		textArea.setText(Double.toString(serv.curent()));
		}
		else if(Action.equals("mc"))
		{ 	
		aux();
		serv.mc(curent);
		textArea.setText("");
		textArea.setText(Double.toString(serv.curent()));
		}
		

    }
}
}


