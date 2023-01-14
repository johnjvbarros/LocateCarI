package com.locateCar;

import com.locateCar.model.Caminhao;
import com.locateCar.model.Carro;
import com.locateCar.model.Moto;
import com.locateCar.model.Veiculo;

public class Main {
    public static void main(String[] args) {

        System.out.println("locateCar\n");

        // Inicializar o Sistema


        Veiculo moto = new Moto();
        Veiculo carro = new Carro();
        Veiculo caminhao = new Caminhao();

        String v =  carro.toString();
        String m = moto.toString();
        String c = caminhao.toString();
        System.out.println("Carro: "+ v);
        System.out.println("Moto: "+ m);
        System.out.println("Caminhao: "+ c);

        /* Objetos:
        * 1. Agencia
        * 2. Veiculo ( > Moto, Caminhao, Carro)
        * 2. Cliente
        * 3. Aluguel
        * 4. Comprovante
        * 5. Carros Alugados (ArrayList de carros c/ usuario)
        * 6. Carros Disponiveis ( Arraylist de carros s/ usuario)
        * Inventario LocateCar (qual carro onde?)
        * Carro {
        *   Boolean isAlugado;
        *   integer diasAlugado;
        * }
        */
    }

}