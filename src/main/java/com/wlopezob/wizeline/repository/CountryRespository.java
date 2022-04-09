package com.wlopezob.wizeline.repository;

import com.wlopezob.wizeline.models.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CountryRespository extends JpaRepository<Country, Long> {

}
