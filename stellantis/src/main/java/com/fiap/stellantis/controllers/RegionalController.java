package com.fiap.stellantis.controllers;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.stellantis.models.Ambiente;
import com.fiap.stellantis.models.Regional;
import com.fiap.stellantis.repositories.AmbienteRepository;
import com.fiap.stellantis.repositories.RegionalRepository;


@RestController
@RequestMapping("/regional")
public class RegionalController {

    private final RegionalRepository regionalRepository;

    public RegionalController(RegionalRepository regionalRepository) {
        this.regionalRepository = regionalRepository;
    }

    @GetMapping
    public List<Regional> getRegionais() {
        return regionalRepository.findAll();
    }

    @GetMapping("/{id}")
    public Regional getRegional(@PathVariable Long id) {
        return regionalRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @PostMapping
    public ResponseEntity<Regional> createRegional(@RequestBody Regional regional) throws URISyntaxException {
    	Regional savedRegional = regionalRepository.save(regional);
        return ResponseEntity.created(new URI("/regionais/" + savedRegional.getId())).body(savedRegional);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateRegional(@PathVariable Long id, @RequestBody Regional regional) {
    	Regional currentRegional = regionalRepository.findById(id).orElseThrow(RuntimeException::new);
        currentRegional.setData(regional.getData());
        currentRegional.setIdVeiculo(regional.getIdVeiculo());
        currentRegional.setIdLocalizacao(regional.getIdLocalizacao());
        currentRegional = regionalRepository.save(regional);

        return ResponseEntity.ok(currentRegional);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteRegional(@PathVariable Long id) {
    	regionalRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}