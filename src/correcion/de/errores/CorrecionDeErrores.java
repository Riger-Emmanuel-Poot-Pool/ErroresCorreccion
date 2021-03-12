package correcion.de.errores;

import java.util.Scanner;

public class CorrecionDeErrores {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double NumeroReal, NumeroAproximado;

        System.out.println("\33 PROGRAMA PARA SABER EL ERROR ABSOLUTO, ERROR RELATIVO Y ERROR RELATIVO PORCENTUAL");
        System.out.println("");
        System.out.println("Ingrese el valor Real (X)");
        NumeroReal = tec.nextDouble();
        System.out.println("Ingrese el valor Aproximado (Xi)");
        NumeroAproximado = tec.nextDouble();
        ErroresC E1 = new ErroresC(NumeroReal, NumeroAproximado);
        System.out.println(" ");
        System.out.println("Formulas a utilizar para el Error absoluto (ea = |X - Xi|)");
        System.out.println("Error absoluto es = " + E1.ErrorAbsoluto());
        System.out.println(" ");
        System.out.println("Formulas a utilizar para el Error relativo (Er = ea/X)");
        System.out.println("Error Relativo es = " + E1.ErrorRelativo(E1.ErrorAbsoluto()));
        System.out.println(" ");
        System.out.println("Formulas a utilizar para el Error relativo porcentual (Erp = (ea/X) * 100%)");
        System.out.println("Error Relativo porcentual es = " + E1.ErrorRelativoPorcentual(E1.ErrorRelativo(E1.ErrorAbsoluto())) + "%");
    }

}
