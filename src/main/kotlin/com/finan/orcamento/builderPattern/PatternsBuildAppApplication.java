package com.finan.orcamento.builderPattern;

import com.finan.orcamento.builderPattern.subBuilder.Casa2Quartos;
import com.finan.orcamento.builderPattern.subBuilder.Casa2Quartos2BanheiroChurrasqueira;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternsBuildAppApplication {
    public static void main(String[] args){
        SpringApplication.run(PatternsBuildAppApplication.class, args);
        Casa2Quartos builderCasa1 = new Casa2Quartos();
        builderCasa1.buildQuartos();
        builderCasa1.buildBanheiros();
        builderCasa1.buildChurrasqueira();
        CasaModel casa1 = builderCasa1.getCasa();

        System.out.println("Casa 1:");
        System.out.println("Quartos:"+ casa1.getQuartos());
        System.out.println("Banheiros:"+ casa1.getBanheiros());
        System.out.println("Churrasqueira:"+ casa1.getChurrasqueira());

        System.out.println("------------------------------------------");

        Casa2Quartos2BanheiroChurrasqueira builderCasa2 = new Casa2Quartos2BanheiroChurrasqueira();
        builderCasa2.buildQuartos();
        builderCasa2.buildBanheiros();
        builderCasa2.buildChurrasqueira();
        CasaModel casa2 = builderCasa2.getCasa();

        System.out.println("Casa 2:");
        System.out.println("Quartos:"+ casa2.getQuartos());
        System.out.println("Banheiros:"+ casa2.getBanheiros());
        System.out.println("Churrasqueira:"+ casa2.getChurrasqueira());
    }
}
