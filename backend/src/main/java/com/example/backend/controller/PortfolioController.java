package com.example.backend.controller;

import com.example.backend.model.Portfolio;
import com.example.backend.repository.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/portfolio")
@CrossOrigin(origins = "http://localhost:4200")  // adjust Angular frontend URL if different
public class PortfolioController {

    @Autowired
    private PortfolioRepository repository;

    // Create (POST)
    @PostMapping
    public ResponseEntity<Portfolio> createPortfolio(@RequestBody Portfolio portfolio) {
        Portfolio saved = repository.save(portfolio);
        return ResponseEntity.ok(saved);
    }

    // Read all (GET)
    @GetMapping
    public List<Portfolio> getAllPortfolios() {
        return repository.findAll();
    }

    // Read one by id (GET)
    @GetMapping("/{id}")
    public ResponseEntity<Portfolio> getPortfolioById(@PathVariable Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Update (PUT)
    @PutMapping("/{id}")
    public ResponseEntity<Portfolio> updatePortfolio(@PathVariable Long id, @RequestBody Portfolio portfolio) {
        return repository.findById(id).map(existing -> {
            existing.setName(portfolio.getName());
            existing.setSkills(portfolio.getSkills());
            existing.setProjects(portfolio.getProjects());
            existing.setLinkedin(portfolio.getLinkedin());
            existing.setGithub(portfolio.getGithub());
            existing.setSelectedTheme(portfolio.getSelectedTheme());
            existing.setSelectedColor(portfolio.getSelectedColor());
            Portfolio updated = repository.save(existing);
            return ResponseEntity.ok(updated);
        }).orElse(ResponseEntity.notFound().build());
    }

    // Delete (DELETE)
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePortfolio(@PathVariable Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
