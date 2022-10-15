package font.code.movie.controller.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import font.code.movie.model.Movie;
import font.code.movie.repository.MovieRepository;

public class MovieUpdate {
	@NotNull @NotEmpty @Length(min = 2)
	private String nome;
	@NotNull @NotEmpty @Length(min = 3)
	private String genero;
	@NotNull @NotEmpty
	private int posicao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getPosicao() {
		return posicao;
	}
	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	public Movie converter() {
		return new Movie(nome, genero, posicao);
	}
	
	public Movie atualiza(Long id, MovieRepository repository) {
		Movie movie = repository.findByIdMovie(id);
		movie.setNome(nome);
		movie.setPosicao(posicao);
		movie.setGenero(genero);
		return movie;
	}
}
