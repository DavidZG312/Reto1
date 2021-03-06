/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto1_Ciclo4.Reto1;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author David
 */
public interface UserCrudRepository extends CrudRepository<User, Integer> {

    Optional<User> findByEmail(String email);

    Optional<User> findByEmailAndPassword(String email, String password);
    //Optional<User> findByName(String name);

}
