/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.TallerCoche;

/**
 *
 * @author 59397
 */
public class Main2 {
     private static List<TallerCoche> coches = new ArrayList<>();

    public static void main(String[] args) {
   
    Scanner es = new Scanner(System.in);
    int t = 0;

    
        do {
            System.out.println("------DATOS DEL COCHE-------");
        System.out.println("Seleccione una Opcion " + "\n" + "1. Gestión de" + "\n");
        int opMG = es.nextInt();
        es.nextLine(); // Consumir el salto de línea

        if (opMG == 1) {
            System.out.println("ELIJA UNA OPCIÓN" + "\n"
                    + "1. Entrada nueva reparación" + "\n"
                    + "2. Salida de coche reparado" + "\n"
                    + "3. Listado de vehículos" + "\n"
                    + "4. Salir");
            int opP1 = es.nextInt();
            es.nextLine(); // Consumir el salto de línea

            switch (opP1) {
                case 1:
                    System.out.println("Nombre del propietario:");
                    String nombrePropietario = es.nextLine();
                    System.out.println("Marca:");
                    String marca = es.nextLine();
                    System.out.println("Placa:");
                    String placa = es.nextLine();

                    TallerCoche nuevoCoche = new TallerCoche(nombrePropietario, marca, placa, false);
                    coches.add(nuevoCoche);
                    System.out.println("Coche añadido");
                    break;
                case 2:
                    System.out.println("Nombre del propietario:");
                    String propietario = es.nextLine();

                    boolean cocheEncontrado = false;
                    for (TallerCoche coche : coches) {
                        if (coche.getNombrePropietario().equalsIgnoreCase(propietario) && !coche.getSiRepara()) {
                            coche.setSiRepara(true);
                            System.out.println("Coche reparado y entregado.");
                            cocheEncontrado = true;
                            break;
                        }
                    }

                    if (!cocheEncontrado) {
                        System.out.println("Coche no encontrado o ya reparado.");
                    }
                    break;
                case 3:
                    System.out.println("Listado de vehículos:");
                    for (TallerCoche coche : coches) {
                        System.out.println(coche);
                    }
                    break;
                case 4:
                    t = 1;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
    while (t 
!= 1);
    }
}
