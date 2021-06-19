/*
@Autor:Luis Torres
@Versión: 1.0
@Fecha: 12/06/21
*/

import java.util.Scanner;
public class Aeroline{
   public static void main (String [] args){

   /*ZONA DE DECLARACIÓN DE ATRIBUTOS e Instanciación de objetos*/
   final String AVENSA     = "1";
   final String AEROPOSTAL = "2";
   final String ZULIANA    = "3";
   final String ASERCA     = "4";
   final String V_NACIO    = "5";
   final String V_INTER    = "6";
   /*Definimos las constantes para las aerolineas*/

   String hSalida,linAerea,numVuelo,tipVuelo;
   byte nPasajerosL1=0,nPasajerosL2=0,nPasajerosL3=0,nPasajerosL4=0;
   byte opc=0;
   String tipVueloMayor="";
   byte ctaVInter=0;
   byte ctaVNacio=0;
   int ttalPasajeros=0;
   /*Definimos los atributos para capturar las entradas y guardar los datos calculados respectivamente*/

    Scanner entrada = new Scanner(System.in);
   /*Instanciamos un objeto de tipo Scanner para la captura de los datos*/

   System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
   System.out.println("%%%%%%%%%%%%%%%%%            REGISTRO DE VUELOS                    %%%%%%%%%%%%%%%%%%%%%%");
   System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
   /*implementacion del ciclo DO WHILE*/
    do {  
       /*ENTRADA DE DATOS*/
       System.out.println("Ingrese el Codigo de la aerolinea (1=AVENSA; 2=AEROPOSTAL; 3=ZULIANA; 4=ASERCA): ");
       linAerea = entrada.next();
       System.out.println();
       System.out.println(" Ingrese el numero de pasajeros: ");
       System.out.println();

      /*PROCESAMIENTO DE DATOS*/
      switch (linAerea){
      case "1":{
               nPasajerosL1 = entrada.nextByte();
               ttalPasajeros+=nPasajerosL1;
               break;
               }
      case "2":{
               nPasajerosL2 = entrada.nextByte();
               ttalPasajeros+=nPasajerosL2;
               break;
               }
      case "3":{
               nPasajerosL3 = entrada.nextByte();
               ttalPasajeros+=nPasajerosL3;
               break;
               }
      case "4":{ 
               nPasajerosL4 = entrada.nextByte();
               ttalPasajeros+=nPasajerosL4;
               break ;
               }
      }//fin de switch

      /*ENTRADA DE DATOS*/
      System.out.println("Ingrese el tipo de vuelo (5=NACIONAL - 6=INTERNACIONAL): ");
      tipVuelo = entrada.next();
      System.out.println();
      
      /*EVALUAMOS EL TIPO DE VUELO PARA CONTARLO*/
      if (tipVuelo.equals("5")){
        ctaVNacio++;
      }//fin del if
      else{
        ctaVInter++;
      }//fin del else
    
      System.out.println("Indique el numero del vuelo: ");
      numVuelo = entrada.next();
      System.out.println();
      System.out.println("Ingrese la hora de salida: ");
      hSalida = entrada.next();
      System.out.println();
      System.out.println();
      System.out.println();

     /*PROCESAMIENTO DE DATOS*/

     System.out.println();
     System.out.println();
     System.out.println();
     System.out.println("Desea Procesar mas datos?");
     System.out.println();
     System.out.println(" Ingrese (1= continuar - 0= Salir): ");
     opc = entrada.nextByte();
     }while(opc!=0); 
  
   if (ctaVInter>ctaVNacio){
        tipVueloMayor="INTERNACIONAL";
   }//fin de if
   else if (ctaVInter<ctaVNacio){
     tipVueloMayor="NACIONAL";
   }//fin de if
   else{
    tipVueloMayor="LOS VUELOS NACIONALES E INTERNACIONALES TUVIERON IGUAL CONCURRENCIA";
   }//fin de else 

   /*SALIDA DE DATOS*/

   System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
   System.out.println("%%%%%%%%%%% R E P O R T E  D E  V U E L O S %%%%%%%%%%%%%%%%%%%%%%% ");
   System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
   System.out.println(); //ENCABEZADOS PARA EL REPORTE

   System.out.println("AEROLINEA :            NUMERO DE PASAJEROS :"); 
   System.out.print("A V E N S A");
   System.out.print("                   "); System.out.print(""                           +nPasajerosL1);
   System.out.println();
   System.out.print("A E R O P O S T A L");
   System.out.print("           "); System.out.print(""                           +nPasajerosL2);
   System.out.println(); 
   System.out.print("Z U L I A N A");
   System.out.print("                 "); System.out.print(""                            +nPasajerosL3);
   System.out.println();
   System.out.print("A S E R C A");
   System.out.print("                   "); System.out.print(""                            +nPasajerosL4);
   System.out.println();
   System.out.println();
   System.out.println("TOTAL DE VUELOS NACIONALES : "+ctaVNacio);
   System.out.println();
   System.out.println("TOTAL DE VUELOS INTERNACIONALES : "+ctaVInter);
   System.out.println(); System.out.println("TIPO DE VUELOS CON MAYOR NRO DE VUELOS : "+tipVueloMayor);
   System.out.println(); System.out.println();
   System.out.println("TOTAL DE PASAJEROS QUE SALIERON POR EL AEROPUERTO : "+ttalPasajeros);

   }//fin de método main
}//fin de la clase
