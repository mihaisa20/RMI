import java.rmi.*; 
import java.rmi.server.*;

public class Generator extends UnicastRemoteObject 
                       implements I_Generator {
  static int contor;
  Generator() throws RemoteException {}
	
  public I server_propriu() throws  Exception 
  {
	 Server.textArea.append("\nNew Client Connected");
     return new C(0,contor++);
  }
}
