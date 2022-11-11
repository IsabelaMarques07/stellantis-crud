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
import com.fiap.stellantis.repositories.AmbienteRepository;


@RestController
@RequestMapping("/ambiente")
public class AmbienteController {

    private final AmbienteRepository ambienteRepository;

    public AmbienteController(AmbienteRepository ambienteRepository) {
        this.ambienteRepository = ambienteRepository;
    }

    @GetMapping
    public List<Ambiente> getAmbientes() {
        return ambienteRepository.findAll();
    }

    @GetMapping("/{id}")
    public Ambiente getAmbiente(@PathVariable Long id) {
        return ambienteRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @PostMapping
    public ResponseEntity<Ambiente> createAmbiente(@RequestBody Ambiente ambiente) throws URISyntaxException {
    	Ambiente savedAmbiente = ambienteRepository.save(ambiente);
        return ResponseEntity.created(new URI("/ambientes/" + savedAmbiente.getId())).body(savedAmbiente);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateAmbiente(@PathVariable Long id, @RequestBody Ambiente ambiente) {
    	Ambiente currentAmbiente = ambienteRepository.findById(id).orElseThrow(RuntimeException::new);
        currentAmbiente.setData(ambiente.getData());
        currentAmbiente.setQualidadeDoAr(ambiente.getQualidadeDoAr());
        currentAmbiente.setCidade(ambiente.getCidade());
        currentAmbiente.setTemperatura(ambiente.getTemperatura());
        currentAmbiente.setEstado(ambiente.getEstado());
        currentAmbiente.setDistrito(ambiente.getDistrito());
        currentAmbiente = ambienteRepository.save(ambiente);

        return ResponseEntity.ok(currentAmbiente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteAmbiente(@PathVariable Long id) {
        ambienteRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}