package nnjung.circularrefersolve.controller;

import lombok.RequiredArgsConstructor;
import nnjung.circularrefersolve.data.Mapping;
import nnjung.circularrefersolve.data.MappingDto;
import nnjung.circularrefersolve.service.MappingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mapping")
public class MappingController {

    private final MappingService mappingService;


    @GetMapping("/entity")
    public List<Mapping> entityReturn(){
        return mappingService.entityReturn();
    }

    @GetMapping("/dto")
    public List<MappingDto> dtoReturn(){
        return mappingService.dtoReturn();
    }

}
