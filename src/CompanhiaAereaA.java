import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class CompanhiaAereaA extends UnicastRemoteObject implements Geral {
	private String naming = "A";
	private DAOCompanhiaA daoCompanhiaA = new DAOCompanhiaA();
	
	public CompanhiaAereaA() throws RemoteException {}
	
	public String getNaming(){
		return naming;
	}
	
	@Override
	public String opcoesAereas(){
		return "Voc� escolheu a empresa a�rea A!";
	}
	
	public String menuCompanhia(){
		return "Deseja fazer ";
	}
	
	public String fazReserva(int i, boolean comEscala){
		if(daoCompanhiaA.realizaReserva(i)){
			return "Reserva feita com sucesso, ainda tem " + 
					daoCompanhiaA.cadeirasRestantes(i) + 
					" cadeiras dispon�veis no seu v�o";
		}else{
			return "N�o h� mais vagas dispon�ves nesse avi�o";
		}
	}
	
	public String mostraPassagens(boolean comEscala){
		if(!comEscala)
			return daoCompanhiaA.printPassagensDiretas();
		else
			return daoCompanhiaA.printPassagensEscala();
	}
	
	
}
