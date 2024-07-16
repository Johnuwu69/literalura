package com.aluracursos.literalura.principal;

import java.util.Scanner;

public class Principal {

    private Scanner teclado = new Scanner(System.in);

    public void mostrarMenu(){
        var opcion = -1;
        var menu = """
                Elija la opcion a traves de su numero:
                1- buscar libro por titulo
                2- listar libros registrados
                3- listar autores registrados
                4- listar autores vivos en determinado año
                5- listar libros por idioma
                0- salir
                """;
        System.out.println(menu);
        opcion = teclado.nextInt();
        teclado.nextLine();

        switch (opcion){
            case 1:
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Opcion invalida");
        }
    }
}
