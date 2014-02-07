package com.ippon.formation.gwt.server.service;

import java.util.List;

import javax.ejb.Local;

import com.ippon.formation.gwt.server.domain.entities.CountryEntity;

@Local
public interface CountryService {
    List<CountryEntity> findCountries();

    CountryEntity findCountry(Long id);
}
