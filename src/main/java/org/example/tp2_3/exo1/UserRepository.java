package org.example.tp2_3.exo1;

import org.example.shared.dto.UserDTO;

/**
 * Repository interface for User data access.
 * In a real application this would interact with a database.
 */
public interface UserRepository {

    /**
     * Finds a user by their unique identifier.
     *
     * @param id the user ID
     * @return the UserDTO if found, or null if not found
     */
    UserDTO findUserById(long id);
}
