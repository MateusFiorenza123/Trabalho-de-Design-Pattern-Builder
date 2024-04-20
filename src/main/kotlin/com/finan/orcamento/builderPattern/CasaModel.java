package com.finan.orcamento.builderPattern;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Casas")
public class CasaModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "quartos")
    private int quartos;

    @Column(name = "banheiros")
    private int banheiros;

    @Column(name = "churrasqueiras")
    private int churrasqueira;

    public CasaModel(int quartos, int banheiros, int churrasqueira) {
        this.quartos = quartos;
        this.banheiros = banheiros;
        this.churrasqueira = churrasqueira;
    }

    public int getBanheiros() {
        return banheiros;
    }

    public int getQuartos() {
        return quartos;
    }

    public int getChurrasqueira() {
        return churrasqueira;
    }

    public void setQuartos(int quartos) {

    }

    public void setBanheiros(int banheiros) {
    }

    public void setChurrasqueira(int churrasqueira) {
    }
}
