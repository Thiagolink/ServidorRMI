package companhia;
import java.rmi.RemoteException;

import javax.jws.WebService;

@WebService(endpointInterface = "companhia.Geral")
public class CompanhiaAereaC implements Geral {
	private String naming = "C";
	private DAOCompanhiaC daoCompanhiaC = new DAOCompanhiaC();
	
	public CompanhiaAereaC() throws RemoteException {}
	
	public String getNaming(){
		return naming;
	}
	
	@Override
	public String opcoesAereas(){
		return "Voc� escolheu a empresa a�rea C!";
	}
	
	public String menuCompanhia(){
		return "Deseja fazer ";
	}
	
	public String fazReserva(int i, boolean comEscala){
		if(daoCompanhiaC.realizaReserva(i)){
			return "Reserva feita com sucesso, ainda tem " + 
					daoCompanhiaC.cadeirasRestantes(i) + 
					" cadeiras dispon�veis no seu v�o";
		}else{
			return "N�o h� mais vagas dispon�ves nesse avi�o";
		}
	}
	
	public String mostraPassagens(boolean comEscala){
		if(!comEscala)
			return daoCompanhiaC.printPassagensDiretas();
		else
			return daoCompanhiaC.printPassagensEscala();
	}
	

}
