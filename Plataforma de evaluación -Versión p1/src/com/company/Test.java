package com.company;
import java.util.Scanner;
import java.util.Arrays;

import java.util.Scanner;

public class Test {
    public void eva  (){
        Scanner sc=new Scanner(System.in);
        String p[] = {"Pregunta 1","Pregunta 2", "Pregunta 3", "Pregunta 4", "Pregunta 5"};
        int ans[] = new int[5], r = 0;
        System.out.println("\u001B[0m A continuación se le presentaran una serie de preguntas relacionadas  a su forma de actuar o pensar");
        System.out.println("\u001B[31m Conteste de manera sincera para identificar sus resultados al final de la evaluación");
        System.out.println("\u001B[31m Teclee el número indicado por la escala de evaluación para seleccionar su respuesta");
        for (int i = 0; i < 5; i++) {
            System.out.println("\u001B[31m 1:Totalmente en desacuerdo, 2:Desacuerdo, 3:Indiferente,4: Deacuerdo,5:Totalmente de acuerdo");
            System.out.println("\u001B[21m " +p[i]);
            ans[i]= sc.nextInt();
        }
        for (int i = 0; i < 5; i++){
            r = ans[i]+r;
        }
        int por = (r/25)*100;
        int radio = (r*360)/25;
        System.out.println(r);
        System.out.println(radio);
        Grafica gp = new Grafica();
        gp.Gravalue(por,radio);
    }
}
