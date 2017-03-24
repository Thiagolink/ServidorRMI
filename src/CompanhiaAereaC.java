import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CompanhiaAereaC extends UnicastRemoteObject implements Geral{
	private String naming = "C";
			
	public CompanhiaAereaC() throws RemoteException {}
	
	public String getNaming(){
		return naming;
	}

	@Override
	public String opcoesAereas(){
		return "SP to BA - 12h";
	}
}
