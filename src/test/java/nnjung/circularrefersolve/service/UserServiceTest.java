package nnjung.circularrefersolve.service;

import nnjung.circularrefersolve.data.User;
import nnjung.circularrefersolve.data.UserDto;
import nnjung.circularrefersolve.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class UserServiceTest {


    @Autowired
    UserRepository userRepository;



    @Test
    public void 일단값불러와지나(){
        System.out.println(userRepository.findAll());
        assertNotEquals(0,userRepository.findAll().size());
    }


}