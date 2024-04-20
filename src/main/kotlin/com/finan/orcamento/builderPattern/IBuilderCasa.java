package com.finan.orcamento.builderPattern;

public interface IBuilderCasa {
    void buildQuartos();
    void buildBanheiros();
    void buildChurrasqueira();

    CasaModel getCasa();

}
