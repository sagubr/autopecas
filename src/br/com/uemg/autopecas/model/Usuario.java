package br.com.uemg.autopecas.model;

/**
 *
 * @author gustavo
 */
public class Usuario {

    private Integer id;
    private String nome;
    private String senha;
    private String cargo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "ID: " + this.id
                + "\nNOME: " + this.nome
                + "\nCARGO: " + this.cargo;
    }

}
