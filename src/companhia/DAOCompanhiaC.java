package companhia;
import java.util.HashMap;
import java.util.Map;

public class DAOCompanhiaC {
	private Map<Integer, String> mapPassagens = new HashMap<Integer, String>();
	private Map<Integer, Integer> mapCadeiras = new HashMap<Integer, Integer>();

    public DAOCompanhiaC(){
    	passagens();
    	cadeiras();
    }
    
    public void passagens(){
    	mapPassagens.put(1, "Brasília to Rio de Janeiro às 12h");
    	mapPassagens.put(2, "São Paulo to Curitiba às 14h");
    	mapPassagens.put(3, "Manaus to Palmas às 8h");
    	mapPassagens.put(4, "Brasília to Salvador às 16h");
    	mapPassagens.put(5, "Goiânia to Belo Horizonte às 12h");
    	mapPassagens.put(6, "Natal to Brasília to Salvador 12h");
    	mapPassagens.put(7, "São Paulo to Florianópolis to Rio de Janeiro 12h");
    }
    public void cadeiras(){
    	mapCadeiras.put(1, 10);
    	mapCadeiras.put(2, 5);
    	mapCadeiras.put(3, 8);
    	mapCadeiras.put(4, 10);
    	mapCadeiras.put(5, 12);
    	mapCadeiras.put(6, 8);
    	mapCadeiras.put(7, 10);
    }
	public boolean realizaReserva(int i){
		int cadeiras = mapCadeiras.get(i);
		if(cadeiras>0){
			mapCadeiras.replace(i, cadeiras-1);
			return true;
		}else{
			return false;
		}
	}
	public String printPassagensDiretas(){
		String passagens = "";
		for(int i=1; i<6; i++){
			passagens = passagens + i + " " + mapPassagens.get(i) + "\n";
		}
		return passagens;
	}
	public String printPassagensEscala(){
		String passagens = "";
		for(int i=6; i<8; i++){
			passagens = passagens + i + " " + mapPassagens.get(i) + "\n";
		}
		return passagens;
	}
	public int cadeirasRestantes(int i){
		return mapCadeiras.get(i);
	}
}
