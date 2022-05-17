package nnjung.circularrefersolve.repository;

import nnjung.circularrefersolve.data.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,String> {
}
