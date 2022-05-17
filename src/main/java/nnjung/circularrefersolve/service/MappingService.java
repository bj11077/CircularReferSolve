package nnjung.circularrefersolve.service;

import lombok.RequiredArgsConstructor;
import nnjung.circularrefersolve.data.Mapping;
import nnjung.circularrefersolve.data.MappingDto;
import nnjung.circularrefersolve.repository.MappingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MappingService {

    private final MappingRepository mappingRepository;

    public List<Mapping> entityReturn(){
        return mappingRepository.findAll();
    }

    public List<MappingDto> dtoReturn(){
        List<Mapping> entityList = mappingRepository.findAll();

        return entityList.stream()
                .map(e-> e.toDto(e.getUserId(),e.getMappingId(),e.getRmk()))
                .collect(Collectors.toList());
    }

}
