package com.clinica_veterinaria_tfg_api.persistence.crud;


import com.clinica_veterinaria_tfg_api.persistence.entity.Veterinario;
import org.springframework.data.repository.CrudRepository;

public interface VeterinarioCrudRepository extends CrudRepository<Veterinario,String> {
}
