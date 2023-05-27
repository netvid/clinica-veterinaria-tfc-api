package com.clinica_veterinaria_tfg_api.persistence.crud;

import com.clinica_veterinaria_tfg_api.persistence.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteCrudRepository extends CrudRepository<Cliente,String> {
}
