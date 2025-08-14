package me.dio.santander_lab_dio_2025.service;

import me.dio.santander_lab_dio_2025.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);

}
