package br.com.angiehempkmeier.UserApi.repository;

import br.com.angiehempkmeier.UserApi.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
