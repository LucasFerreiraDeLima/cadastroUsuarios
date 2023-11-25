package br.com.apiusuarios.projeto.DAO;

import br.com.apiusuarios.projeto.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuario extends CrudRepository<Usuario, Integer> {
}
