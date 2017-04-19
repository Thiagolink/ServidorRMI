import java.rmi.RemoteException;

import javax.xml.ws.Endpoint;

import companhia.CompanhiaAereaA;
import companhia.CompanhiaAereaB;
import companhia.CompanhiaAereaC;
import companhia.CompanhiaAereaD;

public class Servidor{

	public Servidor(){}

	public static void main (String args[]) {
		try {
			
			
			Endpoint.publish("http://127.0.0.1:8080/A",	new CompanhiaAereaA());
			Endpoint.publish("http://127.0.0.1:8080/B",	new CompanhiaAereaB());
			Endpoint.publish("http://127.0.0.1:8080/C",	new CompanhiaAereaC());
			Endpoint.publish("http://127.0.0.1:8080/D",	new CompanhiaAereaD());
			// 	criando o objeto remoto
		} catch (RemoteException e) {
			System.out.println("Erro: " + e);
		}
	}
}