package higherlowerlolchamp.backend.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import higherlowerlolchamp.backend.model.Champion;

@Repository
public class JdbcChampionRepository implements ChampionRepository {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Override
    public List<Champion> getAllChampions() {
        return jdbcTemplate.query("SELECT * from champions", BeanPropertyRowMapper.newInstance(Champion.class));
    }

}
