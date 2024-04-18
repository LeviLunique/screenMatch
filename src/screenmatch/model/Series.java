package screenmatch.model;

public class Series extends Title {
    private int seasons;
    private boolean ativa;
    private int epsiodesPerSeason;
    private int minutesPerSeason;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpsiodesPerSeason() {
        return epsiodesPerSeason;
    }

    public void setEpsiodesPerSeason(int epsiodesPerSeason) {
        this.epsiodesPerSeason = epsiodesPerSeason;
    }

    public int getMinutesPerSeason() {
        return minutesPerSeason;
    }

    public void setMinutesPerSeason(int minutesPerSeason) {
        this.minutesPerSeason = minutesPerSeason;
    }
}
