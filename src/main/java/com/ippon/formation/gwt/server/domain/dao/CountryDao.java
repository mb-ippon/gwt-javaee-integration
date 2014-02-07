package com.ippon.formation.gwt.server.domain.dao;

import java.util.List;

import javax.ejb.Local;

import com.ippon.formation.gwt.server.domain.entities.CountryEntity;

@Local
public interface CountryDao {

    List<CountryEntity> findCountries();

    CountryEntity findCountry(Long id);

}
