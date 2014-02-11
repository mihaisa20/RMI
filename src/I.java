import java.rmi.*;

public interface I extends Remote {
  void pune(double i) throws RemoteException;
  double curent() throws RemoteException;
void minus(double i)throws RemoteException;
void imp(double i)throws RemoteException;
void inm(double i)throws RemoteException;
void rad(double i)throws RemoteException;
void putere(double i)throws RemoteException;
void invers(double i)throws RemoteException;
void memplus(double i)throws RemoteException;
void memminus(double i)throws RemoteException;
void mr(double i)throws RemoteException;
void ms(double i)throws RemoteException;
void clean(double i)throws RemoteException;
void fact(double i)throws RemoteException;
void mc(double i)throws RemoteException;

}
