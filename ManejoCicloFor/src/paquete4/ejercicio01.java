/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete4;

/**
 *
 * @author UTPL
 */
public class ejercicio01 {

    public static void main(String[] args) {

        String mensaje = "";
        int total_uno = 0;
        int total_dos = 0;
        int total_tres = 0;
        int total_cuatro = 0;

        for (int i = 30; i >= 10; i--) { // aqui usamos para poner valores 
            //iniciales de la numeracion y comienza en 30, y va disminuyendo hasta el final
            int numero_1 = i; // aqui se asigna el valor de 30 luego por la disminucion va a valer uno menos hasta llegar al 10
            int numero_2 = 2 * i; // para el resto d columnas se va multiplicando hasta el numero 4
            int numero_3 = 3 * i;
            int numero_4 = 4 * i;

            mensaje = String.format("%s%n%d-%d-%d-%d", mensaje, numero_1, numero_2, numero_3, numero_4);
            total_uno = numero_1 + total_uno;
            total_dos = numero_2 + total_dos;
            total_tres = numero_3 + total_tres;
            total_cuatro = numero_4 + total_cuatro;

        }

        mensaje = String.format("%s%nTotales = %d-%d-%d-%d\n", mensaje, // se acumula la cadena
                total_uno, total_dos, total_tres, total_cuatro);
        System.out.printf(mensaje);
    }
}

