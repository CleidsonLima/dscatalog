package com.devsuperior.dscatalog.services.exceptions;

public class DataBaseException extends RuntimeException{
    private static final long SerialVersionUID = 1L;

    public DataBaseException(String msg){
        super(msg);
    }
}
