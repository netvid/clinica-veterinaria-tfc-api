package com.clinica_veterinaria_tfg_api.persistence.crud;

import com.clinica_veterinaria_tfg_api.persistence.entity.Mascota;
import org.springframework.data.repository.CrudRepository;

public interface MascotaCrudRepository extends CrudRepository<Mascota,String> {
}
