package objetos;

import exceptions.CNPJException;

public class Seguradora {
    private int id;
    private String nome;
    private String cnpj;
    private String email;
    private int municipioId;
    private int estadoId;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        try {
            String cnpjSemSimbolos = cnpj.replaceAll("[^0-9]", "");

            if (cnpj.matches(".*[a-zA-Z].*")) {
                throw new CNPJException("CNPJ inválido: deve conter apenas números.");
            }

            if (cnpjSemSimbolos.length() == 14 && cnpj != null) {
                this.cnpj = cnpjSemSimbolos;
                System.out.println("CNPJ válido: " + this.cnpj);
            } else {
                throw new CNPJException("CNPJ inválido: deve conter 14 dígitos.");
            }
        } catch (CNPJException e) {
            System.err.println(e.getMessage());
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMunicipioId() {
        return municipioId;
    }

    public void setMunicipioId(int municipioId) {
        this.municipioId = municipioId;
    }

    public int getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(int estadoId) {
        this.estadoId = estadoId;
    }
}
