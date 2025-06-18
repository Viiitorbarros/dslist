package com.dslist.dslist.controllers;


import com.dslist.dslist.dto.GameDto;
import com.dslist.dslist.dto.GameListDto;
import com.dslist.dslist.dto.GameMinDto;
import com.dslist.dslist.entities.GameList;
import com.dslist.dslist.service.GameListService;
import com.dslist.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDto> findAll() {
        var result = gameListService.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDto> findByList(@PathVariable Long listId){
        var result = gameService.findByList(listId);
        return result;
    }

}
