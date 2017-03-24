import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CompanhiaAereaD extends UnicastRemoteObject implements Geral{
	private String naming = "D";
			
	public CompanhiaAereaD() throws RemoteException {}
	
	public String getNaming(){
		return naming;
	}

	@Override
	public String opcoesAereas(){
		return "SP to RN - 14h";
	}
}
