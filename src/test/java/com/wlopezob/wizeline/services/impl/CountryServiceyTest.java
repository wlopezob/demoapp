package com.wlopezob.wizeline.services.impl;

import static org.junit.jupiter.api.Assertions.*;

import com.wlopezob.wizeline.Util.Util;
import com.wlopezob.wizeline.repository.CountryRespository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CountryServiceyTest {
  @InjectMocks
  CountryServiceyImpl countryService;

  @Mock
  CountryRespository countryRespository;

  @Test
  @DisplayName("Getting list country")
  public void GetAllTest(){
    var list = Util.getCountryAll();
    Mockito.when(countryRespository.findAll()).thenReturn(list);
    Assertions.assertTrue(countryService.getAll().size() > 0);
  }
}