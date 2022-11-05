//PAQUETE
package com.mycompany.proyectoelmetro;

public class Billete {

    //DECLARACION DE VARIABLES
	private double precio;
	private static int idbillete;// es estatico porque el id es unico 

   //CONSTRUCTOR 
    public Billete() {
        idbillete++; //CADA VEZ QUE SE CREA UN BILLETE SE INCREMENTA EN 1 EL ID
    }
        
        
//METODO GETTERLeer el valor del atributo: get + NombreAtributo o is + NombreAtributo si devuelve un tipo boolea
	public double getPrecio() {
		return this.precio;
	}
        
        public int getIdbillete() {
		return this.idbillete;
	}

        
    //METODO SETTERstablecer el valor de un atributo: set + NombreAtributo(la primera letra del nombre 
   //del atributo debe estar en mayúsculas)

	/**
	 * 
	 * @param precio
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	/**
	 * 
	 * @param idbillete
	 */
	public void setIdbillete(int idbillete) {
		this.idbillete = idbillete;
	}
        
        
     //METODOS
        
        public void imprimirInfoBillete(int tren, int vagon, int plaza, Billete b){
            System.out.println("BILLETE ID: "+this.getIdbillete());
            System.out.println("PRECIO: "+b.getPrecio());
            System.out.println("TREN: "+tren);
            System.out.println("VAGON: "+vagon);
            System.out.println("PLAZA: "+plaza);
            Plaza p=new Plaza();
            System.out.println("EL TIPO DELA PLAZA ELEGIDA ES: "+p.getTipo(plaza));
            Tren t=new Tren();
            System.out.println("DESTINO: "+t.getDestino());
            System.out.println("ORIGEN: "+t.getOrigen());
        }

}