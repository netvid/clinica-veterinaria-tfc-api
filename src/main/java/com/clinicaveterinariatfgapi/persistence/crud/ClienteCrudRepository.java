package com.clinicaveterinariatfgapi.persistence.crud;

import com.clinicaveterinariatfgapi.persistence.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteCrudRepository extends CrudRepository<Cliente,String> {
}
