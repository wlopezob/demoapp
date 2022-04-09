package com.wlopezob.wizeline.services.impl;

import com.wlopezob.wizeline.models.entity.Country;
import com.wlopezob.wizeline.repository.CountryRespository;
import com.wlopezob.wizeline.services.CountryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceyImpl implements CountryService {
  @Autowired
  CountryRespository countryRespository;

  @Override
  public List<Country> getAll() {
    return countryRespository.findAll();
  }
}
