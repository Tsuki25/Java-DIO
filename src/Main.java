import model.Tv;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Tv quarto = new Tv();//CONSTRUTOR DEFAULT
        // Tv sala = new Tv(true, 15, 75); //CONSTRUTOR COMPLETO

        System.out.println(quarto.toString());
        quarto.alterar_estado();
        System.out.println("A tv está ligada? " + quarto.isEstado());

        for(int i = 0; i < 5; i++){
            quarto.aumentar_volume();
            System.out.println("Volume atual da tv: " + quarto.getVolume());
        }

        for(int i = 0; i < 5; i++){
            quarto.diminuir_volume();
            System.out.println("Volume atual da tv: " + quarto.getVolume());
        }

        quarto.avancar_canal();
        System.out.println("Canal atual: " + quarto.getCanal());
        quarto.voltar_canal();
        System.out.println("Canal atual: " + quarto.getCanal());
        quarto.mudar_canal(7);
        System.out.println("Canal atual: " + quarto.getCanal());
    }
}