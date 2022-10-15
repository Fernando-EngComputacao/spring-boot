package font.code.movie.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import font.code.movie.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

	List<Movie> findByNome(String nomeFilme);
	
	@Query("SELECT m FROM Movie m WHERE m.id = :idFilme")
	Movie findByIdMovie(@Param("idFilme") Long id);

}
