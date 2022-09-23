package br.com.jonas.cursomc.service.exceptions;

public class ObjectNotFoundException extends RuntimeException{

    public ObjectNotFoundException(String msg) {
        super(msg);
    }

    public ObjectNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
