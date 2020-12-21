package com.epita.tpalimentation.exposition;

import com.epita.tpalimentation.domaine.dto.AlimentDTO;
import com.epita.tpalimentation.domaine.entity.Aliment;
import com.epita.tpalimentation.exceptions.NotFoundException;
import com.epita.tpalimentation.service.AlimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api")
public class AlimentController {

    @Autowired
    private AlimentService alimentService;

    @Autowired
    private AlimentMapper alimentMapper;


    @PostMapping(value = "/addAliment", produces = {"application/json"}, consumes = {"application/json"})
    public ResponseEntity<?> ajouterAliment(@RequestBody final AlimentDTO alimentDTO) {

        final Aliment aliment = alimentMapper.mapToEntity(alimentDTO);

        alimentService.saveAlimentService(aliment);

        final URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(aliment.getAlimCode()).toUri();

        return ResponseEntity.created(location).build();
    }

    @GetMapping(value="/aliment/{alimCode}", produces = {"application/json"})
    public AlimentDTO getAlimentByCode(@PathVariable("alimCode") final String alimCode)  {

        Aliment aliment = null;
        try {
            aliment = alimentService.getAlimentByAlimCodeService(alimCode);
        } catch (NotFoundException e) {
            e.printStackTrace();
        }

        AlimentDTO alimentDTO = alimentMapper.mapToDto(aliment);

        alimentDTO.toString();
        return  alimentDTO;
    }


    @GetMapping(value="/alimentMaxCalcium", produces = {"application/json"})
    public AlimentDTO getAlimentMaxCalcium() {

        Aliment aliment = alimentService.getAlimentMaxCalciumService();

        AlimentDTO alimentDTO = alimentMapper.mapToDto(aliment);

        alimentDTO.toString();
        return  alimentDTO;
    }
}
