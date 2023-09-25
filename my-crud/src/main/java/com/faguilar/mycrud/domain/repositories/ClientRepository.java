package com.faguilar.mycrud.domain.repositories;

import com.faguilar.mycrud.domain.entities.EntidadUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository <EntidadUsuario, Long> {

    List<EntidadUsuario> findAll();

}
