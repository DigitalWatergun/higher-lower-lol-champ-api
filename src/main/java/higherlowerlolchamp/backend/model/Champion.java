package higherlowerlolchamp.backend.model;

public class Champion {
    private String championName;
    private String matchesPlayed;
    private String loadingScreenUrl;


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

    public String getLoadingScreenUrl() {
        return loadingScreenUrl;
    }

    public void setChampionName(String championName) {
        this.championName = championName;
    }

    public void setMatchesPlayed(String matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public void setLoadingScreenUrl(String loadingScreenUrl) {
        this.loadingScreenUrl = loadingScreenUrl;
    }

    @Override
    public String toString() {
        return String.format("Champion[championName='%s', matchesPlayed='%s', loadingScreenUrl='%s']",
        championName, matchesPlayed, loadingScreenUrl);
    }
}
