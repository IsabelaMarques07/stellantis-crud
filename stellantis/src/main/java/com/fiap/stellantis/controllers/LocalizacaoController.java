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
import com.fiap.stellantis.models.Localizacao;
import com.fiap.stellantis.repositories.AmbienteRepository;
import com.fiap.stellantis.repositories.LocalizacaoRepository;


@RestController
@RequestMapping("/localizacao")
public class LocalizacaoController {

    private final LocalizacaoRepository localizacaoRepository;

    public LocalizacaoController(LocalizacaoRepository localizacaoRepository) {
        this.localizacaoRepository = localizacaoRepository;
    }

    @GetMapping
    public List<Localizacao> getLocalizacoes() {
        return localizacaoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Localizacao getLocalizacao(@PathVariable Long id) {
        return localizacaoRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @PostMapping
    public ResponseEntity<Localizacao> createLocalizacao(@RequestBody Localizacao localizacao) throws URISyntaxException {
    	Localizacao savedLocalizacao = localizacaoRepository.save(localizacao);
        return ResponseEntity.created(new URI("/Localizacoes/" + savedLocalizacao.getId())).body(savedLocalizacao);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateLocalizacao(@PathVariable Long id, @RequestBody Localizacao localizacao) {
    	Localizacao currentLocalizacao = localizacaoRepository.findById(id).orElseThrow(RuntimeException::new);
        currentLocalizacao.setEstado(localizacao.getEstado());
        currentLocalizacao.setCidade(localizacao.getCidade());
        currentLocalizacao.setDistrito(localizacao.getDistrito());

        localizacaoRepository.save(currentLocalizacao);

        return ResponseEntity.ok(currentLocalizacao);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteLocalizacao(@PathVariable Long id) {
    	localizacaoRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}