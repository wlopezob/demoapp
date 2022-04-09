package com.wlopezob.wizeline.controller;

import com.wlopezob.wizeline.models.entity.Country;
import com.wlopezob.wizeline.services.CountryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/country")
public class CountryController {
  @Autowired
  CountryService countryService;

  @GetMapping
  public List<Country> GetAll(){
      return  countryService.getAll();
  }
}
