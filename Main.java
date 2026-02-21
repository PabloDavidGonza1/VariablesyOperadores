package VariablesyOperadores;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Scanner para leer datos desde teclado
        Scanner scanner = new Scanner(System.in);

        // ===============================
        // LOGIN CON 3 INTENTOS
        // ===============================
        // Se valida el acceso del usuario antes de continuar con el programa
        System.out.println("=== INICIO DE SESIÓN ===");

        // Credenciales correctas definidas en el sistema
        String usuarioCorrecto = "p.gonza";
        String contrasenaCorrecta = "1234";

        boolean acceso = false; // controla si el usuario logró ingresar
        int intentos = 3;       // número máximo de intentos permitidos

        // Ciclo while para permitir hasta 3 intentos de inicio de sesión
        while (intentos > 0 && !acceso) {

            System.out.print("Usuario: ");
            String usuario = scanner.nextLine();

            System.out.print("Contraseña: ");
            String contrasena = scanner.nextLine();

            // Validación de usuario y contraseña
            if (usuario.equals(usuarioCorrecto) && contrasena.equals(contrasenaCorrecta)) {
                System.out.println("Acceso concedido\n");
                acceso = true;
            } else if (usuario.equals(usuarioCorrecto)) {
                intentos--;
                System.out.println("Contraseña incorrecta. Intentos restantes: " + intentos);
            } else {
                intentos--;
                System.out.println("Usuario no registrado. Intentos restantes: " + intentos);
            }
        }

        // Si no logra acceder en los 3 intentos, el programa finaliza
        if (!acceso) {
            System.out.println("\nSe agotaron los 3 intentos.");
            System.out.println("Programa finalizado.");
            scanner.close();
            return;
        }

        // ===============================
        // INGRESO DE DATOS PERSONALES
        // ===============================
        // Se solicitan datos básicos del usuario
        System.out.println("=== DATOS PERSONALES ===");

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese su estatura (en metros): ");
        double estatura = scanner.nextDouble();

        System.out.print("¿Está activo? (true/false): ");
        boolean activo = scanner.nextBoolean();

        // ===============================
        // OPERACIONES MATEMÁTICAS
        // ===============================
        // Se realizan operaciones básicas con números enteros
        System.out.println("\n=== OPERACIONES MATEMÁTICAS (int) ===");

        System.out.print("Ingrese primer número entero: ");
        int a = scanner.nextInt();

        System.out.print("Ingrese segundo número entero: ");
        int b = scanner.nextInt();

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        // La división entre enteros no muestra decimales
        System.out.println("División (int): " + (a / b));

        // Se repiten las operaciones usando otros tipos de datos
        System.out.println("\n=== MISMAS OPERACIONES CON OTROS TIPOS ===");

        double d1 = a, d2 = b;
        System.out.println("División (double): " + (d1 / d2));

        float f1 = a, f2 = b;
        System.out.println("División (float): " + (f1 / f2));

        short s1 = (short) a, s2 = (short) b;
        System.out.println("Suma (short): " + (s1 + s2));

        byte by1 = (byte) a, by2 = (byte) b;
        System.out.println("Suma (byte): " + (by1 + by2));

        // ===============================
        // OPERACIONES LÓGICAS
        // ===============================
        // Se comparan los valores ingresados usando operadores lógicos
        System.out.println("\n=== OPERACIONES LÓGICAS ===");

        if (a > b) {
            System.out.println("El primer número es mayor que el segundo");
        } else if (a < b) {
            System.out.println("El primer número es menor que el segundo");
        } else {
            System.out.println("Ambos números son iguales");
        }

        // Uso del operador AND
        if (a > 0 && b > 0) {
            System.out.println("Ambos números son positivos");
        }

        // Uso del operador OR
        if (a > 0 || b > 0) {
            System.out.println("Al menos uno de los números es positivo");
        }

        // ===============================
        // INFORMACIÓN DE LA PERSONA
        // ===============================
        // Se muestran los datos ingresados por el usuario
        System.out.println("\n=== INFORMACIÓN DE LA PERSONA ===");

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
        System.out.println("Activo: " + activo);

        // Clasificación de la edad según rangos
        String clasificacionEdad;

        if (edad < 12) {
            clasificacionEdad = "Niño";
        } else if (edad <= 17) {
            clasificacionEdad = "Adolescente";
        } else if (edad <= 59) {
            clasificacionEdad = "Adulto";
        } else {
            clasificacionEdad = "Adulto mayor";
        }

        System.out.println("Clasificación de edad: " + clasificacionEdad);

        // ===============================
        // DÍA DE LA SEMANA
        // ===============================
        // Se utiliza switch para mostrar el día según el número ingresado
        System.out.println("\n=== DÍA DE LA SEMANA ===");

        System.out.print("Ingrese un número del 1 al 7: ");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1: System.out.println("Lunes"); break;
            case 2: System.out.println("Martes"); break;
            case 3: System.out.println("Miércoles"); break;
            case 4: System.out.println("Jueves"); break;
            case 5: System.out.println("Viernes"); break;
            case 6: System.out.println("Sábado"); break;
            case 7: System.out.println("Domingo"); break;
            default: System.out.println("Número inválido");
        }

        // ===============================
        // MENSAJE FINAL
        // ===============================
        // Mensaje de cierre del programa
        System.out.println("\n====================================");
        System.out.println("Programa finalizado correctamente.");
        System.out.println("Gracias por utilizar el sistema.");
        System.out.println("====================================");

        scanner.close();
    }
}