


import java.util.Scanner;


// 5. Introdueix un Array d'enters i calcula el % d'elements que són més grans que la mitjana aritmètica dels elements
// de la taula. Escriu els elements de l'Array, la mitjana i el nombre d'elements més grans que la mitjana.




public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int [] a = new int [10];
        float mitjanasuma = 0;
        float mitjana = 0;
        float mitjanasup = 0;
        float percent;

        for(int i = 0 ; i < a.length ; i++)
        {
            System.out.println("ARRAY::Entra valor per a vector de 10 posicions (nomes enters positius):");
            System.out.print("Valor possicio " + (i+1) + " =");
            a[i] = sc.nextInt();//entradas
            mitjanasuma = a[i] + mitjanasuma;
        }
        mitjana = mitjanasuma / a.length;

        System.out.println("Mitjana aritmetica = " + mitjana );
        for (int i = 0 ; i < a.length  ; i++ )  //calcula el % d num majors q la mitjana
        {
            if (a[i] > mitjana){
                mitjanasup++;
            }
        }
        percent = (mitjanasup / a.length) * 100 ; //mitjanasup ha de ser float!!!
        System.out.println(" % d'elements que són més grans que la mitjana aritmètica = " + (int) percent + " %" + " (" +(int) mitjanasup + " elements)");

        sc.close();

    }

}
