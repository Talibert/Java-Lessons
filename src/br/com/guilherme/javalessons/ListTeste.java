package br.com.guilherme.javalessons;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ListTeste {

    public static void main(String[] args) {
        // Criando uma lista de Strings
        List<String> lista = new ArrayList<>();
        // Adicionando elementos na lista
        lista.add("Guilherme");
        lista.add("Malu");
        lista.add("Silvio");
        // Iterando sobre a lista e mostrando os elementos
        for (String nome : lista) {
            if (nome.charAt(0) == 'G') {
                System.out.println(nome);
            } else {
                System.out.println("O nome comparado não é válido");
            }
        }
        System.out.println("Fim da lista");

        // Criando uma lista para receber o resultado do filtro aplicado
        List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'G').toList();
        System.out.println(resultado);

        // Atribuindo o resultado do filtro em uma variável
        String nameFilt = lista.stream().filter(x -> x.contains("Mal")).findFirst().orElse(null);
        System.out.println(nameFilt);
    }

}
