package lab5_excor5_marcos_alumno.s._gr.pkg01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab5_ExCor5_Marcos_AlumnoS_GR01 {

    static int Dia = 0;
    static double Unidades = 0;
    static BufferedReader Entrada = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int Menu = 0;
        double Matriz[][], Total = 0, Total1 = 0, Semana1[];
        String Semana[];
        Matriz = new double[5][3];
        Semana = new String[5];
        Semana1 = new double[5];
        do {
            System.out.println("Bienvenido a Sutel S.A\n1)Ingresar venta del dia.\n2)Mostrar ventas en colones.\n3)Mostrar ventas en dolares.\n4)Salir");
            Menu = Integer.parseInt(Entrada.readLine());
            if (Menu < 0 || Menu > 4) {
                System.out.print("Ingrese una opcion valida:");
                Menu = Integer.parseInt(Entrada.readLine());
            }

            switch (Menu) {
                case 1:
                    llenar(Matriz, Semana, Total, Total1, Semana1);
                    break;
                case 2:
                    Mostrar(Matriz, Semana, Total, Total1, Semana1);
                    break;
                case 3:
                    Mostrar1(Matriz, Semana, Total, Total1, Semana1);
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        } while (Menu > 0 && Menu < 4);
    }

    public static void llenar(double matriz[][], String semana[], double total, double total1, double semana1[]) throws IOException {
        int Operadora = 0;
        double Plan = 0, Cantidad = 0;

        System.out.print("Ingrese dia de la semana:");
        semana[Dia] = Entrada.readLine();
        System.out.print("Ingrese la cantidad de moviles Kolbi vendidos el dia " + semana[Dia] + "\nCantidad:");
        matriz[Dia][Operadora] = Double.parseDouble(Entrada.readLine());
        Cantidad = Cantidad + matriz[Dia][Operadora];
        Plan = matriz[Dia][Operadora];
        matriz[Dia][Operadora] = matriz[Dia][Operadora] * 225000;
        Plan = Plan * 22000;
        matriz[Dia][Operadora] = matriz[Dia][Operadora] + Plan;
        semana1[Dia] = semana1[Dia] + matriz[Dia][Operadora];
        Operadora = Operadora + 1;
        System.out.print("Ingrese la cantidad de moviles Claro vendidos el dia " + semana[Dia] + "\nCantidad:");
        matriz[Dia][Operadora] = Double.parseDouble(Entrada.readLine());
        Cantidad = Cantidad + matriz[Dia][Operadora];
        Plan = matriz[Dia][Operadora];
        matriz[Dia][Operadora] = matriz[Dia][Operadora] * 195000;
        Plan = Plan * 22000;
        matriz[Dia][Operadora] = matriz[Dia][Operadora] + Plan;
        semana1[Dia] = semana1[Dia] + matriz[Dia][Operadora];
        Operadora = Operadora + 1;
        System.out.print("Ingrese la cantidad de moviles Liberty vendidos el dia " + semana[Dia] + "\nCantidad:");
        matriz[Dia][Operadora] = Double.parseDouble(Entrada.readLine());
        Cantidad = Cantidad + matriz[Dia][Operadora];
        Plan = matriz[Dia][Operadora];
        matriz[Dia][Operadora] = matriz[Dia][Operadora] * 245000;
        Plan = Plan * 22000;
        matriz[Dia][Operadora] = matriz[Dia][Operadora] + Plan;
        semana1[Dia] = semana1[Dia] + matriz[Dia][Operadora];
        for (int i = 0; i <= Dia; i++) {
            total = semana1[i];
            //total=unidades[i];
        }
        Dia = Dia + 1;
        System.out.println("");
        Unidades = Unidades + Cantidad;
    }

    public static void Mostrar(double matriz[][], String semana[], double total, double total1, double semana1[]) throws IOException {
        for (int i = 0; i < Dia; i++) {
            System.out.println("Total del dia en dolares " + semana[i] + ":" + semana1[i]);

        }
        System.out.println("Dia" + "          Kolby" + "          Claro" + "          Liberty");
        for (int y = 0; y < Dia; y++) {
            System.out.print(semana[y]);
            for (int x = 0; x < matriz[0].length; x++) {
                System.out.print("      " + matriz[y][x] + "      ");
            }
            System.out.println("");
        }
        System.out.println("Total de moviles vendidos en la semana:" + Unidades);
        System.out.println("");
    }

    public static void Mostrar1(double matriz[][], String semana[], double total, double total1, double semana1[]) {
        for (int i = 0; i < Dia; i++) {
            System.out.println("Total del dia en dolares " + semana[i] + ":" + (semana1[i] / 522));

        }
        System.out.println("Dia" + "          Kolby" + "          Claro" + "          Liberty");
        for (int y = 0; y < Dia; y++) {
            System.out.print(semana[y]);
            for (int x = 0; x < matriz[0].length; x++) {
                System.out.print("      " + (matriz[y][x] / 522) + "      ");
            }
            System.out.println("");
        }
        System.out.println("Total de moviles vendidos en la semana:" + Unidades);
        System.out.println("");
    }
}
