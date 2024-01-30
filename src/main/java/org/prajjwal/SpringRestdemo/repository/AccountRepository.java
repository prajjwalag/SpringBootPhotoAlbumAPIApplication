package org.prajjwal.SpringRestdemo.repository;

import java.util.Optional;

import org.prajjwal.SpringRestdemo.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long>{

    Optional<Account> findByEmail(String email);
    
}
