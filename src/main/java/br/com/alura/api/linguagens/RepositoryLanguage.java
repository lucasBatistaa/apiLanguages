package br.com.alura.api.linguagens;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositoryLanguage extends MongoRepository<Language, String> {
    
}
