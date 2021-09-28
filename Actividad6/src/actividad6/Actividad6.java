/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad6;

import java.io.*;

/**
 *
 * @author Juan Carlos Camacho
 */
public class Actividad6 {
public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        try{
        Alumno alumno = new Alumno();
        System.out.println("Ingresa el nombre del alumno");
        alumno.nombre = (entrada.readLine());
        Double promedio = promedio(alumno.calificacion);
        String calificacion = calificacion(promedio);
        imprimirCalificacion(alumno,promedio,calificacion);
         }
        catch (Exception e){
            System.out.println("Ha sucedido un error, vuelva intentar");   
        }
    }

    private static Double promedio(Double[] calificacion)  throws IOException {
        
        Double cal = 0.0d;
        Double promedio = 50d;
        for (int i = 0; i <= 4; ++i) {
             System.out.println("Ingresa la calificación de la materia "+ (i+1)+" del alumno");
             calificacion[i] =  Double.parseDouble(entrada.readLine());
               if (calificacion[i] <0 || calificacion[i]>100){
                 System.out.println("Solo se aceptan calificaciones en el rango de 0 a 100, introduzca la calificación " + (i+1) + " de nuevo");
                 i=i-1;
             }
    }
        for (int i = 0; i <= 4; ++i) {
             cal = cal+calificacion[i];
    }
        promedio = cal/5;
    return promedio;
 }
    private static String calificacion(Double promedio) {
        String calificacion = " ";
        if (promedio <= 50){
            calificacion = "F";
        }
        if (promedio > 50 && promedio <=60){
            calificacion = "E";
        }
       if (promedio > 60 && promedio <=70){
            calificacion = "D";
        }
       if (promedio > 70 && promedio <=80){
            calificacion = "C";
        }
         if (promedio > 80 && promedio <=90){
            calificacion = "B";
        }
        if (promedio > 90 && promedio <=100){
            calificacion = "A";
        }
        return calificacion;
    }

    private static void imprimirCalificacion(Alumno alumno, Double promedio, String calificacion) {
    System.out.println("Nombre estudiante : "+ alumno.nombre);
    for (int i = 0; i <=4; ++i) {
             System.out.println("Calificación "+ (i+1) +": " + alumno.calificacion[i]);
    }
    System.out.println("Promedio: "+ promedio);
    System.out.println("Calificación: "+ calificacion);
    
}
}