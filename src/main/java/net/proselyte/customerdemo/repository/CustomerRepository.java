package net.proselyte.customerdemo.repository;

import net.proselyte.customerdemo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for {@link Customer} class
 */

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
