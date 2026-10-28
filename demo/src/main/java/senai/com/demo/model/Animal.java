package senai.com.demo.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "animal")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Enumerated(EnumType.STRING)
    private Especie especie;

    private String raca;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    private LocalDate dataDeNascimento;

    private Double peso;

    private String cor;

    private Boolean cadastro;

    @Enumerated(EnumType.STRING)
    private Vacinacao vacinacao;

    @Column(length = 500)
    private String observacao;

    public Animal() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Especie getEspecie() { return especie; }
    public void setEspecie(Especie especie) { this.especie = especie; }

    public String getRaca() { return raca; }
    public void setRaca(String raca) { this.raca = raca; }

    public Sexo getSexo() { return sexo; }
    public void setSexo(Sexo sexo) { this.sexo = sexo; }

    public LocalDate getDataDeNascimento() { return dataDeNascimento; }
    public void setDataDeNascimento(LocalDate dataDeNascimento) { this.dataDeNascimento = dataDeNascimento; }

    public Double getPeso() { return peso; }
    public void setPeso(Double peso) { this.peso = peso; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public Boolean getCadastro() { return cadastro; }
    public void setCadastro(Boolean cadastro) { this.cadastro = cadastro; }

    public Vacinacao getVacinacao() { return vacinacao; }
    public void setVacinacao(Vacinacao vacinacao) { this.vacinacao = vacinacao; }

    public String getObservacao() { return observacao; }
    public void setObservacao(String observacao) { this.observacao = observacao; }
}