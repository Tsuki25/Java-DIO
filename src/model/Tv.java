package model;

public class Tv {
    private boolean estado = false;
    private int canal = 1;
    private int volume = 50;

    public Tv(){ //CONSTRUTOR DEFAULT
    }

    public Tv(boolean estado, int canal, int volume){ //CONSTRUTOR COMPLETO
        this.estado = estado;
        this.canal = canal;
        this.volume =  volume;
    }

    public void alterar_estado(){
        this.estado = !this.estado;
    }

    public void aumentar_volume(){
        this.volume += 1;
    }

    public void diminuir_volume(){
        this.volume -= 1;
    }

    public void avancar_canal(){
        this.canal += 1;
    }

    public void voltar_canal(){
        this.canal -= 1;
    }

    public void mudar_canal(int new_canal){
        this.canal = new_canal;
    }

    // GETTERS AND SETTERS
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "estado=" + estado +
                ", canal=" + canal +
                ", volume=" + volume +
                '}';
    }
}
