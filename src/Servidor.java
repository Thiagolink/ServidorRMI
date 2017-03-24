import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.server.*;

public class Servidor extends UnicastRemoteObject{

	public Servidor() throws RemoteException{}

	public static void main (String args[]) throws MalformedURLException, AlreadyBoundException {
		try {
			// 	criando o objeto remoto
			CompanhiaAereaA obj1 = new CompanhiaAereaA();
			CompanhiaAereaB obj2 = new CompanhiaAereaB();
			CompanhiaAereaC obj3 = new CompanhiaAereaC();
			CompanhiaAereaD obj4 = new CompanhiaAereaD();
			
			// registrando esse objeto no serviço de nomes
			Naming.bind("A", obj1);
			Naming.bind("B", obj2);
			Naming.bind("C", obj2);
			Naming.bind("D", obj2);
		} catch (RemoteException e) {
			System.out.println("Erro: " + e);
		}
	}
}