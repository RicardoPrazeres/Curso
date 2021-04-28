package entidadesEnum;

import java.util.Date;

public class Pedidos {
	
	private Integer  id;
	private Date moment;
	private OrdemStatus staus;
	
	public Pedidos() {
	}

	public Pedidos(Integer id, Date moment, OrdemStatus staus) {
		this.id = id;
		this.moment = moment;
		this.staus = staus;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrdemStatus getStaus() {
		return staus;
	}

	public void setStaus(OrdemStatus staus) {
		this.staus = staus;
	}

	@Override
	public String toString() {
		return "Pedidos [id=" 
				+ id + ", moment="
				+ moment
				+ ", staus=" 
				+ staus + "]";
	}
	
	
		
	
}
