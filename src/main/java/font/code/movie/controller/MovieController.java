package font.code.movie.controller;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import font.code.movie.controller.dto.MovieForm;
import font.code.movie.controller.dto.MovieUpdate;
import font.code.movie.model.Movie;
import font.code.movie.repository.MovieRepository;

@RestController
@RequestMapping("/movie")
public class MovieController {
	
	@Autowired
	private MovieRepository movieRepository;
	
	@GetMapping
	public List<Movie> buscarTodos(String nomeFilme) {
		if (nomeFilme == null) 
			return movieRepository.findAll();
		else
			return movieRepository.findByNome(nomeFilme);
	}
	
	@PostMapping
	public Movie cadastrar(@RequestBody @Valid MovieForm form) {
		Movie movie = form.converter();
		movieRepository.save(movie);
		return movie;	
	}
	
	@GetMapping("/{id}")
	public Movie buscarUm(@PathVariable Long id) {
		return movieRepository.findByIdMovie(id);
	}
	
	@PutMapping("/{id}")
	@Transactional
	public Movie atualizar(@PathVariable Long id, @RequestBody @Valid MovieUpdate form) {
		return form.atualiza(id, movieRepository);
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public Movie remove(@PathVariable Long id) {
		Movie movie = movieRepository.findByIdMovie(id);
		movieRepository.delete(movie);
		return movie;
	}
	
	
	
}
