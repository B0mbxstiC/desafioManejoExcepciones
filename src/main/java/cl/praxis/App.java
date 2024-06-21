package cl.praxis;

import cl.praxis.cliente.Cliente;
import cl.praxis.libroVenta.LibroVenta;
import cl.praxis.vehiculo.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main(String[] args) {
        // Ejemplo de uso
        List<Cliente> cliente = new ArrayList<>();
        List<Vehiculo> vehiculo = new ArrayList<>();
        List<LibroVenta> venta = new ArrayList<>();

        Cliente clienteUno = new Cliente("Juan AAAA", 231);
        Cliente clienteDos = new Cliente("Juan Pablo", 40);
        cliente.add(clienteUno);
        cliente.add(clienteDos);

        Vehiculo vehiculoUno = new Vehiculo("ABBA-23");
        Vehiculo vehiculoDos = new Vehiculo("ASDQ-23");
        vehiculo.add(vehiculoDos);
        vehiculo.add(vehiculoUno);

        LibroVenta ventaDos = new LibroVenta("Venta2", "100230310");
        LibroVenta ventaUno = new LibroVenta("Venta1", "01102020");

        ventaUno.guardarVenta(cliente, vehiculo);
        ventaDos.guardarVenta(cliente, vehiculo);



    }

}
