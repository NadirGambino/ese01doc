/**
 * La classe disciplina è una classe astratta la quale sarà la base delle tre discipline praticate
 * @author Nadir Gambino
 *@version 1.0 04/05/2016
 */
public abstract class Disciplina {
	
	private double Mensile;
	private double Annuale;
	
	/**
	 * String nome Attributo nome di tipo Stringa
	 */
	public String nome;

	/**
	 *  Costruttore della classe Disciplina
	 * @param Mensile1
	 * @param Annuale1
	 * @param nome1
	 */
	public Disciplina(double Mensile1, double Annuale1, String nome1) {
		Mensile = Mensile1;
		Annuale = Annuale1;
		nome = nome1;
	}

		/**
		 * Ritorna il valore della retta mensile
		 * @return Mensile
		 */
	public double getMensile() {
		return Mensile;
	}
	
	/**
	 *Valore della retta mensile Modificato 
	 * @param Mensile
	 */
	public void setMensile(float Mensile) {
		this.Mensile = Mensile;
	}
	
	/**
	 * Ritorna il valore della retta annuale
	 * @return Annuale
	 */
	public double getAnnuale() {
		return Annuale;
	}

		/**
		 * Valore della retta annuale modificato
		 * @param Annuale
		 */
	public void setAnnuale(float Annuale) {
		this.Annuale = Annuale;
	}
}

