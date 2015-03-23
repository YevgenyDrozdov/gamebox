package com.epam.jmp.gamebox;

import java.util.List;

public interface GameRepository {

    void init(GameRepositoryConfiguration configuration, GameLocator gameLocator, GameBuilder gameBuilder);
    List<Game> getAllGames();
    Game getGameById(String id);

}
