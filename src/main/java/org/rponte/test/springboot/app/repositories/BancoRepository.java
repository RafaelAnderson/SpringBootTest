package org.rponte.test.springboot.app.repositories;

import org.rponte.test.springboot.app.models.Banco;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BancoRepository extends JpaRepository<Banco, Long> {
    //List<Banco> findAll();
    //Optional<Banco> findById(Long id);
    //void update(Banco banco);
}
