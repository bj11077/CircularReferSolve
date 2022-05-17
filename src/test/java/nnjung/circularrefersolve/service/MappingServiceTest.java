package nnjung.circularrefersolve.service;

import nnjung.circularrefersolve.repository.MappingRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class MappingServiceTest {

    @Autowired
    MappingRepository mappingRepository;

    @Test
    public void 값오나요(){
        assertNotEquals(0,mappingRepository.findAll().size());
    }


}