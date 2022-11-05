//PAQUETE
package com.mycompany.proyectoelmetro;

public class Tren {
    
    //ARRAY DE VAGONES
        Vagon[] vagones;
    //DEFINICION DE VARIABLES 
	private String horario;
	private String origen="Megacity";
	private String destino="PuebloVillage";

   //UTILIZO CLASES PUBLICAS  La parte pública es accedida desde todo el ámbito
   //del programa, también denominada interface de la clase.   
        
   //METODOS GETTER  Leer el valor del atributo: get + NombreAtributo o is + NombreAtributo si devuelve un tipo boolea
        
	public String getHorario() {
		return this.horario;
	}
        
        
        public String getOrigen() {
		return this.origen;
	}
        
        
        public String getDestino() {
		return this.destino;
	}
        
        public Vagon[] getVagones() {
        return vagones;
        }
        
        
   //METODOS SETTER  Establecer el valor de un atributo: set + NombreAtributo(la primera letra del nombre 
   //del atributo debe estar en mayúsculas)
         
	/**
	 * 
	 * @param horario
	 */
	public void setHorario(String horario) {
		this.horario = horario;
	}

	

	/**
	 * 
	 * @param origen
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	

	/**
	 * 
	 * @param destino
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}

    

        public void setVagones(Vagon[] vagones) {
        this.vagones = vagones;
        }

}