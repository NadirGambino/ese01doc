
/**
 * Rappresento la sottoclasse Aerobica ereditato dalla classe Disciplina
 * @author Nadir Gambino
 *@version 1.0 04/05/2016
 */
	public class Aerobica extends Disciplina{
		
		private String codiceCorso;
	
	/**
	 *  	Costruttore della classe Aerobica
	 * @param Mensile1
	 * @param Annuale1
	 * @param nome1
	 * @param codiceCorso
	 */
	public  Aerobica(double Mensile1,double Annuale1,String nome1,String codiceCorso){
		
		super(Mensile1, Annuale1, nome1);
		this.codiceCorso = codiceCorso;
	}
	/**
	 * 
	 * @return codiceCorso Verrà visualizzato codiceCorso
	 */
	public String getCodiceCorso() {
		return codiceCorso;
	}
	/**
	 * 
	 * @param codiceCorso Permette di modificare il codiceCorso
	 */
	public void setCodiceCorso(String codiceCorso) {
		this.codiceCorso = codiceCorso;
	}
	}	
