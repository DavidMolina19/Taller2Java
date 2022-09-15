package org.example;

import clases.Cliente;
import clases.Empanada;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Empanada empanada = new Empanada("empanada de papa y carne ","papa,carne,",1200,5000);
        Cliente cliente = new Cliente();
       DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss ");



        int opcion =100;
        Scanner entradaPorTeclado= new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Agergar Empanadas ");
        System.out.println("2. ver la empanada");
        System.out.println("3.editar precio empanada");
        System.out.println("5. salir ");
        while (opcion!=5){
            System.out.println("Digite una opcion");

            opcion=entradaPorTeclado.nextInt();

            if (opcion==1){
                System.out.println("ingrese saldo disponible ");
                cliente.setSaldoDisponible(entradaPorTeclado.nextInt());
                if(cliente.getSaldoDisponible()>5000){


                    System.out.println("digite el nombre del cliente: ");

                    System.out.println("los ingredientes son: "+empanada.getIngrediente());

                    System.out.println("el precio de la empanada es: "+empanada.getPrecioVenta());

                    System.out.println("digite la cantidad de empandas deseadas :" );
                    empanada.setCantidad(entradaPorTeclado.nextInt());

                    if(empanada.calcularPedido()>cliente.getSaldoDisponible()){
                        System.out.println("no tiene saldo suficiente");
                        System.out.println("ingresa otra cantidad menor de empanadas");
                        empanada.setCantidad(entradaPorTeclado.nextInt());

                    }else {

                        cliente.setSaldoDisponible(cliente.getSaldoDisponible()-empanada.calcularPedido());

                        System.out.println("gracias por su compra");
                        System.out.println("su nuevo saldo es :"+ cliente.getSaldoDisponible());

                    }



                }else{
                    System.out.println("no tenes plata");
                    break;
                }

            }else if(opcion==2){

                System.out.println("la empanada que compro es "+ empanada.getNombre());

                System.out.println("--regimen comun--");
                System.out.println(dtf.format(LocalDateTime.now()));

                System.out.println("el valor de la empanada es :"+ empanada.getPrecioVenta());

                System.out.println("los ingredientes de la empanada son : "+ empanada.getIngrediente());

                System.out.println("la cantidad de empanadas son :"+empanada.getCantidad());

                System.out.println("el precio de tu compra es :"+empanada.calcularPedido());


            }else if(opcion==3){
                  


            }else if (opcion==5){

            } else {
                break;
            }
        }


    }
}