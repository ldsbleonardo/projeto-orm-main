package br.edu.infnet.orm;

import br.edu.infnet.orm.modelo.entidade.Animal;
import br.edu.infnet.orm.modelo.persistencia.AnimalDAO;
import br.edu.infnet.orm.modelo.persistencia.IDAO;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
                IDAO dao = new AnimalDAO();
		Animal animal = new Animal();
		animal.setCodigo(1L);
                animal.setIdade(3);
                animal.setNomeAnimal("Maradona");
                animal.setPesoAnimal(5.5);
                animal.setRaca("ViraLata");
		
		dao.salvar(animal);

	}
}
