import java.rmi.*; import java.rmi.server.*;

public class C extends UnicastRemoteObject 
               implements I {
  private double val;
  private int nr_ordine;
  double Memory;

  public C(double i,int nr) throws RemoteException { 
    val = i; nr_ordine = nr;Memory=0;
  }

  public void pune(double i) {
    val += i;
  }
  public void minus(double i) {
	    val -= i;
	  }

  public double curent() { 
	  return val;
  }

@Override
public void imp(double i) throws RemoteException {
	// TODO Auto-generated method stub
	 val /= i; 
	
}

@Override
public void inm(double i) throws RemoteException {
	// TODO Auto-generated method stub
	val *= i; 
	
}

@Override
public void rad(double i) throws RemoteException {
	val=Math.sqrt(i);
	
}

@Override
public void putere(double i) throws RemoteException {
	val=Math.pow(val, i);
}

@Override
public void invers(double i) throws RemoteException {
	// TODO Auto-generated method stub
	val=1/i;
}

@Override
public void memplus(double i) throws RemoteException {
	// TODO Auto-generated method stub
	Memory+=val;
}

@Override
public void memminus(double i) throws RemoteException {
	// TODO Auto-generated method stub
	Memory-=val;
}

@Override
public void mr(double i) throws RemoteException {
	// TODO Auto-generated method stub
	val=Memory;
}

@Override
public void ms(double i) throws RemoteException {
	// TODO Auto-generated method stub
	Memory=val;
}

@Override
public void clean(double i) throws RemoteException {
	// TODO Auto-generated method stub
	val=0.0;
}

@Override
public void fact(double i) throws RemoteException {
	// TODO Auto-generated method stub
	int k=(int)i;
	val=1;
	for(int j=1;j<=k;j++)
	val*=j;
	
}
public void mc(double i) throws RemoteException {
	// TODO Auto-generated method stub
	Memory=0.0;
}
}

