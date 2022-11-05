
//PAQUETE
package com.mycompany.proyectoelmetro;

import java.util.Scanner;

public class Taquilla {
    //DECLARACION DE VARIABLE
    LineadeMetro lm;

    
    //CLASES PUBLICAS  La parte pública es accedida desde todo el ámbito
    //del programa, también denominada interface de la clase. 
    
    //METODO GETTER Leer el valor del atributo: get + NombreAtributo o is + NombreAtributo si devuelve un tipo boolea
        
    public LineadeMetro getLm() {
        return lm;
    }

    //METODO SETTER Establecer el valor de un atributo: set + NombreAtributo(la primera letra del nombre 
   //del atributo debe estar en mayúsculas)
    
    public void setLm(LineadeMetro lm) {
        this.lm = lm;
    }
    
    //METODO VENDER BILLETE
	public void venderBilletes() {
            //PREGUNTA AL USUARIO EN QUE TREN DESEA VIAJAR
		System.out.println("EN QUE TREN DESEA VIAJAR?");
                Scanner sc=new Scanner(System.in);
                String tren=sc.nextLine();//LEE LA RESPUESTA DEL USUARI0
             //PREGUNTA AL USUARIO EN QUE VAGON VIAJARA SABENDO QUE DEL 0Y1 PREMIUM Y DEL 3 AL 5 TURISTA
                System.out.println("EN QUE VAGON DESEA VIAJAR? (0Y1) SON PREMIUN Y (3 AL 5) ES TURISTA ");
                String nvagon=sc.nextLine();//LEE RESPUESTA DEL USUARIO
             //PREGUNTA EN QUE PLAZA QUIERE VIAJAR 
                System.out.println("EN QUE PLAZA DESEA VIAJAR? (0 AL 39) ");
                String nplaza=sc.nextLine(); //LEE RESPUESTA
                if(lm.ComprobarPlaza(Integer.valueOf(tren), Integer.valueOf(nvagon), Integer.valueOf(nplaza))==true){
                    Billete b;
                    if(Integer.valueOf(nvagon)<=1){
                        b=new Premium();
                    }else{
                        b=new Turista();
                    }
                    lm.asignarPlaza(Integer.valueOf(tren), Integer.valueOf(nvagon), Integer.valueOf(nplaza));
                    System.out.println("SU PLAZA AH SIDO ASIGNADA");
                    b.imprimirInfoBillete(Integer.valueOf(tren),Integer.valueOf(nvagon),Integer.valueOf(nplaza), b);
                }else{
                    System.out.println("NO SE HA PODIDO ASIGNAR LA PLAZA");
                }
                
	}

}