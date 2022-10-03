package cat.itacademy.barcelonactiva.Martinez.MCarmen.s04.t02.n01.S04T02N01MartinezMCarmen;

import cat.itacademy.barcelonactiva.Martinez.MCarmen.s04.t02.n01.S04T02N01MartinezMCarmen.Model.Fruita;
import cat.itacademy.barcelonactiva.Martinez.MCarmen.s04.t02.n01.S04T02N01MartinezMCarmen.Repository.FruitaRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class S04T02N01MartinezMCarmenApplication {

	public static void main(String[] args) {

		ApplicationContext context= SpringApplication.run(S04T02N01MartinezMCarmenApplication.class, args);
		FruitaRepository repository =context.getBean(FruitaRepository.class);


		//crear fruita
		Fruita poma = new Fruita(null, "poma",2);
		Fruita platan = new Fruita(null, "platan",1);
		Fruita llimona = new Fruita(null, "llimona",1);

		//Almacenar una fruita
		repository.save(poma);
		repository.save(platan);
		repository.save(llimona);

	}

}
