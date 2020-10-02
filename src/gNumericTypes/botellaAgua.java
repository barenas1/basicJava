package gNumericTypes;
//Implementar un programa que reporte el uso de un usuario que dura x minutos
//en la ducha expresado en botellas de agua
// Preguntarle al usuario cuantos minutos estas en la ducha
//minuto=1 botellas=12

import libs.Input;

public class botellaAgua {
    static int numeroMinutos;
    static int numeroBotellas;

    public static void main(String[] args) {
        System.out.println("Ingreso en minutos cuanto tiempo duras en la ducha:");
        numeroMinutos = Input.get_int();

        //si el numeroMinutos es positivo, muestre un mensaje de error.. multiplica por doce e imprime el numero de botella
        //sino(else) un mensaje de error.
        if (numeroMinutos >= 0) {
            numeroBotellas = numeroMinutos * 12;
            System.out.println("El número de botellas que gastas en la ducha es:" + numeroBotellas);
        } else {

            System.out.println("El número ingresado es invalido");
        }

    }

}
