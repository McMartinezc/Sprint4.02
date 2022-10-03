package cat.itacademy.barcelonactiva.Martinez.MCarmen.s04.t02.n02.S04T02N02MartinezMCarmen.Repository;

import cat.itacademy.barcelonactiva.Martinez.MCarmen.s04.t02.n02.S04T02N02MartinezMCarmen.Model.Fruita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Repositori
public interface FruitaRepository extends JpaRepository<Fruita, Integer> {
}
