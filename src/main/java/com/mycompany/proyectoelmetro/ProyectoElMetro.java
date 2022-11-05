/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

//PAQUETE
package com.mycompany.proyectoelmetro;

/**
 *
 * @author ADMI
 */
public class ProyectoElMetro {

    //METODO ESTATICO Si a un método se lo hace estático, entonces:
   // Este pertenece a la clase, en lugar de al objeto
    
    public static void main(String[] args) {
       LineadeMetro lm=new LineadeMetro();
       
       //CREO UN ARRAY DE PLAZAS
       Plaza p[]=new Plaza[40];
       for(int i=0;i<p.length;i++){
           Plaza p1=new Plaza();
           p1.setIdplaza(i);
           p1.setEstado(false);
           p[i]=p1;
       }
       
       //CREO UN ARRAY DE VAGONES
       Vagon v[]=new Vagon[6];
       for(int i=0;i<v.length;i++){
           Vagon v1=new Vagon();
           v1.setIdvagon(i);
           v1.setPlazas(p);
           v[i]=v1;
       }
       
       //CREO UN ARRAY DE TRENES 
       Tren t[]=new Tren[1];
       for(int i=0;i<t.length;i++){
        Tren t1=new Tren();
        t1.setHorario("MAÑANA");
        t1.setVagones(v);
        t[i]=t1;
    }
     lm.setTrenes(t);
     Taquilla ve=new Taquilla();
     ve.setLm(lm);
     ve.venderBilletes();
    }
}
