package com.wlopezob.wizeline.controller;

import com.wlopezob.wizeline.Util.Util;
import com.wlopezob.wizeline.services.CountryService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CountryControllerTest {
  @InjectMocks
  private CountryController countryController;

  @Mock
  private CountryService countryService;

  @Test
  @DisplayName("Getting list country")
  public void GetAllTest(){
    var list = Util.getCountryAll();
    Mockito.when(countryService.getAll()).thenReturn(list);
    Assertions.assertTrue(countryController.GetAll().size() > 0);
  }

}