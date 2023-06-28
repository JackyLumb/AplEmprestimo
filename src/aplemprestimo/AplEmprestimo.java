/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplemprestimo;
import java.util.Scanner;
/**
 *
 * @author lumbr
 */
public class AplEmprestimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Interface com o usuário
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe o valor do empréstimo: ");
        float valorEmprestimo = input.nextFloat();
        
        System.out.print("Informe a taxa anual: ");
        float taxaAnual = input.nextFloat();
        
        System.out.print("Informe o tempo(anos): ");
        float tempoAnos = input.nextFloat();
        
        //Atributos: Variáveis
        Taxa taxa;
        
        //Valores iniciais
        taxa = new Taxa();
        
       //Processamento: Método
        taxa.valorEmprestimo = valorEmprestimo;
        taxa.tempoAnos = tempoAnos;
        taxa.taxaAnual = taxaAnual;
        
        //Saída: Exibição de Resultados
        taxa.exibirResultado();
        
    }
    
}
