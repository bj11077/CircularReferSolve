package nnjung.circularrefersolve.service;

import lombok.RequiredArgsConstructor;
import nnjung.circularrefersolve.data.User;
import nnjung.circularrefersolve.data.UserDto;
import nnjung.circularrefersolve.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


    public List<User> entityReturn(){
        return userRepository.findAll();
    }

    public List<UserDto> dtoReturn(){
        List<User> entityList = userRepository.findAll();

        List<UserDto> dtoList = entityList.stream()
                .map(e-> e.toDto(e.getUserId(),e.getUserPw(),e.getUserName(),e.getMapping()))
                .collect(Collectors.toList());

        return dtoList;
    }





}
