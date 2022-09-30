package br.com.jonas.cursomc.service.exceptions;

public class DataIntegrityException extends RuntimeException{

    public DataIntegrityException(String msg) {
        super(msg);
    }

    public DataIntegrityException(String message, Throwable cause) {
        super(message, cause);
    }
}
