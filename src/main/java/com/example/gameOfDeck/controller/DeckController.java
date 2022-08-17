package com.example.gameOfDeck.controller;

import com.example.gameOfDeck.model.Deck;
import com.example.gameOfDeck.service.IDeckService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/deck")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class DeckController {

    @Autowired
    IDeckService deckService;

    @PostMapping("")
    public ResponseEntity<Void> create(@RequestBody Deck deck){
        this.deckService.create(deck);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
