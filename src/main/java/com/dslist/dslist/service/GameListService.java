package com.dslist.dslist.service;

import com.dslist.dslist.dto.GameListDto;
import com.dslist.dslist.entities.GameList;
import com.dslist.dslist.repository.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;


    public List<GameListDto> findAll(){
        var result = gameListRepository.findAll();
        var dto = result.stream().map(x -> new GameListDto(x)).toList();
        return dto;
    }
}
