package com.lopes.apiservico.servicer;


import com.lopes.apiservico.models.ServicoModels;
import com.lopes.apiservico.repositories.ServicoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class ServicoServices {

    final ServicoRepository servicoRepository;

    public ServicoServices(ServicoRepository servicoRepository) {
        this.servicoRepository = servicoRepository;
    }

    @Transactional
    public ServicoModels save(ServicoModels servicoModels) {
        return servicoRepository.save(servicoModels);
    }

    public Page<ServicoModels> findAll(Pageable pageable) {
        return servicoRepository.findAll(pageable);
    }
    public Optional<ServicoModels> findById(Long id){
        return servicoRepository.findById(id);
    }

    @Transactional
    public void delete(ServicoModels servicoModels){
        servicoRepository.delete(servicoModels);
    }

    @Transactional
    public ServicoModels update(ServicoModels servicoModels) {
        return servicoRepository.save(servicoModels);
    }



}
