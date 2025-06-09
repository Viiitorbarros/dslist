package com.dslist.dslist.controllers;


import com.dslist.dslist.dto.GameMinDto;
import com.dslist.dslist.entities.Game;
import com.dslist.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDto> findAll(){
        var result = gameService.findAll();
        return result;
    }

}
