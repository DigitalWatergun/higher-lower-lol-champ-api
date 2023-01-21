package higherlowerlolchamp.backend.repository;

import java.util.List;

import higherlowerlolchamp.backend.model.Champion;

public interface ChampionRepository {
    
    List<Champion> getAllChampions();
}
