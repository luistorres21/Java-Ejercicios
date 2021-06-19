/*
@Autor: Luis Torres
@Versión: 1.0
@Fecha: 12/06/21
*/

import java.lang.Math; 
/*librería utilizada para el redondeo Math.round para los porcentajes...*/
import java.util.Scanner;
public class Nomin{
   public static void main (String [] args){
   /*ZONA DE DECLARACIÓN DE ATRIBUTOS e Instanciación de objetos*/
   final float SBASE = 20000;
   final float PRIMHIJO = 1500;
   final double SS = 0.04;
   final double ISRL = 0.02;
   /*Definimos las constantes para el Salario Base, Prima Por Hijos, Seguro Social e Impuesto Sobre La Renta*/
   
   String decanato,CI,sexo;
   byte nHijos=0;
   byte opc=0;
   byte ctaEmpleados=0;
   double asignaciones=0;
   double deducciones=0;
   double netoACobrar=0;
   float acumSueldos=0;
   float promSueldos=0;
   /*Definimos los atributos para capturar las entradas y guardar los datos calculados respectivamente*/

   Scanner entrada = new Scanner(System.in);
   /*Instanciamos un objeto de tipo Scanner para la captura de los datos*/

   /*ENTRADA DE DATOS*/
   System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
   System.out.println("       MODULO DE NOMINA    ");
   System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
   /*implementamos un ciclo DO WHILE*/

   do {
      ctaEmpleados++;
      System.out.println("Ingrese el Codigo del Decanado: ");
      decanato = entrada.next();
      System.out.println();
      System.out.println("Ingrese la Cedula del Empleado: ");
      CI = entrada.next();
      System.out.println();
      System.out.println(" Indique el sexo M=Masculino; F=Femenino; X=Sin Definir: ");
      decanato = entrada.next();
      System.out.println();
      System.out.println("Ingrese el numero de hijos (0=Ninguno): ");
      nHijos = entrada.nextByte();
                
     /*PROCESAMIENTO DE DATOS*/
      asignaciones=nHijos*PRIMHIJO;/*SE CALCULAN LAS PRIMA POR HIJOS */
      deducciones=SBASE*SS+SBASE*ISRL;/*SE CALCULAN LAS DEDUCCIONES DEL SEGURO SOCIAL E ISRL*/
      netoACobrar=(SBASE+asignaciones)-deducciones;/*CALCULA EL NETO A COBRAR POR PROFESOR*/
      acumSueldos+=netoACobrar; /*SE ACUMULAN EL SUELDO DE CADA PROFESOR*/

      System.out.println();
      System.out.println();
      /*SALIDA DE DATOS DENTRO DEL CICLO DO WHILE CON LA INFORMACIÓN DE COBRO PARA CADA EMPLEADO*/

      System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
      System.out.println("       R E C I B O   D E   P A G O                ");
      System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
      System.out.println();
      System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
      System.out.println("         A S I G N A C I O N E S ");
      System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
      System.out.println("PRIMA POR HIJOS : "+nHijos*PRIMHIJO+" bsS");
      System.out.println();      System.out.println("TOTAL ASIGNACIONES : "+asignaciones+" bsS");
      System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
      System.out.println();
      System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
      System.out.println("           D E D U C C I O N E S ");
      System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
      System.out.println("SS : "+SBASE*SS+" bsS");
      System.out.println("ISLR : "+SBASE*ISRL+" bsS");
      System.out.println();
      System.out.println("TOTAL DEDUCCIONES : "+deducciones+" bsS");
      System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
      System.out.println();
      System.out.println("SALARIO BASE : "+SBASE+" bsS");
      System.out.println();
      System.out.println("SU SUELDO NETO A COBRAR ES =>: "+netoACobrar+" bsS");
      System.out.println();
      System.out.println();
      System.out.println("¿Desea Procesar otro empleado?");
      System.out.println();
      System.out.println("***Ingrese \"1\" para continuar o \"0\" para salir***");
      opc = entrada.nextByte();
     }while(opc!=0); 

     /*CALCULAMOS EL PROMEDIO DE SUELDOS*/
     promSueldos=acumSueldos/ctaEmpleados;
     System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
     System.out.println("         I N F O R M E        D E            R E S U L T A D O S ");
     System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
     System.out.println("EMPLEADOS DE LA NOMINA : "+ctaEmpleados);
     System.out.println();
     System.out.println("PROMEDIO DE SUELDOS PAGADOS POR LA UNIVERSIDAD: "+Math.round(promSueldos)+" bsS");
    
    }//fin de método main
}//fin de la clase
