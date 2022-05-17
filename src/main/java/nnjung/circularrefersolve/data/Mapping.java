package nnjung.circularrefersolve.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@IdClass(MappingPk.class)
@Table(name = "TB_MAPPING")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Mapping {

    @Id
    @Column(name = "USER_ID")
    private String userId;

    @Id
    @Column(name = "MAPPING_ID")
    private String mappingId;

    @ManyToOne
    @JoinColumn(name ="USER_ID",insertable = false,updatable = false)
    private User user;


    @Column(name = "rmk")
    private String rmk;

    public MappingDto toDto(String userId, String mappingId, String rmk){
        return new MappingDto(userId,mappingId,rmk);
    }
}
