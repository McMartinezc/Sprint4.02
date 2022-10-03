package cat.itacademy.barcelonactiva.Martinez.MCarmen.s04.t02.n01.S04T02N01MartinezMCarmen.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
//Aquesta clase ens gestionarà les exceptions y les captura

@ControllerAdvice
public class GestorException {

    @ExceptionHandler({ItemNotFoundException.class}) //Los métodos anotados de esta manera se encargarán de manejar las excepciones que se hayan detallado en la propia anotación.
    public ResponseEntity<Object> handleItemNotFound(ItemNotFoundException ex) {
        Map<String, Object> errors = new HashMap<>();

        errors.put("timestamp", LocalDateTime.now());
        errors.put("message", ex.getMessage());

        return new ResponseEntity<>(errors, HttpStatus.NOT_FOUND);
    }




}
