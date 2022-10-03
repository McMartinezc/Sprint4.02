package cat.itacademy.barcelonactiva.Martinez.MCarmen.s04.t02.n02.S04T02N02MartinezMCarmen.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

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
