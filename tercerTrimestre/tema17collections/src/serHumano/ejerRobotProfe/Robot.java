package serHumano.ejerRobotProfe;

public class Robot implements Comparable<Robot>{

	private String id;
	private Double vida;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Double getVida() {
		return vida;
	}
	public void setVida(Double vida) {
		this.vida = vida;
	}
	@Override
	public String toString() {
		return "Robot [id=" + id + ", vida=" + vida + "]";
	}
	
	public int compareTo(Robot o) {
		
		return (this.vida.compareTo(o.getVida()));
		
		/*if(this.vida > o.getVida()) {
			return 1;
		}else if (this.vida == o.getVida()) {
			return 0;
		}else return -1;
		*/
	}
	public Robot(String id, Double vida) {
		super();
		this.id = id;
		this.vida = vida;
	}
	
}
