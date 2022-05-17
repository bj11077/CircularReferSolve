package nnjung.circularrefersolve.controller;

import lombok.RequiredArgsConstructor;
import nnjung.circularrefersolve.data.User;
import nnjung.circularrefersolve.data.UserDto;
import nnjung.circularrefersolve.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;


    // Overflow --> 엔티티 직접 리턴때려서 순환참조로 인해
    @GetMapping("/entity")
    public List<User> returnEntity(){
        return userService.entityReturn();
    }

    @GetMapping("/dto")
    public List<UserDto> returnDto(){
        return userService.dtoReturn();
    }

}
