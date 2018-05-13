package es.webstilos.springbootdemo.web;

import es.webstilos.springbootdemo.model.Artist;
import es.webstilos.springbootdemo.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArtistController {

    private final ArtistService artistService;

    @Autowired
    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping("artists")
    public List<Artist> getArtists() {
        return artistService.list();
    }

}
