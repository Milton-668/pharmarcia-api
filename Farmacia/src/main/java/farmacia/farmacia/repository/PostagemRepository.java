package farmacia.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import farmacia.farmacia.models.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	
	public List<Postagem> findAllByDescricaoContainingIgnoreCase(String descricao);
	
	public List<Postagem> findAllByNomeContainingIgnoreCase(String nome);

}
