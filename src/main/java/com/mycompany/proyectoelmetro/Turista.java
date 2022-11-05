//PAQUETE
package com.mycompany.proyectoelmetro;


//APLICO HERENCIA A TRAVES DE EXTEND es un
//mecanismo de la programación orientada a
//objetos, por medio del cual una clase se
//construye a partir de otra.
//EN ESTE CASO TURISTA HEREDA DE BILLETE
public class Turista extends Billete {

	private double precio;

//CONSTRUCTOR
    public Turista() {
        super.setPrecio(6.95);
        this.setPrecio(6.95);
    }
       
  //CLASES PUBLICAS  La parte pública es accedida desde todo el ámbito
  //del programa, también denominada interface de la clase. 
    
//METODO GETTERLeer el valor del atributo: get + NombreAtributo o is + NombreAtributo si devuelve un tipo boolea
	public double getPrecio() {
		return this.precio;
	}

//METODO SETTER Establecer el valor de un atributo: set + NombreAtributo(la primera letra del nombre 
   //del atributo debe estar en mayúsculas)
	/**
	 * 
	 * @param precio
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

}