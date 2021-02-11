package net.proselyte.customerdemo.service;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.proselyte.customerdemo.model.Customer;
import net.proselyte.customerdemo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public Customer getById(Long id) {
        log.info("IN CustomerServiceImpl getById ()", id);
        return customerRepository.getOne(id);
    }

    public void save(Customer customer) {
        log.info("IN CustomerServiceImpl save ()", customer);
        customerRepository.save(customer);
    }

    public void delete(Long id) {
        log.info("IN CustomerServiceImpl delete ()", id);
        customerRepository.deleteById(id);
    }

    public List<Customer> getAll() {
        log.info("IN CustomerServiceImpl getAll");
        return customerRepository.findAll();
    }
}
