package br.com.alura.api.linguagens;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerLanguages {

    @Autowired
    private RepositoryLanguage repository;
    
    @GetMapping("/linguagens")
    public List<Language> getLanguages() {
        List<Language> languages = repository.findAll();
        return languages;
    }

    @PostMapping("/linguagens")
    public Language registrationLanguage(@RequestBody Language language) {
        Language saveLanguage = repository.save(language);
        return  saveLanguage;
    }
    
}
