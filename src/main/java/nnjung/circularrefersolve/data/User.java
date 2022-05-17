package nnjung.circularrefersolve.data;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "TB_USER")
public class User {

    @Id
    @Column(name = "USER_ID")
    private String userId;

    @Column(name="USER_PW")
    private String userPw;

    @Column(name = "USER_NAME")
    private String userName;


    @OneToMany(mappedBy = "userId",fetch = FetchType.LAZY)
    private List<Mapping> mapping = new ArrayList<>();

    public UserDto toDto(String userId, String userPw, String userName, List<Mapping> mapping){
        List<MappingDto> dtoList = mapping.stream().map(e->
             new MappingDto(e.getUserId(),e.getMappingId(),e.getRmk())).collect(Collectors.toList());
        return new UserDto(userId,userPw,userName,dtoList);
    }

}
