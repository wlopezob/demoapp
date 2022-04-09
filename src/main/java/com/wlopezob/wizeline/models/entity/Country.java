package com.wlopezob.wizeline.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "country")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Country {
  @Id
  @Column(name = "id")
  private Long id;

  @Column(name = "iso")
  private String iso;

  @Column(name = "name")
  private String name;

  @Column(name = "nicename")
  private String nicename;

  @Column(name = "iso3")
  private String iso3;

  @Column(name = "numcode")
  private Integer numcode;

  @Column(name = "phonecode")
  private Integer phonecode;
}
