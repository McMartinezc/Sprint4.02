package cat.itacademy.barcelonactiva.Martinez.MCarmen.s04.t02.n01.S04T02N01MartinezMCarmen.Exception;

//Clase Excepció personalitzada

public class ItemNotFoundException extends Exception {
    public ItemNotFoundException(String message) { //Constructor classe excepció
        super(message);
    }
}
