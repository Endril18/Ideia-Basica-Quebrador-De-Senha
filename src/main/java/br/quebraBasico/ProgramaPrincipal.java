package br.quebraBasico;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Set;
import java.util.HashSet;


public class ProgramaPrincipal {
    public static void main(String[] args) {

        // Para teste
        int senha = 123;
        String limiteDecimal = "000";
        int limiteNumero = 1000;

        // Inicializando Objetos
        Random gerador = new Random();
        DecimalFormat df = new DecimalFormat(limiteDecimal);
        Set<Integer> breakersGerados = new HashSet<Integer>();

        // Gerando o Primeiro Número Aleatótio
        int breaker = gerador.nextInt(limiteNumero);
        String numeroAleatorio = df.format(breaker);

        System.out.println(breaker);

        // Armazenando Números Gerados
        breakersGerados.add(breaker);

        // Estrutura para gerar até que seja encontrado
        while(breaker != senha){
            breaker = gerador.nextInt(1000);
            while(breaker < limiteNumero/10 || breakersGerados.contains(breaker)){
                breaker = gerador.nextInt(1000);
            }
            breakersGerados.add(breaker);
            System.out.println(breaker);
        }
    }
}