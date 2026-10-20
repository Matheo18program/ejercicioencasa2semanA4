//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package nd32;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Ana Pérez", "ana@correo.com");
        Cliente c2 = new Cliente("Luis Gómez", "luis@correo.com");

        c1.mostrar();
        c2.mostrar();

        c2.desactivar();
        System.out.println("Después de desactivar a Luis:");
        c2.mostrar();

        c2.activar();
        System.out.println("Después de activar a Luis:");
        c2.mostrar();

        System.out.println("Total de clientes: " + Cliente.getTotalClientes());
    }
}