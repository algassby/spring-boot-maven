package com.mycompany.invoise.core.repository;
import com.mycompany.invoise.core.entity.Customer;
import com.mycompany.invoise.core.entity.Invoice;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepositoryInterface extends CrudRepository<Customer, Long> {


}
