package cl.praxis.libroVenta;

import cl.praxis.cliente.Cliente;
import cl.praxis.vehiculo.Vehiculo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor

public class LibroVenta {
		private String nombreVenta;
		private String fechaVenta;

		// Método para guardar la venta
		public void guardarVenta(List<Cliente> cliente, List<Vehiculo> vehiculo) {

			//Método para crear nuevo archivo. Comprueba además si es que el archivo existe.
			File archivo = new File("ficheros.txt");
			if(!archivo.exists()){
				System.out.println("Archivo creado con éxito");
			} else {
				System.out.println("Archivo no encontrado");
			}

			try (FileWriter escribir = new FileWriter(archivo)) {
				for (int i = 0; i <cliente.size(); i++) {
					Cliente clienteConteo = cliente.get(i);
					Vehiculo vehiculoConteo = vehiculo.get(i);
					escribir.write("Patente del vehículo: " + vehiculoConteo.getPatente() + "\n");
					escribir.write("Edad del cliente: " + clienteConteo.getEdad() + "\n");
					escribir.write("Fecha de venta: " + this.fechaVenta + "\n");
					escribir.write("Nombre de venta: " + this.nombreVenta + "\n");
					escribir.write("\n");
				}
				System.out.println("Venta guardada exitosamente en: " + archivo.getPath());
			} catch (IOException e) {
				System.out.println("Error al guardar la venta: " + e.getMessage());
			}
		}


}
