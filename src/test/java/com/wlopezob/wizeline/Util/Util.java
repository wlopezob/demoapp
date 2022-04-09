package com.wlopezob.wizeline.Util;

import com.wlopezob.wizeline.models.entity.Country;
import java.util.Arrays;
import java.util.List;

public class Util {
  public static List<Country> getCountryAll(){
    return Arrays.asList(
        Country.builder().id(1L).iso("AF").name("AFGHANISTAN")
            .nicename("AFGHANISTAN").iso3("AFG")
            .numcode(4).phonecode(93).build(),
        Country.builder().id(2L).iso("AL").name("ALBANIA")
            .nicename("ALBANIA").iso3("AFG")
            .numcode(8).phonecode(355).build(),
        Country.builder().id(3L).iso("DZ").name("ALGERIA")
            .nicename("Algeria").iso3("DZA")
            .numcode(12).phonecode(213).build()
    );
  }

}
