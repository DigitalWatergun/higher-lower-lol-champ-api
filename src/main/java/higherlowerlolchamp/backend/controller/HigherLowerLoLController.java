package higherlowerlolchamp.backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import higherlowerlolchamp.backend.model.Champion;
import higherlowerlolchamp.backend.repository.ChampionRepository;

@RestController
@RequestMapping("/api")
public class HigherLowerLoLController {
    
    @Autowired
    ChampionRepository championRepository;

    @GetMapping("/champions")
    public ResponseEntity<List<Champion>> getAllChampions() {
        try {
            List<Champion> champions = new ArrayList<Champion>();
            championRepository.getAllChampions().forEach(champions::add);
            return new ResponseEntity<>(champions, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping("/test")
    public String test() {
        return "Testing";
    }
}
