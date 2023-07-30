package br.com.estudy.SpringSecurity.repositories;

import br.com.estudy.SpringSecurity.data.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, String> {

    UserDetails findByLogin(String login);
}
