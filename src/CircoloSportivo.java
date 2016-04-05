/**
 * Questa classe rappresenta il Circolo Sportivo
 * 
 * @author Nadir Gambino
 *@version 1.0 04/05/2016
 */

public class CircoloSportivo {
	
	/**
	 * ElencoSoci è un array che contiene il numero massimo dei soci che possono Iscriversi (150)
	 * Nome è un attributo di tipo Stringa
	 */
	public String Nome;
	public int ElencoSoci[]=new int [150];
	
	private Disciplina[] discipline= new Disciplina[3];
	
	/**
	 * Costruttore della classe CircoloSportivo
	 * 
	 * @param nome Nome del CircoloSportivo
	 */
	
	public CircoloSportivo(String Nome){
		
		this.Nome=Nome;
	}
		
	/**
	 * Metodo che terrà gli iscritti del cirloco sportivo
	 */
	
	public void ElencoIscritti(){
		
	}
	/**
	 * Metodo che terrà gli iscritti divisi per disciplina
	 * @param disc il parametro indica la disciplina
	 */
	
	public void ElencoIscrittiPerDisciplina(String disc){
	
	}
	
	/**
	 * 
	 * @return Nome Sarà possibile visualizzare il nome del circolo sportivo
	 */
	public String getNome(){
		return Nome;
	}
	
	/**
	 *  Metodo che permette di aggiungere una disciplina
	 * @param D
	 */
	public void aggiungiDisciplina( Disciplina D ) {
		
	}
	/**
	 * Metodo che permette di rimuovere una disciplina
	 * @param D
	 */
	public void rimuoviDisciplina( Disciplina D ) {
		
	}
}
