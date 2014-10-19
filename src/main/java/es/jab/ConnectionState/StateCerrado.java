package es.jab.ConnectionState;

public class StateCerrado extends State {
	
    public void abrir(Conexion conexion){
    	conexion.setState(new StatePreparado());
    	conexion.setEstado(Estado.PREPARADO);
    }

    public void cerrar(Conexion conexion){
    	
    }

    public void parar(Conexion conexion){
    	throw new UnsupportedOperationException("Acción no permitida... ");
    }

    public void iniciar(Conexion conexion){
    	throw new UnsupportedOperationException("Acción no permitida... ");
    }

    public void enviar(Conexion conexion, String msg){
    	throw new UnsupportedOperationException("Acción no permitida... ");
    }

    public void recibir(Conexion conexion, int respuesta){
    	throw new UnsupportedOperationException("Acción no permitida... ");
    }

}
