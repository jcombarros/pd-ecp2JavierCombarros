package es.jab.ConnectionState;

public class StatePreparado extends State {

	@Override
	public void abrir(Conexion conexion) {

	}

	@Override
	public void cerrar(Conexion conexion) {
    	conexion.setState(new StateCerrado());
    	conexion.setEstado(Estado.CERRADO);
	}

	@Override
	public void parar(Conexion conexion) {
		conexion.setState(new StateParado());
    	conexion.setEstado(Estado.PARADO);
	}

	@Override
	public void iniciar(Conexion conexion) {

	}

	@Override
	public void enviar(Conexion conexion, String msg) {
		conexion.setState(new StateEsperando());
		conexion.getLink().enviar(msg);
    	conexion.setEstado(Estado.ESPERANDO);
	}

	@Override
	public void recibir(Conexion conexion, int respuesta) {
    	throw new UnsupportedOperationException("Acción no permitida... ");
	}

}
