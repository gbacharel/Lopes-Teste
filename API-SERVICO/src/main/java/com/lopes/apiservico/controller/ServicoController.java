package com.lopes.apiservico.controller;


        import com.lopes.apiservico.data.ServicoDto;
        import com.lopes.apiservico.models.ServicoModels;
        import com.lopes.apiservico.servicer.ServicoServices;
        import org.springframework.beans.BeanUtils;
        import org.springframework.data.domain.Page;
        import org.springframework.data.domain.Pageable;
        import org.springframework.http.HttpStatus;
        import org.springframework.http.ResponseEntity;
        import org.springframework.web.bind.annotation.*;

        import javax.validation.Valid;
        import java.time.LocalDateTime;
        import java.time.ZoneId;
        import java.util.Optional;

@RestController
@RequestMapping("/cadastro-servico")
public class ServicoController {

    final ServicoServices servicoServices;

    public ServicoController(ServicoServices servicoServices){
        this.servicoServices = servicoServices;
    }

    @PostMapping
    public ResponseEntity<Object> postServico(@RequestBody @Valid ServicoDto servicoDto) {

        ServicoModels servicoModels = new ServicoModels();
        BeanUtils.copyProperties(servicoDto, servicoModels);
        servicoModels.setDataCadastro(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(servicoServices.save(servicoModels));
    }
    @GetMapping
    public ResponseEntity<Page<ServicoModels>> getAllServico(Pageable pageable){
        return ResponseEntity.status(HttpStatus.OK).body(servicoServices.findAll(pageable));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> getOneServico(@PathVariable(value = "id") Long id) {
        Optional<ServicoModels> servicoModels = servicoServices.findById(id);
        if (!servicoModels.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Servico not found.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(servicoModels.get());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteServico(@PathVariable(value = "id") Long id){
        Optional<ServicoModels> servicoModels = servicoServices.findById(id);
        if (!servicoModels.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Servico not found.");
        }
        servicoServices.delete(servicoModels.get());
        return ResponseEntity.status(HttpStatus.OK).body(" Servico deleted successfully.");
    }
    @PutMapping("/{id}")
    public ResponseEntity<Object> updateParkingSpot(@PathVariable(value = "id") Long id,
                                                    @RequestBody @Valid ServicoDto servicoDto) {
        Optional<ServicoModels> servicoModelsOptional = servicoServices.findById(id);
        if (!servicoModelsOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Servico not found.");
        } else {
            ServicoModels servicoModels = servicoModelsOptional.get();
            BeanUtils.copyProperties(servicoDto, servicoModels);
            servicoModels.setProfName(servicoModelsOptional.get().getProfName());
            servicoModels.setDataAtualizacao(LocalDateTime.now());
            return ResponseEntity.status(HttpStatus.OK).body(servicoServices.save(servicoModels));
        }
    }

    }


