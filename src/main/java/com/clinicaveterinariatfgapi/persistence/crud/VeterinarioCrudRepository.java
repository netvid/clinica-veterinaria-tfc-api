package com.clinicaveterinariatfgapi.persistence.crud;


import com.clinicaveterinariatfgapi.persistence.entity.Veterinario;
import org.springframework.data.repository.CrudRepository;

public interface VeterinarioCrudRepository extends CrudRepository<Veterinario,String> {
}
