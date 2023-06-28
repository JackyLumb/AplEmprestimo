/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplemprestimo;

/**
 *
 * @author lumbr
 */
public class Taxa {

    //Atributos - variaveis
    int duracaoMeses;
    float taxaMensal, taxaAnual, tempoAnos, valorPrestacao, valorEmprestimo;

    //Dados iniciais
    {
        this.valorEmprestimo = 1000;
        this.tempoAnos = 5;
        this.taxaAnual = 4.5f;
    }

    //Processamento
    float taxaMensal() {
        taxaMensal = taxaAnual / 1200;
        return taxaMensal;
    }
    
    int duracaoMeses() {
        duracaoMeses = (int) (tempoAnos * 12);
        return duracaoMeses;
    }
    
    float valorPrestacao() {
        if (taxaMensal() == 0) {  
            valorPrestacao = valorEmprestimo / duracaoMeses();
            return valorPrestacao;
        } else {
            valorPrestacao = (float) (valorEmprestimo * taxaMensal() * Math.pow(1 + taxaMensal(), duracaoMeses()) / (Math.pow(1 + taxaMensal(), duracaoMeses()) - 1));
        }
        return valorPrestacao;

    }

         //Saida
    void exibirResultado() {
        System.out.println("O valor da prestação é: " +valorPrestacao());
        
    }
}
