package sreenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int epsodios;
    private int minutosPorEpisodios;

    public int getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean getAtiva(){
        return ativa;
    }
    public void setAtiva(boolean ativa){
        this.ativa = ativa;
    }

    public int getEpsodios(){
        return epsodios;
    }
    public void setEpsodios(int epsodios){
        this.epsodios = epsodios;
    }

    public int getMinutosPorEpisodios(){
        return minutosPorEpisodios;
    }
    public void setMinutosPorEpisodios(int minutosPorEpisodios){
        this.minutosPorEpisodios = minutosPorEpisodios;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * epsodios * minutosPorEpisodios;
    }
}

