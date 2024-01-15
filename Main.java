// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String opcion;
        do {
            String resultado;
            String nombre = Leer.leerTexto("Introduce tu nombre: ");
            String apellidos = Leer.leerTexto("Introduce tus apellidos: ");
            int edad = Leer.leerEntero("Introduce tu edad: ");
            double peso = Leer.leerDouble("Introduce tu peso actual: ");
            double altura = Leer.leerDouble("Introduce tu altura: ");
            String telefono = Leer.leerTexto("Introduce tu número de teléfono: ");
            double valor = peso / (Math.pow(altura, 2));
            if (valor <= 18.5) {
                resultado = "Bajo";
            } else if (valor <= 24.9) {
                resultado = "Normal";
            } else if (valor <= 29.9) {
                resultado = "Sobrepeso";
            } else {
                resultado = "Obesidad";
            }
            System.out.println(nombre + " " + apellidos + " de " + edad + " años, los datos introducidos son correctos");
            System.out.println("El teléfono de contacto es " + telefono);
            System.out.println("Se ha registrado su altura (" + altura + ") y su peso (" + peso + ")");
            System.out.println("Su IMC es: " + valor + ". Nivel: " + resultado);
            System.out.println("------------------");
            do{
            opcion = Leer.leerTexto("¿Otro usuario?(S/N): ");
            System.out.println("------------------");
            }while (!(opcion.equals("s") || opcion.equals("n")));
        }while(opcion.equalsIgnoreCase("s"));
    }
}