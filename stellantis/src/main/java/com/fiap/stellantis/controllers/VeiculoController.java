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
import com.fiap.stellantis.models.Veiculo;
import com.fiap.stellantis.repositories.AmbienteRepository;
import com.fiap.stellantis.repositories.VeiculoRepository;


@RestController
@RequestMapping("/veiculo")
public class VeiculoController {

    private final VeiculoRepository veiculoRepository;

    public VeiculoController(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    @GetMapping
    public List<Veiculo> getVeiculos() {
        return veiculoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Veiculo getveiculo(@PathVariable Long id) {
        return veiculoRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @PostMapping
    public ResponseEntity<Veiculo> createVeiculo(@RequestBody Veiculo veiculo) throws URISyntaxException {
    	Veiculo savedVeiculo = veiculoRepository.save(veiculo);
        return ResponseEntity.created(new URI("/veiculos/" + savedVeiculo.getId())).body(savedVeiculo);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateVeiculo(@PathVariable Long id, @RequestBody Veiculo veiculo) {
    	Veiculo currentVeiculo = veiculoRepository.findById(id).orElseThrow(RuntimeException::new);
        currentVeiculo.setPlaca(veiculo.getPlaca());
        currentVeiculo.setModelo(veiculo.getModelo());
        currentVeiculo.setMarca(veiculo.getMarca());
        currentVeiculo.setQuilometragem(veiculo.getQuilometragem());

        currentVeiculo = veiculoRepository.save(veiculo);

        return ResponseEntity.ok(currentVeiculo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteVeiculo(@PathVariable Long id) {
    	veiculoRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}