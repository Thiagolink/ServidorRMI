package companhia;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface Geral{

	@WebMethod public String opcoesAereas();
	
	@WebMethod public String mostraPassagens(boolean comEscala );

	@WebMethod public String fazReserva(int m, boolean b);
}
