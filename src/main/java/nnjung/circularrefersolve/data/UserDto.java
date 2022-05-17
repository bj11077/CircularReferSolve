package nnjung.circularrefersolve.data;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserDto {
    private String userId;
    private String userPw;
    private String userName;
    private List<MappingDto> mappings;

    //매핑있을때
    public UserDto(String userId, String userPw, String userName, List<MappingDto> mappings) {
        this.userId = userId;
        this.userPw = userPw;
        this.userName = userName;
        this.mappings = mappings;
    }

    //매핑없으면
    public UserDto(String userId, String userPw, String userName) {
        this.userId = userId;
        this.userPw = userPw;
        this.userName = userName;
    }



}
