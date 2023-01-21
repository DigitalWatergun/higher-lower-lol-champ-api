package higherlowerlolchamp.backend.model;

public class Champion {
    private String championName;
    private String matchesPlayed;


    public Champion() {}

    public Champion(String championName, String matchesPlayed) {
        this.championName = championName;
        this.matchesPlayed = matchesPlayed;
    }
    
    public String getChampionName() {
        return championName;
    }

    public String getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setChampionName(String championName) {
        this.championName = championName;
    }

    public void setMatchesPlayed(String matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    @Override
    public String toString() {
        return String.format("Champion[championName='%s', matchesPlayed='%s']",
        championName, matchesPlayed);
    }
}
