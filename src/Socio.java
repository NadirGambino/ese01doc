/**
 * Questa classe rappresenta il Socio
 * 
 * @author Nadir Gambino
 *@version 1.0 04/05/2016
 * */


	public class Socio {
	private String nome,cognome,cf;
	
	/**
	 * Costruttore della classe Socio
	 * @param nome,cognome,cf con questi parametri rappresento i dati di Socio
	 * */
	
	public Socio (String nome,String cognome, String cf){
	
	this.nome=nome;
	this.cognome=cognome;
	this.cf=cf;
}

	/**
	 * 
	 * @param isAnnuale è un parametro che rappresenta la retta
	 * @return 0.0 ritornerà il valore double
	 */
	public double calcoloRetta(boolean isAnnuale){
	return 0.0;
}

	/**
	 * 
	 * @return nome Sarà possibile visualizzare il nome del Socio
	 */
	public String getNome(){
	return nome;
}
	/**
	 * @param nome Nuovo nome Socio
	 * 
	 */
	public void setNome(String nome){
	 this.nome=nome;
}
	/**
	 * 
	 * @return cognome Ritorna il cognome
	 */
	public String getCognome(){
	return cognome;
}
	/**
	 * 
	 * @param cognome Nuovo cognome di Socio
	 * 
	 */
	public void setCognome(String cognome){
		this.cognome=cognome;
}
	/**
	 * 
	 * @return cf Ritorna cf
	 */
	public String getCf(){
	return cf;
}
	/**
	 * 
	 * @param cf Nuovo cf di Socio
	 */
	public	void setCf(String cf){
		this.cf=cf;
}
	  
}


