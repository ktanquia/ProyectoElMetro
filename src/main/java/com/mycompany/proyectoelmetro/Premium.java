//PAQUETE
package com.mycompany.proyectoelmetro;

//APLICO HERENCIA A TRAVES DE EXTEND es un
//mecanismo de la programación orientada a
//objetos, por medio del cual una clase se
//construye a partir de otra.
//EN ESTE CASO PREMIUM HEREDA DE BILLETE

public class Premium extends Billete {

    //DECLARACION DE VARIABLE
	private double precio;

    //CONSTRUCTOR
    public Premium() {
        super.setPrecio(20.0);
        this.setPrecio(20.0);
    }
        
    //CLASES PUBLICAS  La parte pública es accedida desde todo el ámbito
   //del programa, también denominada interface de la clase.  

    //METODO GETTER Leer el valor del atributo: get + NombreAtributo o is + NombreAtributo si devuelve un tipo boolea
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