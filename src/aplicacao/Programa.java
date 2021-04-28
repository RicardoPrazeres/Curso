package aplicacao;

import java.util.Date;

import entidadesEnum.OrdemStatus;
import entidadesEnum.Pedidos;

public class Programa {

	public static void main(String[] args) {
		
		Pedidos pedido = new Pedidos(1080, new Date(), OrdemStatus.PROCESSANDO_PAGAMENTO);
	
	
		System.out.println(pedido);
		
		OrdemStatus os1 = OrdemStatus.ENTREGUE;
		OrdemStatus os2 = OrdemStatus.valueOf("ENTREGUE");
		System.out.println(os1);
		System.out.println(os2);
		System.out.println(pedido);
	
	}

}
