package es.webstilos.springbootdemo.service;

import es.webstilos.springbootdemo.model.Artist;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ArtistService {

    private List<Artist> ARTISTS = Arrays.asList(
      new Artist("James Alan Hetfield", 1963),
      new Artist("Bruce Dickinson", 1958)
    );

    public List<Artist> list() {
        return ARTISTS;
    }

}
