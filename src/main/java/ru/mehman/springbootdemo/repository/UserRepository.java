package ru.mehman.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mehman.springbootdemo.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
