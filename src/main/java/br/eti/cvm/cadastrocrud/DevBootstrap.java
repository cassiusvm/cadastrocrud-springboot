package br.eti.cvm.cadastrocrud;

import java.util.Random;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.eti.cvm.cadastrocrud.model.Person;
import br.eti.cvm.cadastrocrud.services.PersonService;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
	private PersonService personService;

	public DevBootstrap(PersonService personService) {
		this.personService = personService;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		Random random = new Random();

		Person person = null;

		String[] randomWords = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto",
				"Setembro", "Outubro", "Novembro", "Dezembro", "Domingo", "Segunda", "Terça", "Quarta", "Quinta",
				"Sexta", "Sabado", "Manha", "Tarde", "Noite", "Sol", "Lua", "Chuva", "Vento", "Fogo", "Terra", "Gelo",
				"Branco", "Preto", "Azul", "Verde", "Vermelho", "Marrom", "Cinza", "Laranja", "Amarelo", "Uva", "Maçã",
				"Pera", "Abacaxi", "Kiwi", "Banana", "Limao", "Ameixa", "Damasco" };

		int length = randomWords.length;

		String email;
		for (int i = 0; i < 15; i++) {
			person = new Person();
			person.setFirstName(randomWords[random.nextInt(length)]);
			person.setLastName(randomWords[random.nextInt(length)]);
			for (;;) {
				email = randomWords[random.nextInt(length)] + "@" + randomWords[random.nextInt(length)] + "."
						+ randomWords[random.nextInt(length)];
				if (personService.findByEmail(email) == null)
					break;
			}
			person.setEmail(email);
			person.getDetails().setAge(random.nextInt(length));
			person.getDetails().setAddress(randomWords[random.nextInt(length)]);
			person.getDetails().setCity(randomWords[random.nextInt(length)]);
			person.getDetails().setZipCode(String.valueOf(70000 + 100 * random.nextInt(length)));
			person.getDetails().setTelephone(String.valueOf(random.nextInt(length)));
			person.getDetails().setInfo(randomWords[random.nextInt(length)]);
			personService.create(person);
		}
	}

}
