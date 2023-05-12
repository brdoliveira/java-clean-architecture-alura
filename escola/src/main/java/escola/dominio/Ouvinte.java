package escola.dominio;

public abstract class Ouvinte {
    public void processa(Evento evento){
        if(this.deveProcessaar(evento)){
            this.reageAo(evento);
        }
    }

    protected abstract void reageAo(Evento evento);

    protected abstract boolean deveProcessaar(Evento evento);

}
