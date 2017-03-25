import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CompanhiaAereaB extends UnicastRemoteObject implements Geral {
	private String naming = "B";
	private DAOCompanhiaB daoCompanhiaB = new DAOCompanhiaB();
	
	public CompanhiaAereaB() throws RemoteException {}
	
	public String getNaming(){
		return naming;
	}
	
	@Override
	public String opcoesAereas(){
		return "Voc� escolheu a empresa a�rea B!";
	}
	
	public String menuCompanhia(){
		return "Deseja fazer ";
	}
	
	public String fazReserva(int i, boolean comEscala){
		if(daoCompanhiaB.realizaReserva(i)){
			return "Reserva feita com sucesso, ainda tem " + 
					daoCompanhiaB.cadeirasRestantes(i) + 
					" cadeiras dispon�veis no seu v�o";
		}else{
			return "N�o h� mais vagas dispon�ves nesse avi�o";
		}
	}
	
	public String mostraPassagens(boolean comEscala){
		if(!comEscala)
			return daoCompanhiaB.printPassagensDiretas();
		else
			return daoCompanhiaB.printPassagensEscala();
	}
	

}
