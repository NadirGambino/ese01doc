
/**
 * Rappresento la sottoclasse BodyBuilding ereditata dalla classe Disciplina
 * @author Nadir Gambino
 *@version 1.0 04/05/2016
 */

	public class BodyBuilding extends Disciplina{
	
	private String Peso;
	
	/**
	 * Costruttore della classe BodyBuilding
	 * @param Peso
	 * @param Mensile1
	 * @param Annuale1
	 * @param nome
	 */
	public BodyBuilding(String Peso, double Mensile1, double Annuale1, String nome1) {
		
		super(Mensile1, Annuale1, nome1);
		this.Peso = Peso;
		
	}
	
	/**
	 * 
	 * @return Peso  Ritorna il valore del Peso della Disciplina
	 */
	public String getPeso() {
		return Peso;
	}
	
	/**
	 * 
	 * @param Peso Parametro di Peso da impostare
	 */
	public void setPeso(String Peso) {
		this.Peso = Peso;
	}
}
