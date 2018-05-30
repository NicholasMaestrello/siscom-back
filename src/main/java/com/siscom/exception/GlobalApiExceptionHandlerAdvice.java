package com.siscom.exception;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.h2.jdbc.JdbcSQLException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.siscom.exception.type.InvalidArgumentException;
import com.siscom.model.dto.ApiErrorDTO;

@ControllerAdvice(basePackages = {"com.siscom.controller"})
public class GlobalApiExceptionHandlerAdvice
{
	private final Logger LOGGER = LoggerFactory.getLogger(GlobalApiExceptionHandlerAdvice.class);
	
    @ExceptionHandler( value = DataIntegrityViolationException.class )
    @ResponseStatus( HttpStatus.INTERNAL_SERVER_ERROR )
    @ResponseBody
    public ApiErrorDTO handle( DataIntegrityViolationException ex)
    {
    	LOGGER.error("Erro inesperado", ex);
        return new ApiErrorDTO( ExceptionUtils.getMessage( ex ), 
                ExceptionUtils.getStackTrace( ex ),
                HttpStatus.INTERNAL_SERVER_ERROR.value( ));
    }
    
    @ExceptionHandler( value = InvalidArgumentException.class )
    @ResponseStatus( HttpStatus.INTERNAL_SERVER_ERROR )
    @ResponseBody
    public ApiErrorDTO handle( InvalidArgumentException ex)
    {
    	LOGGER.error("Erro inesperado", ex);
        return new ApiErrorDTO( ExceptionUtils.getMessage( ex ), 
                ExceptionUtils.getStackTrace( ex ),
                HttpStatus.INTERNAL_SERVER_ERROR.value( ));
    }
    
    @ExceptionHandler( value = JdbcSQLException.class )
    @ResponseStatus( HttpStatus.INTERNAL_SERVER_ERROR )
    @ResponseBody
    public ApiErrorDTO handle( JdbcSQLException ex)
    {
    	LOGGER.error("Erro inesperado", ex);
        return new ApiErrorDTO( ExceptionUtils.getMessage( ex ), 
                ExceptionUtils.getStackTrace( ex ),
                HttpStatus.INTERNAL_SERVER_ERROR.value( ));
    }
    
    @ExceptionHandler( value = ClassCastException.class )
    @ResponseStatus( HttpStatus.INTERNAL_SERVER_ERROR )
    @ResponseBody
    public ApiErrorDTO handle( ClassCastException ex)
    {
    	LOGGER.error("Erro inesperado", ex);
        return new ApiErrorDTO( ExceptionUtils.getMessage( ex ), 
                ExceptionUtils.getStackTrace( ex ),
                HttpStatus.INTERNAL_SERVER_ERROR.value( ));
    }
}   