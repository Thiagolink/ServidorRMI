import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CompanhiaAereaC extends UnicastRemoteObject implements Geral {
	private String naming = "C";
	private DAOCompanhiaC daoCompanhiaC = new DAOCompanhiaC();
	
	public CompanhiaAereaC() throws RemoteException {}
	
	public String getNaming(){
		return naming;
	}
	
	@Override
	public String opcoesAereas(){
		return "Você escolheu a empresa aérea C!";
	}
	
	public String menuCompanhia(){
		return "Deseja fazer ";
	}
	
	public String fazReserva(int i, boolean comEscala){
		if(daoCompanhiaC.realizaReserva(i)){
			return "Reserva feita com sucesso, ainda tem " + 
					daoCompanhiaC.cadeirasRestantes(i) + 
					" cadeiras disponíveis no seu vôo";
		}else{
			return "Não há mais vagas disponíves nesse avião";
		}
	}
	
	public String mostraPassagens(boolean comEscala){
		if(!comEscala)
			return daoCompanhiaC.printPassagensDiretas();
		else
			return daoCompanhiaC.printPassagensEscala();
	}
	

}
