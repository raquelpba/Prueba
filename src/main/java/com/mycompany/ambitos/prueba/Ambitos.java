/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ambitos.prueba;

/**
 *
 * @author raquel.pereira
 */

public class Ambitos{
    public static void main(String[] args)
    {
        /*COMENTARIO 3*/
        //int a=1000;
        {
            {
                int a=2;
                System.out.println("1- a = " + a++);
            }
            int a = 1;
            int b = 1000;
            System.out.println("2- a = " + a++);
        }
        /*COMENTARIO 1*/
        //System.out.println("b = " + b);
        int a=0;
        System.out.println("3- a = " + a+1);
        {
            /*COMENTARIO 2*/
            //a=17;
            System.out.println("4- a = " + a+1);
            {
                System.out.println("5- a = " + a+1);
            }
        }
        System.out.println("6- a = " + a+1);
    }
}
