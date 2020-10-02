package jStrings;

import libs.Input;

public class inicialFacil {

    public static void main(String[] args) {

        System.out.println("Ingrese su nombre completo");
        String nombreCompleto = Input.get_string();

        //necesito saber cuantas letras tiene mi nombre
        int numeroTotalLetras = nombreCompleto.length();
        char posicionLetraMay = nombreCompleto.charAt(0);
        System.out.println(posicionLetraMay);

//        char posicionLetraMay = 1;
        while (posicionLetraMay <= numeroTotalLetras - 1) {
            char letraActual= nombreCompleto.charAt(posicionLetraMay);
            if(letraActual ==' ');
            System.out.println(nombreCompleto.charAt(posicionLetraMay + 1));
        }


    }


}
