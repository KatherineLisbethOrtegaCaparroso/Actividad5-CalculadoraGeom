import java.util.Scanner;

public class CalculadoraGeom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la figura geométrica:");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.println("4. Rectángulo");
        System.out.println("5. Pentágono");
        System.out.print("Ingrese el número de la figura: ");
        int figura = scanner.nextInt();

        System.out.println("Seleccione la operación:");
        System.out.println("1. Área");
        System.out.println("2. Perímetro");
        System.out.print("Ingrese el número de la operación: ");
        int operacion = scanner.nextInt();

        double resultado = 0.0;

        switch (figura) {
            case 1:
                System.out.print("Ingrese el radio del círculo: ");
                double radio = scanner.nextDouble();
                if (operacion == 1) {
                    resultado = Math.PI * Math.pow(radio, 2); // Área
                } else if (operacion == 2) {
                    resultado = 2 * Math.PI * radio; // Perímetro
                }
                break;
            case 2:
                System.out.print("Ingrese la longitud del lado del cuadrado: ");
                double ladoCuadrado = scanner.nextDouble();
                if (operacion == 1) {
                    resultado = Math.pow(ladoCuadrado, 2); // Área
                } else if (operacion == 2) {
                    resultado = 4 * ladoCuadrado; // Perímetro
                }
                break;
            case 3:
                System.out.print("Ingrese la base del triángulo: ");
                double baseTriangulo = scanner.nextDouble();
                System.out.print("Ingrese la altura del triángulo: ");
                double alturaTriangulo = scanner.nextDouble();
                if (operacion == 1) {
                    resultado = (baseTriangulo * alturaTriangulo) / 2; // Área
                } else if (operacion == 2) {
                    System.out.print("Ingrese la longitud de los otros dos lados: ");
                    double lado1 = scanner.nextDouble();
                    double lado2 = scanner.nextDouble();
                    resultado = baseTriangulo + lado1 + lado2; // Perímetro
                }
                break;
            case 4:
                System.out.print("Ingrese la longitud del rectángulo: ");
                double longitud = scanner.nextDouble();
                System.out.print("Ingrese el ancho del rectángulo: ");
                double ancho = scanner.nextDouble();
                if (operacion == 1) {
                    resultado = longitud * ancho; // Área
                } else if (operacion == 2) {
                    resultado = 2 * (longitud + ancho); // Perímetro
                }
                break;
            case 5:
                System.out.print("Ingrese la longitud del lado del pentágono: ");
                double ladoPentagono = scanner.nextDouble();
                if (operacion == 1) {
                    resultado = (5 * ladoPentagono * ladoPentagono) / (4 * Math.tan(Math.PI / 5)); // Área
                } else if (operacion == 2) {
                    resultado = 5 * ladoPentagono; // Perímetro
                }
                break;
            default:
                System.out.println("Figura no válida.");
                break;
        }

        if (resultado != 0.0) {
            System.out.println("El resultado es: " + resultado);
        }


        scanner.close();
    }
}
