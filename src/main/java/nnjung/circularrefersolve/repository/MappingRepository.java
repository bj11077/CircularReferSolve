package nnjung.circularrefersolve.repository;


import nnjung.circularrefersolve.data.Mapping;
import nnjung.circularrefersolve.data.MappingPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MappingRepository extends JpaRepository<Mapping, MappingPk> {
}
