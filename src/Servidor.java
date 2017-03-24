import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.server.*;


public class Servidor extends UnicastRemoteObject implements Geral{

	public Servidor() throws RemoteException{}
	
	
	public String hello(String teste) {
		return "==== Hello Word!!!====" + teste;
	}
	
	public static void main (String args[]) throws MalformedURLException, AlreadyBoundException {
		try {
			// 	criando o objeto remoto
			GeralImplementacao obj = new GeralImplementacao();
			// registrando esse objeto no serviço de nomes
			Naming.bind("HelloWordServer", obj);
			Naming.bind("Teste", obj);
		} catch (RemoteException e) {
			System.out.println("Erro: " + e);
		}
	}
}