package companhia;
import java.rmi.RemoteException;

import javax.jws.WebService;

@WebService(endpointInterface = "companhia.Geral")
public class CompanhiaAereaB implements Geral {
	private String naming = "B";
	private DAOCompanhiaB daoCompanhiaB = new DAOCompanhiaB();
	
	public CompanhiaAereaB() throws RemoteException {}
	
	public String getNaming(){
		return naming;
	}
	
	@Override
	public String opcoesAereas(){
		return "Você escolheu a empresa aérea B!";
	}
	
	public String menuCompanhia(){
		return "Deseja fazer ";
	}
	
	public String fazReserva(int i, boolean comEscala){
		if(daoCompanhiaB.realizaReserva(i)){
			return "Reserva feita com sucesso, ainda tem " + 
					daoCompanhiaB.cadeirasRestantes(i) + 
					" cadeiras disponíveis no seu vôo";
		}else{
			return "Não há mais vagas disponíves nesse avião";
		}
	}
	
	public String mostraPassagens(boolean comEscala){
		if(!comEscala)
			return daoCompanhiaB.printPassagensDiretas();
		else
			return daoCompanhiaB.printPassagensEscala();
	}
	

}
