/**
 * Rappresento la sottoclasse Nuoto ereditata dalla classe Disciplina
 * @author Nadir Gambino
 *@version 1.0 04/05/2016
 */
public class Nuoto extends Disciplina{
	
	private String codiceCorso;
	
	/**
	 * Attributo che definisce la corsia del corso
	 */
	public int Corsia;
	
	/**
	 * Costruttore della classe Nuoto
	 * @param Mensile1
	 * @param Annuale1
	 * @param nome1
	 * @param codiceCorso
	 * @param corsia
	 */
	public Nuoto(double Mensile1,double Annuale1,String nome1,String codiceCorso,int corsia){
		
		super(Mensile1, Annuale1, nome1);
		this.codiceCorso=codiceCorso;
		this.Corsia=Corsia;
		
	}
	/**
	 * Ritorna il codice del corso
	 * @return codiceCorso
	 */
	public String getCodiceCorso() {
		return codiceCorso;
	}
	/**
	 * Parametro del codice da impostare
	 * @param codiceCorso
	 */
	public void setCodiceCorso(String codiceCorso) {
		this.codiceCorso = codiceCorso;
	}
}
