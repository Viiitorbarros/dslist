package com.dslist.dslist.service;


import com.dslist.dslist.dto.GameMinDto;
import com.dslist.dslist.entities.Game;
import com.dslist.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired //Pense nele como um Instanciador:
    private GameRepository gameRepository;

    public List<GameMinDto> findAll(){

        var result = gameRepository.findAll();
        var dto = result.stream().map(x -> new GameMinDto(x)).toList();

        return dto;
    }


}
