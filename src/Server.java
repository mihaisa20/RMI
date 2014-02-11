import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.rmi.*; import java.util.*;
import java.rmi.registry.*;
import javax.swing.JTextArea;
import java.awt.Font;





public class Server extends JFrame {

	private JPanel contentPane;
     static JTextArea textArea=new JTextArea();

	/**
	 * Launch the application.
	 * @throws RemoteException 
	 * @throws AlreadyBoundException 
	 */
	public static void main(String[] args) throws RemoteException, AlreadyBoundException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Server frame = new Server();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		 Generator Ob = new Generator();  
		  Registry reg = LocateRegistry.createRegistry(893);
		    reg.bind("Ob",Ob);
		    textArea.append("Serverul s-a legat la" +" registrul RMI");
	}

	/**
	 * Create the frame.
	 */
	public Server() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 352, 265);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
		
		textArea.setBounds(5, 5, 309, 200);
		contentPane.add(textArea);
		textArea.setEditable(false);
	}

}
