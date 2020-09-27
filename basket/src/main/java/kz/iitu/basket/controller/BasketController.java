package kz.iitu.basket.controller;

import kz.iitu.basket.entity.Basket;
import kz.iitu.basket.repository.BasketRepository;
import kz.iitu.basket.service.BasketService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BasketController {

    private final BasketService basketService;
    private final BasketRepository basketRepository;



    @PostMapping("/recommendation")
    public ResponseEntity<Basket> addItem(@RequestBody Basket reservation){
        return new ResponseEntity<>(basketService.createItem(reservation), HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<Basket>> getItems(){
        return new ResponseEntity<>(basketRepository.findAll(), HttpStatus.OK);
    }

}
