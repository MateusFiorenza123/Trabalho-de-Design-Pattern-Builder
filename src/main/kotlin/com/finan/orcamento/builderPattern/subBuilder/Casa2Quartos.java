package com.finan.orcamento.builderPattern.subBuilder;

import com.finan.orcamento.builderPattern.CasaModel;
import lombok.Getter;

@Getter
public class Casa2Quartos{

    private CasaModel casa = new CasaModel();

    public Casa2Quartos() {
        casa = new CasaModel(2,1,1);
    }

    public void buildQuartos() {
        System.out.println("Um quarto 2.5 x 1.90 outro 2.3 x 1.80");
    }

    public void buildBanheiros() {
        System.out.println("Banheiro 2.3 x 1.25");
    }

    public void buildChurrasqueira() {
        System.out.println("Sem churrasqueira");
    }

    public CasaModel getCasa() {
        return casa;
    }
}
