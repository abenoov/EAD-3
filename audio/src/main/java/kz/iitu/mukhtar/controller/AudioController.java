package kz.iitu.mukhtar.controller;

import kz.iitu.mukhtar.repository.AudioRepository;
import kz.iitu.mukhtar.service.AudioService;
import kz.iitu.mukhtar.model.Audio;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AudioController {

    private final AudioService audioService;
    private final AudioRepository audioRepository;


    @GetMapping("/audio/{id}")
    public ResponseEntity<Audio> getAudio(@PathVariable Long id){
        return new ResponseEntity<>(audioService.getMovie(id), HttpStatus.OK);
    }

    @GetMapping("/audio/list")
    public ResponseEntity<List<Audio>> getMovie(){
        return new ResponseEntity<>(audioRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("/audio")
    public ResponseEntity<Audio> createMovie(@RequestBody Audio audio){
        return new ResponseEntity<>(audioService.addMovie(audio), HttpStatus.CREATED);
    }

}
