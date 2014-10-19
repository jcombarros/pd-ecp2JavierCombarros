package es.jab.ConnectionState;

public class ConexionMain {

	public static void main(String[] args) {
		Link link = new LinkImplementacion();
        Conexion conexion = new Conexion(link);
        
        conexion.abrir();
        System.out.println("Conexión abierta");
        conexion.cerrar();
        System.out.println("Conexión cerrada");

        
        conexion.abrir();
        System.out.println("Conexión abierta de nuevo");
        conexion.iniciar();
        System.out.println("Conexión preparada para enviar");
        conexion.parar();
        System.out.println("Conexión parada");

        
        conexion.iniciar();
        System.out.println("Conexión preparada de nuevo para enviar");
        conexion.enviar("Enviado");
        System.out.println("Conexion ha realizado un envio");
        conexion.recibir(0);
        System.out.println("Conexión ha recibido una respuesta");
        
        conexion.cerrar();
        System.out.println("Conexión cerrada");

	}

}
