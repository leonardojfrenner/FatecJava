package br.fatec.gerenciamentoFuncionario.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departamentos", uniqueConstraints = {
        @UniqueConstraint(columnNames = "nome")
})
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String nome;

    private String descricao;
    private String telefone;

    @OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Funcionario> funcionarios = new ArrayList<>();

    public Departamento() {}

    public Departamento(String telefone, String descricao, String nome) {
        this.telefone = telefone;
        this.descricao = descricao;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void addFuncionario(Funcionario funcionario) {
        funcionario.setDepartamento(this);
        this.funcionarios.add(funcionario);
    }

    @Override
    public String toString() {
        return "DEPARTAMENTO: " + nome + " ATRIBUIÇÃO : " + descricao + " TELEFONE:  " + telefone;
    }
}
