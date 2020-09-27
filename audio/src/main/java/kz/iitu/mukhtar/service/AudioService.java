package kz.iitu.mukhtar.service;

import kz.iitu.mukhtar.model.Audio;
import kz.iitu.mukhtar.repository.AudioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AudioService {

    private final AudioRepository audioRepository;

    public Audio addMovie(Audio movie){
        Audio aud;

        aud = audioRepository.save(movie);
        aud.setId(aud.getId());

        return aud;

    }

    public Audio getMovie(Long id){

        if(!audioRepository.existsById(id)){

            System.out.println("No emplyee with given id found");
        }

        return audioRepository.findById(id).get();

    }



}
