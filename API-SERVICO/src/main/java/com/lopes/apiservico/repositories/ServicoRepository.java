package com.lopes.apiservico.repositories;

import com.lopes.apiservico.models.ServicoModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<ServicoModels, Long> {


}