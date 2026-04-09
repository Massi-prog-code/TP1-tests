package org.example.tp2_3.exo1;

import org.example.shared.dto.UserDTO;

/**
 * Service class that handles business logic for Users.
 * Delegates data access to the UserRepository.
 */
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Retrieves a user by their ID via the repository.
     *
     * @param id the user ID
     * @return the UserDTO found in the repository
     * @throws IllegalArgumentException if no user is found with the given ID
     */
    public UserDTO getUserById(long id) {
        UserDTO user = userRepository.findUserById(id);
        if (user == null) {
            throw new IllegalArgumentException("User not found with id: " + id);
        }
        return user;
    }
}
