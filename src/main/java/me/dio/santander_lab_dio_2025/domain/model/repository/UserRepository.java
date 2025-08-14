package me.dio.santander_lab_dio_2025.domain.model.repository;

import me.dio.santander_lab_dio_2025.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
