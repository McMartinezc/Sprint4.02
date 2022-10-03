package cat.itacademy.barcelonactiva.Martinez.MCarmen.s04.t02.n01.S04T02N01MartinezMCarmen.Controller;


import cat.itacademy.barcelonactiva.Martinez.MCarmen.s04.t02.n01.S04T02N01MartinezMCarmen.Exception.ItemNotFoundException;
import cat.itacademy.barcelonactiva.Martinez.MCarmen.s04.t02.n01.S04T02N01MartinezMCarmen.Model.Fruita;
import cat.itacademy.barcelonactiva.Martinez.MCarmen.s04.t02.n01.S04T02N01MartinezMCarmen.Service.FruitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//Aquesta clase ens permet redireccionar
@RestController
//Gestiona las peticiones http, junto las entidades y la vista(ver la tablas en el navegador) Trabaja con Json
//@Controller //Gestiona las peticiones y permite cargar las vistas en html
@RequestMapping("/fruita")
public class FruitaController {

    @Autowired //Inyección de dependencia
    FruitaService fruitaService;

    //METODES CRUD

    //Crear
    @PostMapping("/Add")
    public ResponseEntity<Fruita> add (@RequestBody Fruita fruita){
        return ResponseEntity.ok(fruitaService.add(fruita));
    }

    //Actualitzar
    @PutMapping("/Update/{id}")
    public ResponseEntity<Fruita> uptade (@PathVariable("id") int id, @RequestBody Fruita fruita) throws ItemNotFoundException {
        return ResponseEntity.ok(fruitaService.uptade(id, fruita));
    }

    //Borrar
    @DeleteMapping("/Delete/{id}")
    public ResponseEntity<Fruita>  delete (@PathVariable ("id") int id)  throws ItemNotFoundException {
        fruitaService.delete(id);
        return ResponseEntity.noContent().build();
    }

    //Buscar Un
    @GetMapping("/getOne/{id}")
    public ResponseEntity<Fruita> getOne (@PathVariable ("id") int id) throws ItemNotFoundException{
        return  ResponseEntity.ok(fruitaService.getOne(id));
    }

    //Mostrar tot
    @GetMapping("/getAll")
    public List<Fruita> getAll(){
        return fruitaService.getAll();
    }

}
