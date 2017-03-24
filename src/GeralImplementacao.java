import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class GeralImplementacao extends UnicastRemoteObject implements Geral{
	Scanner reader;
	
	public GeralImplementacao() throws RemoteException{
		reader = new Scanner(System.in);
	}
	
	public String hello(String teste) {
		return "==== Hello Word!!!====" + teste;
	}
	
	public void incial(String companhia){
		System.out.println("Bem Vindo, companhia aérea: " + companhia);
	}
}
