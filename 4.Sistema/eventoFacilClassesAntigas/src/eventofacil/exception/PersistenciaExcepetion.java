package eventofacil.exception;

public class PersistenciaExcepetion extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6167705405882979770L;
	
	public PersistenciaExcepetion(String msg, Exception exception){
		super(msg, exception);
	}
	
	public PersistenciaExcepetion(String msg){
		super(msg);
	}
	
}
