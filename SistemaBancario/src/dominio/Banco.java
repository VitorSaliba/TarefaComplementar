package dominio;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void addConta(Conta conta) {
        contas.add(conta);
    }

    public Double somarSaldos() {
        Double total = 0.0;
        for (Conta conta : contas) {
            total += conta.getSaldo();
        }
        return total;
    }
}
