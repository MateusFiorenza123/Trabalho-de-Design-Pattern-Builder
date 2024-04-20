package com.finan.orcamento.controller;

import com.finan.orcamento.builderPattern.CasaModel;
import com.finan.orcamento.repositories.CasaRepository;
import com.finan.orcamento.service.CasaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/casas")
public class CasaController {

    @Autowired
    private CasaService casaService;

    @Autowired
    private CasaRepository casaRepository;

    @GetMapping
    public ResponseEntity<List<CasaModel>> buscaTodasCasas() {
        return ResponseEntity.ok(casaService.buscarTodasCasas());
    }

    @GetMapping(path = "/pesquisaid/{id}")
    public ResponseEntity<CasaModel> buscaPorId(@PathVariable Long id) {
        return ResponseEntity.ok(casaService.buscaPorId(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<CasaModel> cadastraCasa(@RequestBody CasaModel casaModel) {
        return ResponseEntity.ok(casaService.cadastraCasa(casaModel));
    }

    @PutMapping(path = "/put/{id}")
    public ResponseEntity<CasaModel> atualizaCasa(@RequestBody CasaModel casaModel, @PathVariable Long id) {
        CasaModel casaAtualizada = casaService.atualizaCasa(casaModel, id);
        return ResponseEntity.ok(casaAtualizada);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void deleteCasa(@PathVariable Long id) {
        casaService.deletaCasa(id);
    }
}