package objetos;

import java.time.LocalDate;

public class Locacao {
    public int id;
    public int carro_id;
    public int cliente_id;
    public LocalDate dataLocacao;
    public LocalDate dataDevolucao;
    public LocalDate dataDevolvida;
    public double valor;
    public double valorTotal;
}
