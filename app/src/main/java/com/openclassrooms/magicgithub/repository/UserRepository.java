package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService;

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        /* Au lancement de l'application, un nouveau userRepository est instancié via MagicGithubApplication via Injection.
         * Et simultanément une instance de l'interface ApiService est créée et devient un attribut du userRepository.
         * La méthode getUsers() du userRepository peut donc faire appel à la méthode getUser() de l'interface et retourner
         * à son tour la liste des "users" qu'elle renvoie.*/
        return apiService.getUsers();
    }

    public void generateRandomUser() {
        // On appelle la méthode generateRandomUser() de notre instance d'interface.
        apiService.generateRandomUser();
    }

    public void deleteUser(User user) {
        // TODO: A modifier
    }
}
