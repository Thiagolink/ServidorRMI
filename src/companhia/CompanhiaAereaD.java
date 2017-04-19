package companhia;
import java.rmi.RemoteException;

import javax.jws.WebService;

@WebService(endpointInterface = "companhia.Geral")
public class CompanhiaAereaD implements Geral {
	private String naming = "D";
	private DAOCompanhiaD daoCompanhiaD = new DAOCompanhiaD();
	
	public CompanhiaAereaD() throws RemoteException {}
	
	public String getNaming(){
		return naming;
	}
	
	@Override
	public String opcoesAereas(){
		return "Você escolheu a empresa aérea D!";
	}
	
	public String menuCompanhia(){
		return "Deseja fazer ";
	}
	
	public String fazReserva(int i, boolean comEscala){
		if(daoCompanhiaD.realizaReserva(i)){
			return "Reserva feita com sucesso, ainda tem " + 
					daoCompanhiaD.cadeirasRestantes(i) + 
					" cadeiras disponíveis no seu vôo";
		}else{
			return "Não há mais vagas disponíves nesse avião";
		}
	}
	
	public String mostraPassagens(boolean comEscala){
		if(!comEscala)
			return daoCompanhiaD.printPassagensDiretas();
		else
			return daoCompanhiaD.printPassagensEscala();
	}
	
	

}
