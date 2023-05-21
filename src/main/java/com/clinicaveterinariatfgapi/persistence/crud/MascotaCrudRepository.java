package com.clinicaveterinariatfgapi.persistence.crud;

import com.clinicaveterinariatfgapi.persistence.entity.Mascota;
import org.springframework.data.repository.CrudRepository;

public interface MascotaCrudRepository extends CrudRepository<Mascota,String> {
}
