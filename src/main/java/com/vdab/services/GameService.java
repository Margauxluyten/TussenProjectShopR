package com.vdab.services;

import com.vdab.domain.Game;
import com.vdab.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<Game> getGames() {
        return gameRepository.getGames();
    }

    public void saveGame(Game newGame) {
        gameRepository.saveGame(newGame);
    }

    public Game findGameById(long id) {

        return gameRepository.findGameById(id);
    }

    public void updateGame(Game game) {
        gameRepository.updateGame(game);
    }

    public void deleteGame(long id) {
        gameRepository.deleteGame(id);
    }
}
