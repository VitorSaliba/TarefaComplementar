package ui;

import dominio.Banco;
import dominio.Cliente;
import dominio.Conta;
import dominio.ManipuladorArquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class SistemaBancario {

    public static void main(String[] args) throws IOException {

        Cliente c1 = new Cliente();

        Banco banco = new Banco();

        c1.setNome(JOptionPane.showInputDialog("Digite o nome do cliente: "));

        String file = "D:/Linguagens de Programação/TarefaComplementar/SistemaBancario/Contas.txt";
        String[] contas = ManipuladorArquivos.leitor(file);

        Conta[] objContas = new Conta[contas.length-1];

        for (int i = 0; i < contas.length-1; i++) {
            String[] contaSeparada = contas[i].split(",");

            objContas[i] = new Conta(contaSeparada[0], contaSeparada[1], Double.parseDouble(contaSeparada[2]));

            banco.addConta(objContas[i]);
        }

        banco.setNome(JOptionPane.showInputDialog("Digite o nome do Banco: "));

        String outputfile = "D:/Linguagens de Programação/TarefaComplementar/SistemaBancario/Banco.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputfile));
        writer.write("Banco " + banco.getNome() + " possui o saldo geral de contas de: " + banco.somarSaldos() + ".");
        writer.close();

    }
}
