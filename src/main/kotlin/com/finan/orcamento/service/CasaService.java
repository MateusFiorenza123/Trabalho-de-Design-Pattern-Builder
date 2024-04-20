package com.finan.orcamento.service;

import com.finan.orcamento.builderPattern.CasaModel;
import com.finan.orcamento.repositories.CasaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CasaService {

    @Autowired
    private CasaRepository casaRepository;

    public List<CasaModel> buscarTodasCasas() {
        return casaRepository.findAll();
    }

    public CasaModel buscaPorId(Long id) {
        Optional<CasaModel> obj = casaRepository.findById(id);
        if (obj.isPresent()) {
            return obj.get();
        } else {
            throw new RuntimeException("Casa não encontrada");
        }
    }

    public CasaModel cadastraCasa(CasaModel casaModel) {
        return casaRepository.save(casaModel);
    }

    public CasaModel atualizaCasa(CasaModel casa, Long id) {

        Optional<CasaModel> casaOptional = casaRepository.findById(id);
        if (casaOptional.isPresent()) {
            CasaModel casaToUpdate = casaOptional.get();
            casaToUpdate.setQuartos(casa.getQuartos());
            return casaRepository.save(casaToUpdate);
        } else {
            throw new RuntimeException("Casa não encontrada para atualização");
        }
    }

    public void deletaCasa(Long id) {
        casaRepository.deleteById(id);
    }
}