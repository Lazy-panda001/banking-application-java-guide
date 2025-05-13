// Create Spring Data JPA Repository for Account Entity-->  AccountRepository

package net.javaguide.banking.repository;

import net.javaguide.banking.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
