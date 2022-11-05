//PAQUETE
package com.mycompany.proyectoelmetro;

public class Plaza {

    //DECLARACION DE VARIABLES
	private int idplaza;
	private String tipo;
        private boolean estado;
        
    //CLASES PUBLICAS  La parte pública es accedida desde todo el ámbito
   //del programa, también denominada interface de la clase.   
        
    //METODOS GETTER Leer el valor del atributo: get + NombreAtributo o is + NombreAtributo si devuelve un tipo boolea
        
	public int getIdplaza() {
		return this.idplaza;
	}

        public String getTipo() {
		return this.tipo;
	}
        
        //UTILIZAMOS IS COMO DEVUELVE UN BOOLEANO
         public boolean isEstado() {
        return estado;
        }
         
    //METODOS SETTER stablecer el valor de un atributo: set + NombreAtributo(la primera letra del nombre 
   //del atributo debe estar en mayúsculas)
         
	/**
	 * 
	 * @param idplaza
	 */
	public void setIdplaza(int idplaza) {
		this.idplaza = idplaza;
	}

	/**
	 * 
	 * @param tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

   

        public void setEstado(boolean estado) {
        this.estado = estado;
        }
        
        //METODO  GETTIPO DE PLAZA VENTANILLA O PASILLO
        //METODO SOBRECARGADO es el mecanismo mediante el
        //cual se definen dos o más métodos con un
        //mismo nombre, pero con parámetros diferentes
        //en cantidad y/o tipo.
        public String getTipo(int nplaza){
            int contador=0;//variable contador
            int i=0;
            String resultado="";
            while(i<=nplaza){
                if((contador==0)|| (contador==3)){
                    contador=0;
                    resultado="ventanilla";
                }else{
                    resultado="pasillo";
                }
                contador++;
                i++;
            }
            return resultado;
        }

	

}