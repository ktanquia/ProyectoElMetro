//PAQUETE
package com.mycompany.proyectoelmetro;

public class Vagon {
    //ARRAY DE PLAZAS QUE TIENE 40 PLAZAS
    //DECLARACION DE VARIABLES
        Plaza[] plazas;
	private int idvagon;

    //CLASES PUBLICAS  La parte pública es accedida desde todo el ámbito
    //del programa, también denominada interface de la clase. 
        
    //METODOS GETTER Leer el valor del atributo: get + NombreAtributo o is + NombreAtributo si devuelve un tipo boolea
	public int getIdvagon() {
		return this.idvagon;
	}
        
         public Plaza[] getPlazas() {
        return plazas;
        }

    //METODOS SETTER Establecer el valor de un atributo: set + NombreAtributo(la primera letra del nombre 
   //del atributo debe estar en mayúsculas)
	/**
	 * 
	 * @param idvagon
	 */
	public void setIdvagon(int idvagon) {
		this.idvagon = idvagon;
	}

   

        public void setPlazas(Plaza[] plazas) {
        this.plazas = plazas;
        }

}