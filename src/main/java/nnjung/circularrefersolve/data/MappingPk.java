package nnjung.circularrefersolve.data;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@NoArgsConstructor
public class MappingPk implements Serializable {
    private String userId;
    private String mappingId;
}
