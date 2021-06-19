/*
@Autor:Luis Torres
@Versión: 1.0
@Fecha: 12/06/21
*/

import java.lang.Math; 
/*librería para usar el método de redondeo Math.round para los porcentajes...*/
import java.util.Scanner;
public class Encuest{
   public static void main (String [] args){

   /*ZONA DE DECLARACIÓN DE ATRIBUTOS e Instanciación de objetos*/
   boolean swHPan=false;
   boolean swHJuana=false;
   /* Atributos booleanas para detectar las repuestas "Sí o No"*/

   String hPan;
   String hJuana;
   /*Atributos String para alamacenar las repuestas "Sí o No" de los encuestados*/
   byte ctaHPan=0;
   byte ctaHJuana=0;
   byte ctaAmbasOPciones=0;
   byte ctaNinguna=0;
   byte ctaEncuestados=0;
   byte opc=0;
   /*Atributos bayte para contar las repuestas de los encuestados*/

   float pctHPan=0,pctHJuana=0,pctNgo=0,pctAmb=0;
   /*Atributos para almacenar el porcentaje*/
   
   Scanner teclado = new Scanner(System.in);
   /*Instanciamos un objeto de tipo Scanner para la captura de los datos*/

   /*ENTRADA DE DATOS*/

   System.out.println();
   System.out.println();
   System.out.println();

   /*implementacion de un ciclo DO WHILE */
   do {
       ctaEncuestados++;
       System.out.println(" Consume usted Harina Pan? s/n");
       hPan = teclado.next();
       System.out.println(" Consume usted Harina Juana? s/n");
       hJuana = teclado.next();
       System.out.println();
       System.out.println();

    /*PROCESAMIENTO DE DATOS*/
    if (hPan.equals("s")){
        swHPan=true;
    }//fin de if
    else{
        swHPan=false;
    }//fin de else

    if (hJuana.equals("s")){
       swHJuana=true;
   }//fin de if
   else{
       swHJuana=false;
   }//fin de else

   if (swHPan==true && swHJuana==false){
      ctaHPan++; 
   }//fin de if

   else if(swHPan==false && swHJuana==true){
         ctaHJuana++;
   }//fin de elseif

   else if(swHPan==true && swHJuana==true){
          ctaAmbasOPciones++;
   }//fin de else if
   else{
      ctaNinguna++;
   }//fin de else

   System.out.println("¿Desea Procesar más encuestados?");
   System.out.println("PRESIONE  \"1\" para continuar o \"0\" para salir***");
   opc = teclado.nextByte();
   }while(opc!=0); 

   /*SALIDA DE DATOS*/
   /*Calculamos los porcentajes*/
   pctHPan=(ctaHPan*100)/ctaEncuestados;
   pctHJuana=(ctaHJuana*100)/ctaEncuestados;
   pctAmb=(ctaAmbasOPciones*100)/ctaEncuestados;
   pctNgo=(ctaNinguna*100)/ctaEncuestados;

   System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
   System.out.println("                       R E S U L T A D O S   D E  L A   E N C U E S T A"                          );
   System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
   System.out.println();
   System.out.println("Total Personas Encuestadas: "+ctaEncuestados);
   System.out.println();
   System.out.println("Porcentaje de personas que consumen solo el producto Harina Pan : "+Math.round(pctHPan)+"%");
   System.out.println("Porcentaje de personas que consumen solo el producto Harina Juana : "+Math.round(pctHJuana)+"%");
   System.out.println("Porcentaje de personas que consumen ambos producto Harina Pan y Harina Juana : "+Math.round(pctAmb)+"%");
   System.out.println("Porcentaje de personas que NO consumen ninguno de los producto : "+Math.round(pctNgo)+"%");
    System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
   }//fin de método main
}//fin de la clase
