package com.dslist.dslist.service;


import com.dslist.dslist.dto.GameDto;
import com.dslist.dslist.dto.GameMinDto;
import com.dslist.dslist.entities.Game;
import com.dslist.dslist.repository.GameRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired //Pense nele como um Instanciador:
    private GameRepository gameRepository;
    @Transactional(readOnly = true)
    public List<GameMinDto> findAll(){

        var result = gameRepository.findAll();
        var dto = result.stream().map(x -> new GameMinDto(x)).toList();

        return dto;
    }

    @Transactional(readOnly = true)
    public GameDto findById(Long id){
        var result = gameRepository.findById(id);
        if(result.isPresent()){
            return new GameDto(result.get());
        }else {
            throw new EntityNotFoundException("Game not found");
        }

    }


}
