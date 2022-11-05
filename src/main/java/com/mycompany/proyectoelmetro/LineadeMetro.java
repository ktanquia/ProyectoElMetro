package com.mycompany.proyectoelmetro;

public class LineadeMetro {
    //ARRAY DE TRENES
    Tren[] trenes;
    
    //METODO GETTER Leer el valor del atributo: get + NombreAtributo o is + NombreAtributo si devuelve un tipo boolea
        public Tren[] getTrenes() {
        return trenes;
        }

    //METODO SETTER stablecer el valor de un atributo: set + NombreAtributo(la primera letra del nombre 
   //del atributo debe estar en mayúsculas)
        
        public void setTrenes(Tren[] trenes) {
            this.trenes = trenes;
        }
        
    //METODOS
        
	public void informacionTrenes() {
		// TODO - implement LineadeMetro.informacionTrenes
		throw new UnsupportedOperationException();
	}
        
	

	public boolean ComprobarPlaza(int tren, int nvagon, int plaza) {
		if(trenes[tren].getVagones()[nvagon].getPlazas()[plaza].isEstado()==false){
                return true;
                }else{
                    return false;
                }
	}//termina comprobarplaza

    public void asignarPlaza(int tren, int nvagon, int plaza) {
            trenes[tren].getVagones()[nvagon].getPlazas()[plaza].setEstado(true);
            
	}

    
}